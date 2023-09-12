package ra;

import java.util.Scanner;

public class StudentsManager {
    static Student[] students = new Student[100];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choise;
        while(true) {
            System.out.println("====== *** Student Manager *** ======"
                    + "\n1.Them moi hoc sinh"
                    + "\n2.Sua thong tin hoc sinh"
                    + "\n3.Xoa hoc sinh"
                    + "\n4.In ra danh sach hoc sinh"
                    + "\n5.Sap xep hoc sinh theo thu tu bang chu cai abc"
                    + "\n0.Thoat chuong trinh"
                    + "\n==========>");
            System.out.println("Nhap lua chon cua ban :");
            try {
                choise = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.err.println(e.getMessage());
                continue;
            }
            switch (choise){
                case 1:
                    addStudent(sc);
                    break;
                case 2:
                    editById(sc);
                    break;
                case 3:
                    deleteById(sc);
                    break;
                case 4:
                    displayAll();
                    break;
                case 5:
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.err.println("So nhap vao chua hop le! vui long nhap lai");
            }
        }
    }
    // them moi hoc sinh
    public static void addStudent(Scanner sc) {
        char flag;
        do{
            Student student = new Student();
            student.inputData(sc);
            boolean check = true;
            for (int i = 0; i < students.length; i++) {
                if(students[i] == null) {
                    students[i] = student;
                    System.out.println("Them hoc sinh thanh cong");
                    check = false;
                    break;
                }
            }
            if(check) {
                System.err.println("them khong thanh cong! danh sach khong the vuot qua 100 hoc sinh");
            }
            System.out.println("ban co muon tiep tuc them hay khong (y/n) : ");
            flag = sc.next().charAt(0);
            sc.nextLine();
        }
        while (flag != 'n');

    }
    // edit hoc sinh
    public static void editById(Scanner sc) {
        String id;
        do{
            System.out.println("nhap id hoc sinh muon edit ( Nhap 'EXIT hoac exit' de quay lai menu tuy chon) : ");
            id = sc.nextLine();
            if(id.equalsIgnoreCase("exit")) {
                break;
            }
            boolean check = true;
            for (int i = 0; i < students.length; i++) {
                if(students[i] != null && students[i].getStudentId().equals(id)) {
                    System.out.println("StudentName: " + students[i].getStudentName() + ", Nhap ten sua doi: ");
                    String name = sc.nextLine();
                    students[i].setStudentName(name);
                    System.out.println("Age: " + students[i].getAge() + ", Nhap tuoi sua doi: ");
                    int age = Integer.parseInt(sc.nextLine());
                    students[i].setAge(age);
                    System.out.println("Sex: " + students[i].isSex() + ", Nhap gioi sua doi: ");
                    boolean sex = sc.nextBoolean();
                    students[i].setSex(sex);
                    sc.nextLine();
                    System.out.println("Address: " + students[i].getAddress() + ", Nhap dia chi sua doi: ");
                    String address = sc.nextLine();
                    students[i].setAddress(address);
                    System.out.println("Phone: " + students[i].getPhone() + ", Nhap SDT sua doi: ");
                    String phone = sc.nextLine();
                    students[i].setPhone(phone);
                    check = false;
                    System.out.println("Sua thong tin thanh cong");
                    break;
                }
            }
            if(check) {
                System.err.println("Sua khong thanh cong");
            }
        }
        while (true);
    }
    // xoa hoc sinh
    public static void deleteById(Scanner sc){
        String id;
        do{
            System.out.println("nhap id hoc sinh muon xoa ( Nhap 'EXIT hoac exit' de quay lai menu tuy chon) : ");
            id = sc.nextLine();
            if(id.equalsIgnoreCase("exit")) {
                break;
            }
            boolean check = true;
            for (int i = 0; i < students.length; i++) {
                if(students[i] != null && students[i].getStudentId().equals(id)) {
                    students[i] = null;
                    check = false;
                    System.out.println("Xoa thanh cong");
                    break;
                }
            }
            if(check) {
                System.err.println("Xoa khong thanh cong");
            }
        }
        while (true);
    }
    // xap xep theo thu tu a b c

    // in ra danh sach hoc sinh
    public static void displayAll() {
        for (Student s: students
             ) {
            if(s != null) {
                s.displayData();
                System.out.println("================");
            }

        }
    }

    static class Student {
        // thuoc tinh
        private String studentId;
        private String studentName;
        private String address;
        private String phone;
        private int age;
        private boolean sex;

        // constructor

        public Student() {

        }

        public Student(String studentId, String studentName, String address, String phone, int age, boolean sex) {
            this.studentId = studentId;
            this.studentName = studentName;
            this.address = address;
            this.phone = phone;
            this.age = age;
            this.sex = sex;
        }

        // getter setter


        public String getStudentId() {
            return studentId;
        }

        public void setStudentId(String studentId) {
            this.studentId = studentId;
        }

        public String getStudentName() {
            return studentName;
        }

        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public boolean isSex() {
            return sex;
        }

        public void setSex(boolean sex) {
            this.sex = sex;
        }

        // inputData
        public void inputData(Scanner sc) {
            System.out.println("============");
            System.out.println("Nhap ma sinh vien :");
            this.studentId = sc.nextLine();
            System.out.println("Nhap ten sinh vien :");
            this.studentName = sc.nextLine();
            System.out.println("Nhap tuoi sinh vien :");
            this.age = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap gioi tinh ten sinh vien (Nam : true; Nu: false) :");
            this.sex = sc.nextBoolean();
            sc.nextLine();
            System.out.println("Nhap dia chi cua sinh vien :");
            this.address = sc.nextLine();
            System.out.println("Nhap SDT cua sinh vien :");
            this.phone = sc.nextLine();
            System.out.println("=======> Nhap hoan tat!");
        }

        // displayData()
        public void displayData() {
            System.out.println("StudentId: " + this.studentId
                    + "\nStudentName: " + this.studentName
                    + "\nAge: " + this.age
                    + "\nSex: " + (this.sex ? "Nam" : "Nu")
                    + "\nAddress: " + this.address
                    + "\nPhone: " + this.phone);
        }

    }
}

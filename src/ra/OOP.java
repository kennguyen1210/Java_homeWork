package ra;

public class OOP {
    // dinh nghia 1 class
    // cac thuoc tinh
    static int number = 0;

    String name = "ken";

    SubClass subClass = new SubClass();
    public OOP() {
        System.out.println("day la phuong thuc khoi tao khong tham so cua lop OOP");
    }

    public OOP (int numer) {
        this.number = numer;
    }
    public OOP(int num, String name) {
        this.number = num;
        this.name = name;
    }

    public void display() {
        System.out.println(this.name);
        System.out.println(this.number);
    }

    // dinh nghia lop con

    static class SubClass{
        String message = "kkkk";

        public SubClass() {

        }
        public void displayMessage() {
            System.out.println(this.message);
        }
    }
}

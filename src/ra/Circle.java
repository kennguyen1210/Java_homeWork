package ra;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NewCircle c1 = new NewCircle();
        c1.inputData(sc);
        c1.displayData();
        System.out.println("chu vi la: " + c1.chuVi());
        System.out.println("dien tich la: " + c1.dienTich());

    }

    static class NewCircle{
        // thuoc tinh
        private double r;
        private String color;

        // contructor
        public  NewCircle() {

        }

        public NewCircle(double r, String color) {
            this.r = r;
            this.color = color;
        }

        public double getR() {
            return r;
        }

        public void setR(double r) {
            this.r = r;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public double chuVi() {

            double chuVi = this.r*Math.PI/2;
            return chuVi;
        }

        public double dienTich() {
            double dienTich = this.r*this.r*Math.PI;
            return dienTich;
        }

        public void inputData(Scanner sc) {
            System.out.println("Nhap ban kinh");
            this.r = Double.parseDouble(sc.nextLine());
            System.out.println("Nhap mau sac");
            this.color = sc.nextLine();
        }

        public void displayData() {
            System.out.println("ban kinh la: " + this.r + "\n color la: " + this.color);
        }
    }
}

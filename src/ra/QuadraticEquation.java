package ra;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QE qe = new QE();
        qe.inputData(sc);
        qe.display();
    }

    static class QE{
        // bien
        private double a;
        private double b;
        private double c;

        private double delta;
        //contructor
        public QE() {

        }

        public QE(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        // getter setter


        public double getA() {
            return a;
        }

        public void setA(double a) {
            this.a = a;
        }

        public double getB() {
            return b;
        }

        public void setB(double b) {
            this.b = b;
        }

        public double getC() {
            return c;
        }

        public void setC(double c) {
            this.c = c;
        }

        public void getDelta() {
            this.delta = Math.pow(this.b, 2) - 4*this.a*this.c;
        }
        // nhap a b c
        public void inputData(Scanner sc) {
            System.out.println("Enter a, b, c : ");
            this.a = sc.nextDouble();
            this.b = sc.nextDouble();
            this.c = sc.nextDouble();
            this.getDelta();
        }

        public double getRoot1() {
            double r1;
            if(this.delta >= 0 ) {
                r1 = (-this.b + Math.pow(this.delta, 0.5))/(2*this.a);
            } else {
                r1 = 0;
            }
            return r1;
        }
        public double getRoot2() {
            double r2;
            if(this.delta >= 0 ) {
                r2 = (-this.b - Math.pow(this.delta, 0.5))/(2*this.a);
            } else {
                r2 = 0;
            }
            return r2;
        }

        public void display() {
            if(this.delta > 0) {
                double r1 = this.getRoot1();
                double r2 = this.getRoot2();
                System.out.println("The equation has tow roots " + r1 + " and " + r2);
            } else if(this.delta ==0) {
                double r = this.getRoot1();
                System.out.println("The equation has one root " + r);
            } else {
                System.out.println("The equation has no real roots ");
            }
        }
    }
}

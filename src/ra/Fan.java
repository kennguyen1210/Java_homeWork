package ra;

public class Fan {
    public static void main(String[] args) {
        NewFan fan1 = new NewFan();
        NewFan fan2 = new NewFan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        fan2.setSpeed(fan2.MEDIUM);

        System.out.println(fan1.toString());
        System.out.println("===========");
        System.out.println(fan2.toString());

    }

    static class NewFan {
        // thuoc tinh
        private final int SLOW = 1;
        private final int MEDIUM = 2;
        private final int FAST = 3;
        private int speed = this.SLOW;

        private boolean on = false;
        private double radius = 5;

        private String color = "blue";

        // constructor
        public NewFan() {

        }
        // getter setter


        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public boolean isOn() {
            return on;
        }

        public void setOn(boolean on) {
            this.on = on;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        // toString()

        public String toString() {
            String str;
            if(this.on) {
                str = "fan is on with speed: " + this.speed
                        + "\ncolor: " + this.color
                        + "\nradius: " + this.radius;
            } else {
                str = "fan is off "
                        + "\ncolor: " + this.color
                        + "\nradius: " + this.radius;
            }
            return str;
        }
    }
}

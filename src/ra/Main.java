package ra;

public class Main {
    public static void main(String[] args) {
        // static dung de dinh nghia bo nho 1 lan duy nhat khi khai bao lop
        // static thuoc so huu cua lop chu khong phai cua doi tuong nen co the truy cap truc tiep tu lop
        // khoi tao doi tuong
        OOP oop1 = new OOP(10, "Kirito");
        OOP oop2 = new OOP(12, "Kirito111");
        // oop la 1 doi tuong cua lop OOP
        oop1.display();
        // truy cap thuoc tinh cua 1 thuoc tinh khac
        oop1.subClass.displayMessage();
        System.out.println(oop1.number);
        System.out.println(oop2.number);
    }
}
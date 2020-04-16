package com.solid.lsp.methodchanged;

/*
* Kết quả tính diện tích HCN là 50 -> chương trình chạy đúng
* Kết quả tính diện tích hình vuông là 25 -> chương trình chạy đúng
* Kết quả tính diện tích HCN khi tính trên đối tượng của lớp con là 100 -> chương trình chạy sai
Cần lưu ý là phương thức getArea không bị ghi đè nên khi gọi đến getArea của rectangle trong TH cuối
tức là gọi đến getArea của Rectangle. Và ở đây getArea trả về giá trị sai với logic.
* Thực thể (đối tượng) ở lớp Square không thể thay thế cho thực thể ở lớp Rectange do thực thể
của lớp square đã khiến cho thực thể của của lớp Rectangle thay đổi bản chất vốn có của mình.
*/

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setWidth(5);
        rect.setHeight(10);
        System.out.println(rect.getArea());

        Square square = new Square();
        square.setWidth(5);
        System.out.println(square.getArea());

        rect = new Square();
        rect.setWidth(5);
        rect.setHeight(10);
        System.out.println(rect.getArea());
    }
}

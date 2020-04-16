package com.solid.lsp.methodchanged;

/*
* LSP - Liskov substitution principle - Nguyên lý thay thế Liskov:
* Trong một chương trình, các object của class con có thể thay thế class cha
mà không làm thay đổi tính đúng đắn của chương trình
* Đoạn code dưới không thoả mãn nguyên lý LSP (Liskov substitution principle) do các thực thể của class con không
thể thay thế cho thực thể của class cha mà không làm thay dổi tính đúng đắn của chương trình.
* Cách kế thừa này xét về code là không sai nhưng lớp con đã khiến phương thức của lớp cha thay đổi giá trị trả về.
* Khi xét kế thừa cần xét tới việc lớp con có thay thế được cho lớp cha hay không để thoả mãn nguyên tắc này
* Trong đoạn code dưới, class Square kế thừa class Rectangle và ghi đè hai phương thức setter của lớp Cha sao cho
phù hợp với đặc tính của class Square. Hình vuông có 2 cạnh bằng nhau nên khi set chiều dài và chiều rộng đều set
chiều dài = chiều rộng = tham số truyền vào.
* Vấn đề chỉ xảy ra khi gọi đến phương thức getArea. Do cách kế thừa và ghi đè phương thức của
class square đã ảnh hưởng tới phương thức getArea của lớp cha. Cần lưu ý rằng phương thức getArea
không bị ghi đè -> Tính đúng đắn của phương thức getArea bị thay đổi -> tính đúng đắn của chương trình
bị thay đổi.
*/

public class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }
}

package com.solid.ocp;

import com.solid.srp.User;

/*
* OCP - Open-Closed Principle - Nguyên Lý Đóng Mở
* Có thể thoải mái mở rộng 1 class nhưng không được sửa đổi bên trong class đó
* Trong đoạn code dưới đây, phương thức saveUser đã được viết sao cho nếu có thay đổi
logic trong việc validator cũng không phải can thiệp vào phương thức saveUser để thay đổi
* Đoạn code dưới đã thoả mãn nguyên tắc OCP vì vẫn mở rộng, nâng cấp phương thức
saveUser mà không phải can thiệp vào class UserServiceVersion2
* Class này cũng đã thoả nguyên lý Đơn trách nhiệm SRP vì các thao tác đã được tách nhỏ
thành các class riêng biệt
*/

public class UserServiceVersion2 {
    private User user;

    public UserServiceVersion2(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    //Viết như ở dưới nếu muốn thay đổi logic validate thì phải can thiệp vào phương thức
    public void saveUser() {
        if (user.getUserName() != null) {
            System.out.println(user);
        } else {
            System.out.println("Can't save");
        }
    }

    //Nếu thay đổi logic validate thì không cần phải can thiệp vào phương thức SaveUser vì
    //việc validate đã do Interface Validator kiểm soát.
    public void saveUser(Validator validator) {
        if (validator.isValid()) {
            System.out.println(user);
        } else {
            System.out.println("Can't save");
        }
    }
}

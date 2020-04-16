package com.solid.srp;

/*
* SRP - Single Responsibility Principle:
* 1 Class chỉ nên giữ 1 trách nhiệm duy nhất, chỉ có thể sửa đổi class với 1 lí do duy nhất
*
* Class dưới vi phạm nguyên tắc SRP vì 1 class làm quá nhiều việc
* Khi class chứa nhiều phương thức và code hơn sẽ khiến việc bảo trì, nâng cấp gặp khó khăn
* Khi muốn thay đổi 1 trong số các phương thức ở dưới, phải can thiệp trực tiếp vào class và dò từng phương thức một
* Nên tách thành các class con như:
* UserRepository dùng để lấy dữ liệu từ DB
* UserValidator dùng để xác thực dữ liệu từ DB
* SystemLogger dùng để ghi lại Log
* JsonConverter dùng để parse Json sang đối tượng User
 */

public class UserService {
    public User getUser() {
        return null;
    }

    public boolean isValid() {
        return true;
    }

    public void showNotification() {
        System.out.println("User logon");
    }

    public void logging() {
        System.out.println("....");
    }

    public User parseJson(String json) {
        return null;
    }
}

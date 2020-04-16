package com.solid.srp;

/*
* Class này tuân thủ định luật SRP - Single Responsibility Principle
* Class này chỉ có chức năng khởi tạo một instance (Thực thể) của User dựa
* trên những dữ liệu cơ bản
* Vì Class này khởi tạo nên một mẫu hình có các thuộc tính đi kèm nên không
* có những phương thức nào khác ngoài getter và setter
*/


public class User {
    private String id;
    private String userName;
    private String password;

    public User() {
    }

    public User(String id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Id: "
                + id + "\n"
                + "User Name: "
                + userName + "\n"
                + "Password: "
                + password;
    }
}

package com.solid.ocp;

/*
* Với mỗi lớp triển khai Interface Validator sẽ có từng phương thức isValid
riêng biệt
*/

public class ValidatorByUserName implements Validator {
    private String userName;

    public ValidatorByUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean isValid() {
        return userName.matches("^[a-z][a-z0-9]{6,15}");
    }
}

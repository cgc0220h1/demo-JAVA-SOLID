package com.solid.ocp;

/*
* Với mỗi lớp triển khai Interface Validator sẽ có từng phương thức isValid
riêng biệt
*/

public class ValidatorByID implements Validator {
    private String id;

    public ValidatorByID(String id) {
        this.id = id;
    }

    @Override
    public boolean isValid() {
        return id.matches("\\d*");
    }
}

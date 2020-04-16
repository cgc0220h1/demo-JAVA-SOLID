package com.solid.ocp;

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

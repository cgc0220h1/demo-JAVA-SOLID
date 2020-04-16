package com.solid.ocp;

import com.solid.srp.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("1","vanduc2514","123456");
        UserServiceVersion2 userServiceVersion2 = new UserServiceVersion2(user);
        String toValidate = user.getUserName();
        ValidatorByUserName validatorByUserName = new ValidatorByUserName(toValidate);
        userServiceVersion2.saveUser(validatorByUserName);

        System.out.println("----------Other Case----------------------");
        user = new User("a","anhnam420","420@Bl4z1T");
        userServiceVersion2.setUser(user);
        toValidate = user.getId();
        ValidatorByID validatorByID = new ValidatorByID(toValidate);
        userServiceVersion2.saveUser(validatorByID);
    }
}

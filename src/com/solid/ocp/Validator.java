package com.solid.ocp;

/*
* Interface này chịu trách nhiệm gọi đến từng phương thức isValid ở
các lớp triển khai từ interface này.
*/

public interface Validator {
    boolean isValid();
}

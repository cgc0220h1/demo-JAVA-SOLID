package com.solid.dip;

/*
* DIP - Dependency Inversion Principle - Nguyên lý giảm bớt sự phụ thuộc
* Các Module cấp cao không nên phụ thuộc vào các module cấp thấp. Cả 2 nên phụ thuộc vào Abstraction
* Các class giao tiếp với nhau thông qua Interface
* Code dưới đây đã tuân thủ nguyên tắc này
* Class DatabaseConfig giao tiếp với các class dbconnection riêng biệt thông qua Interface DBConnection. Do đó các
thực thể của DBConnection có thể giao tiếp với từng dbconnection mà không cần phải triển khai từng dbConnection ở trong
Code. Do đó khi thi đổi các dbConnection, class DatabseConfig không bị ảnh hưởng. Việc thay đổi các class dbConnection
là độc lập và không làm các thực thể của DBConnection mất đi tính chất
*/

public class DatabaseConfig {
    private DBConnection dbConnection;

    public DatabaseConfig(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
        this.dbConnection.connect();
    }

    public DBConnection getDbConnection() {
        return this.dbConnection;
    }
}

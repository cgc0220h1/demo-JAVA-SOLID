package com.solid.lsp.subtypeexception;

/*
* Việc kế thừa ở đoạn code dưới là không sai về code nhưng vì Interface FileService
không khai báo việc sẽ throw ra các Exception nên ở các lớp triển khai cũng không được
phép throw Exception. Việc throw ra Exception sẽ làm thay đổi tính đúng đắn của Interface FileService
* Các đối tượng của lớp này sẽ không thay thế được Interface FileService vì làm thay đổi tính đúng đắn của Interface
*/

public class SystemFileService implements FileService {
    @Override
    public void getFiles() {
        //Load temp files
    }

    @Override
    public void deleteFiles() {
        throw new UnsupportedOperationException("Can't delete temp files");
    }
}

package com.solid.isp;

import java.awt.print.Pageable;

/*
* ISP - Interface Segregation Principle - Nguyên lý chia tách các Interface:
* Thay vì dùng interface lớn, nên tách thành nhiều interface nhỏ, với nhiều mục đích cụ thể
* Interface dưới không thoả mãn nguyên tắc này vì khi sử dụng Interface này cần phải triển
khai toàn bộ các phương thức, kể cả những phương thức không cần thiết
* Nên tách Interface này thành các các interface nhỏ gồm các phương thức liên quan tới nhau
*/

public interface Repository<T, ID> {
    Iterable<T> findAll();

    T findOne(long id);

    T save(T entity);

    void update(T entity);

    void delete(T entity);

    Page<T> findAll(Pageable pageable);

    Iterable<T> findAll(Sort sort);
}

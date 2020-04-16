package com.solid.isp;

/*
* Interface này được tách ra từ Interface Repository do đó nếu sử dụng Interface này chỉ cần triển khai
các phương thức của Interface này mà không cần phải triển khai toàn bộ các phương thức của Interface
Repository
*/

public interface CrudRepository<T,ID> {
    Iterable<T> findAll();

    T findOne(long id);

    T save (T entity);

    void update(T entity);

    void  delete(T entity);
}

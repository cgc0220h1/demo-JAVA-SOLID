package com.solid.isp;

public interface CrudRepository<T,ID> {
    Iterable<T> findAll();

    T findOne(long id);

    T save (T entity);

    void update(T entity);

    void  delete(T entity);
}

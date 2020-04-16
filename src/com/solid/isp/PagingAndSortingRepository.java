package com.solid.isp;

import java.awt.print.Pageable;

public interface PagingAndSortingRepository<T, ID> extends CrudRepository<T, ID> {
    Page<T> findAll(Pageable pageable);

    Iterable<T> findAll(Sort sort);
}

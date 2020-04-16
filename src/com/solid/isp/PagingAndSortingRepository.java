package com.solid.isp;

import java.awt.print.Pageable;

/*
* Interface này được tách ra từ Interface Repository do đó nếu sử dụng Interface này chỉ cần triển khai
các phương thức của Interface này mà không cần phải triển khai toàn bộ các phương thức của Interface
Repository
*/

public interface PagingAndSortingRepository<T, ID> extends CrudRepository<T, ID> {
    Page<T> findAll(Pageable pageable);

    Iterable<T> findAll(Sort sort);
}

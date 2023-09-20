package com.tzy.service;/*
 * @author 田中耀
 * @version 1.0
 */


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tzy.domain.Book;

import java.util.List;

public interface BookService {
    Boolean save(Book book);
    Boolean update(Book book);
    Boolean delete(Integer id);
    Book getById(Integer id);
    List<Book> getAll();
    IPage<Book> getPage(int currentPage,int pageSize);


}

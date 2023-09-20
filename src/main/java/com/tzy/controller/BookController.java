package com.tzy.controller;/*
 * @author 田中耀
 * @version 1.0
 */

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tzy.controller.utils.R;
import com.tzy.domain.Book;
import com.tzy.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private IBookService bookService;

    @GetMapping
    public R getAll(){
        return new R(true,bookService.list());
    }

    @PostMapping
    public R save(@RequestBody Book book)throws IOException{
//        R r = new R();
//        boolean flag = bookService.save(book);
//        r.setFlag(flag);
        if(book.getName().equals("123")) throw new IOException();
        boolean flag = bookService.save(book);
        return new R(flag,flag?"添加成功 ^_^":"添加失败 -_-!");
//        return new R(false);
    }

    @PutMapping
    public R update(@RequestBody Book book){
        return new R(bookService.updateById(book));
    }

    @DeleteMapping("/{id}")
    public R delete(@PathVariable Integer id){
        return new R(bookService.removeById(id));
    }

    @GetMapping("/{id}")
    public R getById(@PathVariable Integer id){
        return new R(true,bookService.getById(id));
    }

    @GetMapping("/{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage,@PathVariable int pageSize,Book book){
        IPage<Book> page = bookService.getPage(currentPage, pageSize,book);
        //如果当前页码值大于总页码值，修改当前页码值为总页码值
        if (currentPage > page.getPages()){
            page = bookService.getPage((int)page.getPages(),pageSize,book);
        }
        return new R(true,page);
    }

}

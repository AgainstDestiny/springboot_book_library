package cn.itaxu.controller;

import cn.itaxu.domain.Book;
import cn.itaxu.service.BookService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

/**
 * @Description: cn.itaxu.controller
 * @author: Axu
 * @date:2022/11/12 19:54
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public String save(@RequestBody Book book){
        bookService.add(book);
        return "{'message':'success'}";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        bookService.delete(id);
        return "{'message':'success'}";
    }

    @DeleteMapping
    public String deleteByIds(@RequestBody int[] ids){
        bookService.deleteByIds(ids);
        return "{'message':'success'}";
    }

    @PutMapping
    public String update(@RequestBody Book book){
        bookService.update(book);
        return "{'message':'success'}";
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable Integer id){
        return bookService.getById(id);
    }

   @GetMapping
    public List<Book> getAll(){
        return bookService.getAll();
    }
}

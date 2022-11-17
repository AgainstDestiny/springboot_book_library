package cn.itaxu.service;

import cn.itaxu.domain.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: cn.itaxu.service
 * @author: Axu
 * @date:2022/11/12 22:11
 */
public interface BookService {
    void add(Book book);
    void delete(Integer id);
    void deleteByIds(int[] ids);
    void update(Book book);
    Book getById(Integer id);
    List<Book> getAll();
}

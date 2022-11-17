package cn.itaxu.service.impl;

import cn.itaxu.dao.BookDao;
import cn.itaxu.domain.Book;
import cn.itaxu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @Description: cn.itaxu.service.impl
 * @author: Axu
 * @date:2022/11/12 22:13
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public void add(Book book) {
        bookDao.add(book);
    }

    @Override
    public void delete(Integer id) {
        bookDao.delete(id);
    }

    @Override
    public void deleteByIds(int[] ids) {
        bookDao.deleteByIds(ids);
    }

    @Override
    public void update(Book book) {
        bookDao.update(book);
    }

    @Override
    public Book getById(Integer id) {
        return bookDao.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}

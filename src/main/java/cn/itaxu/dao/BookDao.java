package cn.itaxu.dao;

import cn.itaxu.domain.Book;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description: cn.itaxu.dao
 * @author: Axu
 * @date:2022/11/12 21:57
 */
// TODO 添加@Mapper
@Mapper
public interface BookDao {

    @Insert("insert into ev_books(name,type,author,publisher)values(#{name},#{type},#{author},#{publisher})")
    void add(Book book);

    @Delete("delete from ev_books where id=#{id}")
    void delete(Integer id);

    @Delete("<script> DELETE FROM ev_books WHERE id in <foreach collection='ids' item='id' open='(' separator=',' " +
            "close=')" +
            "'>#{id}</foreach> </script>")
    void deleteByIds(@Param("ids") int[] ids);

    @Update("update ev_books set name=#{name},type=#{type},author=#{author},publisher=#{publisher} where id=#{id}")
    void update(Book book);

    @Select("select * from ev_books where id=#{id}")
    Book getById(Integer id);

    @Select("select * from ev_books")
    List<Book> getAll();

}

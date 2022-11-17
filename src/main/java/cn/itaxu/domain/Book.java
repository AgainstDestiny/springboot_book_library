package cn.itaxu.domain;

import java.io.Serializable;

/**
 * @Description: cn.itaxu.domain
 * @author: Axu
 * @date:2022/11/12 19:54
 */
public class Book {

    private Integer id;
    private String name;
    private String type;
    private String author;
    private String publisher;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    public Book() {
    }

    public Book(Integer id, String name, String type, String author, String publisher) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.author = author;
        this.publisher = publisher;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}

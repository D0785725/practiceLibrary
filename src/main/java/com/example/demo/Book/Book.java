package com.example.demo.Book;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity(name = "book")
@Table(name = "book")
public class Book {

    @Id
    @SequenceGenerator(
            name = "book_sequence",
            sequenceName = "book_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "student_sequence"
    )
    @Column(
            name = "book_id",
            updatable = false
    )
    private Long bookId;
    @Column(name = "title",
            nullable = false)
    private String title;
    @Column(name = "author",
            nullable = false)
    private String author;
    @Column(name = "price",
            nullable = false)
    private int price;
    @Column(name = "place",
    nullable = false)
    private String place;
    @Column(name = "remark"
    )
    private String remark;

    public Book() {
    }

    public Book(String title, String author, int price, String place, String remark) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.place = place;
        this.remark = remark;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

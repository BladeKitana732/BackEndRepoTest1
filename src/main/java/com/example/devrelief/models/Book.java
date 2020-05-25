package com.example.devrelief.models;

import javax.persistence.*;
import javax.websocket.ClientEndpoint;


@Entity
@Table(name = "book_names")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long bookid;
    //in instructor example code she put @Column(name = "bookid"); but this works as well

    @Column
    private String title;

    @Column
    private String author;

    @Column
    private int release_date;

    //constructor for object
    public Book(){ }

    //getters and setters
    public void setBookid(long bookid) {
        this.bookid = bookid;
    }

    public long getBookid() {
        return bookid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setRelease_date(int release_date) {
        this.release_date = release_date;
    }

    public int getRelease_date() {
        return release_date;
    }

}

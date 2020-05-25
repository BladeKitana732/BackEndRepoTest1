package com.example.devrelief.controller;

import com.example.devrelief.models.Book;
import com.example.devrelief.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class Books {
    @Autowired
    BookService bookService;

//    @GetMapping
//    public String describe() {
//        return "I am books endpoint :D";
//    }

    @GetMapping
    public Iterable<Book> listBooks() {
        return bookService.listBooks();
    }


    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    };




}

//what would be passed to database table
//{
// bookid: 12,
// title: "To kill a mockingbird",
// author: "author name",
// release_date: 1972
//  }

//{
// bookid: int,
// title: String,
// author: String,
// release_date: int,
//  }
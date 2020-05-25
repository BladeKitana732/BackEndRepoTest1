package com.example.devrelief.services;

import com.example.devrelief.models.Book;

public interface BookService {

    public Book createBook(Book book);

    public Iterable<Book> listBooks();
}

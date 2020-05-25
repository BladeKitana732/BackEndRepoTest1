package com.example.devrelief.services;


import com.example.devrelief.models.Book;
import com.example.devrelief.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImplementation implements BookService {

    @Autowired //to inject dependency
    private BookRepository bookRepository;

    @Override
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Iterable<Book> listBooks() {
        return bookRepository.findAll();
    }



    //why override? b.c when we implement an interface we have to give access to methods

}

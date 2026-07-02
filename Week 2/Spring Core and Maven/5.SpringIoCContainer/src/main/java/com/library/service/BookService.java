package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public BookService() {
        System.out.println("BookService Bean Created");
    }

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {

        System.out.println("Dependency Injection Executed");

        this.bookRepository = bookRepository;
    }

    public void displayService() {

        System.out.println("Book Service is working.");

        bookRepository.displayRepository();
    }
}
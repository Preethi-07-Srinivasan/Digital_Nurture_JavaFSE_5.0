package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;
    private String libraryName;

    // Constructor Injection
    public BookService(String libraryName) {

        this.libraryName = libraryName;

        System.out.println("Constructor Injection Executed");
        System.out.println("Library Name : " + libraryName);
    }

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {

        System.out.println("Setter Injection Executed");

        this.bookRepository = bookRepository;
    }

    public void displayService() {

        System.out.println("Book Service is working.");

        bookRepository.displayRepository();
    }
}
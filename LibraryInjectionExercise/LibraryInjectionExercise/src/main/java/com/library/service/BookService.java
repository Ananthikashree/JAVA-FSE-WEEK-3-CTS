package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private String serviceName;
    private BookRepository bookRepository;

    // Constructor injection
    public BookService(String serviceName) {
        this.serviceName = serviceName;
    }

    // Setter injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBook() {
        System.out.println(serviceName + " - Book: " + bookRepository.findBook());
    }
}

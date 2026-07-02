package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;

public class MainApp {

    public static void main(String[] args) {

        // Load Spring Configuration File
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get Bean from Spring Container
        BookService service = (BookService) context.getBean("bookService");

        // Call Method
        service.displayService();
    }
}
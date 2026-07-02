package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;

public class MainApp {

    public static void main(String[] args) {

        System.out.println("Loading Spring Container...");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("Spring Container Loaded Successfully.");

        BookService service =
                (BookService) context.getBean("bookService");

        service.displayService();
    }
}
package com.example.springlibrarymongodb.controller;


import com.example.springlibrarymongodb.model.Book;
import com.example.springlibrarymongodb.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/library")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/save")
    public void save(@RequestBody Book book) {
        bookService.save(book);
    }

    @GetMapping
    public String hello() {
        return "hello";
    }
}

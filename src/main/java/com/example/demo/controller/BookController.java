package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8100", maxAge = 3600)
@RestController
@RequestMapping({"/book"})
public class BookController {

    @Autowired
    AuthorService authorService;

    @PostMapping("/create")
    public ResponseEntity<Book> createBook(@RequestBody Book book, @PathVariable Long idAuthor) {
        return new ResponseEntity<Book>(authorService.createBook(book, idAuthor), HttpStatus.OK);
    }

    @PutMapping("/edit")
    public ResponseEntity<Book> editBook(@RequestBody Book book, @PathVariable Long idAuthor) {
        return new ResponseEntity<Book>(authorService.createBook(book, idAuthor), HttpStatus.OK);
    }
}

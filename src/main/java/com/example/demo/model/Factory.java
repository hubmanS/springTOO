package com.example.demo.model;

import com.example.demo.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Factory {
    @Autowired
    BookRepository bookRepository;

    public Book createBook(Book book, Long idAuthor) {

        Book bookCreate;
        if (book == null) {
            bookCreate = bookRepository.save(book);
        } else {
            book.setTitle(book.getTitle());
            book.setDate(book.getDate());
            bookCreate = bookRepository.save(book);
        }
        return bookCreate;
    }
}

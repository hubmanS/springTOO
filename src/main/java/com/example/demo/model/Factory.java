package com.example.demo.model;

import com.example.demo.Repositories.AuthorRepository;
import com.example.demo.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Factory {
    @Autowired
    BookRepository bookRepository;

    @Autowired
    AuthorRepository authorRepository;

    public Book createBook(Book book, Long idAuthor) {
        Book bookRecovery = bookRepository.findOne(book.getId());
        Author author=authorRepository.findOne(idAuthor);
        Book bookCreate;
        if (bookRecovery == null) {
            bookCreate = bookRepository.save(book);
        } else {
            bookRecovery.setTitle(book.getTitle());
            bookRecovery.setDate(book.getDate());
            bookRecovery.setAuthor(author);
            bookCreate = bookRepository.save(bookRecovery);
        }
        return bookCreate;
    }
}

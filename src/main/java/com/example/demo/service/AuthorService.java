package com.example.demo.service;

import com.example.demo.Repositories.AuthorRepository;
import com.example.demo.Repositories.BookRepository;
import com.example.demo.model.Author;
import com.example.demo.model.Book;
import com.example.demo.model.Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    BookRepository bookRepository;

    @Autowired
    Factory factory;

    static Logger log = Logger.getLogger(AuthorService.class.getName());


    public Author createAuthor(Author author) {
        Author authorRecovery = authorRepository.findOne(author.getId());
        Author authorCreate;

        log.info("MEMEMEM" + authorRecovery);

        if (authorRecovery == null) {
            authorCreate = authorRepository.save(author);
        } else {
            authorRecovery.setName(author.getName());
            authorRecovery.setBook(author.getBook());
            authorCreate = authorRepository.save(authorRecovery);
        }
        return authorCreate;
    }

    public Book createBook(Book book) {
        Book bookRecovery = bookRepository.findOne(book.getId());
        return factory.createBook(book);
    }
}
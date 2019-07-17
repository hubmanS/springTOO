package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Book")
public class Book extends Writte{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    String title;

    @Column(name = "date")
    Date date;

    public Book(){
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
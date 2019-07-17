package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public abstract class Writte {

    @ManyToOne(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name="author_id")
    Author author;

    public  void setAuthor(Author author){
        this.author=author;
    }

    public  Author getAuthor(){
        return this.author;
    }

}

package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Result")
public abstract class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private Long note;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getNote() {
        return note;
    }

    public void setNote(Long note) {
        this.note = note;
    }
}
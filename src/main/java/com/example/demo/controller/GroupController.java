package com.example.demo.controller;

import com.example.demo.model.Result;
import com.example.demo.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8100", maxAge = 3600)
@RestController
@RequestMapping({"/group"})
public class GroupController {

    @Autowired
    ParticipantService participantService;

    @PostMapping("/create")
    public ResponseEntity<Result> createBook(@RequestBody Result result, @PathVariable Long idAuthor) {
        //  return new ResponseEntity<Result>(participantService.createBook(result, idAuthor), HttpStatus.OK);
        return null;
    }

    @PutMapping("/edit")
    public ResponseEntity<Result> editBook(@RequestBody Result result, @PathVariable Long idAuthor) {
        //  return new ResponseEntity<Result>(participantService.createBook(result, idAuthor), HttpStatus.OK);
        return null;
    }
}

package com.example.demo.controller;

import com.example.demo.model.Participant;
import com.example.demo.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8100", maxAge = 3600)
@RestController
@RequestMapping({"/participant"})
public class ParticipantController {

    @Autowired
    ParticipantService participantService;

    @PostMapping("/create")
    public ResponseEntity<Participant> createAuthor(@RequestBody Participant participant){
        //return new ResponseEntity<Participant>(this.participantService.createAuthor(participant), HttpStatus.OK);
        return null;
    }
}

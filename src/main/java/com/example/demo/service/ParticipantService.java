package com.example.demo.service;

import com.example.demo.Repositories.ParticipantRepository;
import com.example.demo.model.Bet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class ParticipantService {
    @Autowired
    ParticipantRepository participantRepository;

    @Autowired
    Bet bet;

    static Logger log = Logger.getLogger(ParticipantService.class.getName());


}
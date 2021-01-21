package com.tutuna.service;

import com.tutuna.model.Speaker;
import com.tutuna.repository.HibernateSpeakerRepositoryImpl;
import com.tutuna.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    public List<Speaker> findAll() {
        return repository.findAll();
    }

}

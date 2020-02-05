package com.cetekot.jokes.service;

import com.cetekot.jokes.persistence.repository.JokeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * Copyright:    Copyright (c) 2020
 * Company:      Crazy coding inc.
 *
 * @author Andrei 'cetekot' Larin
 * @version 1.0
 */
@Service
public class JokeService {

    private JokeRepository repository;

    @Autowired
    public JokeService( JokeRepository repository ) {

        this.repository = repository;
    }

    public String getRandomJoke() {

        int index = ( int ) ( Math.random() * repository.count() );
        return repository.findAll( PageRequest.of( index, 1 ) ).getContent().get( 0 ).getLine();
    }
}

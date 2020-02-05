package com.cetekot.jokes.controller;

import com.cetekot.jokes.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Copyright:    Copyright (c) 2020
 * Company:      Crazy coding inc.
 *
 * @author Andrei 'cetekot' Larin
 * @version 1.0
 */
@Controller
@RequestMapping( value = "/" )
public class JokeController {

    private JokeService service;

    @Autowired
    public JokeController( JokeService service ) {

        this.service = service;
    }

    @GetMapping
    public String getRandomJoke( Model model ) {

        model.addAttribute( "line", service.getRandomJoke() );
        return "index";
    }
}

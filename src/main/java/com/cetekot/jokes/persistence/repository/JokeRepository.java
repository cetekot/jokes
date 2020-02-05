package com.cetekot.jokes.persistence.repository;

import com.cetekot.jokes.persistence.entity.Joke;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Copyright:    Copyright (c) 2020
 * Company:      Crazy coding inc.
 *
 * @author Andrei 'cetekot' Larin
 * @version 1.0
 */
public interface JokeRepository extends JpaRepository<Joke, Long> {

}

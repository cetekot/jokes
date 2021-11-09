package com.cetekot.jokes.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.text.MessageFormat;

/**
 * Copyright:    Copyright (c) 2020
 *
 * @author Andrei 'cetekot' Larin
 * @version 1.0
 */
@Entity
@Table( name = "jokes" )
@Data
public class Joke {

    @Id
    @Column( name = "id" )
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @Column( name = "line", nullable = false )
    private String line;

    @Override
    public String toString() {

        return MessageFormat.format( "Joke [id={0}, line={1}]", id, line );
    }
}

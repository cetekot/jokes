package com.cetekot.jokes.persistence.entity;

import javax.persistence.*;
import java.text.MessageFormat;

/**
 * Copyright:    Copyright (c) 2020
 * Company:      Crazy coding inc.
 *
 * @author Andrei 'cetekot' Larin
 * @version 1.0
 */
@Entity
@Table( name = "jokes" )
public class Joke {

    @Id
    @Column( name = "id" )
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @Column( name = "line", nullable = false )
    private String line;

    public Long getId() {

        return id;
    }

    public void setId( Long id ) {

        this.id = id;
    }

    public String getLine() {

        return line;
    }

    public void setLine( String line ) {

        this.line = line;
    }

    @Override
    public String toString() {

        return MessageFormat.format( "Joke [id={0}, line={1}]", id, line );
    }
}

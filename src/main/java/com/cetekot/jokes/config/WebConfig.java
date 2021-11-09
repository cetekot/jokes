package com.cetekot.jokes.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * Copyright:    Copyright (c) 2020
 *
 * @author Andrei 'cetekot' Larin
 * @version 1.0
 */
@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers( ResourceHandlerRegistry registry ) {

        registry.addResourceHandler( "/image/**" ).addResourceLocations( "classpath:/static/image/" );
    }
}

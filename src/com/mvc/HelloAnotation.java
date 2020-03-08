/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author HP
 */
@Configuration
public class HelloAnotation {
    @Bean    
    public Hello hello(){
        
        return new Hello();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc;


public class Hello {
 String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public void init(){
        
        System.out.println("before initilization");
}
    public void destroy(){
        
        System.out.println("before destroyed");
}
}

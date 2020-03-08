/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc;

public class Address {
    String city;
    String dis;

    public void setCity(String city) {
        this.city = city;
    }
    

    public Address(String city, String dis) {
        this.city = city;
        this.dis = dis;
    }

    @Override
    public String toString() {
        return city +" "+  dis;
    }
    
    
}

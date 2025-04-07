package com.example.ejbs;

import jakarta.ejb.Stateless;

/**
 *
 * @author Henintsoa
 */
@Stateless
public class HelloEJB {
    public String direBonjour() {
        return "Bonjour depuis mon App!";
    }
    
}

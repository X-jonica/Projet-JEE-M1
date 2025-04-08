package com.example.ejbs;

import jakarta.ejb.Stateless;
import java.util.Date;

@Stateless
public class HelloService {
    public String getHelloMessage(){
        return "Bonjour le frontend depuis java + " + new Date();
    }
}

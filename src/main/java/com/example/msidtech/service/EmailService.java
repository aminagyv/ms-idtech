package com.example.msidtech.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {

    public void sendEmail(String who,String email){
        System.out.println("Sending email to; "+who);
        System.out.println("Sending email; "+email);
    }
}

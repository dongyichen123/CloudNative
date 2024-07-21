package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class MsgService {

    public MsgVO hello(){
        return new MsgVO("hello");
    }
}

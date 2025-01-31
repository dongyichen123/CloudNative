package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {
    @Autowired
    MsgService msgService;

    @GetMapping (path = "/demo",produces = MediaType.APPLICATION_JSON_VALUE)
    public MsgVO hello(){
        return msgService.hello();
    }
}

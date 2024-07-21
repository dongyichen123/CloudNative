package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;


@Getter
@Setter
public class MsgVO {
    private String msg;
    public MsgVO(String s){
        this.msg = s;
    }
}

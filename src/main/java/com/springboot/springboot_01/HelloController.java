package com.springboot.springboot_01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/say")
    public  String say(){
        return "你好，springboot!";
    }

}

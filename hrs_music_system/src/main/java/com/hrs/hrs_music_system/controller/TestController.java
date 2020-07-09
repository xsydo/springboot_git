package com.hrs.hrs_music_system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Xsy
 * @create 2020 - 07 - 09 - 15:15
 * @version:1.0
 **/

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/test")
    public String test(){
        System.out.println("hello");
        return "hello ljf";
    }
}

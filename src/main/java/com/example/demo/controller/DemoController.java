package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>TODO</p>
 *
 * @author Hance
 * @version V1.0.0
 * @date 2022/12/28 0:53
 */
@RestController
public class DemoController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/test")
    public String test(){
        String name = "Hance";
        return "test"+name;
    }
}

package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ahmetatalay on 14/01/17.
 */

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        System.out.println("Hello World");
        return "Hello Ahmet";
    }

}

package com.tuten.tuten.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class times {

    @RequestMapping(value="getTimes",method = RequestMethod.POST)
    public String getTimes(){

        return "Hola";


    }
}

package com.world.usa.covid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {


    @GetMapping("/getresult")
    public String getResult(){

        return "Hello I am here";
    }

    public static void main(String[] args){

        System.out.println("Hello covid-19");
    }

}

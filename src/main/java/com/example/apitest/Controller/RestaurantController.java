package com.example.apitest.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "restaurant")
public class RestaurantController {

    @GetMapping("/all")
    public String afficheText(){

        return "hellow world félicitation ";

    }

}

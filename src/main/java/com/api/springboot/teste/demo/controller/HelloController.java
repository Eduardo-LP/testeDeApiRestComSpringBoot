package com.api.springboot.teste.demo.controller;

import com.api.springboot.teste.demo.model.EstimateModel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(path = "/teste/{numero1}/{numero2}")
    public int check(@PathVariable("numero1") int numero1, @PathVariable("numero2") int numero2){
        EstimateModel estimate = new EstimateModel(numero1, numero2);
        return estimate.soma();
    }
}

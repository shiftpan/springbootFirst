package com.springLearning.cources.conroller;

import com.springLearning.cources.entity.Cource;
import com.springLearning.cources.service.CourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourceController {

    @Autowired
    private CourceService courceService;

    @GetMapping("/cources")
    public List<Cource> getAllCources(){

        return this.courceService.getAllCource();

    }



}

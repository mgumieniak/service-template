package com.mgumieniak.servicetemplatewebapp.controllers;

import com.mgumieniak.servicetemplatemodels.models.Test;
import com.web.commonrest.Test2;
import lombok.val;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("")
    public String get(){
        val test2 = new Test2("1","1");
        val test = new Test();
        return "KOT";
    }
}

package com.tck.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class AudioController {

    @GetMapping("audio")
    public String audio (Map<String,Object> model){

        return "audio";
    }
}

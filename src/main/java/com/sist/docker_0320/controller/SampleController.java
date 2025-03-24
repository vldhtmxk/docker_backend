package com.sist.docker_0320.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sist.docker_0320.service.SampleService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/sample")
@RequiredArgsConstructor
public class SampleController {
    
    private final SampleService sampleService;

    @RequestMapping("/all")
    public Object all(){
        return sampleService.getAll();
    }
    
}

package com.exampleJava.demoSpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sampleprogram")
public class SampleController {
    @GetMapping
    public String returnValue(){
        return "This is sample";
    }
}

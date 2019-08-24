package com.example.microservice1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public String greeting() {
//        return new Greeting(counter.incrementAndGet(),
//                            String.format(template, name));
        
        RestTemplate restTemplate = new RestTemplate();
        String string = restTemplate.getForObject("http://microservice2:8081/greeting", String.class);
        return string + " and microservice1";
    }
}
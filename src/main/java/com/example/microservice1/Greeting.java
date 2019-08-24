package com.example.microservice1;

import com.fasterxml.jackson.annotation.JsonCreator;

public class Greeting {

    private final long id;
    private final String content;

    @JsonCreator
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
    
}
package com.clockworkjava.kursspring.domain;

import org.springframework.stereotype.Component;

@Component
public class Quest {

    private String description;


    public Quest() {
        this.description ="Save the Queen";
    }

    @Override
    public String toString() {
        return description;
    }
}

package com.clockworkjava.kursspring.domain;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:castle.properties")
public class Castle {


    @Value("${my.castle.name:East Watch}")
    private String name;

    Knight knight;

    @Autowired
    public Castle(Knight knight) {
        this.knight = knight;
    }

    Castle(Knight knight, String name) {
        this.knight = knight;
        this.name = name;
    }

    @PostConstruct
    public void build() {
        System.out.println("Build castle " + name);
    }

    @PreDestroy
    public void tearDown() {
        System.out.println("Tear down castle " + name);
    }

    @Override
    public String toString() {
        return name + ". It's flat of knight" + knight;
    }
}














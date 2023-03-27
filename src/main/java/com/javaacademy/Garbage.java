package com.javaacademy;


import lombok.Value;

@Value
public class Garbage {

    private final GarbageType garbageType;

    private final double weight;

    private final String cityFrom;

}

package com.javaacademy;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.Objects;
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Getter
public class Garbage {
    private final GarbageType garbageType;
    private final double weight;
    private final String cityFrom;



}

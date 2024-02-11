package com.javaacademy;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Бутылка
 */
@RequiredArgsConstructor
@ToString
public class Bottle {
    @Getter
    private final double volume;
    @Setter
    private double nestedVolume;
    @ToString.Exclude
    private final String cityProducer;

    public void addLiquid(double liquidVolume) {
        if (liquidVolume > nestedVolume) {
            throw  new RuntimeException("Объем добавляемой жидкости больше чем объем бутылки");
        }
        double newNestedVolume = nestedVolume + liquidVolume;
        if (newNestedVolume > volume) {
            throw  new RuntimeException("Нет места в бутылки, все выливается!");
        }
        setNestedVolume(newNestedVolume);
    }
}

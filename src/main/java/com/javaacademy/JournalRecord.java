package com.javaacademy;

import lombok.Builder;

@Builder
public class JournalRecord {
    private double garbageWeight;
    private Bottle bottle;
    private Cartoon cartoon;

    @Override
    public String toString() {
        if (bottle != null) {
            return "Переработан стеклянный мусор, получились бутылки объема " + bottle.getVolume() + " мл\n";
        } else if (cartoon != null) {
            return "Переработан картон, получилось " + cartoon.getWeight() + " кг картона\n";
        }
        return "Не переработано: " + garbageWeight + " килограмм мусора\n";
    }
}

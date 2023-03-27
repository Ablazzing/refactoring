package com.javaacademy;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class JournalRecord {
    private double garbageWeight;

    private Bottle bottle;

    private Cartoon cartoon;

    @Override
    public String toString() {
        if (bottle != null) {
            return "Переработан стеклянный мусор, получились бутылки объема " + bottle.getVolume() + " мл\n";
        } else if (cartoon != null) {
            return "Переработан бумажный мусор, получилось " + cartoon.getWeight() + " кг картона\n";
        }
        return "Не переработано: " + garbageWeight + " килограмм смешанного мусора\n";
    }
}

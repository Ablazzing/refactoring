package com.javaacademy;

import lombok.*;

/**
 * Город
 */
@AllArgsConstructor
@Getter
@ToString
public class City {
    @NonNull
    public final String name;
    @Setter
    @ToString.Exclude
    public int peopleCount;

    public Garbage[] createGarbage() {
        return new Garbage[] {
            new Garbage(GarbageType.GLASS, 1000, this.name),
            new Garbage(GarbageType.PAPER, 15000, this.name),
            new Garbage(GarbageType.MIXED, 200000, this.name),
        };
    }
}

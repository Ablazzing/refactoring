package com.javaacademy;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum GarbageType {

    PAPER("Бумага"), GLASS("Стекло"), MIXED("Смешанный мусор");

    private final String value;
}

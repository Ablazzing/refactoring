package com.javaacademy;

import lombok.NonNull;
import lombok.SneakyThrows;

import java.io.BufferedWriter;
import java.io.IOException;

import static com.javaacademy.GarbageType.GLASS;
import static com.javaacademy.GarbageType.PAPER;

/**
 * Фабрика по переработке мусора
 */

public class UtilizationFactory {
    @NonNull
    private static final double BOTTLE_SIZE = 500;
    private UtilizationFactory(){}
    @SneakyThrows
    private static Bottle refactorGlassGarbage(Garbage garbage) throws GarbageNotRefactorableException {
        if (garbage.getGarbageType() != GLASS) {
            throw new GarbageNotRefactorableException("Мусор не состоит полностью из стекла!");
        }
        return new Bottle(BOTTLE_SIZE, garbage.getCityFrom());
    }
    @SneakyThrows
    private static Cartoon refactorPaperGarbage(Garbage garbage) throws GarbageNotRefactorableException {
        if (garbage.getGarbageType() != PAPER) {
            throw new GarbageNotRefactorableException("Мусор не состоит полностью из бумаги!");
        }
        return new Cartoon(garbage.getWeight() / 2);
    }

    public static void refactorGarbage(Garbage[] garbageArray, BufferedWriter journal)
            throws GarbageNotRefactorableException, IOException {
        for (Garbage garbage : garbageArray) {
            switch (garbage.getGarbageType()) {
                case GLASS ->
                        journal.write(new JournalRecord(UtilizationFactory.refactorGlassGarbage(garbage)).toString());
                case PAPER ->
                        journal.write(new JournalRecord(UtilizationFactory.refactorPaperGarbage(garbage)).toString());
                default -> journal.write(new JournalRecord(garbage.getWeight()).toString());
            }
        }
    }
}

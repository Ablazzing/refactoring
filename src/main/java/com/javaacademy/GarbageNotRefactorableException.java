package com.javaacademy;


import lombok.Builder;

@Builder
public class GarbageNotRefactorableException extends Exception{

    private String message;

    private Throwable cause;

    private boolean enableSuppression;

    private boolean writableStackTrace;
}

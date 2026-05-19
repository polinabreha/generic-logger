package com.pluralsight;

public class Error extends LogLevel {
    @Override
    public String getLabel() {
        return "ERROR";
    }
    @Override
    public int getSeverity() {
        return 4;
    }
}

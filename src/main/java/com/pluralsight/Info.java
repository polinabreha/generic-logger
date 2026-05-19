package com.pluralsight;

public class Info extends LogLevel{
    @Override
    public String getLabel() {
        return "INFO";
    }

    @Override
    public int getSeverity() {
        return 2;
    }
}

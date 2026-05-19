package com.pluralsight;

public class Warning extends LogLevel{
    @Override
    public String getLabel() {
        return "WARNING";
    }

    @Override
    public int getSeverity() {
        return 3;
    }
}

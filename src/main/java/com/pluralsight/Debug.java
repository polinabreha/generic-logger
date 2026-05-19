package com.pluralsight;

public class Debug extends LogLevel{
    @Override
    public String getLabel() {
        return "DEBUG";
    }

    @Override
    public int getSeverity() {
        return 1;
    }
}

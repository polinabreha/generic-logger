package com.pluralsight;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Logger<Error> logger = new Logger<>();
        logger.log("NullPointerException in OrderService", new Error());

        Logger<Debug> logger2 = new Logger<>();
        logger2.log("Entering method: calculateTotal()", new Debug());

        Logger<Warning> warningLogger = new Logger<>();

        List<String> messages = List.of(
                "Disk usage above 80%",
                "Memory usage above 90%",
                "CPU spike detected"
        );

        warningLogger.logMultiple(messages, new Warning());



    }
}

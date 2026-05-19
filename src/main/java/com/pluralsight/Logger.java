package com.pluralsight;

import java.util.List;

public class Logger <T extends LogLevel>{

   void log(String message, T level){
      System.out.println("[" + level.getLabel() + "] (severity: " + level.getSeverity() + ") " + message);
   }

   void logMultiple(List<String> messages, T level){
      for (String message : messages) {
         log(message, level);
      }
   }

}

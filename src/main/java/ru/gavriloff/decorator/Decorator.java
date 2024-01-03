package ru.gavriloff.decorator;

import java.text.SimpleDateFormat;

public class Decorator {
    public static String addTimeToRecord(String record){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        return formatter.format(System.currentTimeMillis()) + " " + record;
    }
}

package pl.sdacademy.java.intermediate.Calendar;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CalendarProg {
        public static void main(String[] args) {

            PropertiesLoader propertiesLoader = new PropertiesLoader();
            System.out.println("ścieżka do event'ów: " + propertiesLoader.getValue());
            System.out.println("ścieżka do listy todo: " + propertiesLoader.getValue2());
            System.out.println(propertiesLoader.getValue3());
            System.out.println(propertiesLoader.getValue4());

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy HH:mm");

            String date = "16122016 13:45";

            LocalDateTime localDateTime = LocalDateTime.parse(date, formatter);

            System.out.println("Sformatowaliśmy tą datę:");
            System.out.println(formatter.format(localDateTime));
            System.out.println("do tej daty:");
            System.out.println(localDateTime);

            }
}

package br.com.casadocodigo.teste;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static java.time.temporal.ChronoUnit.MILLIS;
import static java.time.temporal.ChronoUnit.SECONDS;

public class TestandoPerformance {

    public static void main(String[] args) {

        // Time controllers
        LocalTime start;
        LocalTime end;

        // Filling up a list with values
        List<String> listOfStrings = new ArrayList<>();
        for (int i=0;i<150000;i++) {
            listOfStrings.add("item_" + i);
        }

        // Searching on the list
        start = LocalTime.now();
        System.out.println(" Search start time on List: " + start.format(DateTimeFormatter.ofPattern("hh:mm:ss")));

        for (int i=0; i<listOfStrings.size(); i++) {
            listOfStrings.contains("item_" + i);
        }
        end = LocalTime.now();
        System.out.println(" Search end time on List: " + end.format(DateTimeFormatter.ofPattern("hh:mm:ss")));

        // Display total search time
        System.out.println("Total time on List:" + MILLIS.between(start,end));
        System.out.println("Total time on List:" + Duration.between(start,end).getNano());


        // Filling up a set with values
        Set<String> setOfStrings = new HashSet<>();
        for (int i=0; i<150000; i++) {
            setOfStrings.add("item_" + i);
        }

        // Searching on the set
        start = LocalTime.now();
        System.out.println(" Search start time on Set: " + start.format(DateTimeFormatter.ofPattern("hh:mm:ss")));

        for (int i=0; i<setOfStrings.size(); i++) {
            setOfStrings.contains("item_" + i);
        }

        end = LocalTime.now();
        System.out.println(" Search end time on Set: " + end.format(DateTimeFormatter.ofPattern("hh:mm:ss")));

        // Display total amount of time the full search took in milliseconds
        System.out.println("Total time on Set: " + MILLIS.between(start,end));

    }

}

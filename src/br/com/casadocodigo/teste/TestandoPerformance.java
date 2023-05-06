package br.com.casadocodigo.teste;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.*;

import static java.time.temporal.ChronoUnit.SECONDS;

public class TestandoPerformance {

    public static void main(String[] args) {

        // Formatter
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss");

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
        System.out.println(" Search start time on List: " + start);

        for (int i=0; i<listOfStrings.size(); i++) {
            listOfStrings.contains("item_" + i);
        }
        end = LocalTime.now();
        System.out.println(" Search end time on List: " + end);

        // Display total search time
        System.out.println("Total time on List:" + SECONDS.between(start,end));

        // Filling up a set with values
        Set<String> setOfStrings = new HashSet<>();
        for (int i=0; i<150000; i++) {
            setOfStrings.add("item_" + i);
        }

        // Searching on the set
        start = LocalTime.now();
        System.out.println(" Search start time on Set: " + start);

        for (int i=0; i<setOfStrings.size(); i++) {
            setOfStrings.contains("item_" + i);
        }

        end = LocalTime.now();
        System.out.println(" Search end time on Set: " + end);

        // Display total amount of time the full search took in milliseconds
        System.out.println("Total time on Set: " + SECONDS.between(start,end));

    }

}

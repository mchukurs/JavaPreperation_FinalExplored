package com.chukurs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MainMailer {
    public static void main(String[] args) {
        //List with duplicate 'names'
        //use Map to keep track of 'Accounts' for each distinct 'name'
        String[] names = {"Anna Jones", "Anna Jones Ph.D.",
                "Bob Jones M.D.",
                "Carol Jones",
                "Ed Green Ph.D.", "Ed Green M.D.",
                "Ed Black"};

        List<StringBuilder> population = getNames(names);
        Map<StringBuilder, Integer> counts = new TreeMap<>();//tree map to be sorted
        population.forEach(s -> {
            counts.merge(s, 1, (o1, n1) -> o1 + n1);
            //i use this on purpose, to strengthen the understanding of using interfaces
        });
        System.out.println(counts);
        StringBuilder annJonesPhd = new StringBuilder("Anna Jones Ph.D.");
        System.out.println("There are " + counts.get(annJonesPhd) + " records for " + annJonesPhd);

        List<StringBuilder> cleanedNames = standardizeNames(population);
        System.out.println(cleanedNames);

        System.out.println("There are " + counts.get(annJonesPhd) + " records for " + annJonesPhd);
        System.out.println(counts);
        StringBuilder annJones = new StringBuilder("Anna Jones");
        System.out.println("There are " + counts.get(annJones) + " records for " + annJones);
        System.out.println("-".repeat(20));
        counts.forEach((k,v)-> System.out.println(k+":"+v));
        System.out.println("-".repeat(20));
        counts.keySet().forEach(k-> System.out.println(k+ ":" +counts.get(k)));



    }

    private static List<StringBuilder> getNames(String[] names) {
        List<StringBuilder> list = new ArrayList<>();
        int index = 3;
        for (String name : names) {
            for (int i = 0; i < index; i++) {
                list.add(new StringBuilder(name));
            }
            index++;
        }

        return list;
    }

    private static List<StringBuilder> standardizeNames(List<StringBuilder> list) {
        List<StringBuilder> newList = new ArrayList<>();
        for (var name : list) {
            for (String suffix : new String[]{"Ph.D.", "M.D."}) {
                int startIndex = -1;
                //we reassign the value to startIndex in the if statement
                if ((startIndex = name.indexOf(suffix)) > -1) {
                    name.replace(startIndex - 1, startIndex + suffix.length(), "");
                }
                newList.add(name);
            }
        }
        return newList;
    }
}

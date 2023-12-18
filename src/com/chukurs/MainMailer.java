package com.chukurs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MainMailer {
    public static void main(String[] args) {
        //List with duplicate 'names'
        //use Map to keep track of 'Accounts' for each distinct 'name'
        String[] names = {"Anna Jones", "Ann Jones Ph.D.",
                "Bob Jones M.D.",
                "Carol Jones",
                "Ed Greend Ph.D.", "Ed Green M.D.",
                "Ed Black"};

        List<StringBuilder> population = getNames(names);
        Map<StringBuilder, Integer> counts = new TreeMap<>();//tree map to be sorted
        population.forEach(s->{
            counts.merge(s,1, (o1,n1)-> o1+n1);
            //i use this on purpose, to strengthen the understanding of using interfaces
        });
        System.out.println(counts);
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
}

package net.test;

import java.util.*;

class MapTest {
    public static void main(String[] args) {
        Map<String,Double> gpaMap = new HashMap<>(); //K: String, V: Double; LinkedHashMap keeps input order; TreeMap - natural order of its keys
        gpaMap.put("jay", 3.86);
        gpaMap.put("steph", 3.92);
        gpaMap.put("scott", 3.61);
        gpaMap.put("hitesh", 3.3);
        gpaMap.put("cindy", 3.7);
        gpaMap.put("chase", 1.2);
        gpaMap.put("michael", 2.1);

//        dump(gpaMap);
        double ScottsGpa = gpaMap.get("scott"); // returns value (Double) next to that key
        System.out.println("Scott's GPA: " + ScottsGpa);

        //print all GPAs that are 3.5 or greater; values gives the Value
        Collection<Double> gpas = gpaMap.values();
        for (Double gpa : gpas) {
            if (gpa >= 3.5) {
                System.out.println(gpa);
            }
        }

        // print all names of those with a gpa of 3.0 or greater
        for (var entry : gpaMap.entrySet()) { // var = Map.Entry<String,Double>
            if (entry.getValue() >= 3.0) {
                System.out.println(entry.getKey());
            }
        }
    }

    private static void dump(Map<String,Double> map) {
        for (Map.Entry<String,Double> entry : map.entrySet()) { // in Java 11, could do: var entry : ...
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }
    }
}
package com.kodilla.collections.adv.immutable.Exercise;

import java.util.HashMap;
import java.util.Map;

public class printItinerary {
    public static void main(String[] args) {
        Map<String, String> ports = new HashMap<String, String>();
        ports.put("Szczecin", "Wroclaw");
        ports.put("Poznan", "Warszawa");
        ports.put("Wroclaw", "Poznan");
        ports.put("Warszawa", "Krakow");

        printResult(ports);

    }

    // This function populates 'result' for given input 'ports
    private static void printResult(Map<String, String> ports) {
        Map<String, String> reversePorts = new HashMap<String, String>();

        // To fill reverse map, iterate through the given map
        for (Map.Entry<String,String> entry: ports.entrySet())
            reversePorts.put(entry.getValue(), entry.getKey());

        // Find the starting point of itinerary
        String start = null;
        for (Map.Entry<String,String> entry: ports.entrySet())
        {
            if (!reversePorts.containsKey(entry.getKey()))
            {
                start = entry.getKey();
                break;
            }
        }
        // If we could not find a starting point, then something wrong
        // with input
        if (start == null)
        {
            System.out.println("Invalid Input");
            return;
        }
        // Once we have starting point, we simple need to go next, next
        // of next using given hash map
        String to = ports.get(start);
        while (to != null)
        {
            System.out.print(start +  "->" + to + ", ");
            start = to;
            to = ports.get(to);
        }
    }
}

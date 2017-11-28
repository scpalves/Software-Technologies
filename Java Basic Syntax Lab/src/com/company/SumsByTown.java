package com.company;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class SumsByTown {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        HashMap<String, Double> incomeData = new HashMap<String, Double>();

        for(int i = 0; i < lines; i++){
            String[] data = scanner.nextLine().split("\\|");

            String town = data[0].trim();
            double income = Double.parseDouble(data[1].trim());

            if(!incomeData.containsKey(town)){
                incomeData.put(town, 0.0);
            }
            incomeData.put(town, incomeData.get(town) + income);
        }

        for(String key: incomeData.keySet()){
            System.out.println(key + " -> " + incomeData.get(key));

        }
    }
}

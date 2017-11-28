package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(numbers);

        int counter = 0;


        for (int i = numbers.length - 1; i >= 0; i--) {
            counter++;
            if (counter > 3) {
                break;
            }

            System.out.println(numbers[i] + " ");
        }
    }
}

package com.company;

import java.util.Scanner;

public class SymmetricNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            if(isSymmetric(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isSymmetric(Integer number) {

        String numToStr = number.toString();
        for(int i = 0; i < numToStr.length() / 2; i++){
            if(numToStr.charAt(i) != numToStr.charAt(numToStr.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
}

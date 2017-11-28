package com.company;

import java.util.Scanner;

public class IntegersSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (!checkNumbers(num1, num2, num3) &&
                !checkNumbers(num2, num3, num1) &&
                !checkNumbers(num1, num3, num2)){
            System.out.println("No");
        }

    }

    public static boolean checkNumbers(int first, int second, int sum) {
        if (first + second == sum) {
            if (first > second) {
                int temp = first;
                first = second;
                second = temp;
            }

            System.out.printf("%d + %d = %d", first, second, sum);
            return true;
        }
        return false;
    }

}





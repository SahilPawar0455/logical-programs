package com.bridgelabz.logicalPrograms;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                result += i;
            }
        }
        if (result == number){
            System.out.println("This is Perfect Number");
        }else {
            System.out.println("This is not Perfect Number");
        }
    }
}

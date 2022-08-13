package com.bridgelabz.logicalPrograms;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int number = scanner.nextInt();
        System.out.println("fibonacci Series is : ");
        for (int i = 2; i < number ; i++) {
            int fibonacci = firstNumber + secondNumber;
            System.out.print(fibonacci +" ,");
            firstNumber = secondNumber;
            secondNumber = fibonacci;
        }
    }
}

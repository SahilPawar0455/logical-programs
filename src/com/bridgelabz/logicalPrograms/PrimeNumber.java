package com.bridgelabz.logicalPrograms;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = scanner.nextInt();
        boolean prime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        if(prime){
            System.out.println("This is prime Number");
        }else {
            System.out.println("This is Not Prime Number");
        }
    }
}

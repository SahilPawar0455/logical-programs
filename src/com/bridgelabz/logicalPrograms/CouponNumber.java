package com.bridgelabz.logicalPrograms;

import java.util.Scanner;

public class CouponNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How Many Coupon is generating");
        int howManyCoupon = scanner.nextInt();
        int min = 100;
        int max = 999;
        System.out.println("Coupon Number : ");
        for (int i=0; i<howManyCoupon; i++){
            int couponNumber =(int) (Math.random()*(max-min)+min);
            System.out.println(couponNumber);
        }
    }
}

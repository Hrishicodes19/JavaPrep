package com.practice.basic;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number ");
        long number = input.nextLong();
        System.out.println("Reverse of the given number: "+ makeReverse(number));
        input.close();
    }

    public static long makeReverse(long number) {
        long answer = 0;
        while (number > 0) {
            long reminder = number % 10;
            number /= 10;
            answer = answer * 10 + reminder;
        }
        return answer;
    }
}

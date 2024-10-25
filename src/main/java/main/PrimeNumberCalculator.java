package main;

import java.util.Scanner;

public class PrimeNumberCalculator {

    public int countPrimesInRange(int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException("Hoppsan, fel intervall angivet!");
        }

        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public int sumPrimesInRange(int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException("Hoppsan, fel intervall angivet!");
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public int startNumber(int num){
        int start = num;
        if (start <= 0 || start >= 1000){
            throw new IllegalArgumentException("Hoppsan, siffran är inte inom intervallet!");
        }
        return start;
    }

    public int endNumber(int num){
        int end = num;
        if (end <= 0 || end >= 1000){
            throw new IllegalArgumentException("Hoppsan, siffran är inte inom intervallet!");
        }
        return end;
    }

    public void printCount(int count) {
        System.out.println("Hej, det finns " + count + " primtal i det angivna intervallet!");
    }

    public void printSum(int sum) {
        System.out.println("Och den totala summan av dessa primtal är " + sum + ".");
    }
}

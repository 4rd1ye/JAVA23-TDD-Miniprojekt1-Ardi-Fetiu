package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrimeNumberCalculator calculator = new PrimeNumberCalculator();
        try {
            System.out.println("Ange ett startvärde (mellan 0 och 1000):");
            int start = calculator.startNumber(scanner.nextInt());

            System.out.println("Ange ett slutvärde (mellan 0 och 1000):");
            int end = calculator.endNumber(scanner.nextInt());

            int count = calculator.countPrimesInRange(start, end);
            int sum = calculator.sumPrimesInRange(start, end);

            calculator.printCount(count);
            calculator.printSum(sum);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}


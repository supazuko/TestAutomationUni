package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter base cost of phone plan: ");
        double baseCost = scanner.nextDouble();

        System.out.println("Enter overage minutes:");
        double overageMinutes = scanner.nextDouble();

        double overageFee = calculateOverageFees(overageMinutes);
        double tax = calculateTax(baseCost + overageFee);

        calculateTotalBill(baseCost, overageFee, tax);
    }

    private static double calculateTax(double subtotal) {
        double rate = 0.15;
        return subtotal * rate;
    }

    private static double calculateOverageFees(double extraMinutes) {
        double rate = 0.25;
        return extraMinutes * rate;
    }

    public static void calculateTotalBill(double base, double overage, double tax){
        double total = base + overage + tax;

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f", base));
        System.out.println("Overage: $" + String.format("%.2f", overage));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", total));
    }
}

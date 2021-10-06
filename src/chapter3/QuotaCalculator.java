package chapter3;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        int quota = 10;
        int sales = 0;
        int salesShort = quota - sales;

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sales did you make this week? ");
        sales = scanner.nextInt();
        scanner.close();

        if(sales >= quota) System.out.println("Congratulations, you met your quota!");
        else System.out.println("Sorry, you did not make your quota. You were "+salesShort+" sales short.");
    }
}

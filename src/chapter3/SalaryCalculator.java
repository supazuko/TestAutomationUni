package chapter3;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sales did the employee make this week? ");
        int sales = scanner.nextInt();
        scanner.close();

        if(sales > quota){
            salary += bonus;
        }

        System.out.println("The employee's pay is $" + salary);
    }
}

package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

        boolean qualified = isUserQualified(creditScore, salary);

        notifyUser(qualified);
    }

    public static double getSalary(){
        System.out.println("Enter your salary:");
        return scanner.nextDouble();
    }

    public static int getCreditScore(){
        System.out.println("Enter your credit score:");
        return scanner.nextInt();
    }

    public static boolean isUserQualified(int creditScore, double salary){
        return creditScore >= requiredCreditScore && salary >= requiredSalary;
    }

    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("Congrats! You've been approved.");
        }
        else{
            System.out.println("Sorry. You've been declined");
        }
    }
}

package chapter7;

import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String[] args) {
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for the day of the week: ");
        int index = input.nextInt();
        if (index > 0 && index <= 7){
            input.close();
        }else{
            System.out.println("Invalid input");
        }

        System.out.println("Corresponding day: " + week[index - 1]);
    }
}

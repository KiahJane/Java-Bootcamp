package main;

import java.util.Scanner;

public class NumDays {

    public static Integer askNums() {
        /* helper method -- asks & validates user input, saves array of integers until negative integer entered */
        Scanner sc = new Scanner(System.in);
        Integer sum = 0;
        String test = "";
        boolean shouldRun = true;

        do {
            try {
                System.out.print("Please enter an integer:");
                test = sc.nextLine();
                int num = Integer.parseInt(test);

                if (num > 0) {
                    String weekDay = WeekDayUtil.getWeekDayByUserInput(num);
                    System.out.println("You have entered weekday " + weekDay);
                }
                if (num > 0 && num % 2 == 0) {
                    sum += num;
                }
                if (num == 0) {
                    continue;
                }
                if (num < 0) {
                    shouldRun = false; // this will stop the iteration when a negative integer is received
                }

                return sum;
            } catch (Exception ex) {
                System.out.println();
            }
        } while (shouldRun);

        return null;
    }

    public static void main(String[] args) {
        NumDays numDays = new NumDays();

        int sum = askNums();

        System.out.println("The sum of all entered even numbers is: " + sum);
    }
}
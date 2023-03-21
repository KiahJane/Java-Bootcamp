package main;

import java.util.Scanner;

public class NumDays {

    public static Integer askNums() {
        /* helper method -- asks & validates user input, returns integer entered */
        Scanner sc = new Scanner(System.in);
        String test;
        int num;

        do {
            try {
                System.out.print("Please enter an integer:");
                test = sc.nextLine();
                num = Integer.parseInt(test);

                if (num < 0) {
                    break;
                } else {
                    return num;
                }
            } catch (Exception ex) {
                System.out.println("You have entered an invalid character");
            }
        } while (true);
        return num;
    }

    public static int getDay() {
        int num = askNums();
        int sum = 0;

        while(num >= 0){
            if(num == 0){
                num = askNums();
            }
            String weekDay = WeekDayUtil.getWeekDayByUserInput(num);
            System.out.println("You have entered weekday " + weekDay);
            if(num % 2 == 0){
                sum += num;
            }
            num = askNums();

            if (num < 0) {
                System.out.println("You have exited by entering a negative number");
                break;
            }
        }
        return sum;
    }

    public static void main (String[] args){

        int sum = getDay();
        System.out.println("The sum of all entered even numbers is: " + sum);
    }

}
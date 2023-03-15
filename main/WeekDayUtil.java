package main;

public final class WeekDayUtil {
    private WeekDayUtil(){

    }
    public static String getWeekDayByUserInput(Integer userInput){
        /* helper method -- takes user input and returns string (day of the week) */

        do {
            if (userInput > 6) {
                userInput = (userInput % 7);
            }
            return switch (userInput) {
                case 0 -> "Sunday";
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                default -> "Invalid day";
            };
        } while (true);
    }
}

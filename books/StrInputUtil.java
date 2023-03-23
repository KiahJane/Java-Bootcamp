package books;

import java.util.Scanner;

public class StrInputUtil {
    private StrInputUtil() {

    }

    public static String askStrInput(String prompt) {
        /* helper method -- asks & validates user input, returns string entered, 0 is exit value */
        Scanner sc = new Scanner(System.in);

        do {
            try {
                System.out.print(prompt);
                String input = sc.nextLine();
                if (input.equals("0")) {
                    System.out.println("exiting...");
                    return "0";
                }
                return input;
            } catch (Exception ex) {
                System.out.println("You have entered an invalid character");
            }
        } while (true);
    }
}

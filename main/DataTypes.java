package main;

import java.io.*;
import java.util.Scanner;

public class DataTypes {

    public static Double askNum(String prompt) {
        /* helper method -- asks & validates user input */
        Scanner sc = new Scanner(System.in);
        Double num = 0d;
        String test = "";
        boolean shouldRun = true;

        do {
            try {
                System.out.print(prompt);
                test = sc.nextLine();
                num = Double.parseDouble(test);

                if(num <= 0d){
                    System.out.println("Please enter a positive number:");
                    continue;
                }

                shouldRun = false;

                return num;

            } catch (Exception ex) {
                System.out.println("Please enter a number");
            }
        } while (shouldRun);

        return null;
    }

    public static void askInt(Double kilometers, Double conversionFactor) {
        /* helper method -- asks user input */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int miles = 0;
        try {
            if (num == 1) {
                miles = multiplyNums(kilometers, conversionFactor);
            } else if (num == 2) {
                miles = multiplyNums(kilometers, 0.62137119);
            }
            System.out.println(kilometers + " kilometers were entered, which is (circa) " + miles + " miles");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int multiplyNums(double num1, double num2) {
        /* helper method -- multiplies two doubles and returns as integer */
        return (int) ((num1 * num2));
    }

    public static void saveNumAsFile(double num, File fileName) {
        /* helper method -- saves double to text file */
        try {
            FileWriter fw = new FileWriter(fileName);
            fw.write(String.valueOf(num));
            fw.close();

            // System.out.println("Successfully wrote to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to " + fileName);
            e.printStackTrace();
        }
    }

    public static double readNumFile(File fileName) {
        /* helper method -- reads & returns double from text file */
        double num = 0;
        try {
            FileReader reader = new FileReader(fileName);
            char[] buffer = new char[100];
            reader.read(buffer);
            reader.close();

            String contents = new String(buffer);
            num = Double.parseDouble(contents);
            System.out.println("File contents: " + num);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
        return num;
    }

    public static void main(String[] args) {
        // DataTypes dataTypes = new DataTypes();
        File file = new File("./conversion_factor.txt");

        double kilometers = askNum("Enter a number of kilometers: ");
        double conversionFactor = askNum("Enter a conversion rate: ");
        saveNumAsFile(conversionFactor, file);
        int miles = multiplyNums(kilometers, conversionFactor);

        double num = readNumFile(file);
        double realConversionFactor = 0.62137119;

        if (num != realConversionFactor) {
            System.out.println("""
                    The entered kilometer to mile conversion factor is wrong. Would you like to:\s
                    1. continue anyways
                    2. use the real conversion factor""");
            askInt(kilometers, num);
        } else {
            System.out.println(kilometers + " kilometers were entered, which is (circa) " + miles + " miles");
        }
    }
}
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Grafton
 */
import java.util.Scanner;
public class Assignment_1_Exercise_11 {
    public static void main(String[] args) {

        // Scanner begins
        Scanner sc = new Scanner(System.in);

        double result = 0.0;

        // Beginning of program
        System.out.println("How many Euros are you exchanging?");

        double euros = sc.nextDouble();

        System.out.println("What is the exchange rate?");

        double exchangeRate = sc.nextDouble();

        double dollars = currencyConverter(euros, exchangeRate,result);

        // Final result of exchangeRate calculation
        System.out.println(euros + " Euros at an Exchange rate of " + exchangeRate + " is ");
        System.out.println(dollars + " U.S Dollars ");

        sc.close();
    }

    private static double currencyConverter(double euros, double exchangeRate,double result) {
        return result = euros * exchangeRate;
    }
}

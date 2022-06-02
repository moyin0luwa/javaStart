package com.javastart;

import java.text.NumberFormat;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int percentage = 100;
        final int yearsToMonths = 12;


        System.out.print("Type in the Principal($1K-1M) _");
        int principal = 0;
        while (true) {
            principal = scanner.nextInt();
            boolean validPrincipalInput = principal > 1000 && principal <= 1_000_000;
            if (validPrincipalInput)
                break;
            else
                System.out.print("Please enter a valid value between 1000 and 1,000,000 _");

        }


        System.out.print("Enter your annual interest rate _");
        float annualInterestRate = 0;
        while (true) {
            annualInterestRate = scanner.nextFloat();
            boolean validInterestInput = annualInterestRate > 0 && annualInterestRate <= 30;
            if (validInterestInput)
                break;
            else
                System.out.print("Please enter a valid value between 0 and 30 _");
        }
        float monthlyInterestRate = annualInterestRate/(percentage*yearsToMonths);


        System.out.print("Type in the Duration in years _");
        int periodInYears = 0;
        while (true) {
            periodInYears = scanner.nextInt();
            boolean validPeriodInput = periodInYears > 0 && periodInYears <= 30;
            if (validPeriodInput)
                break;
            else
                System.out.print("Please enter a valid value between 0 and 30 _");
        }
        int periodInMonths = periodInYears * yearsToMonths;


        double numerator = monthlyInterestRate*(Math.pow((1+monthlyInterestRate),periodInMonths));
        double denominator = (Math.pow((1+monthlyInterestRate),periodInMonths)) - 1;
        double mortgage = principal*(numerator/denominator);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        String mortgageResult = currencyInstance.format(mortgage);
        System.out.println("Mortgage = " + mortgageResult);
    }
}



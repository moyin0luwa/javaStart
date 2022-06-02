package com.javastart;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator{
    public int mortgageCalculator;{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type in the Principal _");
        int principal = scanner.nextInt();
        System.out.print("Type in the Annual Interest Rate _");
        float annualInterestRate = scanner.nextFloat();
        boolean validInterestInput = annualInterestRate > 0 && annualInterestRate <= 30;
        while (validInterestInput == false){
            System.out.println("Please enter a valid value between 0 and 30");

        }

            float monthlyInterestRate = annualInterestRate/(100*12);
        System.out.print("Type in the Duration in years _");
        int periodInMonths = (Integer.parseInt(scanner.nextLine().trim()))*12;
        double numerator = monthlyInterestRate*(Math.pow((1+monthlyInterestRate),periodInMonths));
        double denominator = (Math.pow((1+monthlyInterestRate),periodInMonths)) - 1;
        double mortgage = principal*(numerator/denominator);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        String mortgageResult = currencyInstance.format(mortgage);
        System.out.println("Mortgage = " + mortgageResult);

        //FizzBuzz
        //for (int i = 0; i < 100 ; i++){}
        System.out.print('>');
        int number = scanner.nextInt();
        if (number%15 == 0)
            System.out.println("FizzBuzz");
        else if (number%5 == 0)
            System.out.println("Fizz");
        else if (number%3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);
    }
}



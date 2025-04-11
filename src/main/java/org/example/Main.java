package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double initial_deposit;
        double future_value;
        double interest_rate;
        double total_Interest_Earned;
        int number_of_years;

        //future_value = initial_deposit × (1 + (interest_rate / 365))^(365 × number_of_years)

        Scanner myscanner= new Scanner(System.in);

        System.out.println("Enter the amount of deposit. Please insert on only number.Eg 5300, 6777");
        initial_deposit = myscanner.nextDouble();
        System.out.println(initial_deposit);


        System.out.println("What is the interest rate as a percentage but do not include %. Eg 7.62, 5 ");
        interest_rate = myscanner.nextDouble();
        interest_rate = interest_rate / 100;
        System.out.println(interest_rate);

        System.out.println("What is the number of Years.Eg 12,34");
        number_of_years = myscanner.nextInt();
        System.out.println(number_of_years);

        future_value = initial_deposit * Math.pow(1 + (interest_rate / 365), (365 * number_of_years));
        total_Interest_Earned=future_value-initial_deposit;

        System.out.println("The future value is " +" "+ future_value + "and the total interest earned is " +" " + total_Interest_Earned);

    }
}

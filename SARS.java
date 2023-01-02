import java.util.Scanner;

/*
The South African Revenue Service (SARS) normally helps the people to calculate their annual tax.
SARS always asks people to submit their monthly salary.
Then SARS calculates the total annual salary as well as the annual tax.
Write a program that asks the user to enter their name.
The program should ask the user to enter their monthly salary.
Using a FOR LOOP, the program should calculate the total salary for the 12 months in a year.
The program should use the total salary to find the annual tax.
The annual Tax is 14% of the total salary. Please see below for a sample output of what the program should do.

 */

import java.util.Scanner;
public class SARS {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String userName;
        Double userSalary, annualSalary, tax, annualTaxAmount;

        userName = "";
        userSalary = 0.0;
        annualSalary = 0.0;
        tax = 0.14;
        annualTaxAmount = 0.0;

        // print a welcome message

        System.out.println("=================");
        System.out.println("WELCOME TO SARS");
        System.out.println("=================");
        System.out.println("");

        // Informing the user to enter Name
        System.out.println("Please enter your Name: ");
        //How to capture a string from the user Eg. Name
        userName = sc.nextLine();
        // Informing the user to enter Salary
        System.out.println("Please enter your monthly Salary:");
        userSalary = sc.nextDouble();

        // Informing the user that our system is processing
        System.out.println("Please wait ......");

        //===================The FOR LOOP=====================

        // remember parts A,B,C of the FOR LOOP??
        // Why is 12 used in the condition??
        // Why does the test variable begin at 0?
        for (int i=0; i<12; i++) {
            //Remember part D of the FOR LOOP??
            // Also remember the default value of annual salary was 0.0
            //now we create a new value which is equal to the old value plus the entered salary
            annualSalary =annualSalary + userSalary;

        }
        //Calculating annual tax amount

        annualTaxAmount = annualSalary * tax;

        //========To DO =============
        //calculate how much the user is left with after deductions
        //====================

        // informing the user about the results after processing.
        System.out.println("Dear " + userName + ", your Annual Salary is : " + annualSalary);
        System.out.println("your annual tax deduction will be " + annualTaxAmount);

        System.out.println("");
        System.out.println("== Good Bye ==");


    }
}

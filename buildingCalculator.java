/*
create a calculator menu with options to add, subtract, multiply and divide.
The menu should have an exit option to allow the user to end the program.
 */

import java.util.Scanner;

public class buildingCalculator {
    public static void main(String args[]) {

            //preparing to capture user data using the Scanner class
            Scanner userInput = new Scanner(System.in);

            // variables declared
            int selectedOption, num1, num2 , result ;

// Declaring a constant. Eg the exit option
            final int exitOption = 0;

            // Default values given at the beginning.
            num1 = 0;
            num2 = 0;
            result = 0;

            // Show the menu to the user for the first time
            System.out.println("========= Welcome to simple calculator =========");
            System.out.println("press 1 to Add");
            System.out.println("press 2 to Subtract");
            System.out.println("press 3 to Multiply");
            System.out.println("press 4 to Divide");
            System.out.println("press 0 to exit");

            // Ask the user to select and option
            System.out.println("Please select an option");
            //capture the entered option using the scanner class.
            selectedOption = userInput.nextInt();

            // start of while loop to repeat the calculate menu until the user selects zero
            while (selectedOption!= exitOption)
            { // things to be done in the while loop

                //Using  the switch statement to decide on what operation to perform
                switch (selectedOption)
                { //start of the content inside the switch statement

                    case 1: //when option one is selected.
                    {
                        System.out.println("===== you selected Add =====");
                        System.out.println("please enter first number");
                        num1 = userInput.nextInt();
                        System.out.println("please enter second number");
                        num2 = userInput.nextInt();

                        result = num1 + num2;

                        System.out.println(num1 + " + " + num2 + " = " + result);
                    }
                    break;

                    case 2: //when option two is selected.
                    {
                        System.out.println("===== you selected Subtract =====");
                        System.out.println("please enter first number");
                        num1 = userInput.nextInt();
                        System.out.println("please enter second number");
                        num2 = userInput.nextInt();

                        result = num1 - num2;

                        System.out.println(num1 + " - " + num2 + " = " + result);
                    }
                    break;
                    case 3: //when option three is selected.
                    {
                        System.out.println("===== you selected Multiply =====");
                        System.out.println("please enter first number");
                        num1 = userInput.nextInt();
                        System.out.println("please enter second number");
                        num2 = userInput.nextInt();

                        result = num1 * num2;

                        System.out.println(num1 + " x " + num2 + " = " + result);
                    }
                    break;
                    case 4: // when option four is selected
                    {
                        System.out.println("===== you selected Divide =====");
                        System.out.println("please enter first number");
                        num1 = userInput.nextInt();
                        System.out.println("please enter second number");
                        num2 = userInput.nextInt();

                        result = num1 / num2;

                        System.out.println(num1 + " / " + num2 + " = " + result);
                    }
                    break;
                    // in case any other number is entered which is not part of the options
                    default:
                    {
                        System.out.println("You entered an incorrect option. Please see menu options");
                    }
                } //Closing the switch statement

                // now we display the menu again in case the used wants to calculate more
                System.out.println("======= Calculator menu =========");
                System.out.println("press 1 to Add");
                System.out.println("press 2 to Subtract");
                System.out.println("press 3 to Multiply");
                System.out.println("press 4 to Divide");
                System.out.println("press 0 to exit");

                System.out.println("Please select an option");
                selectedOption = userInput.nextInt();

            }// end of the while loop

            //once out of the loop end the program
            System.out.print("========Good Bye========");

        } //end of the main method

    } // end of the class


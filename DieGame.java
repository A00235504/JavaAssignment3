import java.util.Scanner;

/*
-----------------Readme--------------------
Student Name- Aakash Sadnani
Student ID - A00235504
Program Description - This program is written to perform the following task:.
1) Making 3 types of Dies with 3 different constructors and rolling the dice (3 constructors created)
2) Testing the dice by entering the number of sides or die type (2 test created)
3) A bonus 5 dice which is created having 6 sides
4) Rolling all the dice till we get the same sides up
5) Keeping the count of how many rolls are done

-----------------x------------------------
*/

public class DieGame {

    public static void main(String[] args) {

        int inputNumberOfSides = 0;
        System.out.println("Die Game");

        // dice 1 created
        System.out.println("Creating a default d6...");
        Die dice1 = new Die();

        // dice 2 created
        System.out.println("Creating a d13...");
        Die dice2 = new Die(13);

        // dice 3 created
        System.out.println("Creating percentile die (a special d5)...");
        Die dice3 = new Die(5, "d5");

        // printing the dice outputs of the current sides up and dice type
        System.out.println("The current side up for " + dice1.diceType + " is " + dice1.currentSideUp);
        System.out.println("The current side up for " + dice2.diceType + " is " + dice2.currentSideUp);
        System.out.println("The current side up for " + dice3.diceType + " is " + dice3.currentSideUp);

        // Testing the rolling method in all three dice
        System.out.println("\n\nTesting the Roll Method");

        // Rolling dice 1 and printing the current side up
        System.out.println("Rolling the " + dice1.getDiceType() + " ...");
        dice1.rollmethod();
        dice1.printDice();

        // Rolling dice 2 and printing the current side up
        System.out.println("Rolling the " + dice2.getDiceType() + " ...");
        dice2.rollmethod();
        dice2.printDice();

        // Rolling dice 3 and printing the current side up
        System.out.println("Rolling the " + dice3.getDiceType() + " ...");
        dice3.rollmethod();
        dice3.printDice();

        //Taking inputs from user for the number of sides of dice
        System.out.println("\n\nSetting the dice to user inputs..");
        System.out.println("Please enter number of sides(greater than or equal to 3) for a dice");
        Scanner scr = new Scanner(System.in);
        inputNumberOfSides = scr.nextInt();
        scr.nextLine();

        if(inputNumberOfSides >= 3){
            System.out.println("\n\nSetting the d" + inputNumberOfSides + " to show " + inputNumberOfSides + " ...");
            dice3.setNumSides(inputNumberOfSides);
            dice3.setDiceType("d" + inputNumberOfSides);
            dice3.rollmethod();
            while (inputNumberOfSides != dice3.getSidesUp()) {
                dice3.rollmethod();
            }
            System.out.println("The side up of " + dice3.getDiceType() + " is now " + dice3.getSidesUp());    
        }
        else{
            System.out.println("Please enter number of dice sides 3 or more than 3!");
        }

        // Bonus Code Here
        // Here we roll all the dice till we get the same sides up and its a YAHTZEE..
        System.out.println("\n-----\nBONUS\n-----");
        System.out.println("Creating 5 d6...");

        // creating 5 dice of 6 sides
        Die die1 = new Die(6);
        Die die2 = new Die(6);
        Die die3 = new Die(6);
        Die die4 = new Die(6);
        Die die5 = new Die(6);

        // Roll times is the number of rolls done in all the 5 dice
        int rollTimes = 0;
        // we save the first dice result in this variable so we can compare the sides
        // with other dice
        int dieResult = 0;
        do {
            // calling the roll methods for all dice
            die1.rollmethod();

            die2.rollmethod();

            die3.rollmethod();

            die4.rollmethod();

            die5.rollmethod();

            // dice1 is the reference dice we use to compare all the sides of the dice
            dieResult = die1.getSidesUp();

            // incrementing the rolls everytime the dieResult doesnt match the dieSide
            rollTimes++;

        }
        // Checking and comparing the values of result thats the first die with all the
        // other dice
        while (dieResult != die1.getSidesUp() || die2.getSidesUp() != dieResult || die3.getSidesUp() != dieResult
                || die4.getSidesUp() != dieResult || die5.getSidesUp() != dieResult);

        // printing the sides up
        System.out.println("Current Sides Up Are: " + die1.getSidesUp() + " " + die2.getSidesUp() + " "
                + die3.getSidesUp() + " " + die4.getSidesUp() + " " + die5.getSidesUp());
        // printing the number of rolls
        System.out.println("YAHTZEE! It took " + rollTimes + "rolls.");

    }
}

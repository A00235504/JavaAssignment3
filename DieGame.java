/*
-----------------Readme--------------------
Student Name- Aakash Sadnani
Student ID - A00235504
Program Description - This program is written to perform the following task:.
1) Making 3 types of Dies with 3 different constructors
2) 
3) 
4) 

-----------------x------------------------
*/

public class DieGame {
    
    public static void main(String[] args){

        System.out.println("Die Game");

        //die 1
        System.out.println("Creating a default d6...");
        Die dice1 = new Die();

        //die 2
        System.out.println("Creating a d13...");
        Die dice2 = new Die(13);

        //die 3
        System.out.println("Creating percentile die (a special d5)...");
        Die dice3 = new Die(5,"d5");

        System.out.println("The current side up for "+ dice1.diceType + " is " + dice1.currentSideUp);
        System.out.println("The current side up for "+ dice2.diceType + " is " + dice2.currentSideUp);
        System.out.println("The current side up for "+ dice3.diceType + " is " + dice3.currentSideUp);

        //Testing the rolling method in all three dice
        System.out.println("\n\nTesting the Roll Method");

        //Rolling dice 1 and printing the current side up
        System.out.println("Rolling the " + dice1.getDiceType() + " ...");
        dice1.rollmethod();
        dice1.printDice();


        //Rolling dice 2 and printing the current side up
        System.out.println("Rolling the " + dice2.getDiceType() + " ...");
        dice2.rollmethod();
        dice2.printDice();

        //Rolling dice 3 and printing the current side up
        System.out.println("Rolling the " + dice3.getDiceType() + " ...");
        dice3.rollmethod();
        dice3.printDice();

        //setting the sides manually
        System.out.println("\n\nSetting the d20 to show 20...");
        dice3.setNumSides(20);
        dice3.setDiceType("d20");
        System.out.println("The side up of " + dice3.getDiceType() + " is now " + dice3.getNumberofSides());


        System.out.println("\n\nSetting the d10 to show 10...");
        dice2.setNumSides(10);
        System.out.println("The side up of " + dice2.getDiceType() + " is now " + dice2.getNumberofSides());

        //Bonus Code Here

        System.out.println("\n-----\nBONUS\n-----");
        System.out.println("Creating 5 d6...");
        Die die1 = new Die(6);
        Die die2 = new Die(6);
        Die die3 = new Die(6);
        Die die4 = new Die(6);
        Die die5 = new Die(6);

        int rollTimes = 0;
        
        int dieResult = 0;
        do { 
            
            die1.rollmethod();
                        
            die2.rollmethod();

            die3.rollmethod();

            die4.rollmethod();
            
            die5.rollmethod();

            dieResult = die1.getSidesUp();
            rollTimes++;
        }while(dieResult != die1.getSidesUp() || die2.getSidesUp() != dieResult ||  die3.getSidesUp() != dieResult || die4.getSidesUp() != dieResult || die5.getSidesUp() != dieResult);

        System.out.println("Current Sides Up Are: " + die1.getSidesUp() +" "+ die2.getSidesUp() +" "+ die3.getSidesUp() +" "+ die4.getSidesUp() +" "+ die5.getSidesUp());
        System.out.println("YAHTZEE! It took "+ rollTimes + "rolls.");
		
    }
}

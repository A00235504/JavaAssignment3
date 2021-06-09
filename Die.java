/*
-----------------Readme--------------------
Student Name- Aakash Sadnani
Student ID - A00235504
This is the Dice class here where we define the constructors, the accessors, the mutators.
Also there is a print function which prints the dice type and side up
-----------------x------------------------
*/

import java.util.Random;

public class Die {
    
    //initializing the variables
    String diceType;
    int numberOfSides;
    int currentSideUp;

    //using the Random function to get random values for the dice side up
     //defining the constructors 3 types
    public Die(){
        diceType = "d6";
        numberOfSides = 6;
        currentSideUp = (int)(Math.random()*numberOfSides + 1);  
    }

    public Die(int numberOfSides){
        //dice cannot have sides less than 3 or more than 100
        if(numberOfSides < 3 || numberOfSides > 100)
			return;
        diceType = "d"+numberOfSides;
        this.numberOfSides = numberOfSides;
        currentSideUp =  (int)(Math.random()*numberOfSides + 1); 
    }

    public Die(int numberOfSides, String dieType){
        if(numberOfSides < 3 || numberOfSides > 100)
			return;
        this.diceType = dieType;
        this.numberOfSides = numberOfSides;
        currentSideUp =  (int)(Math.random()*numberOfSides + 1);  
    }
    
    public int rollmethod(){
        currentSideUp = (int)(Math.random()*this.numberOfSides + 1);
        return currentSideUp;
    }

    //defining the accessors for the dice
    public String getDiceType() {
		return diceType;
	}

    public int getNumberofSides() {
		return numberOfSides;
	}

    public int getSidesUp() {
		return currentSideUp;
	}

    //defining the mutators for the dice
	public void setDiceType(String diceType) {
		this.diceType = diceType;
	}

	public void setNumSides(int numberOfSides) {
		this.numberOfSides = numberOfSides;
		this.diceType = "d"+numberOfSides;
	}

	public void setSidesUp(int sideUp) {
		this.currentSideUp = sideUp;
	}
	
    //printing the dice output with number of sides and the side up
	public void printDice() {
	System.out.println("The current side of " + this.numberOfSides + " is " + this.currentSideUp + ".");
    }	

}


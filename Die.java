import java.util.Random;

public class Die {

    String diceType;

    int numberOfSides;

    int currentSideUp;

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


    public String getDiceType() {
		return diceType;
	}

	public void setDiceType(String diceType) {
		this.diceType = diceType;
	}

	public int getNumberofSides() {
		return numberOfSides;
	}

	public void setNumSides(int numberOfSides) {
		this.numberOfSides = numberOfSides;
		this.diceType = "d"+numberOfSides;
	}

	public int getSidesUp() {
		return currentSideUp;
	}

	public void setSidesUp(int sideUp) {
		this.currentSideUp = sideUp;
	}
	
	public void printDice() {
	System.out.println("The current side of " + this.numberOfSides + " is " + this.currentSideUp + ".");
    }	

}


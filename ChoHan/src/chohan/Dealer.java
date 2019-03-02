/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chohan;

public class Dealer {
    
    private int die1Value;
    private int die2Value;
    
    /*
    Constractor
    */

    public Dealer() {
        die1Value=0;
        die2Value=0;
    }
    
    public void rollDice(){
        
        final int SIDES = 6; // Number of sides for the dice
        
        // Create the two dice (Also roll them)
        Die die1 = new Die(SIDES);
        Die die2 = new Die(SIDES);
        
        // Record thier values.
        die1Value = die1.getValue();
        die2Value = die2.getValue();  
    }
    
    /**
     * The getChoOrHan method returns the result of the dice if the
     * sum is even it returns Cho else it returns Han or Odd. 
     * 
     */
    public String getChoOrHan(){
        String result;
        int sum = die1Value+die2Value;
        
        if(sum%2==0)
            result = "Cho (even)";
        else
            result = "Han (odd)";
        
        return result; 
    }
    
    public int getDie1Value() {
        return die1Value;
    }
    
    public int getDie2Value() {
        return die2Value;
    }   
    
    
    
}


package chohan;

import java.util.Scanner;


public class ChoHan {


    public static void main(String[] args) {
        
        
        
        final int Max_Rounds = 5;
        String player1Name;
        String player2Name;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the first players' name: ");
        player1Name=keyboard.nextLine();
        System.out.println("Enter the second players' name: ");
        player2Name=keyboard.nextLine();
        
        
        // creating the dealer
        
        
        // creating the two player
        Player player1 = new Player(player1Name);
        Player player2 = new Player(player2Name);
        
        
        // play the rounds
        
        for (int round =0; round<Max_Rounds; round++){
            System.out.println("---------------------------------");
            System.out.printf("Now playing round %d.\n", round+1);
            
            Dealer dealer = new Dealer();
            // roll the dice 
            dealer.rollDice();
            
            player1.makeGuess();
            player2.makeGuess();
            
            roundResults(dealer, player1, player2);
            
        }
        displayGrandWinner(player1, player2);
        
    }
    
    public static void roundResults(Dealer dealer, Player player1, Player player2){
        System.out.printf("The dealer rolled %d and %d.\n", dealer.getDie1Value(), dealer.getDie2Value());
        System.out.printf("Result: %s\n", dealer.getChoOrHan());
        
        checkGuess(player1, dealer);
        checkGuess(player2, dealer);
    }
    
    public static void checkGuess(Player player, Dealer dealer){
        final int POINTS_TO_Add = 1;
        String guess = player.getName();
        String choHanResult = dealer.getChoOrHan();
        
        System.out.printf("The player %s guessed %s.\n", player.getName(), player.getGuess());
        
        if(guess.equalsIgnoreCase(choHanResult)){
            player.addPoints(POINTS_TO_Add);
            System.out.printf("Awarding %d points(s) to %s.\n",POINTS_TO_Add, player.getName() );
        }
    }
    
    public static void displayGrandWinner(Player player1, Player player2 ){
        System.out.println("---------------------------------");
        System.out.println("Game over. Here are the resutls: ");
        System.out.println(player1.getName()+" "+player1.getPoints());
        System.out.println(player2.getName()+" "+player2.getPoints());
        
        if (player1.getPoints()>player2.getPoints())
            System.out.println(player2.getName() +" is the grand winner!");
        else
             System.out.println(player1.getName() +" is the grand winner!");
        
        
        
        
        
    }
    
}

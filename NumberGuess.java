/*
Justin Biester
3/29/23
Block 2
*/
import java.util.Scanner;
public class NumberGuess {
//Defines certain variables that appear often
   private int low = 1;
   private int high = 10;
   private int numToGuess = getNumInRange(low, high);
// Gets the number to guess      
   public static int getNumInRange (int low, int high){
      int numToGuess = (int)(Math.random()*(high-low+1)+low);
      return numToGuess;
   }
// Gets the response for the the number in the range 
   public static int getGuess(int low1, int high1){
      Scanner gg = new Scanner(System.in);
      System.out.println("Guess a number in the range of 1 to 10. ");
      //int userGuess = Integer.parseInt(gg.nextLine());
      int userGuess = Integer.parseInt(gg.nextLine());
      return(userGuess);
      }
   
// This is what figures out what the number is and where the next guess should lead to. The Brain of the system   
   public static int evaluateGuess(int userGuess1, int numToGuess1){
// Just says you win when if you guess right      
      if (userGuess1 == numToGuess1) {
      System.out.println("You win");
      return userGuess1;
// Determines if too low      
      } else if (userGuess1 < numToGuess1){
        
      System.out.println("Too Low");
// Determines if too high           
      } else if (userGuess1 > numToGuess1){
      
      
       
      System.out.println("Too High");
      
      
// Stops       
      return userGuess1;
      }
// Stops?      
      return userGuess1;
      }
     
// The skeleton of the system where it puts everything together       
   public static void playGame(){
// Gets back the random number and asks for a guess
         int numToGuess = (int)(Math.random()*(10-1+1)+1);
         Scanner gg = new Scanner(System.in);
         System.out.println("Guess a number in the range of 1 to 10. ");
         int userGuess = Integer.parseInt(gg.nextLine());
// Calls back to the evaluateGuess or the "brain"         
         evaluateGuess(userGuess, numToGuess);
// Determines if the number is not equal to the random num       
      if (numToGuess != userGuess){
// Puts it in a loop for when it is not correct      
      while (numToGuess != userGuess){
// Keeps asking until correct      
      System.out.println("Guess a number in the range of 1 to 10. ");
      int userGuess10 = Integer.parseInt(gg.nextLine());
// Calls back to the evaluateGuess method to continue the loop
      evaluateGuess(userGuess10, numToGuess);
// Finally it closes out the program when correct      
         if (numToGuess == userGuess10){
         System.out.print("Click Enter to Leave:");
         String exit = gg.nextLine();
         return;
         }
      }
      }
      }
      
      
// The real finally, where it calls the playGame and it starts the game!
public static void main (String[] args){
   playGame();
   
    
   }
   }
/*
Justin Biester
3/29/2023
Block 2
*/
import java.util.Scanner;
public class GameTime{
   public static void main (String[] args){
   // Starts the menu and does everything
      runMenu();
   }
   // Plays the madlibs game
   public static void runMadLibs(){
   System.out.print("Welcome to Madlibs!\n");
   Madlibs.playGame();
   }
   // plays the number guesser
   public static void runNumberGuesser(){
   System.out.print("Welcome to Number Guesser!\n");
   NumberGuess.playGame();
   }
   // Plays word guesser
   public static void runWordGuesser(){
   System.out.println("Welcome to Country Word Guesser!");
   wordGuesser.wordGuess();
   }
   // Calls back to the other games in a center
   public static void runMenu(){
   Scanner gt = new Scanner(System.in);
   // Welcomes then asks a person for what game they want or to exit
   System.out.println("\nWelcome to Game Time!");
   System.out.println("Select:\n1 for Madlibs\n2 for Number Guess\n3 for Word Guesser\n4 to exit.");
   String select = gt.nextLine();
   int select1 = Integer.parseInt(select);
   /* These if-else statements look a number inputted and plays the right game accordingly
   It also tells the user to try again if they enter not in the range
   Each runMenu() method at the end goes back to the menu after the game ends.
   */
   if (select1 == 1){
   runMadLibs();
   runMenu();
   } else if (select1 == 2){
   runNumberGuesser();
   runMenu();
   } else if (select1 == 3){
   runWordGuesser();
   runMenu();
   } else if (select1 == 4){
   System.out.print("Goodbye.");
   } else if (select1 > 4 || select1 < 1){
   System.out.print("Try again. Select a number 1-4");
   runMenu();
   }

   }
}
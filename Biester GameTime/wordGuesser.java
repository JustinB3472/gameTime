/*
Justin Biester
3/29/23
Block 2
*/
import java.util.Scanner;
public class wordGuesser{
   public static void main (String[] args){
   wordGuess();
// Calls the method that does all the work   
   }
// Start of method that first creates the array of words   
   public static void wordGuess(){
      String[] wordList = {"tajikistan", "azerbaijan", "qatar", "uzbekistan", "mozambique", "eswatini", "djibouti", "turkmenistan", "kazakhstan", "kyrgyzstan"};
// This picks the random word's index and then uses the index to assign that word a variable      
      int word = (int)(Math.random()*wordList.length);
      String random = (wordList[word]);
//Creates the hidden word variable which is masked by putting an asterisk for each letter
      String hiddenWord = "";
         for (int i = 0; i < random.length(); i++){
             hiddenWord += "*";     
         }
//This asks for input then creates the method of storage for the guess, and it also sets the numbers of tries/mistakes      
      Scanner ug = new Scanner(System.in);
      String letters = "";
      int tries = 3;
//Bases it off of tries and whether the hidden word equals the random one      
      while (tries !=0 && !hiddenWord.equals(random)){
         System.out.println("Word to Guess: "+hiddenWord);
         System.out.print("Guess a Letter: ");
         String guess = ug.nextLine();
         letters += guess+", ";
//This just asks if the person guesses the word they win and exit the program
            if (random == guess){
             System.out.print("You win and the word was "+random+"\nEnter to go back to the menu");
            
             String exit = ug.nextLine();
            }
//Sets a value so the tries can be kept the same or subtracted
         boolean correct = false;
//This loops over the letters to see if the guess equals a letter for the entire word
         for(int i = 0; i < random.length(); i++){
         //Makes the guess a certain letter for the random word
            String letterGuess = random.substring(i,i+1);
            if (guess.equals(letterGuess)){
         //Builds the new hidden word that has the new guesses
               hiddenWord = hiddenWord.substring(0,i) + letterGuess + hiddenWord.substring(i+1,hiddenWord.length());
         //Makes sure it does not subtract a try
               correct = true;
            } 
         }
         
         //This kind of quits out of the loop to make sure it can finish      
            if (guess.equals(random)){
            hiddenWord = random;
            correct = true;
            }
         //If wrong, then it removes a try
            if (!correct){
            tries --;
            }
            //Tells the user what they have done
         System.out.println("You have guessed: " + letters+"and you have " +tries+" mistakes left"); 
         }
         //If the person guesses right, then they will get greeted with victory and are asked to leave to Game time and same for a loss
            if (random.equals(hiddenWord)){
            System.out.print("\nYou win and the word was "+random+"\nEnter to go back to the menu");
            
            String exit = ug.nextLine();
            } else{
            System.out.print("\nYou lose and the word was "+random+"\nEnter to go back to the menu");
            
            String exit = ug.nextLine();
            }
      }
} 
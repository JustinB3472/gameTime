/*
Justin Biester
3/29/23
Block 2
*/
import java.util.Scanner;
public class Madlibs {
   public static void main (String[] args){
   //Ask name of user
   playGame();
   }
   public static void playGame(){
   System.out.println("What's your name?");
   
   //Get input
   Scanner ml = new Scanner(System.in);
   String name = ml.nextLine();
   
   //Display name and intro to story
   System.out.print("Hello "+name+" let's write a story!");
   
   //Start Story
   System.out.println(" First, Name an -ing verb");
   String ing1 = ml.nextLine();
   System.out.println("Name a noun");
   String noun1 = ml.nextLine();
   System.out.println("Name a location");
   String loc1 = ml.nextLine();
   System.out.println("Name a plural noun");
   String plural = ml.nextLine();
   System.out.println("Name a past tense verb");
   String past = ml.nextLine();
   System.out.println("Name an outside location");
   String loc2 = ml.nextLine();
   System.out.println("Name an adjective");
   String adj1 = ml.nextLine();
   System.out.println("Name an -ing verb");
   String ing2 = ml.nextLine();
   System.out.println("Name an animal or a person");
   String ani = ml.nextLine();
   System.out.println("Name an adjective");
   String adj2 = ml.nextLine();
   System.out.println("Name an -ing verb");
   String ing3 = ml.nextLine();
   System.out.println("Name a location");
   String loc3 = ml.nextLine();
   System.out.println("Lastly, name an adjective");
   String adj3 = ml.nextLine();
   
   // Write Story
   System.out.println("\n"+name+"'s Odyssey:");
   System.out.println("As "+name+" was "+ing1+" down the street, "+name+" saw a/an "+noun1+" in a tree.");
   System.out.println("When "+name+" saw the "+loc1+", it had thousands of "+plural+" on the shelves.");
   System.out.println("Then, "+name+" " +past+" into the "+loc2+" that had a/an "+adj1 +" looking rock.");
   System.out.println(name+" went uphill "+ing2+" with a/an "+ani+", and "+name+" finally arrived.");
   System.out.println("It was a/an "+adj2+" day for "+name+" "+ing3+" to the "+loc3+".");
   
   //Conclusion
   System.out.println("\nHave a "+adj3+" day "+name+"!");
   
   System.out.print("\nClick Enter to Leave:");
   String exit = ml.nextLine();
   }
   } 

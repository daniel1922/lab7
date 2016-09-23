/*two problems that I can't fix 
 * 1. when I type no at end it continues
 * 2. it won't clear out scanner and continue if number inputed outside the range*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Students2 {	
	
public static void main(String[] args) {
		
		//Create scanner
		Scanner sc = new Scanner(System.in);
		
		 //Create an array that holds info for people in class
	
		String[] studentArray = new String[20];
		
		studentArray[0] = "Domonique Baul";
		studentArray[1] = "Kevin Baxter";
		studentArray[2] = "Kristen Carethers";
		studentArray[3] = "Jennifer Cline";
		studentArray[4] = "Kim Driscoll";
		studentArray[5] = "Dominique Escoe";
		studentArray[6] = "Elle Folson";
		studentArray[7] = "Tricia Haslinger";
		studentArray[8] = "Tyler Hensley";
		studentArray[9] = "Yasmine Lee";
		studentArray[10] = "Jennifer Lucas";
		studentArray[11] = "Nicole Mallory";
		studentArray[12] = "Zalika Ockleberry";
		studentArray[13] = "Armani Raleigh";
		studentArray[14] = "Johnny Robinson";
		studentArray[15] = "Daniel Schneider";
		studentArray[16] = "David Smily";
		studentArray[17] = "Kimberli Smith";
		studentArray[18] = "Clark Vaughanis";
		studentArray[19] = "Jeseekia Vaughn";
	
		 //where students live
		String[] studentHometown = new String[20];
		
		studentHometown[0] = "Detroit";
		studentHometown[1] = "Detroit";
		studentHometown[2] = "Detroit";
		studentHometown[3] = "Monroe";
		studentHometown[4] = "Detroit";
		studentHometown[5] = "Detroit";
		studentHometown[6] = "Detroit";
		studentHometown[7] = "Detroit";
		studentHometown[8] = "Monroe";
		studentHometown[9] = "Detroit";
		studentHometown[10] = "Detroit";
		studentHometown[11] = "Detroit";
		studentHometown[12] = "Detroit";
		studentHometown[13] = "Detroit";
		studentHometown[14] = "Detroit";
		studentHometown[15] = "Hamtramck";
		studentHometown[16] = "Detroit";
		studentHometown[16] = "Detroit";
		studentHometown[18] = "Detroit";
		studentHometown[19] = "Detroit";
	
		 //students favorite food 
		String[] studentFood = new String[20];
		
		studentFood[0] = "Salmon";
		studentFood[1] = "Tacos";
		studentFood[2] = "Salmon";
		studentFood[3] = "Italian";
		studentFood[4] = "Ice Cream";
		studentFood[5] = "Shrimp";
		studentFood[6] = "Salmon";
		studentFood[7] = "Mashed Potatoes";
		studentFood[8] = "Cheeseburger's";
		studentFood[9] = "Pizza";
		studentFood[10] = "Italian";
		studentFood[11] = "Mexican";
		studentFood[12] = "Pasta";
		studentFood[13] = "Salmon";
		studentFood[14] = "Thai";
		studentFood[15] = "Chinese";
		studentFood[16] = "Steak";
		studentFood[17] = "Salmon";
		studentFood[18] = "Pizza";
		studentFood[19] = "Lasagana";
		
	
		//Welcome message
				System.out.println("Welcome to our Java Class");
				do{
				// Prompt user to ask about a particular user
					System.out.println("Which student would you like to learn more about? (enter a number 1-20):");
					int number  = sc.nextInt( );
					
				//Must be within the numbers given in the array
					try {
					while(number < 0 || number > studentArray.length){ 
						System.out.println("That student does not exist. Please try again. (enter a number 1-20:)");
						sc.nextInt();} //taking input from user
					
					}
						catch (InputMismatchException e) {
						break;
					}
			
				System.out.println("Student "  + number + " is " + studentArray[number-1]); //must subtract one or start with zero
				System.out.println("What would you like to know about " + studentArray[number-1] + "? (enter 'hometown' or 'favorite food'):");
		        sc.nextLine();
		        String input = sc.nextLine();
		    
		        //If user input is hometown prints out student name and hometown
		        if(input.equalsIgnoreCase("hometown")){
		        System.out.println(studentArray[number-1] + " is from " + studentHometown[number-1]);    	
		        
		        //Ask user question
		        System.out.println("Would you like to know more? (enter 'yes' or 'no'):");
		        //taking input from user
		        input = sc.nextLine();
		        
		        if(input.equals("yes")){
		        System.out.println(studentArray[number-1] + " loves " + studentFood[number-1]);
		        
		        }
		        }else if(input.equalsIgnoreCase("favorite food")){
		     
		        //Prints out student name and favorite food
		        System.out.println(studentArray[number-1] + " loves " + studentFood[number-1]);	
		        System.out.println("Would you like to know more? (enter 'yes' or 'no'):");
		        input = sc.nextLine();
		        
		        if(input.equalsIgnoreCase("yes")){
		            System.out.println(studentArray[number-1] + " is from " + studentHometown[number-1]);
		      
		            }
		        	}
		        
			   }while(true);
				   
				}
				
			}
				

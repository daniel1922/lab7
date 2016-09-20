	/*This application will do four things. 
	 	* 1. It will provide info about students in my Java class.
		* 2. It will prompt the user to ask about a particular student.
		* 3. It will proper responses according to user submitted info.
		* 4. It will ask user if they want to learn about another student. */	

import java.util.Scanner; //import scanner
import java.util.InputMismatchException; //needed for exception statement

public class Students { //declare class
	
		public static void main(String[] args) { //main method
		
			Scanner userInput = new Scanner(System.in);
			String userCont = "yes";
			boolean cont = true;
			
			int input=0;
			String continueYesNo;
			
			System.out.println("Welcome to our Java class!");
			while(userCont.equals("yes"))	
			{	//Ask user question and get user input
				System.out.print("Which student/teacher/administrator/ would you like to learn more about?");
				System.out.println("(Enter a number 1-19:)");
				System.out.println("1.Domonique Baul (student)");
				System.out.println("2.Kevin Baxter (student)");
				System.out.println("3.Kristen Carethers (student)");
				System.out.println("4.Jenniefer Cline (student)");
				System.out.println("5.Kim Driscoll (administrator)");
				System.out.println("6.Dominique Escoe (student)");
				System.out.println("7.Elle Folson");
				System.out.println("8.Tricia Haslinger (administrator)");
				System.out.println("9.Tyler Hensley (teacher assistant)");
				System.out.println("10.Yasmine Lee (student)");
				System.out.println("11.Jennifer Lucas (student)");
				System.out.println("12.Nicole Mallory (student)");
				System.out.println("13.Zalika Ockleberry (student)");
				System.out.println("14.Armani Raleigh (student)");
				System.out.println("15.Johnny Robinson (student)");
				System.out.println("16.Daniel Schneider (student)");
				System.out.println("17.David Smily (student)");
				System.out.println("18.Kimberli Smith (student)");
				System.out.println("19.Clark Vaughan (student)");
				System.out.println("20.Jeseekia Vaughn (teacher)");
				
				try{ //Input Exception statement
				input = userInput.nextInt();
					}
				catch(InputMismatchException e){
					System.out.print("That data does not exist. Please try again. Press enter or type 'hometown'");
					System.out.println("or type 'favorite food:'");
					userInput.nextLine();
					userCont =userInput.nextLine();	

	
			
			//start while loop if yes
			//input exception statement
			//begin switch statement
			
			//case 1
			//if
			//if else statement
			//break
			
			//case 2
			//if
			//if else statement
			//break
			
			//case 3
			//if
			//if else statement
			//break
			
			//case 4
			//if
			//if else statement
			//break
			
			//case 5
			//if
			//if else statement
			//break
			
			//case 6
			//if
			//if else statement
			//break
	
			//case 7
			//if
			//if else statement
			//break
			
			//case 8
			//if
			//if else statement
			//break
			
			//case 9
			//if
			//if else statement
			//break
			
			//case 10
			//if
			//if else statement
			//break
			
			//case 11
			//if
			//if else statement
			//break
			
			//case 12
			//if
			//if else statement
			//break
			
			//case 13
			//if
			//if else statement
			//break
			
			//case 14
			//if
			//if else statement
			//break
			
			//case 15
			//if
			//if else statement
			//break
			
			//case 16
			//if
			//if else statement
			//break
			
			//case 17
			//if
			//if else statement
			//break
			
			//case 18
			//if
			//if else statement
			//break
			
			//case 19
			//if
			//if else statement
			//break
			
			//if "no" "good bye"
	


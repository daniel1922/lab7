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
			String classMember;
			
			System.out.println("Welcome to our Java class!");
			
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
			
			while(userCont.equals("yes")) //Start while loop	
			{	//Ask user question and get user input
				System.out.print("Which student/teacher/administrator/ would you like to learn more about?");
				System.out.println("(Enter a number 1-20:)");
				
				try{ //Input Exception statement
				input = userInput.nextInt();
					}
				catch(InputMismatchException e){
					System.out.print("That data does not exist. Please try again. Type 'yes' or 'no' to continue");	
					userInput.nextLine();
					userCont =userInput.nextLine();	
				}
					switch (input){
					
					case 1 :
						classMember = userInput.nextLine();
						System.out.println("Dominique Baul is a student"); 
						System.out.println("Would you like to know where Dominique is from? (enter yes or no)");
								userCont = userInput.nextLine();
					
							//user Input is yes
						if(userCont.equalsIgnoreCase("yes")){
								System.out.println("Dominique is from Detroit, MI!");
								System.out.println("Would you like to know Dominique's favorite food?"); 
								System.out.println("enter yes or no)");;
								userCont = userInput.nextLine();
								
								if(userCont.equalsIgnoreCase("yes")){
									System.out.println("Dominique's favorite food is Salmon!");
									System.out.println("Continue with another student? (enter yes or no)");
									userCont = userInput.nextLine();
								}
								//user Input is no
						else if (userCont.equalsIgnoreCase("no")){
									System.out.println("Continue with another student?");
									System.out.println("(enter yes or no)");
									userCont = userInput.nextLine();
								}
						}		
			break;			
					case 2 :
						classMember =userInput.nextLine();
						System.out.println("Kevin Baxter is a student"); 
						System.out.println("Would you like to know where Kevin is from? (enter yes or no)");
								userCont = userInput.nextLine();
					
							//user Input is yes
						if(userCont.equalsIgnoreCase("yes")){
								System.out.println("Kevin is from Detroit, MI!");
								System.out.println("Would you like to know Kevin's favorite food?"); 
								System.out.println("enter yes or no)");;
								userCont = userInput.nextLine();
								
								if(userCont.equalsIgnoreCase("yes")){
									System.out.println("Kevin's favorite food is Tacos!");
									System.out.println("Continue with another student? (enter yes or no)");
									userCont = userInput.nextLine();
								}
								//user Input is no
						else if (userCont.equalsIgnoreCase("no")){
									System.out.println("Continue with another student?");
									System.out.println("(enter yes or no)");
									userCont = userInput.nextLine();
								}
						}		
			break;	
					case 3 :
						classMember =userInput.nextLine();
						System.out.println("Kristen Carethers is a student"); 
						System.out.println("Would you like to know where Kristen is from? (enter yes or no)");
								userCont = userInput.nextLine();
					
							//user Input is yes
						if(userCont.equalsIgnoreCase("yes")){
								System.out.println("Kristen is from Detroit, MI!");
								System.out.println("Would you like to know Dominique's favorite food?"); 
								System.out.println("enter yes or no)");;
								userCont = userInput.nextLine();
								
								if(userCont.equalsIgnoreCase("yes")){
									System.out.println("Kristen's favorite food is Salmon!");
									System.out.println("Continue with another student? (enter yes or no)");
									userCont = userInput.nextLine();
								}
								//user Input is no
						else if (userCont.equalsIgnoreCase("no")){
									System.out.println("Continue with another student?");
									System.out.println("(enter yes or no)");
									userCont = userInput.nextLine();
								}
						}		
			break;	
					case 4 :
						classMember =userInput.nextLine();
						System.out.println("Jennifer Cline is a student"); 
						System.out.println("Would you like to know where Jennifer is from? (enter yes or no)");
								userCont = userInput.nextLine();
					
							//user Input is yes
						if(userCont.equalsIgnoreCase("yes")){
								System.out.println("Jennifer is from Detroit, MI!");
								System.out.println("Would you like to know Jennifer's favorite food?"); 
								System.out.println("enter yes or no)");;
								userCont = userInput.nextLine();
								
								if(userCont.equalsIgnoreCase("yes")){
									System.out.println("Jennifer's favorite food is Italian!");
									System.out.println("Continue with another student? (enter yes or no)");
									userCont = userInput.nextLine();
								}
								//user Input is no
						else if (userCont.equalsIgnoreCase("no")){
									System.out.println("Continue with another student?");
									System.out.println("(enter yes or no)");
									userCont = userInput.nextLine();
								}
						}		
			break;
					case 5 :
						classMember =userInput.nextLine();
						System.out.println("Kim Driscoll is an administrator"); 
						System.out.println("Would you like to know where Kim is from? (enter yes or no)");
								userCont = userInput.nextLine();
					
							//user Input is yes
						if(userCont.equalsIgnoreCase("yes")){
								System.out.println("Kim is from Detroit, MI!");
								System.out.println("Would you like to know Kim's favorite food?"); 
								System.out.println("enter yes or no)");;
								userCont = userInput.nextLine();
								
								if(userCont.equalsIgnoreCase("yes")){
									System.out.println("Kristen's favorite food is Ice Cream!");
									System.out.println("Continue with another person in class? (enter yes or no)");
									userCont = userInput.nextLine();
								}
								//user Input is no
						else if (userCont.equalsIgnoreCase("no")){
									System.out.println("Continue with another person in class?");
									System.out.println("(enter yes or no)");
									userCont = userInput.nextLine();
								}
						}		
			break;
					case 6 :
						classMember =userInput.nextLine();
						System.out.println("Dominique Escoe is a student"); 
						System.out.println("Would you like to know where Dominique is from? (enter yes or no)");
								userCont = userInput.nextLine();
					
							//user Input is yes
						if(userCont.equalsIgnoreCase("yes")){
								System.out.println("Dominique is from Detroit, MI!");
								System.out.println("Would you like to know Dominique's favorite food?"); 
								System.out.println("enter yes or no)");;
								userCont = userInput.nextLine();
								
								if(userCont.equalsIgnoreCase("yes")){
									System.out.println("Dominique's favorite food is Shrimp!");
									System.out.println("Continue with another student? (enter yes or no)");
									userCont = userInput.nextLine();
								}
								//user Input is no
						else if (userCont.equalsIgnoreCase("no")){
									System.out.println("Continue with another student?");
									System.out.println("(enter yes or no)");
									userCont = userInput.nextLine();
								}
						}		
			break;
					case 7 :
						classMember =userInput.nextLine();
						System.out.println("Elle Folson is a student"); 
						System.out.println("Would you like to know where Kristen is from? (enter yes or no)");
								userCont = userInput.nextLine();
					
							//user Input is yes
						if(userCont.equalsIgnoreCase("yes")){
								System.out.println("Elle is from Detroit, MI!");
								System.out.println("Would you like to know Elle's favorite food?"); 
								System.out.println("enter yes or no)");;
								userCont = userInput.nextLine();
								
								if(userCont.equalsIgnoreCase("yes")){
									System.out.println("Elle's favorite food is Salmon!");
									System.out.println("Continue with another student? (enter yes or no)");
									userCont = userInput.nextLine();
								}
								//user Input is no
						else if (userCont.equalsIgnoreCase("no")){
									System.out.println("Continue with another student?");
									System.out.println("(enter yes or no)");
									userCont = userInput.nextLine();
								}
						}		
			break;
					case 8 :
						classMember =userInput.nextLine();
						System.out.println("Tricia Haslinger is an administrator"); 
						System.out.println("Would you like to know where Tricia is from? (enter yes or no)");
								userCont = userInput.nextLine();
					
							//user Input is yes
						if(userCont.equalsIgnoreCase("yes")){
								System.out.println("Tricia is from Detroit, MI!");
								System.out.println("Would you like to know Tricia's favorite food?"); 
								System.out.println("enter yes or no)");;
								userCont = userInput.nextLine();
								
								if(userCont.equalsIgnoreCase("yes")){
									System.out.println("Tricia's favorite food is Mashed Potatoes!");
									System.out.println("Continue with another person in class? (enter yes or no)");
									userCont = userInput.nextLine();
								}
								//user Input is no
						else if (userCont.equalsIgnoreCase("no")){
									System.out.println("Continue with another person in class?");
									System.out.println("(enter yes or no)");
									userCont = userInput.nextLine();
								}
						}		
			break;
					case 9 :
						classMember =userInput.nextLine();
						System.out.println("Tyler Hensley is a teacher assistant"); 
						System.out.println("Would you like to know where Tyler is from? (enter yes or no)");
								userCont = userInput.nextLine();
					
							//user Input is yes
						if(userCont.equalsIgnoreCase("yes")){
								System.out.println("Tyler is from Monroe, MI!");
								System.out.println("Would you like to know Tyler's favorite food?"); 
								System.out.println("enter yes or no)");;
								userCont = userInput.nextLine();
								
								if(userCont.equalsIgnoreCase("yes")){
									System.out.println("Tyler's favorite food is Tacos!");
									System.out.println("Continue with another person in class? (enter yes or no)");
									userCont = userInput.nextLine();
								}
								//user Input is no
						else if (userCont.equalsIgnoreCase("no")){
									System.out.println("Continue with another person in class?");
									System.out.println("(enter yes or no)");
									userCont = userInput.nextLine();
								}
						}		
			break;
					case 10 :
						classMember =userInput.nextLine();
						System.out.println("Yasmine Lee is a student"); 
						System.out.println("Would you like to know where Yasmine is from? (enter yes or no)");
								userCont = userInput.nextLine();
					
							//user Input is yes
						if(userCont.equalsIgnoreCase("yes")){
								System.out.println("Yasmine is from Detroit, MI!");
								System.out.println("Would you like to know Yasmine's favorite food?"); 
								System.out.println("enter yes or no)");;
								userCont = userInput.nextLine();
								
								if(userCont.equalsIgnoreCase("yes")){
									System.out.println("Yasmine's favorite food is Pizza!");
									System.out.println("Continue with another student? (enter yes or no)");
									userCont = userInput.nextLine();
								}
								//user Input is no
						else if (userCont.equalsIgnoreCase("no")){
									System.out.println("Continue with another student?");
									System.out.println("(enter yes or no)");
									userCont = userInput.nextLine();
								}
						}		
			break;
					case 11 :
						classMember =userInput.nextLine();
						System.out.println("Jennifer Lucas is a student"); 
						System.out.println("Would you like to know where Jennifer is from? (enter yes or no)");
								userCont = userInput.nextLine();
					
							//user Input is yes
						if(userCont.equalsIgnoreCase("yes")){
								System.out.println("Jennifer is from Detroit, MI!");
								System.out.println("Would you like to know Jennifer's favorite food?"); 
								System.out.println("enter yes or no)");;
								userCont = userInput.nextLine();
								
								if(userCont.equalsIgnoreCase("yes")){
									System.out.println("Jennifer's favorite food is Italian!");
									System.out.println("Continue with another student? (enter yes or no)");
									userCont = userInput.nextLine();
								}
								//user Input is no
						else if (userCont.equalsIgnoreCase("no")){
									System.out.println("Continue with another student?");
									System.out.println("(enter yes or no)");
									userCont = userInput.nextLine();
								}
						}		
			break;
					case 12 :
						classMember =userInput.nextLine();
						System.out.println("Nicole Mallory is a student"); 
						System.out.println("Would you like to know where Nicole is from? (enter yes or no)");
								userCont = userInput.nextLine();
					
							//user Input is yes
						if(userCont.equalsIgnoreCase("yes")){
								System.out.println("Nicole is from Detroit, MI!");
								System.out.println("Would you like to know Nicole's favorite food?"); 
								System.out.println("enter yes or no)");;
								userCont = userInput.nextLine();
								
								if(userCont.equalsIgnoreCase("yes")){
									System.out.println("Nicole's favorite food is Mexican!");
									System.out.println("Continue with another student? (enter yes or no)");
									userCont = userInput.nextLine();
								}
								//user Input is no
						else if (userCont.equalsIgnoreCase("no")){
									System.out.println("Continue with another student?");
									System.out.println("(enter yes or no)");
									userCont = userInput.nextLine();
								}
						}		
			break;
					case 13 :
						classMember =userInput.nextLine();
						System.out.println("Zalika Ockleberry is a student"); 
						System.out.println("Would you like to know where Zalika is from? (enter yes or no)");
								userCont = userInput.nextLine();
					
							//user Input is yes
						if(userCont.equalsIgnoreCase("yes")){
								System.out.println("Zalika is from Detroit, MI!");
								System.out.println("Would you like to know Zalika's favorite food?"); 
								System.out.println("enter yes or no)");;
								userCont = userInput.nextLine();
								
								if(userCont.equalsIgnoreCase("yes")){
									System.out.println("Zalika's favorite food is Pasta!");
									System.out.println("Continue with another student? (enter yes or no)");
									userCont = userInput.nextLine();
								}
								//user Input is no
						else if (userCont.equalsIgnoreCase("no")){
									System.out.println("Continue with another student?");
									System.out.println("(enter yes or no)");
									userCont = userInput.nextLine();
								}
						}		
			break;
					case 14 :
						classMember =userInput.nextLine();
						System.out.println("Armani Raleigh is a student"); 
						System.out.println("Would you like to know where Armani is from? (enter yes or no)");
								userCont = userInput.nextLine();
					
							//user Input is yes
						if(userCont.equalsIgnoreCase("yes")){
								System.out.println("Armani is from Detroit, MI!");
								System.out.println("Would you like to know Armani's favorite food?"); 
								System.out.println("enter yes or no)");;
								userCont = userInput.nextLine();
								
								if(userCont.equalsIgnoreCase("yes")){
									System.out.println("Armani's favorite food is Salmon!");
									System.out.println("Continue with another student? (enter yes or no)");
									userCont = userInput.nextLine();
								}
								//user Input is no
						else if (userCont.equalsIgnoreCase("no")){
									System.out.println("Continue with another student?");
									System.out.println("(enter yes or no)");
									userCont = userInput.nextLine();
								}
						}		
			break;
					case 15 :
						classMember =userInput.nextLine();
						System.out.println("Johnny Robinson is a student"); 
						System.out.println("Would you like to know where Johnny is from? (enter yes or no)");
								userCont = userInput.nextLine();
					
							//user Input is yes
						if(userCont.equalsIgnoreCase("yes")){
								System.out.println("Johnny is from Detroit, MI!");
								System.out.println("Would you like to know Johnny's favorite food?"); 
								System.out.println("enter yes or no)");;
								userCont = userInput.nextLine();
								
								if(userCont.equalsIgnoreCase("yes")){
									System.out.println("Johnny's favorite food is Thai!");
									System.out.println("Continue with another student? (enter yes or no)");
									userCont = userInput.nextLine();
								}
								//user Input is no
						else if (userCont.equalsIgnoreCase("no")){
									System.out.println("Continue with another student?");
									System.out.println("(enter yes or no)");
									userCont = userInput.nextLine();
								}
						}		
			break;
					case 16 :
						classMember =userInput.nextLine();
						System.out.println("Daniel Schneider is a student"); 
						System.out.println("Would you like to know where Daniel is from? (enter yes or no)");
								userCont = userInput.nextLine();
					
							//user Input is yes
						if(userCont.equalsIgnoreCase("yes")){
								System.out.println("Daniel is from Hamtramck, MI!");
								System.out.println("Would you like to know Daniel's favorite food?"); 
								System.out.println("enter yes or no)");;
								userCont = userInput.nextLine();
								
								if(userCont.equalsIgnoreCase("yes")){
									System.out.println("Daniel's favorite food is Chinese!");
									System.out.println("Continue with another student? (enter yes or no)");
									userCont = userInput.nextLine();
								}
								//user Input is no
						else if (userCont.equalsIgnoreCase("no")){
									System.out.println("Continue with another student?");
									System.out.println("(enter yes or no)");
									userCont = userInput.nextLine();
								}
						}		
			break;
					case 17 :
						classMember =userInput.nextLine();
						System.out.println("David Smily is a student"); 
						System.out.println("Would you like to know where David is from? (enter yes or no)");
								userCont = userInput.nextLine();
					
							//user Input is yes
						if(userCont.equalsIgnoreCase("yes")){
								System.out.println("David is from Detroit, MI!");
								System.out.println("Would you like to know David's favorite food?"); 
								System.out.println("enter yes or no)");;
								userCont = userInput.nextLine();
								
								if(userCont.equalsIgnoreCase("yes")){
									System.out.println("David's favorite food is Steak!");
									System.out.println("Continue with another student? (enter yes or no)");
									userCont = userInput.nextLine();
								}
								//user Input is no
						else if (userCont.equalsIgnoreCase("no")){
									System.out.println("Continue with another student?");
									System.out.println("(enter yes or no)");
									userCont = userInput.nextLine();
								}
						}		
			break;
					case 18 :
						classMember =userInput.nextLine();
						System.out.println("Kimberli Smith is a student"); 
						System.out.println("Would you like to know where Kimberli is from? (enter yes or no)");
								userCont = userInput.nextLine();
					
							//user Input is yes
						if(userCont.equalsIgnoreCase("yes")){
								System.out.println("Kimberli is from Detroit, MI!");
								System.out.println("Would you like to know KImberli's favorite food?"); 
								System.out.println("enter yes or no)");;
								userCont = userInput.nextLine();
								
								if(userCont.equalsIgnoreCase("yes")){
									System.out.println("Kimberli's favorite food is Salmon!");
									System.out.println("Continue with another student? (enter yes or no)");
									userCont = userInput.nextLine();
								}
								//user Input is no
						else if (userCont.equalsIgnoreCase("no")){
									System.out.println("Continue with another student?");
									System.out.println("(enter yes or no)");
									userCont = userInput.nextLine();
								}
						}		
			break;
					case 19 :
						classMember =userInput.nextLine();
						System.out.println("Clark Vaughan is a student"); 
						System.out.println("Would you like to know where Clark is from? (enter yes or no)");
								userCont = userInput.nextLine();
					
							//user Input is yes
						if(userCont.equalsIgnoreCase("yes")){
								System.out.println("Clark is from Detroit, MI!");
								System.out.println("Would you like to know Clark's favorite food?"); 
								System.out.println("enter yes or no)");;
								userCont = userInput.nextLine();
								
								if(userCont.equalsIgnoreCase("yes")){
									System.out.println("Clark's favorite food is Pizza!");
									System.out.println("Continue with another student? (enter yes or no)");
									userCont = userInput.nextLine();
								}
								//user Input is no
						else if (userCont.equalsIgnoreCase("no")){
									System.out.println("Continue with another student?");
									System.out.println("(enter yes or no)");
									userCont = userInput.nextLine();
								}
						}		
			break;
					case 20 :
						classMember =userInput.nextLine();
						System.out.println("Jeseekia Vaughn is a teacher"); 
						System.out.println("Would you like to know where Jeseekia is from? (enter yes or no)");
								userCont = userInput.nextLine();
					
							//user Input is yes
						if(userCont.equalsIgnoreCase("yes")){
								System.out.println("Jeseekia is from Detroit, MI!");
								System.out.println("Would you like to know Jeseekia's favorite food?"); 
								System.out.println("enter yes or no)");;
								userCont = userInput.nextLine();
								
								if(userCont.equalsIgnoreCase("yes")){
									System.out.println("Jeseekia's favorite food is Lasagna!");
									System.out.println("Continue with another personin class? (enter yes or no)");
									userCont = userInput.nextLine();
								}
								//user Input is no
						else if (userCont.equalsIgnoreCase("no")){
									System.out.println("Continue with another personin class?");
									System.out.println("(enter yes or no)");
									userCont = userInput.nextLine();
								}
						}		
			break;
					}//End of Switch statements
					if (userCont.equalsIgnoreCase("no")){
					System.out.println("Continue with another student? (enter yes or no)");
					userCont = userInput.nextLine();}
				
			}//End of While Loop	
			System.out.println("goodbye. I am sorry I couldn't figure out how to use an array.");

			}
			}

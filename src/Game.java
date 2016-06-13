import java.util.Scanner;
import java.util.Random;
public class Game {

	public static void main(String[] args) {
		System.out.println("Welcome what is your name?");
		Scanner userInput = new Scanner(System.in);
		String userName = userInput.nextLine();
		System.out.println( userName + " would you like to play a game of hockey? Enter Yes or No");
		String userAnswer = userInput.nextLine();
		boolean loop = true;
		switch (userAnswer.charAt(0)) {
		case 'Y':
		case 'y':
			while(loop){
			System.out.println("Great " + userName + " let's pick teams!");
			System.out.println("Which team do you want to play with:Detroit Redwing, Chicago Blackhawks, San Jose Sharks, or the Pittsburgh Peguins?");
			String userAnswerTwo = userInput.nextLine();
				switch(userAnswerTwo.charAt(0)){
				case 'D':
				case'd':
					System.out.println("Congrats " + userName + " you have picked the winning team! No need to play any longer");
					System.out.println("This is the Redwings 12th Stanley Cup");
					loop=false;
					break;
					
				case 'C' :
				case 'c' :
					System.out.println("I'm sorry but we're from hockey town blackhawks are not allowed");
					System.out.println("We all feel bad for you but not bad enough have a good day!");	
					loop=false;
					break;
					
				case 'P' :
				case 'p' :
					System.out.println("Wise choice let's see who will win between Pittsburgh and San Jose.");
					int pittsburgh = (int) (Math.random()*10);
					int sanJose =  (int) (Math.random()*10);
					System.out.println("Pitsburgh Penguins:" + pittsburgh);
					System.out.println("San Jose :" + sanJose);
						if(pittsburgh > sanJose){
						System.out.println("Congrats the Pittsburgh Penguins have won their 4th Stanley Cup");
						}else if(pittsburgh == sanJose){
						System.out.println("The teams have tied");
						}else if (pittsburgh < sanJose){
						System.out.println("I'm sorry but the San Jose Sharks hoist their 1st Stanley Cup trophey");
						}	
					loop=false;
					break;
				case 'S' :
				case 's' : 
					System.out.println("Wise choice let's see who will win between Pittsburgh and San Jose.");
					double pittsburgh2 =  (int) (Math.random()*10);
					double sanJose2 = (int) (Math.random()*10);
					System.out.println("Pitsburgh Penguins:" + pittsburgh2);
					System.out.println("San Jose :" + sanJose2);
					if(pittsburgh2 > sanJose2){
						System.out.println();
						System.out.println("Congrats the Pittsburgh Penguins have won their 4th Stanley Cup");
					}else if(pittsburgh2 == sanJose2){
						System.out.println("The teams have tied");
						int pittsburgh3 = (int) (Math.random() *10);
						int sanJose3 = (int) (Math.random() * 10);
						System.out.println("Pitsburgh Penguins:" + pittsburgh3);
						System.out.println("San Jose :" + sanJose3);
							if(pittsburgh3 > sanJose3){
								System.out.println("I'm sorry but San Jose lost, the Pittsburgh Penguins have won their 4th Stanley Cup ");
							}else if (pittsburgh3<sanJose3){
								System.out.println("Congrats to the San Jose Sharks for winning their 1st Stanley Cup!");
							}else if(pittsburgh3==sanJose3){
								System.out.println("The teams have tied");
							}
				}else if (pittsburgh2 < sanJose2){
					System.out.println("I'm sorry but the San Jose Sharks hoist their 1st Stanley Cup trophey");
				}
				break;
			}
				loop=false;
				break;
		}
			break;
	
	
	case 'N':
	case 'n': 
	loop=false;
	System.out.println("Have a good day!");
	loop=false;
		break;
			}
			
	}
	}


			


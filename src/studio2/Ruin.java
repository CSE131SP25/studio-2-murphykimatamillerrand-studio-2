package studio2;

import java.util.Scanner;

public class Ruin {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your starting amount?");
		double startAmount = in.nextDouble();
		
		System.out.println("What is the probability that you win?");
		double winChance = in.nextDouble();
		
		System.out.println("What is the amount of money you need to leave with to have a succesful day?");
		double winLimit = in.nextDouble();
		
		System.out.println("How many days do you want to simulate?");
		double totalSimulations = in.nextDouble();
		
		String Win = "";
		int handsPlayed = 0;
		
		double moneyAmount = startAmount;
		for(int i=1; i<totalSimulations+1; i++) {
			moneyAmount = startAmount;
			while (moneyAmount > 0 && moneyAmount < winLimit) {
		 
				double randomNum = Math.random();
			
				if (randomNum < winChance) {
				
					moneyAmount++;
	
				
				}
			
				else {
				
				moneyAmount--;
			
				}
				handsPlayed++;
			}
			if (moneyAmount == 0){
				Win = Win + "ruin";
			}
			else {
				 Win = "success";
			}
			System.out.println("Simulation " + i + ". Hands Played: " + handsPlayed + " " + Win);
			Win = "";
			handsPlayed = 0;
		}                                                   	                                                   
	
	}

}

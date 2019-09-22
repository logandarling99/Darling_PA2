package darling_p3;

import java.util.Scanner;

public class Poll {
	public static void main(String args[]) {
		String[] topics = new String[] {"games", "food", "political issues", "programming", "space"};
		Scanner scnr = new Scanner(System.in);
		int[][] responses = new int[5][10];
		int response;
		double[] avg = new double[5];
		int userCount = 0;
		while(userCount < 10) {
			System.out.println("Rate each topic with a scale from 1 (the worst) to 10 (the best), the poll currently holds 10 users inputs.");
			System.out.println("Please enter the data for user " + (userCount+1));
			for(int i = 0; i < 5; i++) {
				System.out.print("Please enter your rating on the topic " + topics[i] + ":");
				response = scnr.nextInt();
				responses[i][response-1] += 1;
				avg[i] += response;
			}
			userCount++;
		}
		int max = 0, min = 0;
		for(int i = 0; i < 5; i++) {
			avg[i] /= userCount;
			if(avg[i] > max) max = i;
			if(avg[i] < min) min = i;
		}
		
		System.out.println("|      Topics      | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | Average");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("|      " + topics[0] +"       | " + responses[0][0] + " | " + responses[0][1] + " | " + responses[0][2] + " | " + responses[0][3] + " | " + responses[0][4] + " | " + responses[0][5] + " | " + responses[0][6] + " | " + responses[0][7] + " | " + responses[0][8] + " | " + responses[0][9] + "  | " + avg[0]);
		System.out.println("|       " + topics[1] +"       | " + responses[1][0] + " | " + responses[1][1] + " | " + responses[1][2] + " | " + responses[1][3] + " | " + responses[1][4] + " | " + responses[1][5] + " | " + responses[1][6] + " | " + responses[1][7] + " | " + responses[1][8] + " | " + responses[1][9] + "  | " + avg[1]);
		System.out.println("| " + topics[2] +" | " + responses[2][0] + " | " + responses[2][1] + " | " + responses[2][2] + " | " + responses[2][3] + " | " + responses[2][4] + " | " + responses[2][5] + " | " + responses[2][6] + " | " + responses[2][7] + " | " + responses[2][8] + " | " + responses[2][9] + "  | " + avg[2]);
		System.out.println("|    " + topics[3] +"   | " + responses[3][0] + " | " + responses[3][1] + " | " + responses[3][2] + " | " + responses[3][3] + " | " + responses[3][4] + " | " + responses[3][5] + " | " + responses[3][6] + " | " + responses[3][7] + " | " + responses[3][8] + " | " + responses[3][9] + "  | " + avg[3]);
		System.out.println("|      " + topics[4] +"       | " + responses[4][0] + " | " + responses[4][1] + " | " + responses[4][2] + " | " + responses[4][3] + " | " + responses[4][4] + " | " + responses[4][5] + " | " + responses[4][6] + " | " + responses[4][7] + " | " + responses[4][8] + " | " + responses[4][9] + "  | " + avg[4]);
		System.out.println("The topic with most points is " + topics[max]);
		System.out.println("The topic with least points is " + topics[min]);
	}
}

package darling_p1;

import java.util.Scanner;

public class Encryption {
	static public void main(String args[]) {
		Scanner scnr = new Scanner(System.in);
		int encInt, temp;
		int[] encArr = new int[4];
		
		System.out.print("Please input the four digit integer you want to encrypt: ");
		encInt = scnr.nextInt();
		for(int i = 3; i >= 0; i--) {
			encArr[i] = (encInt%10 + 7)%10;
			encInt = encInt / 10;
		}
		
		System.out.print("Your encrypted integer is " + encArr[2] + "" + encArr[3] + "" + encArr[0] + "" + encArr[1]);
	}
}

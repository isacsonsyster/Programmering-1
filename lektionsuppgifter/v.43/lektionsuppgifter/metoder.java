package lektionsuppgifter;

import java.util.Scanner;

public class metoder {
	public static void main (String [] args) {
		lol("HAHHAHAHAHAH");
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("skriv in två heltal: ");
		int i = input.nextInt();
		int j = input.nextInt();
		
	}

	public static void lol(String hej) {
	 System.out.println(hej);
	}
	public static int min(int i, int j){
		
		if (i <= j) {
			return i;
		}
		else if (j <= i) {
				return j;
			}
		else {
			return j;
		}
	} 
}


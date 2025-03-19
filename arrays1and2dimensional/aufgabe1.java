package arrays1and2dimensional;

import java.util.Scanner;

public class aufgabe1 {
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		String input = "";
		int lengthOfGrades;
		
		do {
			System.out.printf("How many grades: ");
			input = scanner.nextLine();
			
		} while (isNumber(input));
		
		lengthOfGrades = Integer.valueOf(input);
		
		int[] grades = new int[lengthOfGrades];
		
		for(int i = 0; i < lengthOfGrades; i++) {
			
			do {
				System.out.printf("%dth Grade: ", i + 1);
				input = scanner.nextLine();
				
			} while (isNumber(input));
			
			grades[i] = Integer.valueOf(input);
		}
		
		
	}
	
	public static boolean isNumber(String str) {
		
		
		boolean returnValue = true;
		
		if(str.length() == 0) {
			
			return false;
		}
		
		for(int i = 0; i < str.length(); i++) {
			
			returnValue = (
				(((int) str.charAt(i)) <= 48) &&
				(((int) str.charAt(i)) >= 57)
			) ? true : false;
			
			if(!returnValue) {
				break;
			}
			
			
		}
		
		return returnValue;
		
	
		
	}
}

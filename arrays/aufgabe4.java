package arrays;

import java.util.Scanner;

public class Aufgabe4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		final int lengthOfBothArrays = 7;
		
		int matches = 0;
		
		int a[] = new int[lengthOfBothArrays];
		int b[] = new int[lengthOfBothArrays];
		
		System.out.printf("Zahlen aus dem 1. Durchgang werden mit Zahlen aus dem 2. Durchgang verglichen.%n%n");
		System.out.printf("1. Durchgang. Bitte geben Sie 7 Zahlen ein:%n%n");
		for(int i = 0; i < lengthOfBothArrays; i++) {
			
			System.out.printf("Zahl %d eingeben: ", i + 1);
			a[i] = scanner.nextInt();
			
		}
		
		System.out.printf("%n".repeat(80));

		System.out.printf("Zahlen aus dem 1. Durchgang werden mit Zahlen aus dem 2. Durchgang verglichen%n%n");
		System.out.printf("2. Durchgang. Bitte geben Sie 7 Zahlen ein:%n%n");
		for(int i = 0; i < lengthOfBothArrays; i++) {
			
			System.out.printf("Zahl %d eingeben: ", i + 1);
			b[i] = scanner.nextInt();
			
		}
		
		for(int i = 0; i < lengthOfBothArrays; i++) {
			
			if(a[i] == b[i]) {
				
				matches +=1;
				
			}
			
		}
		System.out.printf("Anzahl der Übereinstimmungen: %d", matches);
		
		scanner.close();

	}

}

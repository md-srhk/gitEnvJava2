
package arrays;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Aufgabe10a {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		int lottoNumbers[] = new int[6];
		int userGivenNumbers[] = new int[6];
		
		getUserInput(userGivenNumbers, scanner);
		
		System.out.printf("%n");
		
		generateLottoNumber(lottoNumbers);
		
		Arrays.sort(userGivenNumbers);
		Arrays.sort(lottoNumbers);
		
		showNumbers(lottoNumbers, userGivenNumbers);
		showMatches(lottoNumbers, userGivenNumbers);

	}
	
	public static void generateLottoNumber(int lottoNumbers[]) {
		
		Random random = new Random();
		
		for(int i = 0; i < lottoNumbers.length; i++) {
					
			lottoNumbers[i] = random.nextInt(1, 49);
					
		}
		
	}
	
	public static void getUserInput(int userGivenNumbers[], Scanner scanner) {
		
		for(int i = 0; i < userGivenNumbers.length; i++) {
			
			while(!(userGivenNumbers[i] <= 49) || !(userGivenNumbers[i] >= 1)) {
				
				System.out.printf("Bitte die %d.Zahl eingeben: ", i + 1);
				userGivenNumbers[i] = scanner.nextInt();
				
				if(!(userGivenNumbers[i] <= 49) || !(userGivenNumbers[i] >= 1)) {
					System.out.printf("Nur Zahlen zwischen 1 und 49 sind zulässig!%n");
				}
			}
					
		}
		
	}
	
	public static void showNumbers(int lottoNumbers[], int userGivenNumbers[]) {
		
		System.out.printf("Die getippten Zahlen:%n");
		
		for(int i = 0; i < lottoNumbers.length; i++) {
			
			System.out.printf("%d ", userGivenNumbers[i]);
					
		}
		
		System.out.printf("%n%n");
		
		System.out.printf("Die Lottozahlen:%n");
		for(int i = 0; i < lottoNumbers.length; i++) {
			
			System.out.printf("%d ", lottoNumbers[i]);
					
		}
		
		System.out.printf("%n%n");
		
	}
	
	public static void showMatches(int lottoNumbers[], int userGivenNumbers[]) {
		
		int matches = 0;
		
		for(int lottoNumber : lottoNumbers) {
			
			for(int userGivenNumber: userGivenNumbers) {
				
				if(lottoNumber == userGivenNumber) {
					
					matches++;
					
				}
				
			}
			
		}
		
		System.out.printf("Anzahl der Treffer: %d%n", matches);
		
	}
	
}
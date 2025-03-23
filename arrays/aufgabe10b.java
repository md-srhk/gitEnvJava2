package arrays;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class aufgabe10b {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int lottoNumbers[] = new int[6];
		int userGivenNumbers[] = new int[6];
		
		int attempts = 1;
		
		
		showAttempts(attempts);
		getUserInput(userGivenNumbers, scanner);
		
		generateLottoNumber(lottoNumbers);
		
		Arrays.sort(userGivenNumbers);
		Arrays.sort(lottoNumbers);
		
		while(calcMatches(lottoNumbers, userGivenNumbers) < 4) {
			
			showAttempts(attempts);
			getUserInput(userGivenNumbers, scanner);
			Arrays.sort(userGivenNumbers);
			
			attempts++;
			
		}
		System.out.printf("%n");
		System.out.printf("Anzahl der Versuche %d%n", attempts);
		
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
		
		System.out.printf("%n");
		
		
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
		
		int matches = calcMatches(lottoNumbers, userGivenNumbers);
		
		System.out.printf("Anzahl der Treffer: %d%n", matches);
		
	}
	
	public static int calcMatches(int lottoNumbers[], int userGivenNumbers[]) {
		
		int matches = 0;
		
		for(int lottoNumber : lottoNumbers) {
			
			for(int userGivenNumber: userGivenNumbers) {
				
				if(lottoNumber == userGivenNumber) {
					
					matches++;
					
				}
				
			}
			
		}
		
		return matches;
		
	}
	
	public static void showAttempts(int attempts) {
		
		System.out.printf("%n");
		System.out.printf("Versuch %d%n", attempts);
		System.out.printf("%n");
		
	}
}
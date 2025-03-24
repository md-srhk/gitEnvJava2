package arrays;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Aufgabe10b {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int lottoNumbers[] = new int[6];
		int userGivenNumbers[] = new int[6];
		
		int attempts = 1;
		boolean auto = true;
		
		showAttempts(attempts);
		getUserInput(userGivenNumbers, scanner);
		
		generateLottoNumber(lottoNumbers);
		
		Arrays.sort(userGivenNumbers);
		Arrays.sort(lottoNumbers);
		
		while(calcMatches(lottoNumbers, userGivenNumbers) < 6) {
			
			showAttempts(attempts);
			
			if(auto) {
				
				
				/* Nachricht für den Lehrer / Message for the teacher
				 * 
				 * Dieser Abschnitt ist dafür gedacht, dass der Computer gegen sich selbst Lotto spielt
				 * Da ich nicht alle Werte menuell eingeben muss.
				 * 
				 * Versuche für 5 Treffer mit zufälligen Werten: 18073
				 * Versuche für 6 Treffer mit zufälligen Werten: 450680
				 * 
				 * Bei einer manuellen Eingabe, der Zahlen. Gibt man am besten 6x die gleiche Zahl ein,
				 * um schnell mehrere Treffer zu landen.
				 * 
				 */
				
				userGivenNumbers[0] = random.nextInt(1, 49);
				userGivenNumbers[1] = random.nextInt(1, 49);
				userGivenNumbers[2] = random.nextInt(1, 49);
				userGivenNumbers[3] = random.nextInt(1, 49);
				userGivenNumbers[4] = random.nextInt(1, 49);
				userGivenNumbers[5] = random.nextInt(1, 49);
				
				
			} else {
				
				getUserInput(userGivenNumbers, scanner);
				
			}
			
			Arrays.sort(userGivenNumbers);
			
			attempts++;
			
		}
		System.out.printf("%n");
		System.out.printf("Anzahl der Versuche %d%n", attempts);
		
		showNumbers(lottoNumbers, userGivenNumbers);
		
		showMatches(lottoNumbers, userGivenNumbers);
		
		scanner.close();

	}
	
	public static void generateLottoNumber(int lottoNumbers[]) {
		
		Random random = new Random();
		
		for(int i = 0; i < lottoNumbers.length; i++) {
					
			lottoNumbers[i] = random.nextInt(1, 49);
					
		}
		
	}
	
	public static void getUserInput(int userGivenNumbers[], Scanner scanner) {
		
		for(int i = 0; i < userGivenNumbers.length; i++) {
			
			boolean between1and49 = false;
			
			while(!between1and49) {
				
				userGivenNumbers[i] = readNumber(scanner, i);
				
				between1and49 = (userGivenNumbers[i] <= 49) && (userGivenNumbers[i] >= 1);
				
				if(!between1and49) {
					
					System.out.printf("%n");
					System.out.printf("Nur Zahlen zwischen 1 und 49 sind zulässig!%n");
					System.out.printf("%n");
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
	
	// Method to check if a character is a number
		public static boolean charIsANumber(char c) {return c >= 48 && c <= 57;}
		
	// Method to check if a string consists only of numeric characters
	public static boolean stringIsANumber(String s) {
		
		boolean isANumber = true;
		
		for(int i = 0; i < s.length(); i++) {
			
			boolean currentCharIsANumber = charIsANumber(s.charAt(i));
			
			isANumber = currentCharIsANumber ? isANumber : false;
			
			if(!currentCharIsANumber) {
				
				break;
				
			}
			
		}
		
		if(s.length() == 0) {
			
			isANumber = false;
		}
		
		return isANumber;
	}
	
	public static int readNumber(Scanner scanner, int i) {
		
		String inputAsString = "placeholder";
		
		while(!stringIsANumber(inputAsString)) {
			
			System.out.printf("Bitte die %d. Zahl eingeben: ", i + 1);
			inputAsString = scanner.nextLine();
			
			if(!stringIsANumber(inputAsString)) {
				
				System.out.printf("%n");
				System.out.printf("Zeichenketten als Eingaben und leere Eingaben sind unzulässig!%n");
				System.out.printf("%n");
				
			}
			
		}
		
		int inputAsInt = Integer.valueOf(inputAsString);
		
		return inputAsInt;
	}
	
	
	
}
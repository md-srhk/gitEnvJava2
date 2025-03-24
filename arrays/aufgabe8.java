package arrays;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Aufgabe8 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int array[] = new int[100];
		
		int chosen = -1;
		boolean arrayFilled = false;
		boolean terminated = false;
		
		String choices[] = {
				"Array füllen",
				"Array anzeigen",
				"Array sortieren",
				"Minimum",
				"Maximum",
				"Mittelwert",
				"Spannweite",
				"Beenden"
		};
		
		while(!terminated) {
			
			System.out.printf("%n");
			for (int i = 0; i < choices.length; i++) {
				
				System.out.printf("(%d) %s%n", i + 1, choices[i]);
				
			}
			System.out.printf("%n");
			
			System.out.printf("%n");
			
			System.out.printf("Auswahl (1 - 8): ");
			chosen = scanner.nextInt();
			
			if(!arrayFilled && !((chosen == 1) || (chosen == 8))) {
				
				System.out.printf("Array muss vorhere befüllt werden.%n");
				
			} else {
				
				switch(chosen - 1) {
				case 0:
					arrayFilled = true;
					arrayFuellen(array);
					break;
				case 1:
					arrayAnzeigen(array);
					break;
				case 2:
					arraySortieren(array);
					break;
				case 3:
					System.out.printf("Minimum: %d%n", minimum(array));
					break;
				case 4:
					System.out.printf("Maximum: %d%n", maximum(array));
					break;
				case 5:
					System.out.printf("Mittelwert: %f%n", mittelwert(array));
					break;
				case 6:
					System.out.printf("Spannweite: %d%n", spannweite(array));
					break;
				case 7:
					terminated = true;
					break;
				default:
					System.out.printf("Falsche Eingabe!%n");
					break;
				}
				
			}
			
		}
		
		scanner.close();
		
	}
	
	public static void arrayFuellen(int array[]) {
		
		Random random = new Random();
		
		for(int i = 0; i < array.length; i++) {
			
			array[i] = random.nextInt(1, 1000);
			
		}
		
	}
	
	public static void arrayAnzeigen(int array[]) {
		
		for(int x = 0; x < 10; x++) {
			for(int y = 0; y < 10; y++) {
				
				System.out.printf(" [%03d] %4d", (x*10 + y), array[(x*10 + y)]);
				
			}
			
			System.out.printf("%n");
			
		}
		
	}
	
	public static void arraySortieren(int array[]) {
		Arrays.sort(array);
	}
	
	public static int minimum(int array[]) {
		
		
		int min = array[0];
		
		for(int i = 1; i < array.length; i++) {
			
			if(array[i] < min) {
				
				min = array[i];
				
			}
			
		}
		
		return min;
		
	}
	
	public static int maximum(int array[]) {
		
		
		int max = array[0];
		
		for(int i = 1; i < array.length; i++) {
			
			if(array[i] > max) {
				
				max = array[i];
				
			}
			
		}
		
		return max;
		
	}
	
	public static double mittelwert(int array[]) {
		
		/* Nachricht für den Lehrer / Message for the teacher
		 * 
		 * Ich nehme an, dass Sie das arithmetisches Mittel als Durchschnitt meinen
		 * Siehe: https://de.wikipedia.org/wiki/Arithmetisches_Mittel
		 */
		
		
		
		double avg;
		int sum = 0;
		
		for(int i = 1; i < array.length; i++) {
			
			sum += array[i];
			
		}
		
		avg = sum / array.length;
		
		return avg;
		
	}
	
	public static int spannweite(int array[]) {
		
		return maximum(array) - minimum(array);
		
	}
	
}

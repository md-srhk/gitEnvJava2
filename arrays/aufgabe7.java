package arrays;
import java.awt.geom.GeneralPath;
import java.util.Random;
import java.util.Arrays;

public class aufgabe7 {
	public static void main(String[] args) {
		
		int array[] = new int[100];
		
		int min, max, range;
		double avg;
		
		generateValues(array);
		displayValues(array);
		
		Arrays.sort(array);
		
		min = calcMin(array);
		max = calcMax(array);
		avg = calcAvg(array);
		range = calcRange(array);
		
		System.out.printf(
				  "Minimums: %d%n"
				+ "Maximums: %d%n"
				+ "Durchschnitt (Arithmetisches Mittel): %f%n"
				+ "Spannweite: %d%n",
				min, max, avg, range);
		
				
		
		
		
	}
	
	public static void generateValues(int array[]) {
		
		Random random = new Random();
		
		for(int i = 0; i < array.length; i++) {
			
			array[i] = random.nextInt(1, 1000);
			
		}
		
	}
	
	public static void displayValues(int array[]) {
		
		for(int x = 0; x < 10; x++) {
			for(int y = 0; y < 10; y++) {
				
				System.out.printf(" [%03d] %4d", (x*10 + y), array[(x*10 + y)]);
				
			}
			
			System.out.printf("%n");
			
		}
		
	}
	
	public static int calcMin(int array[]) {
		
		
		int min = array[0];
		
		for(int i = 1; i < array.length; i++) {
			
			if(array[i] < min) {
				
				min = array[i];
				
			}
			
		}
		
		return min;
		
	}
	
	public static int calcMax(int array[]) {
		
		
		int max = array[0];
		
		for(int i = 1; i < array.length; i++) {
			
			if(array[i] > max) {
				
				max = array[i];
				
			}
			
		}
		
		return max;
		
	}
	
	public static double calcAvg(int array[]) {
		
		// Ich nehme an, dass Sie das arithmetisches Mittel als Durchschnitt meinen
		// Siehe: https://de.wikipedia.org/wiki/Arithmetisches_Mittel
		
		double avg;
		int sum = 0;
		
		for(int i = 1; i < array.length; i++) {
			
			sum += array[i];
			
		}
		
		avg = sum / array.length;
		
		return avg;
		
	}
	
	public static int calcRange(int array[]) {
		
		return calcMax(array) - calcMin(array);
		
	}
	
}

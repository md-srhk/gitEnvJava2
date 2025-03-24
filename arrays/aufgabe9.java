package arrays;

import java.util.Random;
import java.util.Arrays;

public class Aufgabe9 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int lottoNumbers[] = new int[6];
		for(int i = 0; i < lottoNumbers.length; i++) {
			
			lottoNumbers[i] = random.nextInt(1, 49);
					
		}
		
		Arrays.sort(lottoNumbers);
		
		System.out.printf("Die Lottozahlen: ");
		for(int i = 0; i < lottoNumbers.length; i++) {
			
			System.out.printf("%d ", lottoNumbers[i]);
					
		}

	}

}

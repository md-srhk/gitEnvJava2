package arrays;

import java.util.Random;

public class aufgabe5 {

	public static void main(String[] args) {
		
		final int lengthOfBothArrays = 10;
		
		int beliebigeZahlen1[] = new int[lengthOfBothArrays];
		
		beliebigeZahlen1[0] = 99;
		beliebigeZahlen1[1] = 67;
		beliebigeZahlen1[2] = 33;
		beliebigeZahlen1[3] = 12;
		beliebigeZahlen1[4] = 71;
		beliebigeZahlen1[5] = 88;
		beliebigeZahlen1[6] = 78;
		beliebigeZahlen1[7] = 87;
		beliebigeZahlen1[8] = 88;
		beliebigeZahlen1[9] = 98;
		
		int beliebigeZahlen2[] = beliebigeZahlen1.clone();
		
		for(int i = 0; i < lengthOfBothArrays; i++) {
			
			System.out.printf(
					 
			  "Wert von beliebigeZahlen1[%d] ist %d\t"
			+ "Wert von beliebigeZahlen2[%d] ist %d\n"
			  , i, beliebigeZahlen1[i], i, beliebigeZahlen2[i]);
			
		}

	}

}

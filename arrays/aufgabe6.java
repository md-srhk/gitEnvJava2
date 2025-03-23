package arrays;

import java.util.Arrays;
import java.util.Iterator;

public class aufgabe6 {

	public static void main(String[] args) {

		int meinArray[] = new int[6];
		
		meinArray[0] = 23;
		meinArray[1] = 11;
		meinArray[2] = 2;
		meinArray[3] = 134;
		meinArray[4] = 3;
		meinArray[5] = 1;
		
		String[] stringArray = new String[5];
		
		stringArray[0] = "x";
		stringArray[1] = "y";
		stringArray[2] = "d";
		stringArray[3] = "a";
		stringArray[4] = "m";
		
		System.out.printf("int-Array%n");
		System.out.printf("Unsortiertes Array:\t\t\t\t");
		for(int i = 0; i < meinArray.length; i++) {
			
			if(i == (meinArray.length - 1)) {
				
				System.out.printf("%d%n", meinArray[i]);
				
			} else {
				
				System.out.printf("%d ", meinArray[i]);
				
			}
			
		}
		
		Arrays.sort(meinArray);
		
		System.out.printf("Sortiertes Array mit for-Schleife:\t\t");
		for(int i = 0; i < meinArray.length; i++) {
			
			if(i == (meinArray.length - 1)) {
				
				System.out.printf("%d%n", meinArray[i]);
				
			} else {
				
				System.out.printf("%d ", meinArray[i]);
				
			}
			
		}
		
		System.out.printf("Sortiertes Array mit foreach-Schleife:\t\t");
		for(int current : meinArray) {
			
			if(current == meinArray[meinArray.length - 1]) {
				
				System.out.printf("%d%n", current);
				
			} else {
				
				System.out.printf("%d ", current);
				
			}
			
		}
		
		System.out.printf("%n");
		System.out.printf("String-Array%n");
		System.out.printf("Unsortiertes Array:\t\t\t\t");
		for(int i = 0; i < stringArray.length; i++) {
			
			if(i == (stringArray.length - 1)) {
				
				System.out.printf("%s%n", stringArray[i]);
				
			} else {
				
				System.out.printf("%s ", stringArray[i]);
				
			}
			
		}
		
		Arrays.sort(stringArray);
		
		System.out.printf("Sortiertes Array mit for-Schleife:\t\t");
		for(int i = 0; i < stringArray.length; i++) {
			
			if(i == (stringArray.length - 1)) {
				
				System.out.printf("%s%n", stringArray[i]);
				
			} else {
				
				System.out.printf("%s ", stringArray[i]);
				
			}
			
		}
		
		System.out.printf("Sortiertes Array mit foreach-Schleife:\t\t");
		for(String current : stringArray) {
			
			if(current == stringArray[stringArray.length - 1]) {
				
				System.out.printf("%s%n", current);
				
			} else {
				
				System.out.printf("%s ", current);
				
			}
			
		}
	}

}

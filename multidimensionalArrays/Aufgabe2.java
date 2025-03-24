package multidimensionalArrays;

public class Aufgabe2 {

	public static void main(String[] args) {
		
		final int rows = 4;
		final int columns = 2;
		
		String array[][] = new String[rows][columns];
		
		// Initialize values for array
		array[0][0] = "Heute";
		array[0][1] = "ist";
		array[1][0] = "ein";
		array[1][1] = "toller";
		array[2][0] = "Tag.";
		array[2][1] = "Wir";
		array[3][0] = "programmieren";
		array[3][1] = "Java.";
		
		// Print out values of array without an loop
		System.out.printf("%s ", array[0][0]);
		System.out.printf("%s ", array[0][1]);
		System.out.printf("%s ", array[1][0]);
		System.out.printf("%s ", array[1][1]);
		System.out.printf("%s ", array[2][0]);
		System.out.printf("%s ", array[2][1]);
		System.out.printf("%s ", array[3][0]);
		System.out.printf("%s%n", array[3][1]);
		
		/*
		 * Print out values of array.
		 * Goes over the columns of the first row, then over the columns of the second row, and so on.
		 */
		for(int x = 0; x < rows; x++) {
		
			for(int y = 0; y < columns; y++) {
			
				if((x == (rows - 1)) && (y == (columns - 1))) {
					
					System.out.printf("%s%n", array[x][y]);
					
				} else {
					
					System.out.printf("%s ", array[x][y]);
					
				}
				
			}
			
		}
		
		/*
		 * Print out values of array.
		 * Goes over the columns of the first row, then over the columns of the second row, and so on.
		 * Adds "KEIN" after "programmieren"
		 */
		for(int x = 0; x < rows; x++) {
			
			for(int y = 0; y < columns; y++) {
			
				if((x == (rows - 1)) && (y == (columns - 1))) {
					
					System.out.printf("%s%n", array[x][y]);
					
				} else {
					
					System.out.printf("%s ", array[x][y]);
					
					if(array[x][y].equals("programmieren")) {
						System.out.printf("KEIN ");
					}
					
				}
				
			}
			
		}
		
		// Count the characters in every element of the array with the word "KEIN" added
		int countCharacters = 0;
		for(int x = 0; x < rows; x++) {
			
			for(int y = 0; y < columns; y++) {
			
				countCharacters += array[x][y].length();
				
			}
			
		}
		countCharacters += 4; // For the word "KEIN"
		System.out.printf("Anzahl Zeichen: %d", countCharacters);
		

	}

}

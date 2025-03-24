package multidimensionalArrays;

public class Aufgabe3 {
	
	public static void main(String[] args) {
		
		int array1[][] = {{6,5}, {4, 7}, {2, 1}};
		int array2[][] = kopieren(array1);
		int array3[][] = ausmisten(array1);
		
		System.out.printf("array2: ");
		show2DimensionalArray(array2);
		
		System.out.printf("array3: ");
		show2DimensionalArray(array3);
		
	}
	
	public static int[][] kopieren(int array[][]) {
		
		int oldArrayRows = array.length;
		int oldArrayColumns = array[0].length;
		
		int newArray[][] = new int[oldArrayRows][oldArrayColumns];
		
		// Copies every element of a two-dimensional array to a new two-dimensional array newArray
		for(int currentRow = 0; currentRow < oldArrayRows; currentRow++) {
			for(int currentColumn = 0; currentColumn < oldArrayColumns; currentColumn++) {
				
				newArray[currentRow][currentColumn] = array[currentRow][currentColumn];
				
			}
		}
		
		return newArray;
		
	}
	
	public static int[][] ausmisten(int array[][]) {
		
		// Get the length of array[][] and its nested arrays
		int oldArrayRows = array.length;
		int oldArrayColumns = array[0].length;
		
		int newArray[][] = new int[oldArrayRows][oldArrayColumns];
		
		// Copies every element of a two-dimensional array to a new two-dimensional array newArray
		// If one element is greater than 5 it is replaced with 0
		for(int currentRow = 0; currentRow < oldArrayRows; currentRow++) {
			for(int currentColumn = 0; currentColumn < oldArrayColumns; currentColumn++) {
				
				// Filter out every element that is greater than 5
				newArray[currentRow][currentColumn] = (array[currentRow][currentColumn] > 5) ? (0) : (array[currentRow][currentColumn]);
				
			}
		}
		
		return newArray;
		
	}
	
	// Print out every element of a two-dimensional array in one line
	public static void show2DimensionalArray(int array[][]) {
		
		int rows = array.length;
		int columns = array[0].length;
		
		for(int y = 0; y < columns; y++) {
			
			for(int x = 0; x < rows; x++) {
				
				if((x == (rows - 1)) && (y == (columns - 1))) {
					
					System.out.printf("%d%n", array[x][y]);
					
				} else {
					
					System.out.printf("%d ", array[x][y]);
					
				}
				
			}
			
		}
		
	}
	
}

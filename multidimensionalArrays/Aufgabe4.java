package multidimensionalArrays;

public class Aufgabe4 {
	
	public static void main(String[] args) {
		
		int array1[][] = {{6,5}, {4, 7}, {2, 1}};
		int array2[] = gibZeile(array1);

		
		for (int i = 0; i < array2.length; i++) {
			System.out.printf("[%d] %d%n", i, array2[i]);
		}
		
		
		
	}
	
	public static int[] gibZeile(int array[][]) {
		
		int oldArrayRows = array.length;
		int oldArrayColumns = array[0].length;
		
		int newArraySize = oldArrayRows * oldArrayColumns;
		int newArray[] = new int[newArraySize];
		
		// Copies every element of a two-dimensional array to a new two-dimensional array newArray
		for(int currentRow = 0; currentRow < oldArrayRows; currentRow++) {
			for(int currentColumn = 0; currentColumn < oldArrayColumns; currentColumn++) {
				
				newArray[currentRow * oldArrayColumns + currentColumn] = array[currentRow][currentColumn];
				
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

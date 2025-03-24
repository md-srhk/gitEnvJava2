package multidimensionalArrays;

public class Aufgabe1 {
	
	public static void main(String[] args) {
		
		final int rowsForArray1 = 5;
		final int columnsForArray1 = 2;
		
		int array1[][] = new int[rowsForArray1][columnsForArray1];
		
		/* Fills the array with 0 - 4 for the first column, and 5 - 9 for the second column.
		 * 
		 * Equivalent to:
		 * 
		 * array1[0][0] = 0;
		 * array1[1][0] = 1;
		 * array1[2][0] = 2;
		 * array1[3][0] = 3;
		 * array1[4][0] = 4;
		 * array1[0][1] = 5;
		 * array1[1][1] = 6;
		 * array1[2][1] = 7;
		 * array1[3][1] = 8;
		 * array1[4][1] = 9;
		 */
		for(int y = 0; y < columnsForArray1; y++) {
			
			for(int x = 0; x < rowsForArray1; x++) {
				
				array1[x][y] = y * 5 + x;
				
			}
			
		}
		
		System.out.printf("%d ", array1[0][0]);
		System.out.printf("%d ", array1[1][0]);
		System.out.printf("%d ", array1[2][0]);
		System.out.printf("%d ", array1[3][0]);
		System.out.printf("%d ", array1[4][0]);
		System.out.printf("%d ", array1[0][1]);
		System.out.printf("%d ", array1[1][1]);
		System.out.printf("%d ", array1[2][1]);
		System.out.printf("%d ", array1[3][1]);
		System.out.printf("%d", array1[4][1]);
		System.out.printf("%n");
		
		for(int y = 0; y < columnsForArray1; y++) {
			
			for(int x = 0; x < rowsForArray1; x++) {
				
				if((x == (rowsForArray1 - 1)) && (y == (columnsForArray1 - 1))) {
					
					System.out.printf("%d%n", array1[x][y]);
					
				} else {
					
					System.out.printf("%d ", array1[x][y]);
					
				}
				
			}
			
		}
		
		show2DimensionalArray(array1);
		
		final int rowsForArray2 = 3;
		final int columnsForArray2 = 2;
		
		String array2[][] = new String[rowsForArray2][columnsForArray2];
		
		array2[0][0] = "Heute";
		array2[0][1] = "ist";
		array2[1][0] = "ein";
		array2[1][1] = "toller";
		array2[2][0] = "Tag";
		array2[2][1] = "!";

		
		for(int y = 0; y < columnsForArray2; y++) {
			
			for(int x = 0; x < rowsForArray2; x++) {
				
				if(((columnsForArray2 - 1) == y) && ((rowsForArray2 - 1) == x)) {
					
					System.out.printf("%s%n", array2[x][y]);
					
				} else {
					
					System.out.printf("%s ", array2[x][y]);
					
				}
				
			}
			
		}
		
		
		
	}
	
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

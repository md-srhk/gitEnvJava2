package arrays;

public class Aufgabe1 {
	
	public static void main(String[] args) {
		
		double[] array1 = new double[3];
		
		array1[0] = 2.7;
		array1[1] = 3.9;
		array1[2] = 12.54;
		
		System.out.printf("Ausgabe ohne Verwendung einer Schleife:%n");
		
		System.out.printf("Ausgabe Zahl: %.1f%n", array1[0]);
		System.out.printf("Ausgabe Zahl: %.1f%n", array1[1]);
		System.out.printf("Ausgabe Zahl: %.2f%n", array1[2]);
		System.out.printf("%n");
		
		System.out.printf("Laenge des Arrays: %d%n", array1.length);
		System.out.printf("%n");
		
		System.out.printf("Ausgabe mit for-Schleife:%n");
		
		for(int i = 0; i < array1.length; i++) {
			
			if(i == 2) {
				
				System.out.printf("%.2f " ,array1[i]);
				System.out.printf("%n");
				
			} else {
				
				System.out.printf("%.1f " ,array1[i]);
				
			}
			
		}
		System.out.printf("%n");
		
		System.out.printf("Ausgabe mit foreach-Schleife:%n");
		
		for(double currentNumber : array1) {
			
			if(currentNumber == 12.54) {
				
				System.out.printf("%.2f%n" , currentNumber);
				
			} else {
				
				System.out.printf("%.1f%n" , currentNumber);
				
			}
			
		}
		
		
	}
}

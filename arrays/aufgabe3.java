package arrays;

import java.util.Scanner;

public class aufgabe3 {
	
	public static void main(String[] args) {
	        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bitte Anzahl der Elemente eingeben: ");
        
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        
        System.out.printf("%n");
        
        for (int i = 0; i < size; i++) {
            
            System.out.printf("Zahl eingeben: ");
            numbers[i] = scanner.nextInt();
            
        }
        
        System.out.printf("%n");
        
        System.out.printf("Die Zahlen in umgekehrter Reihenfolge: ");
        
        for (int i = size - 1; i >= 0; i--) {
           
            if (i == 0) {
            	
                System.out.printf("%d%n", numbers[i]);
                
            } else {
            	
                System.out.printf("%d, ", numbers[i]);
                
            }
        }
        
        System.out.printf("Die Zahlen in richtiger Reihenfolge: ");
        for (int i = 0; i < size; i++) {
           
            if ((i == (size - 1)) || size == 1) {
            	
                System.out.printf("%d%n", numbers[i]);
                
            } else {
            	
                System.out.printf("%d, ", numbers[i]);
                
            }
        }
        
        System.out.printf("Die Zahlen mit nur jeden zweiten Element: ");
        for (int i = 1; i < size; i+=2) {
            
            if (((i + 2) < size) || (size == 1)) {
            	
                System.out.printf("%d", numbers[i]);
                
            } else {
            	
                System.out.printf("%d, ", numbers[i]);
                
            }
        }
        System.out.printf("%n");
        
        System.out.printf("Die Zahlen mit nur positiven Werten: ");
        for (int i = 0; i < size; i++) {
        	
        	if(numbers[i] > 0) {
            
	            if ((i == (size - 1)) || size == 1) {
	            	
	                System.out.printf("%d%n", numbers[i]);
	                
	            } else {
	            	
	                System.out.printf("%d, ", numbers[i]);
	                
	            }
        	}
        }
        System.out.printf("%n");
        
        System.out.printf("Die Zahlen, die die Ziffer 1 enthalten: ");
        for (int i = 0; i < size; i++) {
        	
        	String currentNumberAsString = String.valueOf(numbers[i]);
        	boolean oneNextElementContains1 = false;
        	
        	if((i + 1) < size) {
	        	for(int x = i + 1; x < size; x++) {
	        		
	        		String nextNumberAsString = String.valueOf(numbers[x]);
	        		if(nextNumberAsString.contains("1")) {
	        			oneNextElementContains1 = true;
	        		}
	        	}
        	}
        	
        	if (currentNumberAsString.contains("1")) {
        		
	            if (!oneNextElementContains1 || size == 1) {
	            	
	                System.out.printf("%d", numbers[i]);
	                
	            } else {
	            	
	                System.out.printf("%d, ", numbers[i]);
	                
	            }
        	}
        }
        System.out.printf("%n");        
        
        scanner.close();
	        
    }
}

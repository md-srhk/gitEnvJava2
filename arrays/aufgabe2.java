package arrays;

public class aufgabe2 {

	public static void main(String[] args) {
		
		int[] beliebigeZahlen = new int[6];
		
		beliebigeZahlen[0] = 0;
		beliebigeZahlen[1] = 23;
		beliebigeZahlen[2] = 99;
		beliebigeZahlen[3] = 4;
		beliebigeZahlen[4] = 6;
		beliebigeZahlen[5] = -6;
		
        
		System.out.printf("Ausgabe ohne Verwendung einer Schleife%n");
		
        System.out.println(beliebigeZahlen[0]);
        System.out.println(beliebigeZahlen[1]);
        System.out.println(beliebigeZahlen[2]);
        System.out.println(beliebigeZahlen[3]);
        System.out.println(beliebigeZahlen[4]);
        System.out.println(beliebigeZahlen[5]);
        System.out.printf("%n");
        
        System.out.printf("Laenge des Arrays: %d%n", beliebigeZahlen.length);
        System.out.printf("%n");
        
        System.out.printf("Ausgabe mit for-Schleife:%n");
        
        for (int i = 0; i < beliebigeZahlen.length; i++) {
        	
            System.out.printf("[%d] %d%n", i, beliebigeZahlen[i]);
            
        }
        System.out.printf("%n");
        
        System.out.printf("Ausgabe mit foreach-Schleife:%n");
        
        for (int current : beliebigeZahlen) {
        	
            System.out.printf("%d%n", current);
            
        }
        System.out.printf("%n");
        
        System.out.printf("Ausgabe eines Arrays mit einem sinnvollen Satz:%n");
        String[] array2 = {"Das", " ist ", "ein ", "Array!"};
        for(String current: array2) {
        	
        	System.out.printf(current);
        	
        }
        

	}

}

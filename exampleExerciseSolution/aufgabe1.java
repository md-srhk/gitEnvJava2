package exampleExerciseSolution;

import java.util.ArrayList;
import java.util.Scanner;

public class aufgabe1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> bielibigeZahlen = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			
			bielibigeZahlen.add(i*i);
			
		}
		
		// The ArrayList<Integer> bielibigeZahl is accessed by its index
		
		System.out.printf("Test 1");
		
		System.out.printf(" %02d", bielibigeZahlen.get(0));
		System.out.printf(" %02d", bielibigeZahlen.get(1));
		System.out.printf(" %02d", bielibigeZahlen.get(2));
		System.out.printf(" %02d", bielibigeZahlen.get(3));
		System.out.printf(" %02d", bielibigeZahlen.get(4));
		System.out.printf(" %02d", bielibigeZahlen.get(5));
		System.out.printf(" %02d", bielibigeZahlen.get(6));
		System.out.printf(" %02d", bielibigeZahlen.get(7));
		System.out.printf(" %02d", bielibigeZahlen.get(8));
		System.out.printf(" %02d", bielibigeZahlen.get(9));
		
		/*
		 * The elements of the ArrayList<Integer> bielibigeZahl is
		 * accessed by a lambda expression that use another function
		 * System.out.println(...)
		 * */
		
		System.out.printf("%nTest 2");
		
		bielibigeZahlen.forEach((n) -> {
			
			System.out.printf(" %02d", n);
			
		});
		
		/*
		 * The iterator i access the elements of every i-th element 
		 * */ 
		
		System.out.printf("%nTest 3");
		
		for(int i = 0; i < bielibigeZahlen.size(); i++) {
			
			System.out.printf(" %02d", bielibigeZahlen.get(i));
			
		}
		
		/*
		 * Pass through the elements of ArrayList bielibigeZahlen through System.out.println(...) 
		 * */
		
		System.out.printf("%nTest 4");
		
		for(int current: bielibigeZahlen) {
			
			System.out.printf(" %02d", current);
			
		}
		
		ausgabe();
		
		System.out.printf("%nTest 5");
		
		ausgabe2(bielibigeZahlen, true);
		
		System.out.printf("%nTest 6");
		
		ausgabe2(bielibigeZahlen, false);
		
		
	}
	
	public static void ausgabe() {
		
		ArrayList<Integer> bielibigeZahlen = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			
			bielibigeZahlen.add(i*i);
			
		}
		
	}
	
	public static void ausgabe2(ArrayList<Integer> arrayList, boolean vorwärts) {
		
		if(vorwärts) {
			
			for(int i = 0; i < 10; i++) {
				
				System.out.printf(" %02d", arrayList.get(i));
				
			}
			
		} else {
			
			for(int i = 9; i >= 0; i--) {
				
				System.out.printf(" %02d", arrayList.get(i));
				
			}
		}
		
	}

}

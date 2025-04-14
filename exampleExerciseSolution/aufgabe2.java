package exampleExerciseSolution;

import java.util.ArrayList;

public class aufgabe2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> zahlenSammlung = new ArrayList<Integer>();
		ArrayList<Integer> zahlenSammlung2 = new ArrayList<Integer>();
		
		zahlenSammlung.add(5);
		zahlenSammlung.add(4);
		zahlenSammlung.add(9);
		zahlenSammlung.add(1);
		zahlenSammlung.add(6);
		zahlenSammlung.add(7);
		zahlenSammlung.add(2);
		zahlenSammlung.add(8);
		zahlenSammlung.add(10);
		zahlenSammlung.add(3);
		
		fillUpArrayList(zahlenSammlung2, 0);
		
		System.out.printf("Test 1 ");
		
		displayArrayList(zahlenSammlung);
		
		System.out.printf("%n");
		
		System.out.printf("Test 2 ");
		
		zahlenSammlung.sort(null);
		
		displayArrayList(zahlenSammlung);
		
		System.out.printf("%n");
		
		System.out.printf("Test 3 ");
		
		for (int i = 1; i < zahlenSammlung.size(); i++) {
				
				zahlenSammlung.remove(i);
				
		}
		
		displayArrayList(zahlenSammlung);
		
		System.out.printf("%nTest 4 ");
		
		fillUpArrayList(zahlenSammlung2, 5);
		
		displayArrayList(zahlenSammlung2);
		
		
		
	}
	
	public static void displayArrayList(ArrayList<Integer> arrayList) {
		
		for(int i = 0; i < arrayList.size(); i++) {
			
			System.out.printf("%02d ", arrayList.get(i));
				
		}
		
	}
	
	public static ArrayList<Integer> fillUpArrayList(ArrayList<Integer> arrayList, int size) {
		
		for(int i = 0; i < size; i++) {
			
			arrayList.add(0);
			
		}
		
		return arrayList;
		
	}
	
	

}

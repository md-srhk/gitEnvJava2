package multidimensionalArrays;

import java.util.Random;

public class Aufgabe5a {

	public static void main(String[] args) {
		
		int amountOfStations = 10;
		int amountOfDays = 7;
		
		double avgForSpecificStations[] = new double[amountOfStations];
		double avgForSpecificDays[] = new double[amountOfDays];
		
		int measuredValues[][] = new int[amountOfStations][amountOfDays];
		
		measuredValues = generateData(amountOfStations, amountOfDays);
		
		displayMeasuredData(measuredValues, amountOfStations, amountOfDays);
		System.out.printf("%n");
		
		avgForSpecificStations = calcAverageForStation(measuredValues, amountOfStations, amountOfDays);
		avgForSpecificDays = calcAverageForDays(measuredValues, amountOfStations, amountOfDays);
		
		
		displayAvgStations(avgForSpecificStations);
		System.out.printf("%n");
		
		displayAvgDays(avgForSpecificDays);
		
		
	}
	
	// Fill the two-dimensional array with values between 20 and 50
	public static int[][] generateData(int amountOfStations, int amountOfDays) {
		
		Random random = new Random();
		
		int generatedValues[][] = new int[amountOfStations][amountOfDays];
		
		for (int currentStation = 0; currentStation < amountOfStations; currentStation++) {
			
			for (int currentDay = 0; currentDay < amountOfDays; currentDay++) {
				
				generatedValues[currentStation][currentDay] = random.nextInt(20, 51);
				
			}
			
		}
		
		return generatedValues;
		
	}
	
	public static void displayMeasuredData(int measuredData[][], int amountOfStations, int amountOfDays) {
		
		for (int currentStation = 0; currentStation < amountOfStations; currentStation++) {
			
			System.out.printf("Messwerte Station %d:", currentStation + 1);
			
			for (int currentDay = 0; currentDay < amountOfDays; currentDay++) {
				
				System.out.printf(" %d", measuredData[currentStation][currentDay]);
				
			}
			
			System.out.printf("%n");
		}
		
	}
	
	public static double[] calcAverageForStation(int measuredData[][], int amountOfStations, int amountOfDays) {
		
		// Array that contains the average for each day
		double avgForSpecificDays[] = new double[amountOfStations];
		
		// Sum up values for each day in the array avgForSpecificDays[]
		for (int currentStation = 0; currentStation < amountOfStations; currentStation++) {
			
			for (int currentDay = 0; currentDay < amountOfDays; currentDay++) {
				
				avgForSpecificDays[currentStation] += measuredData[currentStation][currentDay];
				
			}
			
		}
		
		// Divide the values with amountOfDays (should be 7 by invoking the method)
		// to calculate the arithmetic mean
		for (int currentDay = 0; currentDay < amountOfStations; currentDay++) {
			
			avgForSpecificDays[currentDay] /= amountOfStations;
			
		}
		
		
		return avgForSpecificDays;
		
	}
	
	public static double[] calcAverageForDays(int measuredData[][], int amountOfStations, int amountOfDays) {
		
		// Array that contains the average for each day
		double avgForSpecificStations[] = new double[amountOfDays];
		
		// Sum up values for each day in the array avgForSpecificDays[]
		for (int currentStation = 0; currentStation < amountOfStations; currentStation++) {
			
			for (int currentDay = 0; currentDay < amountOfDays; currentDay++) {
				
				avgForSpecificStations[currentDay] += measuredData[currentStation][currentDay];
				
			}
			
		}
		
		// Divide the values with amountOfDays (should be 7 by invoking the method)
		// to calculate the arithmetic mean
		for (int currentDay = 0; currentDay < amountOfDays; currentDay++) {
			
			avgForSpecificStations[currentDay] /= amountOfDays;
			
		}
		
		
		return avgForSpecificStations;
		
	}
	
	public static void displayAvgStations(double[] avgForSpecificStations) {
		
		for (int i = 0; i < avgForSpecificStations.length; i++) {
			
			System.out.printf("Durschnitt für Tag %d: %.0f%n", i + 1, avgForSpecificStations[i]);
			
		}
		
	}
	
	public static void displayAvgDays(double[] avgForSpecificDays) {
		
		for (int i = 0; i < avgForSpecificDays.length; i++) {
			
			System.out.printf("Durschnitt für Tag %d: %.0f%n", i + 1, avgForSpecificDays[i]);
			
		}
		
	}
	
}

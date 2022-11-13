package miniChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String args[]) {
		excerciseOne();
		excerciseTwo();
	}

	public static void excerciseOne() {
		String typeData = "";
		Scanner leer = new Scanner(System.in);

		while (!typeData.equals("TypeA") && !typeData.equals("TypeB")) {
			System.out.println("Indicate if you want to print a 'TypeA' or a 'TypeB' key");
			typeData = leer.nextLine();

			if (!typeData.equals("TypeA") && !typeData.equals("TypeB")) {
				System.out.println("Por favor ingrese solo 'TypeA' o 'TypeB'");
				System.out.println("Please, only choose amongst 'TypeA' or 'TypeB'");
			} else {
				System.out.println(generateRandom(typeData));
			}
		}
	}

	private static String generateRandom(String typeData) {
		String number = "";

		if (typeData.equals("TypeA")) {
			number = "54";
		} else if (typeData.equals("TypeB")) {
			number = "08";
		}

		for (int i = 0; i <= 8; i++) {
			number += String.valueOf((int) (Math.random() * 10)); // valueOf converts an int to a String
		}

		return number;
	}

	public static void excerciseTwo() {
		Scanner leer = new Scanner(System.in);
		int numbers[] = new int[10];
		String paramater = "";
		
		while (!paramater.equals("Asc") && !paramater.equals("Desc")) {
			System.out.println("Escriba si es 'Asc' o 'Desc' ");
			paramater = leer.nextLine();
			System.out.println("Escriba la lista de números ");
			for (int i = 0; i < 10; i++) {
				numbers[i] = leer.nextInt();	
			}

			if (paramater.equals("Desc")) {
				System.out.println("Ordenado de mayor a menor " + Arrays.toString(descendingOrder(numbers)));

			} else if (paramater.equals("Asc")) {
				System.out.println("Ordenado de menor a mayor " + Arrays.toString(ascendingOrder(numbers)));
			} else {
				System.out.println("Por favor ingrese solo 'Asc' o 'Desc'");
			}
		}
			
		
	}

	private static int[] descendingOrder(int numbers[]) {
		int orderedNumbers[] = Arrays.copyOf(numbers, numbers.length);
		int aux;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i; j < orderedNumbers.length; j++) {
				if (orderedNumbers[j] > orderedNumbers[i]) {
					aux = orderedNumbers[i];
					orderedNumbers[i] = orderedNumbers[j];
					orderedNumbers[j] = aux;
				}
			}
		}

		return orderedNumbers;

	}

	private static int[] ascendingOrder(int numbers[]) {
		int orderedNumbers[] = Arrays.copyOf(numbers, numbers.length);
		int aux;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i; j < orderedNumbers.length; j++) {
				if (orderedNumbers[j] < orderedNumbers[i]) {
					aux = orderedNumbers[i];
					orderedNumbers[i] = orderedNumbers[j];
					orderedNumbers[j] = aux;
				}
			}
		}

		return orderedNumbers;

	}

}

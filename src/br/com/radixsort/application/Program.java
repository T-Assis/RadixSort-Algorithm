package br.com.radixsort.application;

import br.com.radixsort.sortingmethod.RadixSort;

/**
 * 
 * @author Thales Lima de Assis (T-Assis - https://github.com/T-Assis)
 */
public class Program {

	public static void main(String[] args) {
	
		int[] vector = { 831, 1234, 10, 13, 35, 67, 0, 693, 56, 842, 88, 99, 44, 0};
		
		System.out.println("Radix Sort:");
		System.out.print("Vector before:\n[ ");
		printVector(vector);

		RadixSort.sortVector(vector);
		
		System.out.print("Vector after:\n[ ");
		printVector(vector);
	} 
	
	public static void printVector(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			if(i == vector.length - 1 )
				System.out.print(vector[i] + " ]");
			else
				System.out.print(vector[i] + ", ");
		}
		System.out.println("\n");
	}

} 

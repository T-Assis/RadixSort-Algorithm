package br.com.radixsort.sortingmethod;

import java.util.ArrayList;

/**
 *
 * @author Thales Lima de Assis (thales-assis - https://github.com/thales-assis)
 */
public class RadixSort {

	public static void sortVector(int[] vector) {

		// Find the largest element of the vector.
		// Encontra o maior elemento do vetor.
		int largestElement = 0;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] > largestElement)
				largestElement = vector[i];
		}

		// Will sort the vector Nº times (N = number of digits of the largest element).
		// Irá ordenar o vetor Nº vezes (N = quantidade de digitos do maior elemento).
		int divider = 1;
		while (largestElement > 0) {

			// Create the array that will store the elements ​​of the vector to order them mathematically.
			// Cria a matriz que aramzenará os elementos do vetor para ordena-los matematicamente.
			ArrayList[] matrix = new ArrayList[10];

			// Starts ArrayLists from matrix.
			// Inicia os ArrayLists da matriz.
			for (int i = 0; i < matrix.length; i++) {
				matrix[i] = new ArrayList<Integer>();
			}

			// Indexes all elements ​​of the vector in the matrix.
			// Indexa todos os elementos do vetor na matriz.
			for (int i = 0; i < vector.length; i++) {

				// Receive the index at which the element will be appended to the matrix.
				// Recebe o indice em que o elemento será anexado na matriz.
				int index = vector[i] / divider % 10;

				// Add in the matrix the element of the vector.
				// Adiciona na matriz o elemento do vetor.
				matrix[index].add(vector[i]);

			}

			// Auxiliary that will save the position that has already been filled in the vector.
			// Auxiliar que irá guardar a posição que já foi preenchida no vetor.
			int aux = 0;
			
			// Throws the array elements into the vector. 
			// Joga os elementos da matriz no vetor.
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].size(); j++, aux++) {
					vector[aux] = (Integer) matrix[i].get(j);
				}
			}
			
			// Removes the least significant digit from the largest element in the vector (Control of the while).
			// Remove o dígito menos significativo do maior elemento do vetor (Controle do while)
			largestElement /= 10;
			
			// Divider is multiplied by 10.
			// Divisor é multiplicado por 10.
			divider *= 10;
		}

	}

}

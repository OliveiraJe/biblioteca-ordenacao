package br.com.oliveiraJe.sort;

public class QuickSort {

	public static void sort(int[] vetor) {
		if (vetor == null || vetor.length < 2)
			return;
		quickSort(vetor, 0, vetor.length - 1);

	}

	public static void quickSort(int[] vetor, int inicio, int fim) {
		if (inicio < fim) {

			int pi = partiticao(vetor, inicio, fim);

			quickSort(vetor, inicio, pi - 1);
			quickSort(vetor, pi + 1, fim);
		}
	}

	private static int partiticao(int[] vetor, int inicio, int fim) {
		int pivo = vetor[fim];
		int i = (inicio - 1);

		for (int j = inicio; j < fim; j++) {

			if (vetor[j] <= pivo) {
				i++;

				int temp = vetor[i];
				vetor[i] = vetor[j];
				vetor[j] = temp;
			}
		}

		int temp = vetor[i + 1];
		vetor[i + 1] = vetor[fim];
		vetor[fim] = temp;

		return i + 1;
	}

}

package br.com.oliveiraJe.sort;

public class MergeSort {
	public static void sort(int[] vetor) {
		if (vetor.length < 2)
			return;
		sort(vetor, 0, vetor.length - 1);
	}

	private static void sort(int[] vetor, int esquerda, int direita) {
		if (esquerda < direita) {
			int meio = (esquerda + direita) / 2;
			sort(vetor, esquerda, meio);
			sort(vetor, meio + 1, direita);
			merge(vetor, esquerda, meio, direita);
		}
	}

	private static void merge(int[] array, int esquerda, int meio, int direita) {
		int numero1 = meio - esquerda + 1;
		int numero2 = direita - meio;

		int[] l = new int[numero1];
		int[] r = new int[numero2];

		for (int i = 0; i < numero1; ++i)
			l[i] = array[esquerda + i];
		for (int j = 0; j < numero2; ++j)
			r[j] = array[meio + 1 + j];

		int i = 0, j = 0, k = esquerda;
		while (i < numero1 && j < numero2) {
			if (l[i] <= r[j]) {
				array[k] = l[i++];
			} else {
				array[k] = r[j++];
			}
			k++;
		}

		while (i < numero1)
			array[k++] = l[i++];
		while (j < numero2)
			array[k++] = r[j++];
	}
}

package task2;

import java.util.Arrays;

public class Task2_1 {

	public static void mergeSort(int[] array, int left, int right) {
		if(array.length <=1) {
			return ;
		}
		if (left < right) {
			int mid = (left + right) / 2;
			mergeSort(array, left, mid);
			mergeSort(array, mid + 1, right);
			merge(array, left, mid, right);
		}

	}

	private static void merge(int[] array, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;

		int[] arrLeft = new int[n1];
		int[] arrRight = new int[n2];

		for (int i = 0; i < n1; i++) {
			arrLeft[i] = array[left+i];
		}

		for (int j = 0; j < n2; j++) {
			arrRight[j] = array[mid + 1 + j];
		}

		// Merge two array
		int i = 0, j = 0;
		int k = left;
		while (i < n1 && j < n2) {
			if (arrLeft[i] <= arrRight[j]) {
				array[k] = arrLeft[i];
				i++;
				k++;
			} else {
				array[k] = arrRight[j];
				j++;
				k++;
			}
		}

		while (i < n1) {
			array[k] = arrLeft[i];
			i++;
			k++;
		}

		while (j < n2) {
			array[k] = arrRight[j];
			j++;
			k++;
		}
	}

	public static void mergeSort(int[] array) {
		mergeSort(array, 0, array.length - 1);
	}

	public static void main(String[] args) {
		int[] arr = { 25, 30, 45, 6, 11, 90, 15 };
		mergeSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}

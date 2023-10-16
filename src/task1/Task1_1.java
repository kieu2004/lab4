package task1;

import java.util.Arrays;

public class Task1_1 {

	public static void swap(int[] array, int a, int b) {
		int swap;
		swap = array[a];
		array[a] = array[b];
		array[b] = swap;

	}

	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[minIndex] > array[j]) {
					minIndex = j;
				}
			}
			swap(array, i, minIndex);

		}
	}
	
	public static void main(String[] args) {
		int[] arr1= {2,6,0,3,8,6};
		selectionSort(arr1);
		System.out.println(Arrays.toString(arr1));
	}
}

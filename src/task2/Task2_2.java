package task2;

import java.util.Arrays;
import java.util.Random;

public class Task2_2 {

	public static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}

	public static void quickSort(int[] arr, int left, int right) {
		if (left > right) {
			return;
		}

		int pivot = getPivot_Random(arr, left, right);

		quickSort(arr, left, pivot - 1);

		quickSort(arr, pivot + 1, right);

	}

	public static int getPivot_First(int[] arr, int left, int right) {
		int pivot = arr[left];
		int count = 0;
		for (int i = left + 1; i < arr.length; i++) {
			if (arr[i] <= pivot) {
				count++;
			}
		}

		int pivotIndex = left + count;
		swap(arr, left, pivotIndex);

		int i = left, j = right;
		while (i < pivotIndex && i > pivotIndex) {
			while (arr[i] <= pivot) {
				i++;
			}
			while (arr[i] > pivot) {
				j--;
			}

			if (i < pivotIndex && j > pivotIndex) {
				swap(arr, i, j);
			}
		}
		return pivotIndex;
	}

	public static int getPivot_Last(int[] arr, int left, int right) {
		int pivot = arr[right];
		int i = left - 1;

		for (int j = left; j < right; j++) {
			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}

		swap(arr, i + 1, right);
		return i + 1;
	}

	public static int getPivot_Random(int[] arr, int left, int high) {
		Random random = new Random();
		
		int pivotIndex =  left+ random.nextInt(high - left + 1);
		int pivot= arr[pivotIndex];
		
		swap(arr,pivotIndex,high);
		int i = left, j = high - 1;  
	    while (i <= j) {
	        while (i <= j && arr[i] <= pivot) {
	            i++;
	        }
	        while (i <= j && arr[j] > pivot) {
	            j--;
	        }

	        if (i < j) {
	            swap(arr, i, j);
	            i++;
	            j--;
	        }
	    }

	    swap(arr, i, high);

	    return i;
	}
	
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;

	}

	public static void main(String[] args) {
		int[] arr = { 25, 30, 45, 6, 11, 90, 15 };
		quickSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}

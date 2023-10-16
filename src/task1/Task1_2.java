package task1;

import java.util.Arrays;

public class Task1_2 {
	
	static Task1_1 ex1= new Task1_1();
	
		public static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i] > array[j]) {
					ex1.swap(array, i, j);
				}

			}
			
		}
	}
	
	public static void main(String[] args) {
		int[] arr1= {6,0,1,-4,5,8,2};
		bubbleSort(arr1);
		System.out.println(Arrays.toString(arr1));
	}
}

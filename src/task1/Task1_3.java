package task1;

import java.util.Arrays;

public class Task1_3 {
	public static void insertionSort(int[] array) {
         for (int i = 1; i < array.length; i++) {
			 int value= array[i];
			 int j;
			 
			 for ( j = i-1; j >=0 && array[j] > value; j--) {
				array[j+1]=array[j];
			}
			 
			 array[j+1]=value;
				
		}
	}
	
	public static void main(String[] args) {
		int[] arr1= {2,6,0,3,8,6};
		insertionSort(arr1);
		System.out.println(Arrays.toString(arr1));
	}
}

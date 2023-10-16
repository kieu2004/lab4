package task1_4;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {

		Product p1 = new Product("001", "Snack", 56, "Food");
		Product p2 = new Product("007", "Snack", 20, "Food");
		Product p3 = new Product("003", "StrawberryIce", 14.5, "Ice-cream");
		Product p4 = new Product("006", "Lemon", 49, "Dink");
		Product p5 = new Product("001", "Coca", 23.5, "Dink");

		OrderItem i1 = new OrderItem(p1, 2);
		OrderItem i2 = new OrderItem(p2, 1);
		OrderItem i3 = new OrderItem(p3, 2);
		OrderItem i4 = new OrderItem(p4, 3);
		OrderItem i5 = new OrderItem(p5, 3);

		OrderItem[] orderItems = { i1, i2, i3, i4, i5 };
		Order order = new Order(orderItems);

		System.out.println("Unsorted array");
		System.out.println(Arrays.toString(orderItems));
		System.out.println();
		
		order.selectionSort(orderItems);
		System.out.println("Array is sorted by selection");
		System.out.println(Arrays.toString(orderItems));
		System.out.println();
		
		order.bubbleSort(orderItems);
		System.out.println("Array is sorted by bubble ");
		System.out.println(Arrays.toString(orderItems));
		System.out.println();
		
		
		order.insertionSort(orderItems);
		System.out.println("Array is sorted by insert");
		System.out.println(Arrays.toString(orderItems));
		System.out.println();
		
		
		
	}
}


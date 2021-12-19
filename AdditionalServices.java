package ASSIGNMENT2;

public class AdditionalServices {
	public void displayPricesAscendingOrder(double[] array) {
		System.out.println("Stock prices in ascending order are :");
		for(int i=0;i<array.length;i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}
	public void displayPricesDescendingOrder(double[] array) {
		System.out.println("Stock prices in descending order are :");
		for(int i=array.length-1;i>=0;i--)
			System.out.print(array[i] + " ");
		System.out.println();
	}
}

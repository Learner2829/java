// 1) Write application that creates an array of double, to provide following functionality.
//  display the length of the array and its elements.
//  Display an array. (Use for each version of loop for display).
//  compute the sume of the squares of these numbers.
//  Determine Mean and Median of an array.
//  Sort an array – Ascending and Descending. Use any two sorting algorithm. User can also select the sorting method.
//  Search an element from the array, i.e. returns the location of the element of an array that matches an indicated value.
//  Copy of an array.
//  Reverse of an array.

import java.util.Scanner;
import java.util.Arrays;

class arr_operations{
	//array elements display function
	public static void display(double[] array){
		for(double num: array){
			System.out.print(num+", ");
		}
		System.out.println();
	}

	//function to compute the sum of square of each elements
	public static double sqr(double[] array){
		double sum=0.0;
		for(double num: array){
			sum = (sum+(num*num));
		}
		return sum;
	}

	//function to calculate the mean of the array
	public static double mean(double[] array){
		double sum = 0;
		double mean = 0;
		for(double num: array){
			sum = sum+num;
		}
		mean = sum/array.length;
		return mean;
	}

	//function to calculate the median of the array
	public static double median(double[] array){
		double[] sortedArray = Arrays.copyOf(array, array.length);
		Arrays.sort(sortedArray);
		int middle = sortedArray.length/2;
		if(sortedArray.length % 2 == 0){
			return (sortedArray[middle - 1] + sortedArray[middle])/2.0;
		}else{
			return sortedArray[middle];
		}
	}

	//function to sort array using bubble sort in ascending order
	public static void ascending_bubble(double[] array){
		int n = array.length;
		boolean swapped;
		for(int i = 0; i<n-1; i++){
			swapped = false;
			for(int j = 0; j<n-i-1; j++){
				if(array[j]>array[j+1]){
					double temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					swapped = true;
				}
			}
			if(!swapped){
				break;
			}
		}
		display(array);
	}

	//function to sort the array using bubble sort in decsending order using bubblesort
	public static void descending_bubble(double[] array){
		int n = array.length;
		boolean swapped;
		for(int i = 0; i<n-1; i++){
			swapped = false;
			for(int j = 0; j<n-i-1; j++){
				if(array[j]<array[j+1]){
					double temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					swapped = true;
				}
			}
			if(!swapped){
				break;
			}
		}
		display(array);
	}

	//function to sort the array in ascending using selection sort
	public static void ascending_selection(double[] array){
		int n = array.length;
		for(int i = 0; i<n-i; i++){
			int minIndex = i;
			for(int j = i+1; j<n; j++){
				if(array[j]<array[minIndex]){
					minIndex = j;
				}
			}
			double temp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = temp;
		}
		display(array);
	}

	//function to sort the array descending using selection sort
	public static void descending_selection(double[] array){
		int n = array.length;
		for(int i = 0; i<n-i; i++){
			int minIndex = i;
			for(int j = i+1; j<n; j++){
				if(array[j]>array[minIndex]){
					minIndex = j;
				}
			}
			double temp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = temp;
		}
		display(array);
	}

	//function to search an element from the array
	public static int search(double[] array, double e){
		for(int i = 0; i<array.length; i++){
			if(array[i] == e){
				return i;
			}
		}
		return -1;
	}

	//function to reverse the array
	public static void reverse(double[] array){
		int n = array.length;
		double[] reversearray = new double[n];
		for(int i = 0; i<n; i++){
			reversearray[i] = array[n-i-1];
		}
		display(reversearray);
	}


	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);

		double[] arr = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		while(true){
			System.out.println("--------------------------------------------");
			System.out.println("Enter your choice from given options:");
			System.out.println("enter 1 to display the length of the array");
			System.out.println("enter 2 to display array elements using for loop");
			System.out.println("enter 3 to calculate sum of squares of array elements");
			System.out.println("enter 4 to calculate mean of the array elements");
			System.out.println("enter 5 to calculate median of the array elements");
			System.out.println("enter 6 to sort the array in bobble sort order");
			System.out.println("enter 7 to sort the array in Insertion sort order");
			System.out.println("enter 8 to search an element from the array");
			System.out.println("enter 9 to copy of an array");
			System.out.println("enter 10 to reverse the array");
			System.out.println("enter 11 or other number for Exit");
			System.out.println("--------------------------------------------");
			int ch = obj.nextInt();

			if (ch==1) {
				System.out.println("Array length"+arr.length);
			}
			else if(ch==2){
				display(arr);
			}
			else if(ch==3){
				sqr(arr);
			}
			else if(ch==4){
				mean(arr);
			}
			else if(ch==5){
				median(arr);
			}
			else if(ch==6){
				System.out.println("Enter 6.1 for asending order");
				System.out.println("Enter 6.1 for desending order");
				double c = obj.nextDouble();
				if(c == 6.1){
					ascending_bubble(arr);
				}else if(c==6.2){
					descending_bubble(arr);
				}
			}
			else if(ch==7){
				System.out.println("Enter 7.1 for ascending order");
				System.out.println("Enter 7.2 for descending order");
				double c = obj.nextDouble();
				if(c == 7.1){
					ascending_selection(arr);
				}else if(c==7.2){
					descending_selection(arr);
				}
			}
			else if(ch==8){
				System.out.println("Enter the element you want to search: ");
				double key = obj.nextDouble();
				search(arr, key);
			}
			else if(ch==9){
				double[] copyArray = Arrays.copyOf(arr, arr.length);
				display(copyArray);
			}
			else if(ch==10){
				reverse(arr);
			}
			else
			{
				break;
			}
		}
		
		
		// System.out.println("Array elements: ");
		// display(arr);

	}
}

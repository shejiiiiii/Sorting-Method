package kunganolang;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String testArray[] = {"3", "5", "2", "1", "7"};
		String search = sc.nextLine();
		
		System.out.println(binarySearch(search, testArray));
	}
	
	public static String binarySearch(String search, String testArray[]) {
		
		// Implementing Bubble Sort
		testArray = bubbleSort(testArray);
		
		int target = search.hashCode();
		int low = 0;
		int high = testArray.length - 1;
		
		while(low <= high) {
			int mid = (low + high) / 2;
			
			if(search.equals(testArray[mid]))
				return testArray[mid];
			else if(search.compareTo(testArray[mid]) < 0)
				high = mid - 1;
			else 
				low = mid + 1;
		}
	
		return "DID NOT FIND SEARCH ENTRY.";
	}
	
	public static String[] bubbleSort(String testArray[]) {
		
		boolean sorted = false;
		while(!sorted) {
			boolean swapped = false;
			for(int i = 1; i < testArray.length; i++) {
				if(Integer.parseInt(testArray[i]) < Integer.parseInt(testArray[i-1])) {
					String temp = testArray[i-1];
					testArray[i-1] = testArray[i];
					testArray[i] = temp;
					swapped = true;
				}

			}
			if(!swapped) {
				sorted = true;
			}
		}
		
		return testArray;
	}

}

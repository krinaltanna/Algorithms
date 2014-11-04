package serachSort;

import java.util.Arrays;

public class binarySearch {
	public static void main (String args[])
	{
		int a[] = { 2,4,6,9,10};
		int b[] = { 4,9,3,7,5,8};
		int val = doBinarySearch(a, 9);
		int val1 = doBinarySearch(a, 2);
		int val2 = doBinarySearch(a, 10);
		int val3 = doBinarySearch(a, 6);
		int val4 = doBinarySearch(a, 4);
		doInsertionSort(b);
		printNumbers(b);
	
		
	}
	
	  private static void printNumbers(int[] input) {
	         
	        for (int i = 0; i < input.length; i++) {
	            System.out.print(input[i] + ", ");
	        }
	        System.out.println("\n");
	    }
	
	
		 
	    private static int[] doSelectionSort(int[] arr){
	         
	        for (int i = 0; i < arr.length - 1; i++)
	        {
	            int index = i;
	            for (int j = i + 1; j < arr.length; j++)
	                if (arr[j] < arr[index]) 
	                    index = j;
	      
	            int smallerNumber = arr[index];  
	            arr[index] = arr[i];
	            arr[i] = smallerNumber;
	        }
	        return arr;
	    }
	    
	    public static void doInsertionSort(int array[]) {
	        int n = array.length;
	        for (int j = 1; j < n; j++) {
	            int key = array[j];
	            int i = j-1;
	            while ( (i > -1) && ( array [i] > array[j] ) ) {
	                array [i+1] = array [i];
	                i--;
	            }
	            array[i+1] = array[j];
	            //printNumbers(array);
	        }
	    }
	    
	    
	     
	  
	

	    // need extra "helper" method, feed in params
	    public static int doBinarySearch(int[] a, int x) { 
	       return  binarySearch(a, x, 0, a.length - 1);
	    }
	   
	    // need extra low and high parameters
	    private static int binarySearch(int[ ] a, int x,
	          int low, int high) {
	       if (low > high) return -1; 
	       int mid = (low + high)/2;
	       if (a[mid] == x) return mid;
	       else if (a[mid] < x)
	          return binarySearch(a, x, mid+1, high);
	       else // last possibility: a[mid] > x
	          return binarySearch(a, x, low, mid-1);
	    }


}

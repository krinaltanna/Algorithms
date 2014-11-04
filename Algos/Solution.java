package Algos;

//you can also use imports, for example:
//import java.util.*;

//you can use System.out.println for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution {
 public int solution(int[] A) {
     // write you
     int len = A.length;
     int i = 0;
    // System.out.println(len);
     for( i =0; i< len; i++)
     {
         int p = calculateSumPrevious(A, i);
         int a = calculateSumDifference(A,(i+1));
         System.out.println("a\t" +  a);
         System.out.println("p\t" +  0);
         if(a == p)
         {
        	// System.out.println("a= p");
             break;
         }
         
     }
     
     return i;
 }
 public int calculateSumPrevious(int[] A, int i)
 {
     int sum = 0;
     System.out.println("\t" +  i);
     for(int j =0 ; j<=i; j++)
         sum = sum + A[j];
    // System.out.println("\t" +  i);
     return sum;
    // System.out.println(sum);
 }
  public int calculateSumDifference(int[] A, int i)
 {
     int sum = 0;
     System.out.println("\t" +  i);
     for(int j =i ; j<A.length; j++)
         sum = sum + A[j];
    // System.out.println("\t" +  i);
     return sum;
    // System.out.println(sum);
 }
  public static void main(String args[])
  {
	  Solution s = new Solution();
	  int b[] = {1,2,3,1,2,3};
	  
	  int k = s.Calaulate(b);
	  System.out.println(k);
  }
  // Efficicent way to do that
  public int Calaulate(int[] A)
  {
	  int len = A.length;
	  int initialSum = A[0];
	  int totalSum = 0;
	  for(int i =1; i< A.length; i++)
	  {
		  totalSum = totalSum + A[i];
	  }
	  if(initialSum == totalSum)
		  return 0;
	  for(int j = 1; j< A.length; j++)
	  {
		  initialSum = initialSum + A[j];
		  totalSum = totalSum - A[j];
		  
		  if( initialSum == totalSum)
			  return j;
	  }
	  return -1;
  }
  
}


package Algos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DunamicProgramming {

	public static void main(String args[])
	{
		int B[] = {-2,-4,-30,-7,-1,-3,-45,-8,-5,-7};
		int m = MaxContinuousSum(B);
		int v[] = {3,8,6,1,2};
		int w[] = {5,12,4,19,8};
		int q = M_dp(v,w,60);
		System.out.println(q);
		System.out.println(m);
	
		
	}
	  static int  MaxContinuousSum(int[] A)
	 {
		int maxSum = A[0];
		int currentSum = 0;
		int currentPos = 0;
		for(int i =0; i < A.length; i++)
		{
			currentSum = currentSum + A[i];
			if (currentSum < maxSum)
			{
				currentSum = 0;
			}
			else
				maxSum = currentSum;
		}
		 return maxSum;
	 }
	  int unboundedKnapSack(ArrayList<int[]> A)
	{
		  Collections.sort(A, new Comparator<int[]>() {
			    public int compare(int[] a, int[] b) {
			        return (Integer.valueOf(a[1])).compareTo(Integer.valueOf(b[1]));
			    }
			});
		  return 1;
			
	}
	  static int M_dp(int [] W, int [] V, int M)
	    {
		  int wLen = W.length;
		  int [] K = new int[M+1];
		  K[0] = 0;
		  int best = 0;
		  for (int w=1; w <= M; w++) {
		    
		   for (int i=0; i <wLen; i++) {
		    if (w >= W[i]) {
		     best = Math.max(K[w-W[i]] + V[i], best);
		    }
		   }
		   K[w] = best;
		  }
		   
		  System.out.println("Printing knapsack for different Ws:");
		  for (int i=0; i<=M; i++) {
		   System.out.print(K[i] + " ");
		  }
		  System.out.println();
		   
		  return K[M];
		 }
}

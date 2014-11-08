package Algos;
/*Let a1, . . . , an be a sequence of integers. Give an algorithm to compute
1≤i<j≤n Σai*aj
using O(n) arithmetic operations. Prove your algorithm’s correctness and runtime (in terms
of operations used).*/
public class Array {
	
	public static void main(String args[])
	{
		int mul = 0;
		int a1[] = {1, 2,3,4};
		/*Multiplying an element with all the subsequent elements and adding the number to sum*/
		for(int i =0; i<a1.length; i++)
		{
			for(int j =i+1; j< a1.length; j++)
			{
				mul = mul + a1[i]*a1[j];
			}
		}
		System.out.println("by nested for" + mul);
		/*Finding the sum of all numbers*/
		int sum = 0;
		for(int i =0; i< a1.length; i++)
		{
			sum = sum + a1[i];
		}
		System.out.println("sum" + sum);
		int mu = 0;
		int newsum = 0;
		/*Calculating result using second for loop instead of nested for loop*/
		for(int i =0; i< a1.length; i++)
		{
			newsum = a1[i] + newsum;
			mu = mu + a1[i]*(sum - newsum);
			System.out.println(newsum + "\t" + mu);
		}
		System.out.println("by two sums" + mu);
		
	}
	

}

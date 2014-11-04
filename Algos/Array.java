package Algos;

public class Array {
	
	public static void main(String args[])
	{
		int mul = 0;
		int a1[] = {1, 2,3,4};
		for(int i =0; i<a1.length; i++)
		{
			for(int j =i+1; j< a1.length; j++)
			{
				mul = mul + a1[i]*a1[j];
			}
		}
		System.out.println("by nested for" + mul);
		int sum = 0;
		for(int i =0; i< a1.length; i++)
		{
			sum = sum + a1[i];
		}
		System.out.println("sum" + sum);
		int mu = 0;
		int newsum = 0;
		for(int i =0; i< a1.length; i++)
		{
			newsum = a1[i] + newsum;
			mu = mu + a1[i]*(sum - newsum);
			System.out.println(newsum + "\t" + mu);
		}
		System.out.println("by two sums" + mu);
		
	}
	

}

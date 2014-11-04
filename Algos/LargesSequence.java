package Algos;

import java.util.ArrayList;

public class LargesSequence {
	public static void main(String args[])
	{
		Integer ar[]  = { 1,4,8,3,9,5,10,11};
		Integer br[] = {5,2,8,6,3,6,9};
		LargesSequence ls = new LargesSequence();
		ls.printLargestIncreasingSequence(ar);
		ls.printLargestIncreasingSequence(br);
		
	}
	public void printLargestIncreasingSequence(Integer[] ar)
	{
		ArrayList<Integer> seq = new ArrayList<Integer>();
		//int start = ar[0];
		int max = ar[0];
		for (int i =0 ; i< ar.length; i++)
		{
			if(ar[i] < max)
			{
				seq.set((seq.size() - 1), ar[i]);
			}
			else
			{
				seq.add(ar[i]);
			}
			max = ar[i];
		}
		System.out.println(seq.toString());
		String s1 = "Hi";
		String s2 = "Hi";
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		
	}
	

}

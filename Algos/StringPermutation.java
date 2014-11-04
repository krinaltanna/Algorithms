package Algos;

import java.util.Arrays;

public class StringPermutation {
	public static void main(String args[])
	{
		String s1 = "andbatgofive";
		String s2 = "gobat";
		
		boolean flag = checkIfPermutation(s1,  s2);
		System.out.println(flag);
				
	}

	private static boolean checkIfPermutation(String s1, String s2) {
		/*if(s1.length() != s2.length())
		{
			return false;
		}*/
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		System.out.println(c1 + "\t" + c2);
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(c1.toString() + "\t" + c2.toString());
		if (c1.equals(c2))
			return true;
		return false;
		
		// TODO Auto-generated method stub
		//return false;
	}

}

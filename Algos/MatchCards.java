package Algos;

import java.util.Stack;

public class MatchCards {

	public static void main(String args[])
	{
		int v[] = {9, 13, 11,17 ,13};
		int B= 28;
		boolean value = returnMatch(v,B);
		System.out.println(value);
	
	}

	private static boolean returnMatch(int[] v, int b) {
		// TODO Auto-generated method stub
		int n = v.length;
		System.out.println(n);
		Stack<Integer[]> stack = new Stack<Integer[]>();
		
  // Check if a given element at ith position is a part of sum or not
	for(int i =0; i<n; i++)
	{	
		int index = i +1;
		//Checking if any of the element it self is equal to given value 
		if (v[i] == b)
			return true;
		
		int number = v[i];
		
		Integer d[] = { (Integer) index, (Integer) v[i]};
		stack.push(d);
		while(!stack.isEmpty())
		{
			//Keep adding elements till value of sum is less then required number
		for(; index <n; index ++ )
		{
			System.out.println(number + v[index]);
			if (number + v[index] == b)
				return true;
			if ((number + v[index]) < b)
			{
				number = number + v[index];
				System.out.println("In for");
				System.out.println("index \t" + index + "i\t" + i + "number\t" +number);
				Integer c[] = { (Integer) index, (Integer) v[index]};
				stack.push(c);
			}		
			
		}
		//if none of the remaining elements give sum less than number then remove the last added element
		Integer s[] = stack.pop();
		index = s[0] + 1;
		number = number - s[1];
		System.out.println("index \t" + index + "i\t" + i + "number\t" +number);
		
		}
	}
	return false;

	}
}
	/*	while( !stack.isEmpty())
		{
			number = v[index];
			if (number == b)
				return true;
			
			if(index < n - 1)
			{
				if (number + v[index] == b)
					return true;
				if (number + v[index] < b)
				{
					index++;
					number = number + v[index];
					if (number == b)
						return true;
					
					Integer c[] = {(Integer)index, (Integer)v[index]};
					stack.push(c);
					//System.out.println("index before\t" + index + "n\t" + n + "");
					
					//System.out.println("index after\t" + (index + 1));
					System.out.println("number \t" + number + "condition 1");
			}		
				else
				{				
					
					 Integer s[] = stack.pop();
					 
					number = number - s[1];
					index = s[0] + 1;
					
					
				}
			}
			else
				break;
			
			
			
			
		}
	}
/*	}
		int Memo[][] = new int[n][n];
		/* Initializing the base case 
		for(int i =0; i< n; i++)
		{
			Memo[i][i] = v[i]; 
		}
		/* Applying recurrence 
		for(int i = 0; i< n; i++)
		{
			
			for(int j = i +1; j< n;j++)
			{
				Memo[i][j] = Memo[i][j-1] + v[j];
				//Memo[j][i] = v[j] + v[i];
				if(Memo[i][j] == b || Memo[j][i] == b)
				{
					System.out.println(i + "\t" + j);
					return true;
				}
			}
			
		} */
		//return false;
	
package Algos;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class NextGreator {
	public static void main(String args[])
	{
		Integer[] a = {4, 12, 44, 3, 7,1};
		ArrayList<Integer[]> dic = new ArrayList<Integer[]>();
		ArrayList<Integer[]> dic1 = new ArrayList<Integer[]>();
		for(int i =0; i< a.length; i ++)
			
		{
			for(int j = i +1; j< a.length; j++)
			{
				if (a[j] > a[i])
				{
					Integer[] b = { a[i], a[j]};
					dic.add(b);
					break;
				}
				else
				{
					Integer[] b = { a[i], -1};
					dic.add(b);
					break;
					
				}
			}
		}
		/*for(Integer[] d : dic)
			System.out.println(d[0] + "\t" + d[1]);*/
		
		///Using Stack to decrease complexity
		Deque<Integer> stack = new ArrayDeque<Integer>();
		stack.push(a[0]);
		for(int i =1; i< a.length; i ++)
		{
			
			while(!stack.isEmpty())
			
			{
				int current = stack.peek();
				int val = stack.pop();
				if (a[i]> current)
				{
					
					Integer b[] = {val, a[i]};
					dic1.add(b);
					System.out.println("In when array is greator then stack" + dic1);
					
				}
				stack.push(a[i]);
			
					
				}
			
			}
		while(! stack.isEmpty())
		{
			int val = stack.pop();
			Integer c[]= {val, -1};
			System.out.println(c);
			dic1.add(c);
			System.out.println(dic1);
			
		}
		System.out.println(dic1);
		for(Integer[] d : dic1)
			System.out.println(d[0] + "\t" + d[1]);
			
	}

	
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class MatrixDivision {
	
	public static void main(String args[])
	{
		int m1[][] = { {1,2},{3,4},{5,6},{7,8},{9,10},{11,12}};
		int k = 3;
		int n = 2;
		int d = 0;
		List<int[][]> listOfLists = new ArrayList<int[][]>();
		for(int i =0;  i< k; i++ )
		{
			int[][] m = new int[2][2];
			listOfLists.add(m);
			for( int j = 0; j< n; j++)
			{
				
				
			for(int l = 0; l<n; l++)
				{
					/*System.out.println("i" +  "\t" + i);
					System.out.println("j" +  "\t" + j);
					System.out.println("l" +  "\t" + l);
					System.out.println("d" +  "\t" + d);
					System.out.println(m1[d][l]); */
					m[j][l] = m1[d][l];
					
				}
				d++;
			}
			
		}
		for(int[][] l:listOfLists)
		{
			for(int[] x:l)
			{
				System.out.println(Arrays.toString(x));
			}
		}
		
		int m2[][] = {{1,2,3,4,5,6,},{7,8,9,10,11,12}};
		int e = 0;
		List<int[][]> listOfLists1 = new ArrayList<int[][]>();
		for(int i =0;  i< k; i++ )
		{
			int[][] o = new int[2][2];
			listOfLists1.add(o);
			for( int j = 0; j< n; j++)
			{
				
				
				for(int l = 0; l<n; l++)
				{
					/*System.out.println("i" +  "\t" + i);
					System.out.println("j" +  "\t" + j);
					System.out.println("l" +  "\t" + l);
					System.out.println("d" +  "\t" + d);
					System.out.println(m1[d][l]); */
					o[j][l] = m2[l][e];
					
				}
				e++;
			}
			
		}
		for(int[][] l:listOfLists1)
		{
			for(int[] x:l)
			{
				System.out.print(Arrays.toString(x));
			}
			System.out.println();
		}
	}

}

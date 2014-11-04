import java.util.ArrayList;


public class heapStructure {
	
	public static void main(String args[])
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(12);
		a.add(4);
		a.add(6);
		a.add(1);
		a.add(3);
		a.add(5);
		a.add(2);
		a.add(7);
		//{ 12, 4, 6, 1, 3, 5,2};
		ArrayList<Integer> c = heapStructure.heapify(a);
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(40);
		b.add(32);
		b.add(27);
		b.add(18);
		b.add(1);
		b.add(15);
		b.add(14);
		b.add(34);
		b.add(340);
		ArrayList<Integer> d = heapStructure.heapify(a);
		
		//{ 12, 4, 6, 1, 3, 5,2};
		//ArrayList<Integer> e = heapStructure.siftDown(b, 0, b.size()); 
		System.out.println(d);
	}
	
	public static ArrayList<Integer> heapify(ArrayList<Integer> a)
	{
		ArrayList<Integer> b = new ArrayList<Integer>();
		for (int i = 0; i< a.size(); i++)
		{
			 b = addToHeap(b, a.get(i));
			System.out.println(b.toString());
		}
		return b;
	}

	private static ArrayList<Integer> addToHeap(ArrayList<Integer> a, Integer i) {
		if (a.isEmpty())
		{
			a.add(i);
			System.out.println("Adding first element");
			//System.out.println(a.toString());
			return a;
		
		}
		else
		{
			int l = a.size() - 1;
			//Add Elelment to end of array 
			a.add(i);
			
		// if element less than the leaf just append it to leaf and return array
			if(a.get((int)l) > i)
				return a;
			else
			{
				l = (l -1)/2;
				System.out.println(i);
				System.out.println(l);
				System.out.println(a.get((int)l));
				
				while((l > -1 && a.get((int)l) < i)  )
				{
					System.out.println("L" + l);
					int tmp = a.get((int)l);
					System.out.println("I" + i);
					int k = a.indexOf(i);
					a.set((int)l, i);	
					
					
					a.set(k, tmp);
					System.out.println(a.toString());
					l = (int) Math.floor((l -1)/2.0f);
				}
				return a;
			
			}
			
		}
	
		//return a;	
		
	}
	static void siftDown(int numbers[], int root, int bottom)
	{
	  int done, maxChild, temp;

	  done = 0;
	  while ((root*2 <= bottom) && (done != 0))
	  {
	    if (root*2 == bottom)
	      maxChild = root * 2;
	    else if (numbers[root * 2] > numbers[root * 2 + 1])
	      maxChild = root * 2;
	    else
	      maxChild = root * 2 + 1;

	    if (numbers[root] < numbers[maxChild])
	    {
	      temp = numbers[root];
	      numbers[root] = numbers[maxChild];
	      numbers[maxChild] = temp;
	      root = maxChild;
	    }
	    else
	      done = 1;
	  }
	}

}

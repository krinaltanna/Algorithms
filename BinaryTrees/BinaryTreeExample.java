package BinaryTrees;

public class BinaryTreeExample {

	public static void main(String[] args)
	{
		new BinaryTreeExample().run();
	}

	static class Node 
	{
		Node left;
		Node right;
		int value;
		public Node(int value) 
		{
			this.value = value;
		}
	}

	public void run() {
		Node rootnode = new Node(6);
		System.out.println("Building tree with rootvalue" + rootnode.value);
		System.out.println(" ================================= ");
		//insert(rootnode, 6);
		insert(rootnode, 8);
		insert(rootnode, 2);
		insert(rootnode, 7);
		insert(rootnode, 9);
		insert(rootnode, 4);
		insert(rootnode, 1);
		System.out.println("Traversing tree in order");
		System.out.println("=================================");
		//printBFS(rootnode);
		//printMirrorTree(rootnode);
		printGivenLevel(rootnode, 2);
		//printVerticaleSum(rootnode);
		System.out.println("Traversing after mirror");
		System.out.println("=================================");
		//printBFS(rootnode);

	}

	public void insert(Node node, int value) {
		if (value < node.value) {
			if (node.left != null) 
			{
				insert(node.left, value);
			} else 
			{
				System.out.println("  Inserted " + value + 
						" to left of node " + node.value);
				node.left = new Node(value);
			}
		} else if (value > node.value) 
		{
			if (node.right != null) 
			{
				insert(node.right, value);
			} else
			{
				System.out.println("  Inserted " + value + "to right of node " + node.value);
				node.right = new Node(value);
			}
		}
	}
	public void delete(Node node, Node parent,String direction, int value)

	{
		if(value < node.value)
		{
			System.out.println("Traversing the left subtree with root" + node.value);
			delete(node.left,node,"l",value);

		}
		else if (value > node.value)
		{
			System.out.println("Traversing the right subtree with root" + node.value);
			delete(node.right,node,"r", value);

		}
		else
		{
			/* if it is leaf node */
			System.out.println("Traversing for the node to be deleted" + node.value);
			if(node.left == null && node.right == null)
			{  
				System.out.println("Setting to null" + node.value);
				node = null;
				if(direction.equals("l"))
					parent.left = null;
				if(direction.equals("r"))
					parent.right = null;
				return;
			}
			/* if it is does not have left child */
			if(node.left == null)
			{
				node.value = node.right.value;
				node.right = null;
				return;
			}
			/* if it is does not have right child */
			if(node.right == null)
			{
				node.value = node.right.value;
				node.left = null;
				return;
			}
			/* IF IT HAS TWO CHILDS */
			int newValue = findMin(node.right);
			node.value = newValue;
			delete(node.right,node,"r", newValue);

		}

	}

	public void printMirrorTree (Node root)
	{
		if((root.left == null && root.right == null) || (root == null))
			return;
		if(root.left == null)
		{
			root.left = root.right;
			root.right = null;
			return;
		}
		if(root.right == null)
		{
			root.right = root.left;
			root.left = null;
			return;
		}
		Node temp = root.left;
		root.left = root.right;
		root.right = temp;
		printMirrorTree(root.left);
		printMirrorTree(root.right);


	} 
	public void printBFS (Node root)
	{
		int ht = height(root);
		// System.out.print(ht);
		for(int i =1; i<= ht; i++)
		{
			printGivenLevel(root, i);
		}
	}
	
	public int printVerticaleSum(Node root)
	{
		if (root == null)
			return 0;
		if(root.right == null && root.left ==null)
		{
			int tmp = root.value;
			root.value = 0;
			return tmp;					
		}
		if (root.left == null)
		{
			root.value = printVerticaleSum(root.right);
			return root.value;
		}
		if(root.right == null)
		{
			root.value = printVerticaleSum(root.left);
			return root.value;
		}
		
		else
		{
			int r = printVerticaleSum(root.right) ;

			int l = printVerticaleSum(root.left);
			int o = root.value;
			root.value = r + l + root.value;
			return root.value ;
		}
		
		
	}

	private void printGivenLevel(Node root, int i)
	{
		if(root == null)
			return;
		else
		{
			if(i == 1)
				System.out.print( "-->" +root.value);
			else
			{

				printGivenLevel(root.left, i-1);
				printGivenLevel(root.right, i-1);

			}
			// TODO Auto-generated method stub
		}
	}

	public int height(Node root)
	{
		if(root == null)
			return 0; 
		int hr = height(root.right);
		int hl = height(root.left);
		return (Math.max(hr, hl) + 1);
	}


	private int findMin(Node node) {
		while(node.left != null)
		{
			node = node.left;
		}
		// TODO Auto-generated method stub
		return node.value;
	}

	public void printInOrder(Node node)
	{
		if (node != null) {
			printInOrder(node.left);
			System.out.println("  Traversed " + node.value );
			printInOrder(node.right);
		}
	}
}
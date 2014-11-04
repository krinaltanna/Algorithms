package Algos;


class Node
{
    public int item;
    public Node next;
    public Node(int val)
    {
        item = val;
    }
    public void displayNode()
    {
        System.out.println("[" + item + "] ");
    }
} 
class LinkedList
{
    private Node first;
    public LinkedList()
    {
        first = null;
    }
    public boolean isEmpty()
    {
        return (first==null);
    }
    public void insert(int val)//inserts at beginning of list
    {
        Node newNode = new Node(val);
        newNode.next = first;
        /* This step is important for next operations on Linked List */
        first = newNode;
    }
    public Node delete()//deletes at beginning of list
    {
        Node temp = first;
        first = first.next;
        return temp;
    }
    public void display()
    {
        System.out.println("List items from first to last :");
        Node current = first;
        while(current != null)
        {
            current.displayNode();
            current = current.next; 
        }
        System.out.println("");
    }
    public Node search(int val)
    {
        Node current = first;
        while(current.item != val)
        {
            if(current.next == null)
                return null;
            else
                current = current.next;
        }
        return current;
    }
    public Node delete(int val)
    {
        Node current = first;
        Node previous = null; 
        /* To handle first case */
        if(first.item == val)
        {
        	first = first.next;
        	return current;
        }
        /* To handle intermediate nodes*/
        while(current.next!= null)
        {
        	
        	if (current.item == val)
        	{
        		Node next = current.next;
        		previous.next = next;
        		return current;
        	}
        	previous = current;
        	current = current.next;
        }
        /* To handle if node to be deleted is the last node */
        if(current.next == null && current.item == val)
        {
        	previous.next = null;
        	return current;
        }
        return null;
  /*      while(current.item != val)
        {
            if(current.next == null)
                return null;
            else
            {
                previous = current;
                current = current.next;
            }
        }
        if(current == first)
            first = first.next;
        else
            previous.next = current.next;
        return current; */
    }
 
     
} 
class LinkedListBlog
{
    public static void main(String[] args)
    {
        LinkedList object = new LinkedList();
        object.insert(10);
        object.insert(20);
        object.insert(30);
        object.display();
     
     /*   while( !object.isEmpty() )
        {
            Node member = object.delete();
            System.out.print("Deleted ");
            member.displayNode();
            System.out.println("");
        }
        object.display(); */
     
        object.insert(40);
        object.insert(50);
        object.insert(60);
        object.display();
 
        Node objecttosearch = object.search(50);
 
        if( objecttosearch != null)
            System.out.println("Found Node : " + objecttosearch.item);
        else
            System.out.println("Cannot locate the node");
 
        Node objecttodelete = object.delete(10);
 
        if( objecttodelete != null )
            System.out.println("Deleted node : " + objecttodelete.item);
        else
            System.out.println("Cannot delete the node");
 
 
        object.display();
         
    } 
}

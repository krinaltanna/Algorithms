import java.util.ArrayList;

/*
 * Java class to represent linked list data structure.
 */
 class LinkedList {
    private Node head;
    public LinkedList() { this.head = new Node("head"); }   
    public Node head() { return head;}
   
    public void appendIntoTail(Node node) {
        Node current = head;
       
        //find last element of LinkedList i.e. tail
        while(current.next() != null){
            current = current.next();
        }
        //appending new node to tail in LinkedList
        current.setNext(node);
    }
    /* This function deletes the adjacent duplicates form a list*/
    public void removeDublicates()
    {
    	Node current = head.next;
    	Node previous = null;
    
    	ArrayList<String> visited = new ArrayList<String>();
    	while(current != null)
    	{
    		if(visited.contains(current.data))
    		{
    			previous.next = current.next;
    			current = current.next;
    		}
    		else
    		{
    			visited.add(current.data);
    			previous = current;
        		current = current.next;
    			//System.out.println(visited);
    		}
    		
    	}
    }
    
    public Node mthToLast (int m)
    {
    	Node before = head.next;
    	Node after = head.next;
    	for(int i = 0; i <m; i ++)
    	{
    		before = before.next();
    	}
    	//System.out.println(before);
    	while(before.next() != null)
    	{
    		before = before.next();
    		after = after.next();
    		System.out.println(after);
    		System.out.println(before);
    		
    	}
    	//System.out.println(before);
    	return after;
    	
    }
    public void reverse()
    {
    	Node previous = null;
    	Node current = head.next();
    	while(current != null)
    	{
    		Node tmp = current.next();
    		current.next = previous;
    		previous = current;
    		current = tmp;
    		System.out.println(previous.data);
    	}
    	head.next = previous;
    }
   
    /*
     * If singly LinkedList contains Cycle then following would be true
     * 1) slow and fast will point to same node i.e. they meet
     * On the other hand if fast will point to null or next node of
     * fast will point to null then LinkedList does not contains cycle.
     */
    public boolean isCyclic(){
        Node fast = head;
        Node slow = head;
       
        while(fast!= null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
           
            //if fast and slow pointers are meeting then LinkedList is cyclic
            if(fast == slow ){
                return true;
            }
        }
        return false;
    }
   
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Node current = head.next();
        while(current != null){
           sb.append(current).append("-->");
           current = current.next();
        }
        sb.delete(sb.length() - 3, sb.length()); // to remove --> from last node
       return sb.toString();
    }

    public static class Node {
        private Node next;
        private String data;

        public Node(String data) {
            this.data = data;
        }

        public String data() { return data; }
        public void setData(String data) { this.data = data;}

        public Node next() { return next; }
        public void setNext(Node next) { this.next = next; }

        @Override
        public String toString() {
            return this.data;
        }
    }
}
 

/**
 *
 * Java program to find if LinkedList contains loop or cycle or not.
 * This example uses two pointer approach to detect cycle in linked list.
 * Fast pointer moves two node at a time while slow pointer moves one node.
 * If linked list contains any cycle or loop then both pointer will meet some time.
 *

 */
public class LinkedListTest {

    public static void main(String args[]) {

        //creating LinkedList with 5 elements including head
    	LinkedList linkedList = new LinkedList(); 
    	linkedList.appendIntoTail(new LinkedList.Node("101"));
    	LinkedList.Node cycle = new LinkedList.Node("201");
    	linkedList.appendIntoTail(cycle);
    	linkedList.appendIntoTail(new LinkedList.Node("301")); 
    	linkedList.appendIntoTail(new LinkedList.Node("401")); 
    	linkedList.appendIntoTail(cycle); 
    	if(linkedList.isCyclic())
    	{
    		System.out.println("Linked List is cyclic as it contains cycles or loop"); 
    	}
    	else
    	{
    		System.out.println("LinkedList is not cyclic, no loop or cycle found");
    	} 
    	LinkedList linkedList1 = new LinkedList();
    	linkedList1.appendIntoTail(new LinkedList.Node("10"));
    	//linkedList1.appendIntoTail(new LinkedList.Node("10")); 
    	linkedList1.appendIntoTail(new LinkedList.Node("20")); 
    	linkedList1.appendIntoTail(new LinkedList.Node("10"));
    	linkedList1.appendIntoTail(new LinkedList.Node("20"));
    	linkedList1.appendIntoTail(new LinkedList.Node("40")); 
    	linkedList1.appendIntoTail(new LinkedList.Node("10")); 
    	linkedList1.appendIntoTail(new LinkedList.Node("50")); 
    	linkedList1.appendIntoTail(new LinkedList.Node("10")); 
    	String l = linkedList1.toString();
    	System.out.println(l);
    	LinkedList.Node r =linkedList1.mthToLast(4) ;
    	//System.out.println(r.data());
    	//System.out.println(r.next().toString());
    	linkedList1.removeDublicates();
    	
    	//System.out.println("removeDuplicates executed");
    	//String ll = linkedList1.toString();
    	//System.out.println(ll);
    	LinkedList linkedList2 = new LinkedList();
    	linkedList2.appendIntoTail(new LinkedList.Node("1")); 
    	linkedList2.appendIntoTail(new LinkedList.Node("2")); 
    	linkedList2.appendIntoTail(new LinkedList.Node("3")); 
    	linkedList2.appendIntoTail(new LinkedList.Node("4"));
    	linkedList2.reverse();
    	System.out.println(linkedList2.toString());

    	
    	
    } 
   
}



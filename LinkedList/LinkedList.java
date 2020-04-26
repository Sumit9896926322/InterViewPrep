package LinkedList;

import java.util.*;

class LinkedList {
	static Node head;
	static int size;
	static int length = 0;

    static class Node{
    	int data;
    	Node next;
    	

    	Node(int d){
    		data = d;
    		next = null;
    		size++;
    	}
    }
    
    public static void print() {
    	 Node n = head;
  	     while(n != null) {
  		   System.out.print(n.data+" ");
  		   n = n.next;
  	   }	
  	 System.out.println();   
    }
    
	public static Node remove(Node root) {
		// Remove Duplicates in sorted ll
		Node head = root;

		Node prev = root;

		s: while (prev != null) {
			Node temp = prev.next;
			if (temp == null) {
				prev.next = null;
				break;
			}
			while (prev.data == temp.data && temp != null) {
				if (temp.next == null) {
					prev.next = null;
					break s;
				}
				temp = temp.next;
			}
			System.out.println(prev.data + " " + temp.data);
			prev.next = temp;
			prev = temp;
		}
		print();
		return head;
	}

	public static void insert(int data, int pos) {
    	System.out.println();
    	System.out.println("Inserting " +data +" at " +pos+ ".");
    	Node m = new Node(data);
    	if(pos == 1) {
    		m.next = head;
    		head = m;
    		
    	}else if(pos == size+1){
    		if(size == 0) {
    			head.next = m;
    		}
    		
    		 Node n = head;
     	     while(n != null) {
     		   n = n.next;
     	   }	
     	     n.next = m;
     	     m.next = null;
    	}else {
    		Node n = head;
    		for(int i = 1;i<pos-1;i++)
    			n = n.next;
    		
    		m.next = n.next;
    		n.next = m;
    	}
    	
    }

    public static int length(Node head) {
    	if(head == null) {
    		return length;
    	}
    	else
    		return length=1+length(head.next);
 
    }
    
    public static void delete(int item) {
    	Node temp = head;
    	Node prev = null;
    	if(temp.data == item) {
    		head = temp.next;
    		return;
    	}
    	while(temp != null && temp.data != item) {
    		  prev = temp;
    		  temp = temp.next;
    	}
    	if(temp == null) 
    		System.out.println("No Element Found");
    	else
    		System.out.println("\nAfter deleting "+item);
    	prev.next = temp.next;
    }

	public static Node swap(Node head) {

		// add your code here

		if (head.next == null)
			return head;
		Node temp = head;
		while (temp != null) {
			int currentdata = temp.data;
			if (temp.next != null) {
				temp.data = temp.next.data;
				temp.next.data = currentdata;

				temp = temp.next.next;
			} else
				temp = temp.next;

		}
		print();
		return head;
	}

	public static void insertSorted(Node root, int elem) {
		Node temp = root;
		Node prev = null;
		Node insertElem = new Node(elem);
		while (temp != null) {

			if (temp.data > elem) {

				if (prev == null) {
					// if elem is to be inserted at head
					head = insertElem;
					insertElem.next = temp;
					break;
				}

				// if elem is to be inserted between elements
				prev.next = insertElem;
				insertElem.next = temp;
				break;

			}
			// if elem is to be inserted at the last position
			if (temp.next == null) {
				temp.next = insertElem;
				break;
			}

			prev = temp;
			temp = temp.next;
		}
		print();
	}

	public static int detectLoop(Node head) {
		int loop = 0;
		Node slow = head;
		Node fast = head.next;

		if (fast == null)
			return loop;

		while (slow != null && fast.next != null) {
			System.out.println(slow.data + "s" + fast.data);
			if (slow == fast) {
				loop = 1;
				return loop;
			}

			slow = slow.next;
			fast = fast.next.next;
		}
		return loop;
	}

	public static void insertAfter(int data) {
		Node newNode = new Node(data);
		if (head == null)
			head = newNode;
		else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}

	}

	public static void reverse(Node head) {

		Node prev = null;
		Node curr = head;
		Node newNode = null;

		while (curr != null) {

			newNode = curr.next;

			curr.next = prev;

			prev = curr;
			curr = newNode;

		}
		head = prev;
		print();
	}

	public static void recurRev1() {
		// Recur to the last and then reverse the node one by one
	}

	public static void recurRev2(Node prev, Node curr) {
		// Similar to iterative soln
		if (curr == null) {
			head = prev;
			return;
		}
		Node next = curr.next;
		curr.next = prev;
		recurRev2(curr, next);

	}

	public static int countNodesinLoop(Node head) {
		Node slow = head;
		Node fast = head.next;
		int ans = 0;

		while (slow != null && fast.next != null) {

			if (slow == fast) {
				System.out.println(slow + " " + fast);
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return ans;
	}

	public static void rotate(Node head, int k) {

		Node temp = head;
		Node breakNode = head;
		int count = 0;
		while (temp != null) {
			count += 1;

			if (temp.next == null && breakNode != head)
				temp.next = head;


			if (temp.next == breakNode) {
				temp.next = null;
				break;
			}

			if (count == k) {
				breakNode = temp;
				System.out.println(breakNode.data);
			}

			temp = temp.next;
		}
		head = breakNode;
		print();
	}

	public static void removeLoop(Node head) {
		Node slow = head;
		Node fast = head;

		while (slow != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				slow = head;
				fast = fast.next;
				while (slow != fast) {
					slow = slow.next;
					fast = fast.next;

					if (slow == fast)
						System.out.println(slow.data);
				}
			}
		}
	}

	public static void makeLoop(Node head, int num) {
		Node connector = null;
		Node temp = head;
		int count = 0;
		while (temp.next != null) {
			if (++count == num)
				connector = temp;

			temp = temp.next;
		}
		if (connector != null)
			temp.next = connector;
	}

	public static int middle(Node head) {
		Node slow = head;
		Node fast = head.next;
		if (fast == null)
			return slow.data;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		// Handling cases for even length ll
		if (fast != null)
			return slow.next.data;

		return slow.data;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			
			//making linkedlist empty
			head = null;

		    int n = s.nextInt();

			for (int i = 0; i < n; i++)
				insertAfter(s.nextInt());
            
			//For reversing in groups
			int k = s.nextInt();
			makeLoop(head, k);
			removeLoop();
			print();


		}
	}

}

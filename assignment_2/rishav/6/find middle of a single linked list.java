package rishav; 
class prog5
{  
static class Node 
{ 
	int data; 
	Node next; 
}; 
static Node newLNode(int data) 
{ 
	Node temp = new Node(); 
	temp.data = data; 
	temp.next = null; 
	return temp; 
} 

static int n; 
static Node mid; 

static void midpoint_util(Node head ) 
{ 
	if (head == null) 
	{ 
		n = (n) / 2; 
		return; 
	} 

	n = n + 1; 

	midpoint_util(head.next); 
	n = n - 1; 
	if (n == 0) 
	{
		mid = head; 
	} 
} 

static Node midpoint(Node head) 
{ 
	mid = null; 
	n = 1; 
	midpoint_util(head); 
	return mid; 
} 
public static void main(String args[]) 
{ 
	Node head = newLNode(1); 
	head.next = newLNode(2); 
	head.next.next = newLNode(3); 
	head.next.next.next = newLNode(4); 
	head.next.next.next.next = newLNode(5); 
	head.next.next.next.next.next = newLNode(6); 
	Node result = midpoint(head); 
	System.out.print( result.data ); 
} 
} 

package Linked_List;

import Linked_List.insertion.Node;

public class palindrome {
	Node head;
	public class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	public void add_first(int data) {
		
		Node n=new Node(data);
		n.next=head;
		head=n;
	}
	public void add_last(int data) {
		Node newnode=new Node(data);
		Node currnode=head;
		while(currnode.next!=null) {
			currnode=currnode.next;
		}
		currnode.next=newnode;
		newnode.next=null;
		
	}
	public void reverse_iterate() {
		Node prev=head;
		Node curr=head.next;
		while(curr!=null) {
		Node next=curr.next;
		curr.next=prev;
		
		prev=curr;
		curr=next;
		}
		head.next=null;
		head=prev;
	}
	
	public void ispalindrome() {
		reverse_iterate();
		
	}
	
	public void printlist() {
		Node currnode=head;
		while(currnode!=null) {
			System.out.print(currnode.data+" -> ");
			currnode=currnode.next;
		}
		System.out.print("null");
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	insertion list=new insertion();
	list.add_first(2);
	list.add_first(3);
	list.add_last(1);
	list.add_last(0);
	list.add_first(4);
	list.printlist();
	
		}

}

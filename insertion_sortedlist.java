package Linked_List;

import Linked_List.insert_mid.Node;

public class insertion_sortedlist {
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
	
	public void sorted() {
		Node temp=head;
		while(temp.next!=null) {
			Node temp1=temp.next;
			while(temp1!=null) {
			if(temp.data>temp1.data) {
				int t=temp.data;
				temp.data=temp1.data;
				temp1.data=t;
			}
			temp1=temp1.next;
		}
			temp=temp.next;
		}
		
		
	}
//	public void insert_sortlist(int n) {
//		Node node=new Node(n);
//		Node temp=head;
//		Node temp1=head.next;
//		while(temp!=null) {
//			if(temp1.data<n) {
//				
//			}
//			temp=temp.next;
//		}
//	}
	
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
	insertion_sortedlist list=new insertion_sortedlist();
	list.add_first(2);
	list.add_first(3);
	list.add_last(1);
	list.add_last(0);
	list.add_first(4);
	
	list.printlist();
list.sorted();
//insert_sortlist(5);
System.out.println();
list.printlist();
		}

}

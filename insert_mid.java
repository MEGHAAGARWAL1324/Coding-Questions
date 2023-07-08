package Linked_List;

import Linked_List.insertion.Node;

public class insert_mid {
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
	
	public void insert_mid(int n,int p) {
		Node newnode=new Node(n);
		int count=1;
		Node curr=head;
		while(count!=p-1) {
			curr=curr.next;
			count++;
		}
		newnode.next=curr.next;
		curr.next=newnode;
		
	}
	public void delete_mid(int p) {
		
		int count=1;
		Node curr=head;
		while(count!=p-1) {
			curr=curr.next;
			count++;
		}
		curr.next=curr.next.next;
		
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
	insert_mid list=new insert_mid();
	list.add_first(2);
	list.add_first(3);
	list.add_last(1);
	list.add_last(0);
	list.add_first(4);
	list.printlist();
list.insert_mid(8,3);
	System.out.println();
	list.printlist();
	list.delete_mid(4);
	System.out.println();
	list.printlist();
		}

}

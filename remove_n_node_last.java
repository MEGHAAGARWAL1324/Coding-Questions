package Linked_List;

import Linked_List.insertion.Node;

public class remove_n_node_last {
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
	public void delete_first() {
		head=head.next;
	}
	public void delete_last() {
		Node currnode=head;
		while(currnode.next.next!=null) {
			currnode=currnode.next;
		}
		currnode.next=null;
	}
	
	public Node remove_node(int n) {
		int size=0;
		Node temp=head;
		while(temp!=null) {
			size++;
		}
		
		int prev=size-n;
		int curr=1;
		Node t=head;
		while(curr!=prev) {
			t=t.next;
			curr++;
		}
		t.next=t.next.next;
		return head;
		
		
		
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
	remove_n_node_last list=new remove_n_node_last();
	list.add_first(2);
	list.add_first(3);
	list.add_last(1);
	list.add_last(0);
	list.add_first(4);
	list.printlist();
	list.remove_node(2);
	list.printlist();
		}
}

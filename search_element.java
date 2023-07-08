package Linked_List;

public class search_element {
	
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
	
	public void search(int n) {
		Node temp=head;
		int p=1;
		while(temp.data!=n) {
			temp=temp.next;
			p++;
		}
		System.out.println("Element at Position "+p);
		
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
	search_element list=new search_element();
	list.add_first(2);
	list.add_first(3);
	list.add_last(1);
	list.add_last(0);
	list.add_first(4);
	
	list.printlist();
	System.out.println();
	list.search(1);
		}


}

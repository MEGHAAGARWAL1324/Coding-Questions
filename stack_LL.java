package stack;
import java.util.*;

public class stack_LL {
	static Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	public static boolean isEmpty() {
		if(head==null) {
			return true;
		}
		else
		return false;
	}
	public static void push(int data) {
		Node n=new Node(data);
		if(isEmpty()) {
		head=n;
		}
		else {
			n.next=head;
			head=n;
		}
	}
	
	public static int pop() {
		
		if(isEmpty()) {
		return -1;
		}
		int top=head.data;
			head=head.next;
			return top;
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
	stack_LL list=new stack_LL();
	list.push(2);
	list.push(3);
	list.printlist();
	int p=list.pop();
	System.out.println("\nPopped Element: "+p);
	list.printlist();
	
		}

}

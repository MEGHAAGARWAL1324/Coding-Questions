package queue;

import java.util.*;

public class queue_ll {
	static Node head;
	Node front=null;
	Node rear=null;
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
public void enqueue(int data) {
	Node old=rear;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue_ll q=new queue_ll();
		q.enqueue(4);
		q.enqueue(6);
		q.enqueue(8);

	}

}

package stack;
import java.util.*;
class stack{
	static int size=6;
	static int arr[]=new int[size];
	static int top;
	public static boolean isFull() {
		if(top==size-1) {
			return true;
		}
		return false;
	}
	
public static boolean isEmpty() {
	if(top==-1) {
		return true;
	}
	return false;
		
	}
	public static void push(int data) {
		if(isFull()) {
			System.out.print("Stack OverFlow");
		}
		else {
			top++;
			arr[top]=data;
		}
	}
	
	public static void pop() {
		if(isEmpty()) {
			System.out.print("Stack UnderFlow");
		}
		else {
			top--;
		}
	}
	
	public static int peek() {
		int el=arr[top];
		return el;
	}
	
	public static void display() {
		for(int i=top;i>=0;i--) {
			System.out.print(arr[top]+" ");
		}
	}
	
	
	
	
}
public class stack_array {
	
	
public static void main(String[]args) {
	stack s=new stack();
	s.push(5);
	s.push(6);
	s.push(7);
	s.push(8);
	s.display();
	while(!s.isEmpty()) {
		System.out.print(s.peek()+" ");
		s.pop();
	}
	
	
	
}
}

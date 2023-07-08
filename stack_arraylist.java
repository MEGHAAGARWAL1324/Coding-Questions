package stack;
import java.util.*;
public class stack_arraylist {
 
		static ArrayList<Integer> list=new ArrayList<>();
		public static boolean isEmpty() {
			return list.size()==0;
		}
		public static void push(int data) {
			list.add(data);
			
		}
		public static int pop() {
			if(isEmpty()) {
				return -1;
			}
			int top=list.get(list.size()-1);
			list.remove(top);
			return top;
		}
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return list.get(list.size()-1);
		}
		
	
public static void main(String args[]) {
	stack_arraylist s=new stack_arraylist();
	s.push(5);
	s.push(6);
	s.push(2);
	s.push(3);
	while(!s.isEmpty()) {
		System.out.println(peek());
		s.pop();
	}
	
	
	
}
}

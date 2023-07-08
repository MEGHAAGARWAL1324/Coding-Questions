package Linked_List;

import java.util.*;

public class collection_framework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list=new LinkedList<>();
		list.addFirst(6);
		list.addFirst(5);
		
		list.addLast(7);
		list.addLast(8);
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" -> ");
		}
		System.out.println("null");
		
		list.removeFirst();
		list.removeLast();
		
		
		System.out.print(list);

	}

}

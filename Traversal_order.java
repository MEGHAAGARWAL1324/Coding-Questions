package Binary_Tree;

import java.util.*;

public class Traversal_order {

	static int idx=-1;
	static class node{
		int data;
		node left,right;
		
		node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
public static node tree(int nodes[]) {
	idx++;
	
	if(nodes[idx]==-1) {
		return null;
	}
	node newnode=new node(nodes[idx]);
	newnode.left=tree(nodes);
	newnode.right=tree(nodes);
	
	
	return newnode;
	}
public static void preorder(node root) {
	if(root==null) {
		return;
	}
	System.out.print(root.data);
	preorder(root.left);
	preorder(root.right);
}
public static void inorder(node root) {
	if(root==null) {
		return;
	}
	
	inorder(root.left);
	System.out.print(root.data);
	inorder(root.right);
}
public static void postorder(node root) {
	if(root==null) {
		return;
	}
	
	postorder(root.left);
	postorder(root.right);
	System.out.print(root.data);
}
public static void levelorder(node root) {
	Queue<node> q=new LinkedList<>();
	q.add(root);
	q.add(null);
	while(!q.isEmpty()) {
		node currnode=q.remove();
		if(currnode==null) {
			System.out.println();
			if(q.isEmpty()) {
				break;
			}
			else
			q.add(null);
		}
		else {
			System.out.print(currnode.data);
			if(currnode.left!=null) {
			q.add(currnode.left);
			}
			if(currnode.right!=null) {
				
			q.add(currnode.right);
			}
		}
		
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		node root=tree(nodes);
		System.out.println(root.data);
		System.out.println();
		preorder(root);
		System.out.println();
		inorder(root);
		System.out.println();
		postorder(root);
		System.out.println();
		levelorder(root);
		

	}

}

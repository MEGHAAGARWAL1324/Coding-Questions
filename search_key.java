package Binary_search_tree;

import Binary_search_tree.build_bst.node;

public class search_key {
	static class node{
		int data;
		node left,right;
		
		node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
public static node bst(node root,int value) {
	if(root==null) {
		root=new node(value);
		return root;
	}
	if(root.data>value) {
		root.left=bst(root.left,value);
	}
	else{
		root.right=bst(root.right,value);
	}
	return root;
	
	
}
public static boolean search(node root,int key) {
	if(root==null) {
		return false;
	}
	if(root.data==key) {
		return true;	
	}
	
	
	if(root.data>key) {
		return search(root.left,key);
	}
	else {
		return search(root.right,key);
	}
}
public static void inorder(node root) {
	if(root==null) {
		return ;
	}
	inorder(root.left);
	System.out.print(root.data);
	inorder(root.right);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int values[]= {5,1,3,4,2,7};
node root=null;
for(int i=0;i<values.length;i++) {
root=bst(root,values[i]);
}
inorder(root);
if(search(root,8)) {
	System.out.print("\nFound");
}
else {
	System.out.print("\nNot Found");
}
	}
}

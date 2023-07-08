package Binary_Tree;

import Binary_Tree.sum_nodes.node;

public class height_tree {
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
	public static int h_node(node root) {
		if(root==null) {
			return 0;
		}
		int l=h_node(root.left);
		int r=h_node(root.right);
		int h=Math.max(l, r);
		return h+1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		node root=tree(nodes);
		int height=h_node(root);
		System.out.print(height);
	}

}

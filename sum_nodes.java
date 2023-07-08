package Binary_Tree;

import Binary_Tree.count_node.node;

public class sum_nodes {
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
	public static int s_node(node root) {
		if(root==null) {
			return 0;
		}
		int l=s_node(root.left);
		int r=s_node(root.right);
		return l+r+root.data;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		node root=tree(nodes);
		int sum=s_node(root);
		System.out.print(sum);
	}

}

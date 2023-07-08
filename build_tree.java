package Binary_Tree;

public class build_tree {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		node root=tree(nodes);
		System.out.println(root.data);

	}

}

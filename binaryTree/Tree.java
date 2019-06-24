package binaryTree;

public class Tree {
	
	 Node root;
	private Node parent;
	private Node current;
	
	public void insert(int data,  Node root) {
		current=root;
		
		if(this.root==null) {
			Node n = new Node(data);
			this.root=n;
		}else if(current==null) {
			Node n = new Node(data);
			if(data<parent.data) {
				parent.left=n;
			}else {
				parent.right=n;
			}
		}else {
			if(data<current.data) {
				parent=current;
				 insert(data, current.left);
			}else {
				parent=current;
				 insert(data, current.right);
			}
		}
		
	}
	
	public void deleteNode(int data) {
		current=root;
		Node currlef;
		Node currright;
		parent=root;
		if(data==root.data) {
			current=root.right;
			
			while(current!=null) {
				
				parent=current;
				current=current.left;
			}
			Node x=root.left;
			root=parent;
			root.right=parent.right;
			root.left=x;
			
		}else {
		
		while(current.data!=data) {
			if(data<current.data) {
				parent=current;
				current=current.left;
			}else {
				parent=current;
				current=current.right;
			}
		}
		if(current.left!=null) {
			currlef=current.left;
			
			if(current.right!=null) {
				currright=current.right;
				currright.left=currlef;
				parent.right=currright;
			
		}else {
			parent.left=current.left;
		}
		}else if(current.right!=null){
			parent.right=current.right;
		}else {
			System.out.println("dddd");
			parent.right=null;
			parent.left=null;
		}
		
	}
		
	}
	
	public void traversal(Node root) {
		
		if(root==null) {
			return;
		}else {
			
			System.out.println(root.data);
			traversal(root.left);
			//System.out.println(root.data);
			traversal(root.right);
		}
	}

}

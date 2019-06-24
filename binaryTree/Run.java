package binaryTree;

public class Run {

	public static void main(String[] args) {
		
		Tree t =new Tree();
		t.insert(5, t.root);
		t.insert(10, t.root);
		t.insert(4, t.root);
		t.insert(3, t.root);
		t.insert(14, t.root);
		t.insert(15, t.root);
		t.insert(16, t.root);
		System.out.println("done");
		
		t.deleteNode(5);
		t.traversal(t.root);

	}

}

package binarySearchTree;

public class BST {
	private Node root;
	
	public void insert(int key, String value) {
		Node newNode = new Node(key, value);
		
		if(root == null)
			root = newNode;
		else {
			Node current = root;
			Node parent;
			
			while(true) {
				parent = current;				
				if(newNode.key < current.key) {
					current = current.leftChild;				
					if(current == null) {
						parent.leftChild = newNode;
						return;
					}
				}
				else {
					current = current.rightChild;
					if(current == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
	
	public String displayTree(int key) {
		if(root == null)
			return "No node in this tree!";
		
		Node current = root;
		
		while(true) {
			if(key == current.key)
				return "Key fount in tree!";
			
			if(key > current.key) {
				if(current.rightChild == null)
					break;
				else
					current = current.rightChild;
			}
			else if(key < current.key) {
				if(current.leftChild == null)
					break;
				else
					current = current.leftChild;
			}
		}
		return "Key NOT found in tree!";		
	}
	
	public Node findMin() {
		Node current = root;
		Node last = null;
		
		while(current != null) {
			last = current;
			current = current.leftChild;
		}
		return last;
	}
	
	public Node findMax() {
		Node current = root;
		Node last = null;
		
		while(current != null) {
			last = current;
			current = current.rightChild;
		}
		return last;
	}
}
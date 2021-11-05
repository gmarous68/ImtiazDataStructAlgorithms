package binarySearchTree;

public class App {

	public static void main(String[] args) {
		BST tree = new BST();

		tree.insert(10, "Ten");
		tree.insert(20, "Twenty");
		tree.insert(15, "Fifteen");
		tree.insert(8, "bla");
		tree.insert(9, "blw");
		tree.insert(50, "blw");
		tree.insert(30, "is");
		tree.insert(2, "os");
		
		System.out.println(tree.findMin().key);
		System.out.println(tree.findMax().key);
		System.out.println(tree.displayTree(51));

	}
}

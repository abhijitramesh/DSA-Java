
public class Driver {
	
	
	public static void main(String args[])throws Exception {
		
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80); 
		
		tree.inorder();
		System.out.println();
		tree.preorder();
		System.out.println();
		tree.postorder();
		System.out.println();

		try {
		System.out.println(tree.search(tree.root, 22).key);
		}
		catch(NullPointerException e) {
			System.out.println("The Key is not in the BST");
		}
		
		System.out.println(tree.findMax(tree.root));
		
		System.out.println(tree.findMin(tree.root));
		
		System.out.println();
		tree.deleteKey(20);
		
		tree.inorder();

	}

}

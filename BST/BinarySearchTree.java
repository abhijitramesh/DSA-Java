
public class BinarySearchTree {
	Node root;
	
	BinarySearchTree(){
		root = null;
	}
	
	void insert(int key) {
		root = insertRec(root,key);
	}
	
	Node insertRec(Node root,int key) {
		if(root == null) {
			root = new Node(key);
			return root;
		}
		if(key <root.key) {
			root.left = insertRec(root.left,key);
		}
		else
			if(key>root.key){
				root.right = insertRec(root.right,key);
			}
		return root;
	}
	void inorder() {
		inorderRec(root);
	}
	void inorderRec(Node root) {
		if( root!=null) {
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}
	
	}
	void preorder() {
		preorderRec(root);
	}
	void preorderRec(Node root) {
		if(root != null) {
		System.out.println(root.key);
		preorderRec(root.left);
		preorderRec(root.right);
		}
	}
	
	void postorder() {
		postorderRec(root);
	}
	void postorderRec(Node root) {
		if(root != null) {
			preorderRec(root.left);
			preorderRec(root.right);
			System.out.println(root.key);
		}
	}
	public Node search(Node root,int key) {
			if(root == null || root.key == key) {return root;}
			else if(root.key>key) {return search(root.left,key);}
			return search(root.right,key);
	}
	
	public int findMax(Node root) {
		if(root == null)
			return -1;
		else {
			while(root.right != null)
				root = root.right;
		}
		return root.key;
	}
	public int findMin(Node root) {
		if(root == null)
			return -1;
		else {
			while(root.left != null)
				root = root.left;
		}
		return root.key;
	}
	 void deleteKey(int key) { 
	        root = deleteRec(root, key); 
	    } 
	  
	    Node deleteRec(Node root, int key) { 
	        if (root == null)  return root; 
	        if (key < root.key) 
	            root.left = deleteRec(root.left, key); 
	        else if (key > root.key) 
	            root.right = deleteRec(root.right, key); 
	  

	        else{ 
	            if (root.left == null) 
	                return root.right; 
	            else if (root.right == null) 
	                return root.left; 
	  

	            root.key = findMin(root.right); 
		        root.right = deleteRec(root.right, root.key); 
	        } 
	  
	        return root; 
	    } 
}

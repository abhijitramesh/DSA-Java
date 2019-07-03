
public class Node {
	int data;
	Node prev;
	Node next;

	
	Node(int data){
		this.data = data;
		prev = next = null;
	}
	Node(){
		this.data = 0;
		next = prev = null;
	}
	
}

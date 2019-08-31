
public class NodeDoublyLinkedList {
	int data;
	NodeDoublyLinkedList prev;
	NodeDoublyLinkedList next;

	
	NodeDoublyLinkedList(int data){
		this.data = data;
		prev = next = null;
	}
	NodeDoublyLinkedList(){
		this.data = 0;
		next = prev = null;
	}
	
}

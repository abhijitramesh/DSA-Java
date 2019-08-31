
public class DriverDoublyLinkedList {
	
	public static void main(String[] args) {
		DoublyLinkedList dl = new DoublyLinkedList();
		dl.Insert_at_head(1);
		dl.Insert_at_head(2);
		dl.Insert_at_tail(5);
		dl.Insert_at_position(1, 3);
		dl.Delete(1);
		dl.Traversal();
	}

}

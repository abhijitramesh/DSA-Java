
public class Driver {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		ll.InsertAtHead(2);
		ll.InsertAtHead(3);
		ll.InsertAtHead(4);
		ll.InsertAtEnd(5);
		ll.InsertAtEnd(5);
		ll.InsertAtPosition(7, 2);
		ll.Search(5);
		ll.Count();
		ll.EvenPrint();
		ll.Traversel();
		ll.Middle();
	}

}

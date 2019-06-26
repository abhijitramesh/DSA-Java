
public class LinkedList {
public Node head = null;

public void InsertAtHead(int data) {
	Node newnode = new Node(data);
	newnode.next = head;
	head = newnode;

}
public void Traversel() {
	Node temp = head;
	while(temp != null) {
		System.out.print(temp.data+"->");
		temp = temp.next;
	}
	System.out.println();
	
}
public void InsertAtEnd(int data) {
	Node newnode = new Node(data);
	Node temp = head;
	while(temp.next != null) {
		temp = temp.next;
	}
	temp.next = newnode;
}
public void InsertAtPosition(int data,int count) {
	Node newnode = new Node(data);
	Node temp = head;
	for(int i=0;i<count-1;i++) {
		temp = temp.next;
	}
	newnode.next = temp.next;
	temp.next = newnode;
}
public void Search(int data) {
	Node temp = head;
	int count =1;
	while(temp.data != data) {
		temp = temp.next;
		count++;
	}
	System.out.println(count);
}
public void Count() {
	Node temp = head;
	int count =0;
	while(temp.next !=null) {
		temp = temp.next;
		count++;
	}
	System.out.println(count);
}
public void EvenPrint() {
	Node temp = head;
	while(temp.next != null) {
		if(temp.data %2 == 0) {
			System.out.print(temp.data+"->");
		}
		temp = temp.next;
	}
	System.out.println();
}
public void Middle() {
	Node temp = head;
	int count =0;
	while(temp.next != null) {
		temp = temp.next;
		count++;
	}
	if(count %2 ==0) {
		Node temp1 = head;
		for(int i=0;i<count/2;i++) {
			temp1 = temp1.next;
		}
		System.out.print(temp1.data+" ");
		temp1 = temp1.next;
		System.out.print(temp1.data);
	}
	else {
		Node temp2 = head;
		for(int i = 0; i< count/2;i++) {
			temp2 = temp2.next;
		}
		System.out.println(temp2.data);
	}
}
public void SortedInsertion(int data) {
	Node temp = head;
	Node newnode = new Node(data);
	try{while(!(temp.data<data&&temp.next.data>data)) {
	
		temp = temp.next;
	}
	newnode.next = temp.next;
	temp.next = newnode;
	}
	catch(NullPointerException e) {
		newnode.next = temp.next;
		temp.next = newnode;
	}
}
}



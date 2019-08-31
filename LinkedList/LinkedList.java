
public class LinkedList {
public NodeLinkedList head = null;

public void InsertAtHead(int data) {
	NodeLinkedList newnode = new NodeLinkedList(data);
	newnode.next = head;
	head = newnode;

}
public void Traversel() {
	NodeLinkedList temp = head;
	while(temp != null) {
		System.out.print(temp.data+"->");
		temp = temp.next;
	}
	System.out.println();
	
}
public void InsertAtEnd(int data) {
	NodeLinkedList newnode = new NodeLinkedList(data);
	NodeLinkedList temp = head;
	while(temp.next != null) {
		temp = temp.next;
	}
	temp.next = newnode;
}
public void InsertAtPosition(int data,int count) {
	NodeLinkedList newnode = new NodeLinkedList(data);
	NodeLinkedList temp = head;
	for(int i=0;i<count-1;i++) {
		temp = temp.next;
	}
	newnode.next = temp.next;
	temp.next = newnode;
}
public void Search(int data) {
	NodeLinkedList temp = head;
	int count =1;
	while(temp.data != data) {
		temp = temp.next;
		count++;
	}
	System.out.println(count);
}
public void Count() {
	NodeLinkedList temp = head;
	int count =0;
	while(temp.next !=null) {
		temp = temp.next;
		count++;
	}
	System.out.println(count);
}
public void EvenPrint() {
	NodeLinkedList temp = head;
	while(temp.next != null) {
		if(temp.data %2 == 0) {
			System.out.print(temp.data+"->");
		}
		temp = temp.next;
	}
	System.out.println();
}
public void Middle() {
	NodeLinkedList temp = head;
	int count =0;
	while(temp.next != null) {
		temp = temp.next;
		count++;
	}
	if(count %2 ==0) {
		NodeLinkedList temp1 = head;
		for(int i=0;i<count/2;i++) {
			temp1 = temp1.next;
		}
		System.out.print(temp1.data+" ");
		temp1 = temp1.next;
		System.out.print(temp1.data);
	}
	else {
		NodeLinkedList temp2 = head;
		for(int i = 0; i< count/2;i++) {
			temp2 = temp2.next;
		}
		System.out.println(temp2.data);
	}
}
public void SortedInsertion(int data) {
	NodeLinkedList temp = head;
	NodeLinkedList newnode = new NodeLinkedList(data);
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




public class DoublyLinkedList {
	
	public Node head = null;
	
	public void Insert_at_head(int data) {
		Node newnode = new Node(data);
		if(head != null) {
		head.prev = newnode;
		}
		newnode.next = head;
		newnode.prev = null;
		head = newnode;
	}
	public void Insert_at_tail(int data) {
		Node newnode = new Node(data);
		Node temp = head;
		if(temp == null) {
			newnode.prev = null;
			newnode.next = null;
			head = newnode;
		}else {
		while(temp.next != null) {
			temp = temp.next;
		}
		newnode.prev = temp;
		temp.next = newnode;
		
	}
	}
	public void Insert_at_position(int pos,int data) {
		Node temp = head;
		Node newnode =new  Node(data);
		if(head == null) {this.Insert_at_head(data);}
		else {
		for(int i =0;i<pos-1;i++) {
			temp=temp.next;
		}
		try {
		newnode.next = temp.next;
		newnode.prev = temp;
		temp.next.prev = newnode;
		temp.next = newnode;
		}
		catch(NullPointerException e) {this.Insert_at_tail(data);}
		}
	}
	public void Delete(int k) {
		Node temp = head;
		if(k == 1) {
			temp.next.prev = null;
			head = temp.next;
			temp.next = null;
		}
		else {
			temp = head;
		
		for(int i =0;i<k-1;i++) {
			temp = temp.next;
		}
		if(temp.next.next != null) {
			temp.next.next.prev = temp;
			temp.next = temp.next.next;
		}
		else {
			temp.next = null;
		}
		}
		
	}
	public void Traversal() {
		Node temp = head;
		while(temp != null) {
			System.out.printf("%d<-",temp.data);
			temp=temp.next;
		}
		
	}

}

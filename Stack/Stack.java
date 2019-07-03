
public class Stack {
	public Node top = null;
	
	public void push(int data) {
		 Node newnode = new Node(data);
		 newnode.next = top;
		 top = newnode;
	}
	public void Traversal() {
		Node temp = top;
		while(temp!=null) {
			System.out.printf("%d<-",temp.data);
			temp=temp.next;
		}
	}
	public void top() {
		System.out.println(top.data);
	}

}


public class Stack {
	public NodeStack top = null;
	
	public void push(int data) {
		NodeStack newnode = new NodeStack(data);
		 newnode.next = top;
		 top = newnode;
	}
	public void Traversal() {
		NodeStack temp = top;
		while(temp!=null) {
			System.out.printf("%d<-",temp.data);
			temp=temp.next;
		}
	}
	public void top() {
		System.out.println(top.data);
	}

}

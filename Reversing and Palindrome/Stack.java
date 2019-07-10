
public class Stack {
public Node top = null;
public void push(char d) {
	Node newnode = new Node(d);
	newnode.next = top;
	top = newnode;
}
public void pop() {
	if(top == null) {
		System.out.println("Stack Overflow");
	}
	else {
		top=top.next;
	}
}
public void Traversal() {
	Node temp = top;
	while(temp!=null) {
		System.out.printf("%d<-",temp.data);
		temp=temp.next;
}
}
public void top() {
	System.out.print(top.data);
}
}
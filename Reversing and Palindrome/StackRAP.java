
public class StackRAP {
public NodeRAP top = null;
public void push(char d) {
	NodeRAP newnode = new NodeRAP(d);
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
	NodeRAP temp = top;
	while(temp!=null) {
		System.out.printf("%c<-",temp.data);
		temp=temp.next;
}
}
public void top() {
	System.out.print(top.data);
}
}
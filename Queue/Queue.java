
public class Queue {
	Node front = null;
	Node rear = null;
	
Queue()
{
	this.front = this.rear = null;
}

boolean isEmpty() {
	if(front==null&&rear==null) {return true;}
	else {return false;}
}

void enqueue(int data) {
	Node temp = new Node(data);
	
	if(isEmpty()) {
		front=rear=temp;
	}
	
	else {
		rear.next=temp;
		rear=temp;
	}
	
	
}
void deque() {
	if(isEmpty()) {
		System.out.println("Queue underflow");
	}
	else {
		front=front.next;
	}
	if(front == null) {
		front = rear = null;
	}
	}
public void Print() {
	Node temp = front;
	while(temp!=null) {
		System.out.print(temp.data +"<-");
		temp=temp.next;
	}
	
}
}

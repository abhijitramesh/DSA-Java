
public class Circularqueue {
public int front = -1;
public int rear = -1;
public int[] a = new int[10];

boolean isEmpty() {
	if(front==-1&&rear==-1) {
		return true;
	}
	else {return false;}
}

public void enque(int data) {
	if(isEmpty()) {
		front=rear=0;
		a[rear] = data;
	}
	else
		if((rear+1)==10)
			System.out.println("Queue is full");
	else {
		rear = (rear+1)%10;
		a[rear]=data;
	}
}
public void deque() {
	if(isEmpty()) {
		System.out.println("Queue Empty");
	}
	else
		if(front==rear) {
			front=rear= -1;
		}
		else
			front=(front+1)%10;
}
public void Print() {
int i= front;
int c=1;
if(isEmpty()) {System.out.println("Queue Empty");}
else
	while(c!=0) {
		if(i==rear)
			c=0;
			System.out.print(a[i]+"<-");
			i=(i+1)%10;
		
	}

}


}


public class DriverQueue {
	
	public static void main(String args[]) {
		Queue q = new Queue(); 
        q.enqueue(10); 
        q.enqueue(20); 
        q.deque();
        q.deque(); 
        q.enqueue(30);
        q.enqueue(40); 
        q.enqueue(50);
        q.Print();
	}

}

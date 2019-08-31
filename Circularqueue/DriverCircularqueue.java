
public class DriverCircularqueue {
	
	public static void main(String args[]) {
		Circularqueue q = new Circularqueue();
        q.enque(10); 
        q.enque(20); 
        q.deque();
        q.deque(); 
        q.enque(2);
        q.enque(3);
        q.Print();
	}

}

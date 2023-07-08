package queue;

public class queue_array {
	
	static int front=-1;
	static int rear=-1;
	static int size=6;
	static int arr[]=new int[size];
	
	
		
	
	
	public static void enqueue(int data) {
		if(rear==size-1) {
			return;
		}
		if(front==-1 && rear==-1) {
			front=0;
			rear=0;
			
		}
		else {
		rear++;
		}
		arr[rear]=data;
	}
	
	public static void dequeue() {
		if(rear==-1) {
			return;
		}
		if(front==rear) {
			front=-1;
			rear=-1;
		}
		else
		front++;
	}
	public static void display() {
		if(rear==-1) {
			return;
		}
		for (int i = front; i <= rear; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        }
	
public static void main(String args[]) {
	
	
	enqueue(3);
	enqueue(4);
	enqueue(5);
	enqueue(6);
	enqueue(7);
	enqueue(8);
	dequeue();
	dequeue();
	

	display();
	
}
}

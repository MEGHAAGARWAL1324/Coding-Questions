package queue;

public class queue_circular {
	static class queue{
		static int front=-1;
		static int rear=-1;
		static int size=6;
		static int arr[]=new int[size];
		
	public static boolean isEmpty() {
		if(rear==-1) {
			return true;
		}
		return false;
	}
	
	public static boolean isFull() {
		if((rear+1)%size == front) {
			return true;
		}
		return false;
	}
	
	public static void enqueue(int data) {
		if(isFull()) {
			System.out.print("Overflow");
			return;
		}
		if(front==-1 && rear==-1) {
			front=0;
			rear=0;
			
		}
		else {
			rear=(rear+1)%size;	
		}
		arr[rear]=data;
	}
	
	public static void dequeue() {
		if(isEmpty()) {
			System.out.print("Underflow");
			return;
		}
		  int res = arr[front];


          //if only 1 element is present
          if(front == rear) {
              front = rear = -1;
          } else {
              front++;
          }

	}
	public static void display() {
		if(rear==-1) {
			return;
		}
		for (int i = front; i <= rear; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        }
	
	}

	public static void main(String[] args) {
		queue q=new queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		
		
		q.enqueue(7);
		q.display();

	}

}

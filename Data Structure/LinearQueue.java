
import java.util.Scanner;

class Queue {

    private int arr[];
    private int SIZE;
    private int rear, front;

    public Queue(int size) {
        this.SIZE = size;
        arr = new int[size];
        rear = front = -1;
    }

    public boolean isEmpty() {

        return front == rear; // front  == rear == -1; this is also okay but then front are rear is on only first index 
    }

    public boolean isFull() {

        return rear == SIZE - 1;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println(" You cannot ad queue is full");
        } else {
            rear++;
            arr[rear] = value;
        }

    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("You cannot delete queue is empty");
            // throw new RuntimeException("Queue is empty");  // we can also throw the exception but that time our code get terminated
            return -1;
        } else {
            front++;
            return arr[front];
            
        }

    }

    // public void printQueue()
    // {
    //     for(int ele : arr)     this print print all elements
    //     {
    //         System.out.println(ele);
    //     }
    // }

    public void printQueue() {
    if (isEmpty()) {
        System.out.println("Queue is empty");
        return;
    }
    System.out.print("Queue elements: ");
    for (int i = front + 1; i <= rear; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}


    public int peek() {
        if (isEmpty()) {
            System.out.println("Nothing to peek as queue is empty");
            return -1;
        } else {
            return arr[front + 1];  // because i did not want to update front just want to return element which is infront of front
        }

    }

}

public class LinearQueue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter queue size");
        int size = sc.nextInt();
        Queue q = new Queue(size);
        int choice;
        do {
            System.out.println("0. Exit\n1. enqueue\n2. dequeue\n3. peek\n4. print queue\n Enter your choice ");
            choice = sc.nextInt();
            switch (choice) {
                case 0: {
                    break;
                }
                case 1: {
                    System.out.println("Enter element to enter ");
                    int value = sc.nextInt();
                    q.enqueue(value);
                    break;
                }
                case 2: {
                    System.out.println("Deleted element is " + q.dequeue());
                    break;
                }
                case 3: {
                    System.out.println("peek element is " + q.peek());
                    break;
                }
                // case 4:
                // {
                //     q.printQueue();
                //     break;
                // }

            }

        } while (choice != 0);

    }
}

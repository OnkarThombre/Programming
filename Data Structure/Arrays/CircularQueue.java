
import java.util.Scanner;

class Queue {

    private int arr[];
    private int SIZE;
    private int rear, front;

    public Queue(int size) {
        this.SIZE = size;
        arr = new int[SIZE];
        rear = front = -1;
    }

    public boolean isEmpty() {
        return front == rear && rear == -1;
    }

    public boolean isFull() {
        return (front == -1 && rear == arr.length - 1) || (front == rear && front != -1);
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full you can not add");

        } else {
            rear = (rear + 1) % arr.length; // SIZE
            arr[rear] = value;
        }

    }

    public void  dequeue() {
        if (isEmpty()) {
            System.out.println("you can not delete from queue");
            // return -1;
        } else {
            front = (front + 1) % arr.length;
            if(front == rear)
            {
                front = rear = -1;
            }
            // return arr[front];
        }

    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int index = (front + 1) % arr.length;  // front = (....) why not taken bcaf front update hotoy
            return arr[index]; 
        }

    }
}

public class CircularQueue {

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
                    q.dequeue();
                    break;
                }
                case 3: {
                    System.out.println("peek element is " + q.peek());
                    break;
                }
                case 4: {
                    if (q.isFull()) {
                        System.out.println("True is full");
                    }
                    else{
                        System.out.println("Is False");
                    }
                }

                case 5:
                {
                    if(q.isEmpty())
                    {
                        System.out.println("Quesue is empty");
                    }
                    else{
                        System.out.println("Not empty");
                    }
                }

            }

        } while (choice != 0);

    }
}

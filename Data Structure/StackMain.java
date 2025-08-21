
import java.util.Scanner;

class Stack {

    private int SIZE;
    private int arr[];
    private int top;

    public Stack(int size) {
        arr = new int[size];
        this.SIZE = size;
        top = -1;
    }

    public void push(int val) {
        if (isFull()) {
            System.out.println("Stack is full you cannnot add");
        } else {
            top++;
            arr[top] = val;
        }

    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("You cannot pop empty stack");
            return -1;
        } else {
            int rt = arr[top];
            top--;
            return rt;
        }

    }

    public int peek() {
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == SIZE - 1;
    }
}

public class StackMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter stack size");
        int size = sc.nextInt();
        Stack stack = new Stack(size);
        do {
            System.out.println("0. Exit\n1. push\n2. pop\n3. peek\n4. isEmpty\n Enter your choice");
            int value;
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;

                case 1: {
                    System.out.println("Enter value");
                    value = sc.nextInt();
                    stack.push(value);
                    break;
                }
                case 2: {
                    int pop = stack.pop();
                    System.out.println("Popped element is " + pop);
                    break;
                }
                case 3: {
                    System.out.println("Peek element is " + stack.peek());
                    break;
                }
                case 4: {
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Not empty you can add");
                    }
                    break;
                }
                default:
                    System.out.println("wrong input");
            }
        } while (true);
    }
}

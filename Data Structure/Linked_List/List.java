
import java.util.Scanner;

public class List {

    //
    static class Node {

        private int data;
        private Node next;

        public Node(int value) {
            this.data = value;
            this.next = null;
        }
    }

    private Node head;

    private int size;

    public int getSize() {
        return size;
    }

    public List() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int value) {
        Node newNode = new Node(value);
        // if (head == null) {
        //     head = newNode; 
        // }else {
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void traverse() {
        Node trav = head;
        while (trav != null) {
            System.out.print(trav.data + "->");
            trav = trav.next;
        }
        System.out.println();
    }

    public void addAtPos(int value, int pos) {
        Node newnoNode = new Node(value);
        if (head == null) {
            head = newnoNode;
            size++;
        } else if (pos <= 1) {
            addFirst(value);
        } else {
            Node trav = head;
            for (int i = 1; i < pos - 1 && trav.next != null; i++) {
                // if (trav.next == null) {
                //     break;
                // }
                trav = trav.next;
            }
            newnoNode.next = trav.next;
            trav.next = newnoNode;
            size++;
        }
    }

    public void delFirst() {
        if (head == null) {
            System.out.println("List is empty can not delete (: ");
        } else {
            head = head.next;
            size--;
        }
    }

    public void delLast() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head.next == null) {  // sc. when i haa only one node
            head = null;
            size--;
        } else {
            Node trav = head;
            while (trav.next.next != null) {
                trav = trav.next;
            }
            trav.next = null;
            size--;
        }
    }

    public void addLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            size++;
        } else {
            Node trav = head;
            while (trav.next != null) {
                trav = trav.next;
            }
            trav.next = newNode;
            size++;
        }
    }

    public void delAtPos(int pos) {
        if (head == null) {
            System.out.println("List is empty ");
        } else if (pos <= 1) {
            delFirst();
        } else {
            Node trav = head;
            for (int i = 1; i < pos - 1 && trav.next.next != null; i++) {
                trav = trav.next;
            }
            trav.next = trav.next.next;
            size--;
        }

    }

    //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List list = new List();
        int choice;
        do {
            System.out.println("1. travers/print");
            System.out.println("2. Add first");
            System.out.println("3. Add last");
            System.out.println("4. Del first ");
            System.out.println("5. Del last ");
            System.out.println("6. Add at a given pos ");
            System.out.println("7. Delete at give pos ");
            System.out.println("8. count number of nodes ");
            System.out.println("Enter your choice ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    list.traverse();
                    break;
                }

                case 2: {
                    System.out.println("Enter value to add");
                    int value = sc.nextInt();
                    list.addFirst(value);
                    break;
                }

                case 3: {
                    System.out.println("Enter value to add");
                    int value = sc.nextInt();
                    list.addLast(value);
                    break;
                }

                case 4: {
                    list.delFirst();
                    break;
                }

                case 5: {
                    list.delLast();
                    break;
                }
                case 6: {
                    System.out.print("Add value and position \n Value = : ");
                    int value = sc.nextInt();
                    System.out.println("enter pos :- ");
                    int position = sc.nextInt();
                    list.addAtPos(value, position);
                    break;
                }
                case 7: {
                    System.out.println("Enter  position to delete");
                    int pos = sc.nextInt();
                    list.delAtPos(pos);
                    break;
                }
                case 8: {
                    System.out.println("Eount is " + list.getSize());
                    break;
                }
                default: {
                    System.out.println("You entered wrong input");
                }
            }

        } while (choice != 0);

    }
}

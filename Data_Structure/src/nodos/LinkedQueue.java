package nodos;

public class LinkedQueue {
    Node head, tail;
    public void enqueue(Node n){
        if (head != null){
            tail.next = n;
            tail = n;
        }else {
            head = tail = n;
        }
        print();
    }

    public void dequeue(){
        if (head == null){
            System.out.println("Queue is empty");
        }else {
            head = head.next;
            print();
        }
    }

    public void print(){
        System.out.print("[ ");
        Node n = head;
        while ( n!=null ) {
            System.out.print(n.num + ",");
            n=n.next;
        }
        System.out.println("\b ]");
    }
}

package nodos;

public class main {
    public static void main(String[] args) {
        LinkedQueue q = new LinkedQueue();
        q.enqueue(new Node(1));
        q.enqueue(new Node(2));
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.enqueue(new Node(3));
        q.enqueue(new Node(4));
        q.dequeue();
        q.enqueue(new Node(5));
        q.enqueue(new Node(6));
    }
}

class Node{
    int num;
    Node next;
    Node(int num){
        this.num = num;
    }
}
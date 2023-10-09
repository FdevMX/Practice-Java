package colas;

public class Stack {

    Node top;

    public void push(int data) {
        Node n = new Node();
        n.data = data;
        n.next = top;
        top = n;
    }

    public void pop() {
        if (top == null) {
            System.out.println("Stack is empty !");
        } else {
            top = top.next;
        }
    }

    public void print() {
        Node pointer = top;
        System.out.print("[ ");
        while (pointer != null) {
            System.out.print(pointer.data + ",");
            pointer = pointer.next;
        }
        System.out.println("\b ]");
    }
}

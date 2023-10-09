package colas;

public class Main {
    
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.print();
        s.pop();
        s.print();
        s.pop();
        s.push(10);
        s.push(20);
        s.print();
        s.push(30);
        s.push(40);
        s.push(50);
        s.print();
    }
}

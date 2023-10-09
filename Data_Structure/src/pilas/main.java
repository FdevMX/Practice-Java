package pilas;

public class main {

    public static void main(String[] args) {
        
        Stack s = new Stack(3); //Stack size 3
        s.printStack();
        s.pop();
        s.printStack();
        s.push(10);
        s.printStack();
        s.push(20);
        s.printStack();
        s.pop();
        s.printStack();
        s.push(30);
        s.printStack();
        s.push(40);
        s.printStack();
        s.push(50);
        s.printStack();
    }
    
}

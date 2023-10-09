package listaMatriz;

import java.util.Arrays;

public class main_01 {
    static int arr [] = new int[3], index = -1;

    public static void main(String[] args) {
        enqueue(1);
        dequeue();
        dequeue();
        enqueue(2);
        enqueue(3);
        enqueue(4);
        enqueue(5);
        dequeue();
    }

    public static void enqueue(int num){
        if (index == arr.length-1){
            System.out.println("Queue is full");
        }else {
            arr[++index] = num;
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void dequeue(){
        if (index == -1){
            System.out.println("Queue is empty");
        } else {
            for (int i = 0; i<index; i++)
            arr[i] = arr[i+1];
            arr[index] = 0;
            index--;
            System.out.println(Arrays.toString(arr));
        }
    }
}

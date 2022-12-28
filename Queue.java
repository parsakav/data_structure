package queue;

import java.util.Arrays;

public class Queue {

    int capcity = 3;
    int items[] = new int[capcity];
    int front = -1;
    int rear = -1;

    boolean isFull(){
        if(rear == capcity - 1){
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty(){
        if(front == -1 && rear == -1){
            return true;
        } else {
            return false;
        }
    }



    void add(int itemValue) {
        if(isFull()){
            System.out.println("Queue is full");
        } else if(front == -1 && rear == -1){
            front = rear = 0;
            items[rear] = itemValue;
        } else{
            rear++;
            items[rear] = itemValue;
        }
    }

    int remove(){
        int returnValue=-1;
        if(isEmpty()){
            System.out.println("Queue is empty");
        } else if (front == rear){
            returnValue=items[front];
            front = rear = -1;

        } else {

            returnValue=items[front++];
        }
        return returnValue;
    }


    public static void main(String[] args) {
        Queue queue = new Queue();
    queue.add(1);
    queue.add(2);
    queue.add(3);
        System.out.println( queue.remove());
        System.out.println( queue.remove());
        System.out.println( queue.remove());
        queue.add(3);
        queue.add(3);

        System.out.println( queue.remove());
        System.out.println( queue.remove());



    }




}

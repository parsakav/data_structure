package stack;

import java.util.Arrays;
public class Stack<T> {
    private int top;
    private int capacity;
    private Object[] elements;

    public Stack(int capacity){
        this.capacity=capacity;
        this.elements=new Object[capacity];
        this.top=-1;
    }
    public void push(T t){
        if(!isFull()){
            elements[++top]=t;
        }

    }
    public boolean isFull(){
        return top+1==capacity;
    }
    public boolean isEmpty(){
        return top==-1;
    }

    public T pop(){
        if(!isEmpty()){
            return (T) elements[top--];
        }
        return null;
    }


    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>(2);
        integerStack.push(1);
        integerStack.push(2);

        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());

    }
}

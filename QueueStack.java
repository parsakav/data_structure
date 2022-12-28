package queuewithtwostacks;

import java.util.Stack;

public class QueueStack {
     Stack<Integer> s1 = new Stack<>();
     Stack<Integer> s2 = new Stack<>();

     void add(int x)
    {
        while (!s1.isEmpty())
        {
            s2.push(s1.pop());
        }

        s1.push(x);

        while (!s2.isEmpty())
        {
            s1.push(s2.pop());
        }
    }

     int remove()
    {
        if (s1.isEmpty())
        {
            System.out.println("Q is Empty");
            System.exit(0);
        }


        int x=s1.pop();
        return x;
    }

    public static void main(String[] args) {
        QueueStack queueStack = new QueueStack();
queueStack.add(1);
queueStack.add(2);
queueStack.add(3);
        System.out.println(queueStack.remove());
        System.out.println(queueStack.remove());
        System.out.println(queueStack.remove());
     }
}

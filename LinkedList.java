public class LinkedList {
    static class Node {
        int data;
        Node next = null;

        Node(int data) {
            this.data = data;

        }
    }

    private Node first = null;

    public void insert(int i) {
        Node node = new Node(i);
        if (first == null) {
            first = node;
            return;
        }
        Node last = first;

        for (; last.next != null; last = last.next) ;

        last.next = node;
    }

    public void insert(Node i) {
        if (first == null) {
            first = i;
            return;
        }
        Node last = first;

        for (; last.next != null; last = last.next) ;

        last.next = i;
    }

    public void insertFirst(int i) {
        Node node = new Node(i);
        Node temp = first;
        first = node;
        first.next = temp;


    }

    public void removeFirst() {
        Node temp = first;
        first = temp.next;


    }

    public void reverse() {
        Node previous = null;
        Node current = first;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        first = previous;
    }

  /*  public void reverseRecursive(Node previous, Node current) {
        if (first == null) {
            return;
        }
        if (current == null) {
            first = previous;

            return;
        }
        Node next = current.next;
        current.next = previous;
        reverseRecursive(current, next);
    } */
        public static Node reverseRecursive( Node head) {
if(head.next==null || head==null){
    return head;
}

Node rest = reverseRecursive(head.next);

head.next.next=head.next;
head.next=null;
return rest;
    }


    public void print() {
        if (first == null) {
            return;
        }
        for (Node n = first; n != null; n = n.next) {
            System.out.print(n.data + "->");
        }
        System.out.println("null");
    }
}

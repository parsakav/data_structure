package main.java;
/**
 * @see <a href="https://github.com/parsakav/data_structure/blob/main/Tree.png">See the picture for easier understanding</a>
 */
public class TreeTraversal {
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.getLeftMostChild());
        System.out.print(root.getData() + "->");
        inorder(root.getRightSibling());

    }

    public static void preorder(Node root) {
        if (root != null) {
            System.out.print(root.getData() + "->");

        } else {
            return;
        }
        preorder(root.getLeftMostChild());

        preorder(root.getRightSibling());

    }

    public static void postOrder(Node root) {

        if (root == null) {
            return;
        }
        postOrder(root.getLeftMostChild());

        postOrder(root.getRightSibling());
        System.out.print(root.getData() + "->");

    }

    static class Node {
        private final Node parent;
        private String data;
        private Node leftMostChild;
        private Node rightSibling;

        public Node(String data, Node parent) {
            this.data = data;
            this.parent = parent;
        }

        public String getData() {
            return data;
        }

        public Node getLeftMostChild() {
            return leftMostChild;
        }

        public void setLeftMostChild(Node leftMostChild) {
            this.leftMostChild = leftMostChild;
        }

        public Node getRightSibling() {
            return rightSibling;
        }

        public void setRightSibling(Node rightSibling) {
            this.rightSibling = rightSibling;
        }
    }
    public static void main(String[] args) {
        Node root = new Node("a",null);
        Node leftroot = new Node("b",root);

        Node rightroot = new Node("e",root);
        root.setRightSibling(rightroot);
        root.setLeftMostChild(leftroot);

        Node left_leftroot = new Node("c",leftroot);
        Node right_leftroot = new Node("d",leftroot);
        leftroot.setLeftMostChild(left_leftroot);
        leftroot.setRightSibling(right_leftroot);
        Node left_rightroot = new Node("f",rightroot);
        Node right_rightroot = new Node("g",rightroot);
        rightroot.setLeftMostChild(left_rightroot);
        rightroot.setRightSibling(right_rightroot);
        Node right_left_rightroot = new Node("h",left_rightroot);
        left_rightroot.setRightSibling(right_left_rightroot);
        TreeTraversal.inorder(root);
        System.out.println();
        TreeTraversal.preorder(root);
        System.out.println();
        TreeTraversal.postOrder(root);
    }

}

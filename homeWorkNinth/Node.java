package yarchuk;

public class Node {

    public String data;
    public Node next;
    public Node previous;

    public Node(String data) {
        this.data = data;
    }

    public void displayNode() {
        System.out.println(data + " ");
    }
}

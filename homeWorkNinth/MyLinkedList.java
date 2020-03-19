package yarchuk;

import java.util.Collection;

public class MyLinkedList implements CustomCollection {
    private Node header;
    private Node tail;

    public MyLinkedList() {
        header = null;
        tail = null;
    }


    @Override
    public boolean add(String str) {
        Node newNode = new Node(str);
        if (isEmpty()) {
            header = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;

        return true;
    }

    public boolean isEmpty() {
        return header == null;
    }

    @Override
    public boolean addAll(String[] strArr) {
        for (String string : strArr) {
            add(string);
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<String> strColl) {
        strColl.forEach(this::add);
        return true;
    }

    @Override
    public boolean delete(int index) {
        if (isEmpty()) {
            return false;
        }

        Node current = header;
        Node parent = null;

        int i = 0;
        while (current != null && i < index) {
            parent = current;
            current = current.next;

            i++;
        }

        if (current != null && parent == null) {
            if (current.next != null) {
                header = current.next;
            } else {
                header = null;
            }
        } else if (current != null) {
            parent.next = current.next;
        }

        return true;
    }

    @Override
    public boolean delete(String str) {
        if (isEmpty()) {
            return false;
        }
        Node current = header;
        Node previous = header;

        while (current != null) {
            if (current.data.equals(str)) {
                if (current == header) {
                    header = header.next;
                } else {
                    previous.next = current.next;
                }
                return true;
            }
            current = current.next;
        }

        return false;
    }

    @Override
    public String get(int index) {
        if (isEmpty()) {
            return "List is empty";
        }

        Node current = header;
        int nodeCounter = 1;

        while (nodeCounter <= index) {
            current = current.next;
            nodeCounter++;
        }

        return current.data;
    }

    @Override
    public boolean contains(String str) {
        if (isEmpty()) {
            return false;
        }

        Node current = header;

        while (current != null) {
            if (current.data.equals(str)) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    @Override
    public boolean clear() {
        header = null;
        return true;
    }

    @Override
    public int size() {
        int size = 0;
        Node current = header;

        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    @Override
    public boolean compare(MyLinkedList list) {
        Node current = header;
        Node currentToCompare = list.header;

        while (current != null && currentToCompare != null) {
            if (current.data != currentToCompare.data) {
                return false;
            }
            current = current.next;
            currentToCompare = currentToCompare.next;
        }
        return (current == null && currentToCompare == null);
    }

    @Override
    public boolean trim() {
        return true;
    }

    public void displayList() {
        Node current = header;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }


}

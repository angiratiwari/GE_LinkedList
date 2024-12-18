public class LinkedList <T extends Comparable<T>> {
    private Node<T> head;
    // UC1: Create a simple Linked List
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    // UC2: Add nodes in reverse order
    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }
    // UC3: Append nodes
    public void append(T data) {
        add(data);
    }

    // Print the LinkedList
    public void printList() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

}

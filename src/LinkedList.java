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

    // UC4: Insert node at specific position
    public void insertAfter(T key, T data) {
        Node<T> temp = head;
        while (temp != null && !temp.data.equals(key)) {
            temp = temp.next;
        }
        if (temp != null) {
            Node<T> newNode = new Node<>(data);
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    // UC5: Delete the first element
    public T pop() {
        if (head == null) return null;
        T data = head.data;
        head = head.next;
        return data;
    }

    // UC6: Delete the last element
    public T popLast() {
        if (head == null) return null;
        if (head.next == null) {
            T data = head.data;
            head = null;
            return data;
        }
        Node<T> temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        T data = temp.next.data;
        temp.next = null;
        return data;
    }

    // UC7: Search for a node
    public boolean search(T key) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.equals(key)) return true;
            temp = temp.next;
        }
        return false;
    }

    // UC8: Insert after a specific node
    public void insertAfterKey(T key, T data) {
        insertAfter(key, data);
    }

    // UC9: Delete a specific node
    public boolean delete(T key) {
        if (head == null) return false;
        if (head.data.equals(key)) {
            head = head.next;
            return true;
        }
        Node<T> temp = head;
        while (temp.next != null && !temp.next.data.equals(key)) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
            return true;
        }
        return false;
    }

    // Get size of the LinkedList
    public int size() {
        int count = 0;
        Node<T> temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // UC10: Create an ordered LinkedList
    public void addSorted(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null || head.data.compareTo(data) > 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.next != null && temp.next.data.compareTo(data) < 0) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
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

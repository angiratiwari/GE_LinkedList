public class Main {
    public static void main(String[] args) {
        System.out.println("LinkedList");

        LinkedList<Integer> list = new LinkedList<>();

        // UC1
        list.add(56);
        list.add(30);
        list.add(70);
        list.printList(); // Output: 56 -> 30 -> 70 -> null

        // UC2
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.addFirst(70);
        list2.addFirst(30);
        list2.addFirst(56);
        list2.printList(); // Output: 56 -> 30 -> 70 -> null

        // UC3
        LinkedList<Integer> list3 = new LinkedList<>();
        list3.add(56);
        list3.append(30);
        list3.append(70);
        list3.printList(); // Output: 56 -> 30 -> 70 -> nul

        // UC4
        list.insertAfter(30, 40);
        list.printList(); // Output: 56 -> 30 -> 40 -> 70 -> null

        // UC5
        list.pop();
        list.printList(); // Output: 30 -> 40 -> 70 -> null

        // UC6
        list.popLast();
        list.printList(); // Output: 30 -> 40 -> null

        // UC7
        System.out.println(list.search(30)); // Output: true

        // UC8
        list.insertAfterKey(30, 40);
        list.printList(); // Output: 30 -> 40 -> null

        // UC9
        list.delete(40);
        System.out.println("Size: " + list.size()); // Output: Size: 1
        list.printList(); // Output: 30 -> null
    }
}
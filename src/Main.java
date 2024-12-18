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
    }
}
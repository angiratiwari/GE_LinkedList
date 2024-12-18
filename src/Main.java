public class Main {
    public static void main(String[] args) {
        System.out.println("LinkedList");

        LinkedList<Integer> list = new LinkedList<>();

        // UC1
        list.add(56);
        list.add(30);
        list.add(70);
        list.printList(); // Output: 56 -> 30 -> 70 -> null


    }
}
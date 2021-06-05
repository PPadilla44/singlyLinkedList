public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
        sll.remove();
        sll.remove();
        sll.printValues();

        System.out.println(sll.find(4));
        System.out.println(sll.find(22));

        System.out.println("\nremoving at index\n");

        sll.add(12);
        sll.add(8);
        //3,4,10,5,12,8

        sll.removeAt(3);

        sll.printValues();
    }
}

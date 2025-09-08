public class LinkedListDemo {
    public static void main(String[] args) {        
        LinkedList list = new LinkedList();

        // linked list awal
        list.addFirst(100);
        list.addLast(200);
        list.addLast(300);
        list.addLast(400);

        // no. 1 bagian a
        list.addLast(500);
        list.addFirst(50);
        list.insertAfter(200, new Node(250));

        // no. 1 bagian b
        list.removeFirst();
        list.removeLast();
        list.remove(300);

        // no. 1 bagian c dan no. 2
        list.printList();

        // no. 3
        list.replaceAtIndex(1, 150);
        list.printList();
    }
}
public class LinkedListDemo {
    public static void main(String[] args) {        
        LinkedList list = new LinkedList();

        Node node1 = new Node(100);
        Node node2 = new Node(200);
        Node node3 = new Node(300);
        Node node4 = new Node(400);

        // linked list awal
        list.addFirst(node1.data);
        list.addLast(node2.data);
        list.addLast(node3.data);
        list.addLast(node4.data);

        // no. 1 bagian a
        list.addLast(500);
        list.addFirst(50);
        list.insertAfter(200, new Node(250));

        // no. 1 bagian b
        list.removeFirst();
        list.removeLast();
        list.remove(300);

        // no. 1 bagian c
        Node temp = list.head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");

        // no. 2
        list.printList();

        // no. 3
        list.replaceAtIndex(1, 150);
        list.printList();

        // anggep ini perubahan
    }
}
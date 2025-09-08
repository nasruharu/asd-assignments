public class LinkedList {
    Node head, tail;
    Object data;
    int size = 0;

    private boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Object object){
        Node newNode = new Node(object);
        if(isEmpty()){
            tail = head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    } 

    public void addLast(Object object){
        Node newNode = new Node(object);
        if (isEmpty()){
            head = tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void insertAfter(Object target, Node newNode){
        Node temp = head;
        do{
            if(temp.data.equals(target)){
                newNode.next = temp.next;
                temp.next = newNode;
                size++;
                return;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void removeFirst(){
        if (isEmpty()){
            return;
        }
        head = head.next;
        size--;
    }

    public void removeLast(){
        if (isEmpty()){
            return;
        }
        if (head.next == null){
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    public void remove(Object key) {
        if (isEmpty()) {
            return;
        }
        if (head.data.equals(key)) {
            head = head.next;
            return;
        }

        Node temp = head;
        Node prev = null;
        while (temp != null && !temp.data.equals(key)) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null){
            return;
        }
        prev.next = temp.next; 
    }

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.println("NULL");
    }

    public void replaceAtIndex(int index, Object newData){
        if(isEmpty()){
            return;
        }

        Node temp = head;
        int count = 0;
        while (temp != null){
            if (count == index){
                temp.data = newData;
            }
            temp = temp.next;
            count++;
        }
    }
}
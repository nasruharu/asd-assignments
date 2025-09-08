public class Node{
    Object data;
    Node next;

    public Node(Object data){
        this.data = data;
    }

    Node(Object data, Node next){
        this.data = data;
        this.next = next;
    }

}

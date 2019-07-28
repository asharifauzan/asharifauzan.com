class Node {
    String data;
    Node prev;
    Node next;
    void info() {
        System.out.println(" ");
        System.out.println("NILAI :"+this.data);
        System.out.println("POINTER "+this);
    }
}

public class DoubleLinkedList {
    static Node head = null, tail = null;
    static void push(Node node_baru) {
        if (head == null && tail == null) {
            head = node_baru;
            tail = node_baru;
        }else {
            node_baru.prev  = tail;
            tail.next = node_baru;
            tail = node_baru;
        }
    }
    public static void main(String[] args) {
        Node ana = new Node();
        ana.data= "Ana";
        Node Nana = new Node();
        Nana.data= "Nana";
        Node Fana = new Node();
        Fana.data= "Fana";
        Node Sana = new Node();
        Sana.data= "Sana";
        push(ana);
        push(Nana);
        push(Fana);
        push(Sana);
        head.info();
        tail.info();
        head.next.next.info();
    }
}
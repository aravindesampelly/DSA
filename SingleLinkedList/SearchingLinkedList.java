class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SearchingLinkedList {
    Node head;

    public void insert(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    public void search(int data) {
        Node current = head;
        int count = 1;
        while (current != null) {
            if (current.data == data) {
                System.out.println(current.data + " is Found " + "at " + count + " position");
                return;
            }
            current = current.next;
            count++;
        }
        System.out.println(data + " is not found !");

    }

    public static void main(String[] args) {
        SearchingLinkedList list = new SearchingLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.search(30);
    }
}

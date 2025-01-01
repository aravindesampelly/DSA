class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertAtFirst {
    Node head;

    public void insertAtFirst(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("END");
    }

    public void insertAtLast(int data) {
        Node lastNode = new Node(data);
        Node current = head;
        while(current == null)
        {
            current = lastNode;
            current.data = data;

        }
    }

    public static void main(String[] args) {
        InsertAtFirst list = new InsertAtFirst();
        list.insertAtFirst(12);
        list.insertAtFirst(43);
        list.insertAtFirst(345);
        list.display();
        list.insertAtLast(22);
        list.display();
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertAValueAtLast {
    Node head;

    public void insert(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    public void insertatlast(int data) {
        Node newnode = new Node(data);
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newnode;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;

        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        InsertAValueAtLast list = new InsertAValueAtLast();
        list.insert(1);
        list.insert(3);
        list.insert(7);
        list.insertatlast(9);
        list.display();
    }
}

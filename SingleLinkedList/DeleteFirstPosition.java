class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteFirstPosition {

    Node head;

    public void insertAtFirst(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    public void deletefirst() {
        head = head.next;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "---->");
            current = current.next;
        }
        System.out.println("End");
    }

    public static void main(String[] args) {
        DeleteFirstPosition list = new DeleteFirstPosition();
        list.insertAtFirst(10);
        list.insertAtFirst(30);
        list.display();
        list.deletefirst();
        list.display();
    }
}

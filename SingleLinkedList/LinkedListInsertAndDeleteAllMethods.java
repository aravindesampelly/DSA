class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListInsertAndDeleteAllMethods {
    Node head;

    public void insertatfirst(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    public void insertatend(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newnode;
    }

    public void insertatanyposition(int position, int data) {
        Node newnode = new Node(data);
        if (position <= 0) {
            return;
        }
        if (position == 1) {
            newnode.next = head;
            head = newnode;
            return;
        }
        Node current = head;
        int count = 1;
        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }
        if (current == null) {
            return;
        }
        newnode.next = current.next;
        current.next = newnode;
    }

    public void deleteatfirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public void deleteatlast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public void deleteatanyposition(int position) {
        if (position <= 0 || head == null) {
            return;
        }
        if (position == 1) {
            head = head.next;
            return;
        }
        Node current = head;
        int count = 1;
        while (current.next != null && count < position - 1) {
            current = current.next;
            count++;
        }
        if (current.next == null) {
            return;
        }
        current.next = current.next.next;
    }

    public void display() {
        if (head == null) {
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "--->");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkedListInsertAndDeleteAllMethods list = new LinkedListInsertAndDeleteAllMethods();
        list.insertatfirst(10);
        list.insertatfirst(20);
        list.insertatanyposition(3, 30);
        list.display();
        list.deleteatanyposition(2);
        list.display();
        list.insertatend(100);
        list.display();
        list.deleteatlast();
        list.display();
        list.deleteatanyposition(1);
        list.display();
    }
}

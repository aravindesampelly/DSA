class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertAtAnyPositionn {
    Node head;

    public void inserttanyposition(int data, int position) {
        Node newnode = new Node(data);
        if (position == 0) {
            System.out.println("List is too Short, Please Enter Valid Position !");
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
        newnode.next = current.next;
        current.next = newnode;
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
        InsertAtAnyPositionn list = new InsertAtAnyPositionn();
        list.inserttanyposition(10, 1);
        list.inserttanyposition(20, 2);
        list.inserttanyposition(30, 3);
        list.display();
        list.inserttanyposition(200, 2);
        list.display();
        list.inserttanyposition(67, 4);
        list.display();
        list.inserttanyposition(23, 0);
        //list.display();
    }
}
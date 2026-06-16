class LL {

    // Head points to the first node of the linked list
    Node head;

    // Stores the size of the linked list
    private int size;

    // Constructor to initialize size
    LL() {
        this.size = 0;
    }

    // Node class represents each element in the linked list
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++; // Increase size whenever a new node is created
        }
    }

    // Add a node at the beginning of the list
    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Add a node at the end of the list
    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // Print all elements of the linked list
    public void printList() {
        if (head == null) {
            System.out.print("List is empty");
            return;
        }

        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }

        System.out.print("NULL");
    }

    // Delete the first node of the list
    public void deleteFirst() {
        if (head == null) {
            System.out.println("This list is empty");
            return;
        }

        size--;
        head = head.next;
    }

    // Delete the last node of the list
    public void deleteLast() {
        if (head == null) {
            System.out.println("This list is empty");
            return;
        }

        size--;

        // If only one node exists
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    // Return the current size of the linked list
    public int getSize() {
        return size;
    }

    // Driver method
    public static void main(String[] args) {

        // Create a linked list object
        LL list = new LL();

        // Insert nodes
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.addFirst("this");

        // Delete first and last nodes
        list.deleteFirst();
        list.deleteLast();

        // Print linked list
        list.printList();

        // Print size of linked list
        System.out.println();
        System.out.println(list.getSize());
    }
}

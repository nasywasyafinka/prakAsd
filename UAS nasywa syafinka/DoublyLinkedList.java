class DoublyLinkedList {
    Node head;

    public DoublyLinkedList() {
        this.head = null;
    }

    public int getFirstNodeData() {
        if (head != null) {
            return head.data;
        }
        return -1; // Return -1 jika list ksong
    
    }

    public int getLastNodeData() {
        Node current = head;
        while (current != null && current.next != null) {
            current = current.next;
        }
        if (current != null) {
            return current.data;
        }
        return -1; // Return -1 jika list kosong
    } 

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }

    public void removeNode(Node node) {
        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            head = node.next;
        }
        if (node.next != null) {
            node.next.prev = node.prev;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

}

// Node class for a singly linked list
class Node {
    int data;
    Node next;
    Node(int data) {
    this.data = data;
    this.next = null;
    }
    }
    // LinkedList class with basic operations
    public class SinglyLinkedList {
    Node head;
    // Insert a new node at the end
    public void append(int data) {
    if (head == null) {
    head = new Node(data);
    } else {
    Node current = head;
    while (current.next != null) {  current = current.next;
    }
    current.next = new Node(data);  }
    }
    // Display the linked list
    public void display() {
    Node current = head;
    while (current != null) {
    System.out.print(current.data + " -> ");  current = current.next;
    }
    System.out.println("null");
    }
    public static void main(String[] args) {  SinglyLinkedList list = new SinglyLinkedList();  list.append(1);
    list.append(2);
    list.append(3);
    list.display(); // Output: 1 -> 2 -> 3 -> null  }
    }
}
public class SinglyLinkedList{

    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
           head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display(){
        Node current = head;
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        System.out.println("The data in the linked list are : ");
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(598);
        list.insert(590);
        list.insert(599);
        list.insert(566);
        list.display();
    }
    
}
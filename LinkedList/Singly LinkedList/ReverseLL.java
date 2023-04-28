public class ReverseLL {

    static Node head = null;
    static Node tail = null;

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

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

    public void display(Node current){
        
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            while(current != null){
                System.out.println(current.data);
                current = current.next;
            }
        }
    }

    public Node reverse(Node n){
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        Node node = prev; 
        return node;
    }

    public static void main(String[] args) {
        ReverseLL ll = new ReverseLL();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.display(head);
        head = ll.reverse(head);
        ll.display(head);
    }
}

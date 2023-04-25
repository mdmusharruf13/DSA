public class LengthOfLL{

    Node head = null;
    Node tail = null;

    static class Node{
        int data;
        Node next;
        private Node(int data){
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
    
    public void display(){
        Node temp = head;
        if(temp == null){
            System.out.println("List is empty...");
            return;
        }
        System.out.println("Data in the Linked List are : ");
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void getLength(){
        int cnt = 0;
        Node temp = head;
        if(temp == null){
            System.out.println("List is empty...");
            return;
        }
        while(temp != null){
            cnt++;
            temp = temp.next;
        }
        System.out.println("Length is : " + cnt );
    }
    public static void main(String[] args) {

        LengthOfLL ll = new LengthOfLL();
        ll.insert(5);
        ll.insert(2);
        ll.insert(6);
        ll.insert(7);
        ll.insert(9);
        ll.display();
        ll.getLength();

    }
}
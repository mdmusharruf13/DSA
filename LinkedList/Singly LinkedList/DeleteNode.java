public class DeleteNode {

    static Node head = null;
    static Node tail = null;

    class Node{
        Node next;
        int data;
        Node(int value){
            data = value;
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
        if(head == null){
            System.out.println("List is empty...");
            return;
        }
        Node curr = head;
        while(curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("list is empty...");
            return ;
        }
        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("list is empty...");
            return;
        }
        Node prev = null;
        Node curr = head;
        while(curr.next != null){
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
    }

    public void deleteNthNode(int value){
        if(head == null){
            System.out.println("list is empty...");
            return;
        }
        if(head.data == value){
            head = null;
        }
        Node prev = null;
        Node curr = head;
        while(curr.next != null){
            if(value == curr.data){
                prev.next = curr.next;
            }
            prev = curr;
            curr = curr.next;
        }
    }

    public static void main(String [] args){
        DeleteNode list = new DeleteNode();
        list.insert(13);
        list.insert(18);
        list.insert(21);
        list.insert(25);
        list.insert(30);
        list.insert(31);
        list.insert(33);

        System.out.println("linked list : ");
        list.display();

        System.out.println("After deleting first node : ");
        list.deleteFirst();
        list.display();

        System.out.println("After deleting last node : ");
        list.deleteLast();
        list.display();
        
        System.out.println("After deleting nth node : ");
        list.deleteNthNode(30);
        list.display();
    }
}

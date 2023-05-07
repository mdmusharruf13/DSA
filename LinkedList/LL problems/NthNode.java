
public class NthNode{

    class Node{

        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    public static Node head = null;
    public static Node tail = null;

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

    public void getNthFromLast(int n){
        Node ptr = head;
    	int length = 0;
        while(ptr != null){
            ptr = ptr.next;
            length++;
        }
        
    	length = length - n;
    	
    	if(length < 0){
    	    System.out.println("-1");
    	}
    	Node temp = head;
    	
    	while(length != 0){
    	    temp = temp.next;
    	    length--;
    	}
    	System.out.println("element from last "+n+" position in list is "+temp.data);
    }

    public static void main(String[] args) {
        NthNode list = new NthNode();
        list.insert(598);
        list.insert(590);
        list.insert(599);
        list.insert(566);
        list.display();
        list.getNthFromLast(2);
    }
    
}
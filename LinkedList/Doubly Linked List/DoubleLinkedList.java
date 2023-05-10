public class DoubleLinkedList{
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int value){
            data = value;
            next = null;
            prev = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void printList(){
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String [] args){
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.add(598);
        dll.add(590);
        dll.add(566);
        dll.add(500);
        dll.add(12);
        dll.add(18);
        dll.add(100);
        dll.printList();
    }

}
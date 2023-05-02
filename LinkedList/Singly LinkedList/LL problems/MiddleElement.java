public class MiddleElement{

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

    public void add(int data){
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
        Node temp = head;
        System.out.println("List elements are : ");
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public int getlength(){
        Node temp = head;
        int length = 0;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        return length;
    }

    public int getMiddle(){
        MiddleElement obj = new MiddleElement();
        int mid = obj.getlength();
        mid = mid/2;
        Node temp = head;
        while(mid != 0){
            temp = temp.next;
            mid--;
        }
        return temp.data;
    }

    public static void main(String[] args) {
        MiddleElement ml = new MiddleElement();
        ml.add(20);
        ml.add(32);
        ml.add(51);
        ml.add(55);
        ml.add(98);
        ml.display();
        System.out.println("the length is "+ml.getlength());
        System.out.println("the middle element in linked list is : "+ml.getMiddle());
    }
}
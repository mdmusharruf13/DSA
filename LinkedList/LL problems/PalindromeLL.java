public class PalindromeLL{

    Node head = null;
    Node tail = null;
    int length = 0;

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
        length++;
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
        Node headPtr = head;
        while(headPtr != null){
            System.out.println(headPtr.data);
            headPtr = headPtr.next;
        }
    }

    public void delete(int value){
        if(head.data == value){
            head = head.next;
            return;
        }

        Node nextPtr = head;
        Node prevPtr = null;
        while(nextPtr != null){
            if(nextPtr.data == value){
                prevPtr.next = nextPtr.next;
                return;
            }
            prevPtr.next = nextPtr;
            nextPtr = nextPtr.next;
        }
    }

    public String isPalidrome(){
        Node headPtr = head;
        int arr[] = new int[length];
        for(int i=0; i<length; i++){
            arr[i] = headPtr.data;
            headPtr = headPtr.next;
        }
        headPtr = head;
        for(int i=length-1; i>=0; i--){
            if(arr[i] != headPtr.data){
                return "Not Palindrome";
            }
            headPtr = headPtr.next;
        }
        return "It is Palindrome";
    }

    public static void main(String args[]){
        PalindromeLL ll = new PalindromeLL();
        ll.insert(10);
        ll.insert(12);
        ll.insert(15);
        ll.insert(21);
        ll.insert(15);
        ll.insert(12);
        ll.insert(10);
        System.out.println(ll.isPalidrome());
    }
}
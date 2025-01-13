public class linkedlist_code {
    Node head;
    class Node{
        String data;
        Node next;
public Node(String data) {
    this.data = data;
    this.next=null;
}}

public void addFirst(String data){
    Node newnode=new Node(data);
if(head==null){
    head=newnode;
    return;
}
newnode.next=head;
head=newnode;

}
public void addLast(String data){
    Node newnode=new Node(data);
    if(head==null){
        head=newnode;
        return;
    }
    //to traverse we need to creat 
Node current=head;
while(current.next!=null){
    current=current.next;
}
current.next=newnode;

}
// to print the nodes just to  view purpose

public void printList(){
    if(head==null){
        System.out.println("linked list is empty");
        return;
    }
    Node current=head;
while(current!=null){
    System.out.print(current.data+"->");
    current=current.next;
}

System.out.println("Null");
}
    
    public static void main(String[] args) {
        linkedlist_code list=new linkedlist_code();
        list.addFirst("first");
        list.addFirst("second");  list.addFirst("second");  list.addFirst("second");
        // list.addLast("third");
        // list.addLast("222");
        list.printList();
    }

}
public class remove_element {
    Node head;
 class Node{
    Node head;
    String data;
    Node next;
    public  Node ( String data){
        this.data=data;
        this.next=null;
}
 }
 //add first
 public void addfirst(String data){
    Node newnode =new Node(data); 
    if(head==null){
        head=newnode;
        return;
    }
    newnode.next=head;
    head=newnode;
  }
  public void addlast(String data){
    Node newnode =new Node(data); 
    if(head==null){
        head=newnode;
        return;
    }
    Node current=head;
    while(current.next!=null){
        current=current.next;
   }
   current.next=newnode;
}    public void remove(String data){
    if(head==null){
        System.out.println("the list is empty ");
     return;
    } 
   
    if (head.data.equals(data)){
        head=head.next; 
        return;
    } Node current=head;
    while(current.next!=null&&!current.next.data.equals(data)){
        current=current.next;
    }
    if(current.next==null){
        System.out.println("there no such data");
    }
    current.next=current.next.next;
}
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
System.out.println();
} public int size(){    
   
    Node current=head;
    if(head==null){
        return 0;}

        int count=0;
    while(current.next!=null){
        count=count+1;
        current=current.next;
       
    }return count+1;
    
}
public void middle() {
    if (head == null) {
        System.out.println("The list is empty");
        return;
    }

    // Step 1: Count the number of nodes
    int count = 1;
    Node current = head;
    while (current != null) {
        count++;
        current = current.next;
    }

    // Step 2: Find the middle position
    int mid = count / 2;

    // Step 3: Traverse to the middle
    current = head;
    for (int i = 0; i < mid; i++) {
        current = current.next;
    }

    // Step 4: Print the middle element
    System.out.println("Middle element is: " + current.data);
}


public static void main(String[] args) {
    remove_element ff=new remove_element();
    ff.addfirst("vijay"); 
    ff.addfirst("Bikshapathi");
    ff.addfirst("prameela");
    ff.addfirst("akka");
    ff.addlast("my wife");
    // ff.remove("akka");
    // ff.remove("my wife");

ff.printList();
System.out.println("number of elements are :"+ff.size());
ff.middle();


}}
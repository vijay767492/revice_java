public class reverse_linkedlist {
    Node head;
    class Node{
        String data;
        Node next;
        public Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public void addfirst(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void addlast(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node currentnode=head;
        while(currentnode.next!=null){
            currentnode=currentnode.next;
        }
        currentnode.next=newnode;
    }
    public void printlist(){
        if (head==null) {
            System.out.println("list is empty");
            return;
        }
Node curr=head;
while(curr!=null){
    System.out.print(curr.data+"->");
    curr=curr.next;

} System.out.println("NULL");
    }public void reverse(){
        if(head==null||head.next==null){
            System.out.println("the either northing is there or only one element is there");
            return;
        }
        Node prev=null;
        Node  current=head;
        Node nextnode;
        while(current!=null){
            nextnode=current.next;
            current.next=prev;
            //moving to forword
            prev=current;
            current=nextnode;
        }
        prev=head;
    }
    public Node reverseRecursive(Node head){
        if(head==null||head.next==null){
            return head;
        }
       Node newhead= reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
 
    }
    
    public static void main(String[] args) {
        reverse_linkedlist vv=new reverse_linkedlist();
        vv.addfirst("vijay");
        vv.addfirst("vijay2");
        vv.addfirst("vijay3");
        vv.addfirst("vijay4");
        vv.addlast("chintu");
        vv.printlist();
        // vv.reverse();
        // vv.printlist();
        vv.head=vv.reverseRecursive(vv.head);
        vv.printlist();
    }
}

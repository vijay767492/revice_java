public class findLoop {
    Node head;
    class Node{
        String data;
        Node next;
        public Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    //addfirst method
    public void addfirst(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;

        }
        newnode.next=head;
        head=newnode;
    }
    //creating the loop 
    public void creatingloop(int possition){
        if(head==null){
            System.out.println("the lis empty so cant create the loop ");
            return;
        }
        Node loopnode=head;
        Node tail=head;
        int count=1;
        while(count<possition && loopnode!=null){
            loopnode=loopnode.next;
            count++;
        }
//tail attaching the loopnode
while(tail.next!=null){
    tail=tail.next;
}
tail.next=loopnode;
    }
    public void detecting(){
//detecting the loop with help of flyods algorithm
Node fast=head;
Node slow=head;
while(fast!=null && fast.next!=null){
    slow=slow.next;
    fast=fast.next.next;
    if(fast==slow){
        System.out.println("the loop starts at :"+fast.data);
        remove(slow);
        return;
    }
   
} 
System.out.println("there is no loop ");
return;
    }
    public void remove(Node loopnode){
        Node ptr1=head;
        Node ptr2=loopnode;
        while(ptr1.next!=ptr2.next){
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
ptr2.next=null;
System.out.println("the loop is removed ");
    }
    public void printlist(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
          
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        findLoop vv=new findLoop();
        vv.addfirst("vijay1");
        vv.addfirst("vijay2");
        vv.addfirst("vijay3");
        vv.addfirst("vijay4");
        vv.addfirst("vijay5");
vv.printlist();
vv.creatingloop(3);

vv.detecting();
vv.printlist();
    }
}

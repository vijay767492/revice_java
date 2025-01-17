public class practo_palindrome {
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
        Node newnode= new Node(data);
        if(head==null){
           head= newnode ;
           return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void printlist(){
        if(head==null){
            System.out.println("no element is there in there its empty");
        return;}
Node current=head;
while(current!=null){
    
    System.out.print(current.data+"->");
    current=current.next;
}
    }
    public boolean ispalindrome(){
        if(head==null&&head.next==null){
            return true;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next != null){ 
            slow=slow.next;
            fast=fast.next.next;
        }
        Node secoundhalf=reverse(slow);
        Node firsthalf=head;
while(secoundhalf!=null){
    if(secoundhalf.data!=firsthalf.data){
        return false;
    }
    secoundhalf=secoundhalf.next;
   firsthalf=firsthalf.next;
}
return true;
    }
    public Node reverse(Node slow){
Node prev=null;
Node current=slow;
Node nextnode;
while(current!=null){
    nextnode=current.next;
    current.next=prev;
    prev=current;
    current=nextnode;
}
return prev;

}
    

    public static void main(String[] args) {
        practo_palindrome vv=new practo_palindrome();
        vv.addfirst("43");
        vv.addfirst("0");
        vv.addfirst("3");
        vv.addfirst("111");
        vv.addfirst("3");
        vv.addfirst("0");
        vv.addfirst("43");
        vv.printlist();
        System.out.println();
        System.out.println(vv.ispalindrome() );
    }
}

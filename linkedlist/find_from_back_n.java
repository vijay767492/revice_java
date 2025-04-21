public class find_from_back_n {
    //finding the nth element from back and deleting it 
     Node head;
     class Node {
        String data;
        Node next;
        public  Node(String data){
            this.data=data;
            this.next=null;
        }
     }
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
    Node currentnode=head;
    while(currentnode!=null){
        currentnode=currentnode.next;
    }
    currentnode.next=newnode;

     }


     public void  fromback(int position){
        System.out.print("the size from back is "+position+" is :");
        //first find the size 
        Node current=head;
        int size=-1;
        while(current!=null){
            size++;
            current=current.next;
        }
      
        int minusindex=size-position;
       int targetindex= size-minusindex;
       
       while(position>size||size==0){
        System.out.println("invalid position");
        return;
       }
       System.out.println();
       System.out.println(size);
       int count=1;

       current=head;
       while(count<targetindex){
        count++;
        current=current.next;
       }
       System.out.println(current.data);
     }
     public void printing(){
        if(head.data==null){
            System.out.println("the linked list is empty");
            return;
        }
        Node cur=head;
        while(cur.next!=null){
            System.out.print(cur.data+"->");
            cur=cur.next;
            
        }
        System.out.print(cur.data+"->");
        System.out.println("Null");
     }
     public static void main(String[] args) {
        find_from_back_n ff=new find_from_back_n();
        ff.addFirst("vijay1"); 
        ff.addFirst("vijay2");
        ff.addFirst("vijay3");
        ff.addFirst("vijay4");
        ff.addFirst("vijay5");
        ff.addFirst("vijay6");
        ff.addFirst("vijay7");
        ff.addFirst("vijay8");
        ff.addFirst("vijay9");
        ff.fromback(4);
        ff.printing();
       
     }


}

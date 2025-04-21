public class delete_from_end {
    Node head;
    class Node{
        String data;
        Node next;
        public Node (String data){
            this.data=data;
            this.next=null;
                }
    }
    //add first
    public void addfirst(String data){
        Node newnode=new Node(data);
        if(head==null){
head=newnode;
return;
        }
        newnode.next=head;
        head=newnode;
    } 
    public void fromend(int a) {
        // Step 1: Calculate the size of the linked list
        int size=-1;
        Node current = head;

        while (current != null) {
            size++;
            current = current.next;
        }

        // Step 2: Calculate the target index from the start
        int targetIndex = size - a;
        if (targetIndex < 0 || targetIndex >= size) { // Out-of-bounds check
            System.out.println("Invalid position");
            return;
        }

        // Step 3: Traverse again to find the target element
        current = head;
        int count = 0;
        while (current != null) {
            if (count == targetIndex) {
                System.out.println(current.data); // Print the target element
                return;
            }
            current = current.next;
            count++;
        }
    }


   public static void main(String[] args) {
    delete_from_end vv=new delete_from_end();
    vv.addfirst("vijay1");
    vv.addfirst("vijay2");
    vv.addfirst("vijay3");
    vv.addfirst("vijay4");
    vv.addfirst("vijay5");
    vv.addfirst("vijay6");
    vv.addfirst("vijay7");
    vv.addfirst("vijay8");
    vv.addfirst("vijay9");
    vv.addfirst("vijay10");


vv.fromend(3);

   }
}

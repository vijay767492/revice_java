

class school{
void id(){
    System.out.println("the id is 1234");
}
void sports(){
    System.out.println("peopele play sports in the ground ");
}
}
class office extends school{
    void id(){
        System.out.println("the id is is office 3333");
    }
}
public class polymorphism_overriding {
    public static void main(String[] args) {
         //parent class and child class has the same name method so when there this confution which one to use 
        
         office vv=new office();
        vv.sports();// it call the parent class method sports succefully 
        vv.id();// now id method is there in the both classes so it use the method which ever is beside the new office();
    }
}

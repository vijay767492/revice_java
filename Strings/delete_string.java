package revice_java.Strings;

public class delete_string {
    public static void main(String[] args) {
        StringBuilder name=new StringBuilder("vijay");
        //replacing the charecter with help of method setCharAt() 
        name.setCharAt(1,'A');
        System.out.println(name);
        //inserting the charector in it .
        name.insert(0, 'D');
        System.out.println(name);
        //deleting the charector in it .
        name.delete(0, 1);
        System.out.println(name);
        //

    }
    
}

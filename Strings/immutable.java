package revice_java.Strings;

public class immutable {
    public static void main(String[] args) {
        String s="vijay";
        // s.charAt(2);
        // System.out.println(s);
        // System.out.println(s.charAt(2));
        // //we try to change the string here 
        // s="chintu";
        // //we can change the entire string but manuplatation of exting the string is not possble but we can change with help of the StingBuilder
        s.CharAt(0)="i";
        System.out.println(s);
    }
    
}

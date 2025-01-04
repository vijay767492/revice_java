package revice_java.Strings;

public class builder_string {
    public static void main(String[] args) {
        StringBuilder ss=new StringBuilder("this is a string builder");
        ss.setCharAt(4, 'v');
        System.out.println(ss.length());
        for (int i=0;i<ss.length();i++){
            System.out.println(ss.charAt(i));
        }
        ss.insert(0, 'v');
        System.out.println(ss.length());
    }
}

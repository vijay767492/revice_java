
import java.util.ArrayList;
//in Array list we can store only the objects
public class arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer> rollNo =new ArrayList<>();
        rollNo.add(1);
        rollNo.add(2);
        rollNo.add(3);
        rollNo.add(4);
        rollNo.add(5);
        System.out.println(rollNo);
        System.out.println(rollNo.size());
        System.out.println(rollNo.get(0));
        rollNo.add(0,23);
        System.out.println(rollNo);
        System.out.println(rollNo.get(0));
       rollNo.set(0,900);
        System.out.println(rollNo);
        System.out.println(rollNo.size());
        rollNo.remove(Integer.valueOf(3));
        System.out.println(rollNo);
        System.out.println(rollNo.size()); 
    }
}

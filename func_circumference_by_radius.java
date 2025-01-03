package revice_java;
import java.util.*;
public class func_circumference_by_radius {
    public static float circumference(int r) {
        return (2 * 3.14f * r);
    }
    public static void main(String[] args) {
        Scanner radius=new Scanner(System.in);
        System.out.println("please  enter the radius of circle to ge the circumference :");
        int r=radius.nextInt();
        System.out.println("the circumference with radius "+r+" is :"+circumference(r));

    }
}

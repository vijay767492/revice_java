import java.util.*;
import java.util.Scanner;
class animal1{
    int age = 23; 
    private int salary = 15; 

   
    public int getSalary() {
        return salary;
    }

  
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public  static void tables1(int n){
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
       
    }


    public int getAge() {
        return age;
    }


    public  void setAge(int age) {
        this.age = age;
    }
}
public class access_modifier {
    public static void main(String[] args) {
        animal1 vv = new animal1();

        // Accessing and modifying fields
        vv.age = 24; // Modifying public field
        vv.setSalary(25); // Modifying private field using setter

        // Printing values
        System.out.println("Age: " + vv.age);
        System.out.println("Salary: " + vv.getSalary());
        vv.tables1(4);
    }
}
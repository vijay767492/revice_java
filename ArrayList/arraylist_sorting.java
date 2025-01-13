import java.util.ArrayList;
import java.util.Collections;
class student{
    int rollNo;
    String name;
    String  father;
    String mother;
    float CGPA;
    String area;
    public student(int rollNo, String name, String father, String mother, float cGPA, String area) {
        this.rollNo = rollNo;
        this.name = name;
        this.father = father;
        this.mother = mother;
        CGPA = cGPA;
        this.area = area;
    }
    @Override
    public String toString() {
        return "student [rollNo=" + rollNo + ", name=" + name + ", father=" + father + ", mother=" + mother + ", CGPA="
                + CGPA + ", area=" + area + "]";
    }
}

public class arraylist_sorting {
    public static void main(String[] args) {
        ArrayList<student> rollNo =new ArrayList<>();
        rollNo.add(new student(34,"vijay","bikshapathis","prameela",3.5f,"chandigarh"));
        rollNo.add(new student(24, "Aarav", "Raj", "Sita", 4.0f, "Delhi"));
        rollNo.add(new student(14, "Vijay", "Bikshapathi", "Prameela", 3.5f, "Chandigarh"));
rollNo.add(new student(32, "Aarav", "Raj", "Sita", 4.0f, "Delhi"));
rollNo.add(new student(7, "anjali", "Ramesh", "Savitri", 3.8f, "Mumbai"));
rollNo.add(new student(23, "Priya", "Kumar", "Latha", 3.9f, "Hyderabad"));
rollNo.add(new student(41, "Aditya", "Sharma", "Meena", 4.2f, "Pune"));
rollNo.add(new student(19, "Kavya", "Manoj", "Rekha", 3.7f, "Kolkata"));
rollNo.add(new student(8, "Rahul", "Vikram", "Sunitha", 3.6f, "Bengaluru"));
rollNo.add(new student(56, "Neha", "Arun", "Deepa", 4.1f, "Jaipur"));
rollNo.add(new student(5, "Ishaan", "Mohan", "Pooja", 3.4f, "Lucknow"));
rollNo.add(new student(67, "Meera", "Anand", "Leela", 4.3f, "Chennai"));

    //   rollNo.remove(0);
      System.out.println("before sorting ---------------------------------------");
      for(int i=0;i<rollNo.size();i++){
        System.out.println(rollNo.get(i).toString());
      }
     
    // rollNo.set(0, new student(34,"vijay","bikshapathis","prameela",3.5f,"chandigarh"));
    // System.out.println(rollNo.get(0));
    System.out.println("after sorting ----------------------------------------:");
      Collections.sort(rollNo, (s1, s2) -> s1.name.compareTo(s2.name));
    for(int i=0;i<rollNo.size();i++){
        System.out.println(rollNo.get(i).toString());
      }
    }
    
}

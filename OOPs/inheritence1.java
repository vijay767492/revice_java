
class shape{
    String color="black";
     

}
class triagle extends shape{
int age;
public void triangle1(){
   System.out.println("printing this which is in the child class");
}}
class circle extends triagle{
    int salary=100;
}
public class inheritence1 {
    public static void main(String[] args) {
       triagle tt=new triagle();
       circle bb=new circle();
       tt.age=10;
       System.out.println(tt.color);
       tt.triangle1();
       System.out.println(bb.salary+" "+bb.age);
       bb.triangle1(); 
    
    }
}

package revice_java.OOPs;
//this compile time polymorphism (method overloading )
class animal{
    int a=10;
    public static void  methodprint(int a){
        System.out.println("first method printing haha :");
    }
    public  void  methodprint(int a,int b){
        System.out.println(this.a+" and "+b);
    }
}
public class polymorphism1 {
    public static void main(String[] args) {
        animal vv=new animal();
        vv.methodprint(4,7);
        //based the type of or number of the parameter in the object we pick the method 
        vv.methodprint(7);
    }
}

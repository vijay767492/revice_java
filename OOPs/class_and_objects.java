

class pen{

//these are attributes 
    String color;
    String type;
    String brand;
    int price;
//now method in the class
public  void methodprint(){
    System.out.println("this "+brand+" had good writing experience");
}
}
public class class_and_objects {
    public static void main(String[] args) {
        pen p1=new pen();
        p1.color="blue";
        p1.type="gel";
        p1.brand="Bic";
        p1.price=10;
        p1.methodprint();
        System.out.println(p1.color);
        System.out.println(p1.type);
        System.out.println(p1.brand);
        System.out.println(p1.price);
        
        pen p2=new pen();
        p2.brand="Parker";
        p2.type="gel";
        p2.color="black";
        p2.price=20;
        System.out.println(p2.color);
        System.out.println(p2.type);
        System.out.println(p2.brand);
        System.out.println(p2.price);
        p2.methodprint();

    }
}

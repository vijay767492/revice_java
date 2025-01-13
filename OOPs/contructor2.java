package revice_java.OOPs;
// when we call the class methods from other class the constructor is called automatically by defoult
class animal{
    animal(){
        System.out.println("this called the animal constructor ");
    }
    public void sound(){
        System.out.println("the most animal has the 4 legs ");
    }
}
class cat extends animal{
    cat(){
        System.out.println(" this called the cat constructor ");
    }
    public void sound(){
        System.out.println("meow meow");
    }
}

class dog extends cat{
    dog(int a){
        System.out.println(" this called the dog constructor ");
    }
    dog(){
        System.out.println(" dog constructor ");
    }
    public void sound(){
        System.out.println("woof woof");
    }
}
public class contructor2 {
     
    public static void main(String[] args) {
        dog d=new dog();
        d.sound();
        // animal vv=new cat();
        // vv.sound();
        // animal vv1=new dog();
        // vv1.sound();
    }
}

class vijay{
    public static  void printing(){
        System.out.println("hello vijay");
    }
}
class chintu{
     public  void greeting(){
        System.out.println("hello chintu");
    }
}
public class final_key_word {
    public static void main(String[] args) {
        // we call the two class with there class names in main class in main method 
        vijay.printing();
        //now other class chintu that has method of the greeting without static key word
        // chintu.greeting();// error cause its method is non static 
    }
}

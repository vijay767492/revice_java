

class Pen {
    // Attributes
    String color;
    String type;
    String brand;
    int price;

    // Method in the class
    public void methodprint(int price) {
        System.out.println(this.price);
    }
}

public class constructor1{
    public static void main(String[] args) {
        // Object 1
        Pen p1 = new Pen();
        p1.color = "blue";
        p1.type = "ballpoint";
        p1.brand = "Reynolds";
        p1.price = 10;
        p1.methodprint(30);

        System.out.println(); // For better readability

        // Object 2
        Pen p2 = new Pen();
        p2.color = "black";
        p2.type = "gel";
        p2.brand = "Cello";
        p2.price = 20;
        p2.methodprint(40);
    }
}

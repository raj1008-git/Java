class Mobile {
    String brand;
    int price;
    static String name;

    static {
        name = "Phone";
        System.out.println("In static block ");
    }

    public Mobile() {
        brand = "";
        price = 200;
        System.out.println("In Constructor");

    }

    public void show() {
        System.out.println(this.brand);
        System.out.println(this.name);
        System.out.println(this.price);
    }

}

public class StaticKeyword {
    public static void main(String[] args) {
        Mobile mobile1 = new Mobile();
        mobile1.brand = "Apple";
        mobile1.price = 1500;
        Mobile.name = "ShyamSung";

        Mobile mobile2 = new Mobile();

    }
}
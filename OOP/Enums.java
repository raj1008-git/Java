enum Laptop {
    Macbook(2000), XPS(5000), Surface(1000), ThinkPad(6000);

    private Laptop() {
        price = 500;
    }

    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Enums {
    public static void main(String[] args) {
        Laptop lap = Laptop.Macbook;
        System.out.println(lap + "" + lap.getPrice());
        for (Laptop laps : Laptop.values()) {
            System.out.println(lap + ":" + lap.getPrice());
        }

    }
}
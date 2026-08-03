class Laptop {
    String model;
    int price;

    public String toString() {
        return model + ":" + price;
    }

    public boolean equals(Laptop that) {
        return this.model.equals(that.model) && this.price == that.price;

    }
}

public class ObjectClass {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "lENOVO Yoga";
        obj.price = 1000;

        Laptop obj2 = new Laptop();
        obj2.model = "lENOVO Yoga";
        obj2.price = 1000;
        boolean result = obj.equals(obj2);
        System.out.println(result);
    }
}

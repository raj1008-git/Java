class Human {
    private int age;
    private String name;

    public Human() {
        System.out.println("In Constructor ");
    }

    public Human(int age, String name) {
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(30);
        obj.setName("Raj");
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}
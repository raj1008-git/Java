class Computer {
    public void code() {

    }
}

class Laptop extends Computer {
    public void code() {
        System.out.println("Coding,compile,run");
    }
}

class Desktop extends Computer {
    public void code() {
        System.out.println("Coding,compile,run faster");
    }
}

class Dev {
    public void devApp(Computer lap) {
        lap.code();
        System.out.println("Coding");
    }
}

public class Interface {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Dev raj = new Dev();
        raj.devApp(desk);

    }
}

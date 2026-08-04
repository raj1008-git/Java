enum Status {
    Running, Failed, Pending, Success
}

public class Enums {
    public static void main(String[] args) {
        // Status s = Status.Running;
        Status[] s = Status.values();

        for (Status ss : s) {
            System.out.println(ss );
        }
    }
}

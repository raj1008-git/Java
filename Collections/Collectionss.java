import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Student s) {
        if (this.age > this.age)
            return 1;
        else
            return -1;
    }
}

public class Collectionss {
    public static void main(String[] args) {
        Comparator<Student> com = (i, j) -> i.age > j.age ? 1 : -1;

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(1, "Raj"));
        studs.add(new Student(2, "Ra"));
        studs.add(new Student(0, "R"));
        studs.add(new Student(110, "aj"));

        Collections.sort(studs, com);
        for (Student s : studs)
            System.out.println(s);

    }
}

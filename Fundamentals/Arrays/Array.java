class Student {
    int rollno;
    String name;
    int marks;
}

public class Array {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Navin";
        s1.marks = 88;

        Student s2 = new Student();
        s2.rollno = 1;
        s2.name = "Naviin";
        s2.marks = 88;

        Student s3 = new Student();
        s3.rollno = 1;
        s3.name = "Naviiin";
        s3.marks = 88;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (Student stud : students) {
            System.out.println(stud.name + " " + stud.marks);
        }

    }
}

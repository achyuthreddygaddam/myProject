package arrayss;

public class Teacher {

    public static void main(String[] args) {
        Student s1 = new Student("Achyuth", 25);
        Student s2 = new Student("Reddy", 26);
        Student s3 = new Student("Gaddam", 27);

        Student[] student = new Student[3];

        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        for (Student s:student) {
            System.out.println(s);
        }

    }


}

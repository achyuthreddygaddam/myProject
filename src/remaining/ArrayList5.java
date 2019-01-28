package remaining;

import java.util.ArrayList;

class ArrayList5 {

    private Integer marks;
    private Integer year;

    ArrayList5(Integer marks, Integer year) {
        this.marks = marks;
        this.year = year;
    }
    @Override
    public String toString(){
        return "MArks: "+marks+"\n"+" Year:" +year;
    }

    public static void main(String[] args) {

//Creating user-defined class objects
        Student s1 = new Student(101, "Sonoo", 23);
        Student s2 = new Student(102, "Ravi", 21);
        Student s3 = new Student(103, "Hanumat", 25);
        ArrayList5 s4 = new ArrayList5(50, 4);
        ArrayList5 s5 = new ArrayList5(60, 3);
        ArrayList5 s6 = new ArrayList5(70, 2);

        //creating arraylist
        ArrayList<Student> al = new ArrayList<Student>();

        ArrayList<ArrayList5> a2 = new ArrayList<>();

        a2.add(s4);
        a2.add(s5);
        a2.add(s6);


        al.add(s1);//adding Student class object
        al.add(s2);
        al.add(s3);

        for (ArrayList5 aa:a2) {
            System.out.println(aa);
        }

        for (Student student : al) {
            System.out.println(student);

        }
    }
}
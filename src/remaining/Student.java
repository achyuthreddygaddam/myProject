package remaining;

public class Student{
    int rollno;
    String name;
    int age;


    Student(int rollno,String name,int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;

    }
    @Override
    public String toString(){
        return "student: "+name+"\n"+" age:" +age+"\n"+" Rollno: "+ rollno;
    }
}

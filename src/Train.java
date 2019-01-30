
public class Train {

    private static final int ID = 1;
    private static final String NAME = "Achyuth";

    private Train() {
        System.out.println(ID+" \n" +NAME);
    }

    static {
        float salary = 7000;
        double percentage = 80;
        int f = (int) percentage;
        long l = (long) salary;
        System.out.println("Salary: " + l + "\nPercentage: " + f);
    }

    public void m1(int num, String sub) {
        System.out.println("Num: " + num + "\nSub: " + sub);
    }

    public static void main(String[] args) {
        Train t = new Train();
        t.m1(1, "maths");
        System.out.println("Id: " + ID + "\nName: " + NAME);
    }
}

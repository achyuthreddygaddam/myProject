package remaining;

public class EncapImpl {

    public static void main(String[] args) {

        EncapTest emp = new EncapTest();

        emp.setName("Achyuth");
        emp.setIdNum("12345");
        emp.setAge(25);

        System.out.println(
                        emp.getAge() + ", " +
                        emp.getIdNum() + ", " +
                        emp.getname());


    }


}

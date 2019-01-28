package collection;

public class Employee {

    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void displayData() {
        System.out.println(id + "->" + name);
    }

}

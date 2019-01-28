package restarting;

public class Test {

    public static void main(String[] args) {

        int age = 20;
        int weight = 120;

        String saySomething = "";

        switch(age){
            case 10: saySomething = "Hello";
                System.out.println(saySomething);
            break;
            case 20: saySomething = "Hi";
                System.out.println(saySomething);
            break;
        }

        if(age==20){

            if(weight>=100)
            System.out.println("His Age is 20 & weight is above 100 pounds");
        }
        else if(age ==10){

        }

    }
}

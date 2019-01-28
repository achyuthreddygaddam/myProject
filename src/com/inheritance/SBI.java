package com.inheritance;

public class SBI extends Bank {

    SBI(int a){
        super("ABC");
        a = 20;
        System.out.println(a);
    }
@Override
    public void interest(float a){

        a = 8f;
        System.out.println("Interest of SBI:" + a);
    }

    public static void main(String[] args) {
        SBI b = new SBI(20);

        b.interest(8f);
    }


}

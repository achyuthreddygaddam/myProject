package com.corejavasource;

public class Test {

    int eid;
    String ename;

    private int rno;
    private String rname;

    void setRno(int rno){
        this.rno = rno;
    }
    int getRno(){
        return rno;
    }
    void setRname(String rname){
        this.rname = rname;
    }
    String getRname(){
        return rname;
    }

    Test() {
        this(11,"Ford");
        System.out.println("Empty Constructor");
    }

    Test(int id, String company) {
        this(10,"Achyuth",7000);
        System.out.println(id + " " + company);
    }

    Test(int eid, String ename, double salary){
        this.eid = eid;
        this.ename= ename;

        System.out.println(eid+" "+ename+" "+salary);
    }

    void display(int num, String employee) {
        System.out.println(num+" "+ employee);


    }

    public static void main(String[] args) {


        Test t = new Test();
        t.display(10,"Reddy");

        t.setRno(111);
        t.setRname("ACHYUTH REDDY GADDAM");

        System.out.println("Rname: "+ t.getRname()+ "\n"+"Rno: "+ t.getRno());

    }

}

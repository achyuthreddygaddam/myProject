package com.learnarrays;

public class PrintNull {

    public static void main(String[] args) {
        int[]marks = {75,80,85,90,95,100};

        int sum = 0;
        double percentage = 0;

        for (int i = 0; i<marks.length; i++){
            System.out.println(marks[i]);

            sum = sum+marks[i];

            percentage = sum/6;
        }

        System.out.println("Total Marks: "+sum);

        System.out.println("Percentage: "+ percentage);

        int index= 0;
        while (index<6){
            System.out.println(marks[index]);
            index++;
        }
    }
}

package arrayss;

public class Four {

    public static void main(String[] args) {

        int marks[][][] = {{{1,2,3,4,5}, {10,20,30,40,50},{11,22,33,44,55}}};

        for (int i=0;i<3;i++){
            for (int j=0;j<5;j++){
                System.out.print(marks[i][j]+"\t");
            }
            System.out.println();
        }

    }

}

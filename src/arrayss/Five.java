package arrayss;

public class Five {

    public static void main(String[] args) {

        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 0}};


        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                System.out.println(array[i][j]+"\t");
            }
            System.out.println();
        }

       /* for (int[] a : array) {
            System.out.println(a.toString());
        }
*/
        int i = 25;

        String str = String.format("Values= %d", i);

        System.out.println(str);

    }
}

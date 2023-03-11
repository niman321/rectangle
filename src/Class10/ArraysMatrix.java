package Class10;

public class ArraysMatrix {
    public static void main(String[] args) {
        int [][] matrix={{10,20,32,47,3},
                         {36,22,45,33,57},
                         {100,220,450}};

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]%2!=0){
                    System.out.print(matrix[i][j]+" ");

                }

            }
            System.out.println();

        }





    }
}

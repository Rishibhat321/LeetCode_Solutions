public class rotate_image {
    public static void rotate(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = i + 1; j < col; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        int low = 0;
        int high = col - 1;

        while (low < high) {
            for (int i = 0; i < row; i++) {
                int t = matrix[i][low];
                matrix[i][low] = matrix[i][high];
                matrix[i][high] = t;
            }
            low++;
            high--;
        }
    }

        public static void print_rotated(int[][] matrix){

            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++)
                {
                    System.out.print(matrix[i][j]  + " ");
                }
                System.out.println();
            }
        }

    public static void main(String[] args) {

        int[][] arr = { {5,1,9,11},
                         {2,4,8,10},
                         {13,3,6,7},
                         {15,14,12,16}};

        rotate(arr);
        print_rotated(arr);

    }
}

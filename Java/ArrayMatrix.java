class ArrayMatrix {
    public static void main (String[] args){
        int matrix1[][] = new int[2][2];
        matrix1[0][0] = 5;
        matrix1[0][1] = 0;
        matrix1[1][0] = 2;
        matrix1[1][1] = 6;

        System.out.println("MATRIX A :");

        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[0].length; j++){
                System.out.print(matrix1[i][j] + " ");
            }       
            System.out.println();
        }

        int matrix2[][] = new int[2][2];
        matrix2[0][0] = 1;
        matrix2[0][1] = 0;
        matrix2[1][0] = 4;
        matrix2[1][1] = 2;

        System.out.println("MATRIX B :");

        for (int i = 0; i < matrix2.length; i++){
            for (int j = 0; j < matrix2[0].length; j++){
                System.out.print(matrix2[i][j] + " ");
            }       
            System.out.println();
        }

        System.out.println("MATRIX A + MATIX B :");

        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[0].length; j++){
                int elem = matrix1[i][j] + matrix2[i][j]; 
                System.out.print( elem + " ");
            }       
            System.out.println();
        }
    }
}

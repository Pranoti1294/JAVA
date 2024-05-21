public class MatrixOperations {


        public static void main(String[] args) {
            int rows = 3;
            int columns = 3;
    
            int[][] matrix1 = new int[rows][columns];
            int[][] matrix2 = new int[rows][columns];
    
            // Populate the matrices as needed
        //matrix1 = addValues();
        //matrix2 = addValues();
    
        matrix1 = addValues(10);
        matrix2 = addValues(20);
    
    
            System.out.println("Matrix 1:");
            displayMatrix(matrix1);
    
            System.out.println("Matrix 2:");
            displayMatrix(matrix2);
    
            // Matrix Addition
            int[][] sumMatrix = addMatrices(matrix1, matrix2);
            System.out.println("Matrix Sum:");
            displayMatrix(sumMatrix);
    
            // Matrix Subtraction
            int[][] diffMatrix = subtractMatrices(matrix1, matrix2);
            System.out.println("Matrix Difference:");
            displayMatrix(diffMatrix);
    
            // Matrix Multiplication
            int[][] productMatrix = multiplyMatrices(matrix1, matrix2);
            System.out.println("Matrix Product:");
            displayMatrix(productMatrix);
    
            }
    
        // Function to add values in matrix
        static int[][] addValues(){
        int matrix[][]=new int[3][3];
        for(int i = 0 ; i<=2 ; i++){
            for(int j = 0 ; j<=2 ; j++){
            matrix[i][j]= 10;
            }
        }
        return matrix ; 
    
        }
    
        static int[][] addValues(int a){
        
        int matrix[][]=new int[3][3];
        for(int i = 0 ; i<=2 ; i++){
            for(int j = 0 ; j<=2 ; j++){
            matrix[i][j]= a;
            }
        }
        return matrix ; 
    
        }
        
    
        // Function to add two matrices
        private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
            int rows = matrix1.length;
            int columns = matrix1[0].length;
    
            int[][] sumMatrix = new int[rows][columns];
    
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
    
            return sumMatrix;
        }
    
        // Function to subtract one matrix from another
        private static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
            int rows = matrix1.length;
            int columns = matrix1[0].length;
    
            int[][] diffMatrix = new int[rows][columns];
    
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    diffMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
    
            return diffMatrix;
        }
    
        // Function to multiply two matrices
        private static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
            int rows1 = matrix1.length;
            int columns1 = matrix1[0].length;
            int rows2 = matrix2.length;
            int columns2 = matrix2[0].length;
    
            if (columns1 != rows2) {
                throw new IllegalArgumentException("Matrices cannot be multiplied: Number of columns in matrix1 must be equal to the number of rows in matrix2.");
            }
    
            int[][] productMatrix = new int[rows1][columns2];
    
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns2; j++) {
                    for (int k = 0; k < columns1; k++) {
                        productMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
    
            return productMatrix;
        }
    
        // Function to display a matrix
        private static void displayMatrix(int[][] matrix) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    
}


public class LinearAlgebra {

    /*
     * Test out methods from the other files
     */
    public static void main(String[] args) throws Exception {

        // Instance Variables
        int m = 4;
        int n = 4;
        float[][] A = new float[m][n];
        float[] b = new float[m];

        // Objects to access other files
        Functions func = new Functions();
        LAFunctions LAFunc = new LAFunctions();

        // Combining the augmented matrix under one array
        A = func.fill(A);
        b = func.fill(b);
        float[][] aux = func.join(A,b);

        // Augmented matrix
        System.out.println("\nAugmented Matrix:\n" + func.toString(A, b));

        // Diagonal of the augmented matrix
        System.out.println(func.toString(LAFunc.diag(aux)));
        
        // Elementary Row Operation #1: Row Swap
        System.out.println("\n" + func.toString(LAFunc.rowSwap(aux, 2, 3)));

        // Elementary Row Operation #2: Scalar Multiplication
        System.out.println(func.toString(LAFunc.scalMult(aux, 2, 0.5)));

    }
}
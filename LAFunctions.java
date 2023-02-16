public class LAFunctions {

    public float[][] scalMult(float[][] A, int row, double scal) {

        for(int c = 0; c < A[0].length; c++) {
            A[row][c] *= scal;
        }

        return A;
    }

    public float[][] rowSwap(float[][] A, int row1, int row2) {

        int r1 = row1 - 1;
        int r2 = row2 - 1;

        if (!(r1 > 0 && r2 > 0 && r1 < A[0].length && r2 < A[0].length)) {

            throw new IllegalArgumentException("Rows not in range: [0, # of rows]");

        }

        float[][] A1 = new float[A.length][A[0].length];

        for (int r = 0; r < A.length; r++) {
            if (r == r1) {

                for (int c = 0; c < A[0].length; c++) {

                    A1[r2][c] = A[r1][c];
                    A1[r1][c] = A[r2][c];

                }

            } else if (r == r2) {

                for (int c = 0; c < A[0].length; c++) {

                    A1[r1][c] = A[r2][c];
                    A1[r2][c] = A[r1][c];

                }

            }

            for (int c = 0; c < A[0].length; c++) {

                A1[r][c] = A[r][c];

            }

        }

        return A1;

    }

    /*
     * Returns an array with the values along the diagonal;
     */
    public float[] diag(float[][] A) {

        float[] D = new float[A.length];

        for (int r = 0; r < A.length; r++) {

            D[r] = A[r][r];

        }

        return D;

    }

}

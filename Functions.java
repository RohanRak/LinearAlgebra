import java.util.Arrays;

public class Functions {

    /*
     * Returns the Augmented Matrix as one 2D array
     */
    public float[][] join(float[][] A, float[] b) {

        float[][] J = new float[A.length][A[0].length + 1];
        int len = J.length;

        for (int r = 0; r < len; r++) {

            for (int c = 0; c < len; c++) {

                if (c == len) {

                    J[r][c] = b[r];

                } else {

                    J[r][c] = A[r][c];

                }

            }

        }

        return J;

    }

    public float[][] copy(float[][] array) {

        float[][] arrayCopy = new float[array.length][array[0].length];

        for (int r = 0; r < array.length; r++) {

            for (int c = 0; c < array[0].length; c++) {

                arrayCopy[r][c] = array[r][c];

            }

        }

        return arrayCopy;

    }

    public float[] fill(float[] b) {
        
        for (int i = 0; i < b.length; i++) {
            b[i] = (float) (Math.floor((Math.random() * 9) + 1));
        }

        return b;
    }
    /*
     * Fills the Coefficient Matrix with random values
     */
    public float[][] fill(float[][] A) {

        for (int r = 0; r < A.length; r++) {

            for (int c = 0; c < A[0].length; c++) {

                A[r][c] = (float) (Math.floor((Math.random() * 9) + 1));

            }

        }

        return A;

    }

    public String toString(float[] v) {

        String s = "[";

        for (int i = 0; i < v.length; i++) {

            if (i == v.length - 1)
                s += v[i];

            else
                s += v[i] + " ";

        }

        s += "]";

        return s;

    }

    public String toString(float[][] A) {

        String s = "";

        for (int r = 0; r < A.length; r++) {

            s += Arrays.toString(A[r]) + "\n";

        }

        return s;

    }

    public String toString(float[][] A, float[] b) {

        String s = "";

        for (int r = 0; r < A.length; r++) {

            s += "[";

            for (int c = 0; c < A[r].length; c++) {

                s += A[r][c] + " ";

            }

            s += "  |  " + b[r] + "]\n";

        }

        return s;

    }

}

package edu.sdccd.cisc191;
/**
 * CISC191 2.3 Multidimensional Arrays - Junior
 * @author Dang Vo
 */
public class ArrayLab {
    /**
     * @param args command line parameters
     */
    public static void main(String[] args) {
        int[][] spreadsheet = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Max: " + max(spreadsheet));
        System.out.println("Sum of row 0: " + rowSum(spreadsheet, 0));
        System.out.println("Sum of col 0: " + columnSum(spreadsheet, 0));
        int[] rowSums = allRowSums(spreadsheet);
        for (int row = 0; row < rowSums.length; row++) {
            System.out.println("Sum of row " + row + ": " + rowSums[row]);
        }
    }

    /**
     * @param a 2D array
     * @return
     */
    public static int max(int[][] a) {
        int maxValue = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > maxValue) {
                    maxValue = a[i][j];
                }
            }
        }
        return maxValue;
    }
    /**
     * @param a 2D array
     * @param x row index
     * @return the sum of the elements in Row x of a
     */
    public static int rowSum(int[][] a, int x) {
        int sum = 0;
        for (int j = 0; j < a[x].length; j++) {
            sum += a[x][j];
        }
        return sum;
    }

    /**
     * @param a 2D array
     * @param x column index
     * @return the sum of the elements in Column x of a (careful with rows of different lengths!)
     */
    public static int columnSum(int[][] a, int x) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            try {
                sum += a[i][x];
            } catch (Exception e){
            }
        }
        return sum;
        }

    /**
     * @param a 2D array
     * @return calculates the row sum for every row and returns each of the values in an array. Index i of the return array contains the sum of elements in row i.
     */
    public static int[] allRowSums(int[][] a) {
        int[] sumRows = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sumRows[i] += a[i][j];
            }
        }
        return sumRows;
    }
}

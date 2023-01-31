public class Spiral_matrix {
    public static void spiralorder(int[][] matrix, int m, int n) {
        int i, k = 0, l = 0;
        while (k < m && l < n) {
            for (i = 0; i <n; ++i) {
                System.out.print(matrix[k][i] + " ");
            }
            k++;
            for (i = k; i<m; ++i) {
                System.out.print(matrix[i][n - 1] + " ");
            }
            n--;

            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    System.out.print(matrix[m - 1][i] + " ");
                }
                m--;

            }
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(matrix[i][l] + " ");
                }
                l++;
            }
        }
    }

    public static void main(String[] args) {
        int r = 4;
        int c = 4;
        int matrix[][] = {{1, 2, 3,4}, {5,6,7,8}, {9,10,11,12},{13,14,15,16}
        };
        spiralorder(matrix, r, c);
    }
}
/*time complexity=O(m*n)
space complexity=O(1)
 */


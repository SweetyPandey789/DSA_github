/*You are given an nxn 2D matrix representing an image ,rotate the image by 90 degrees(clockwise)

        you have to rotate the image in_place which means you have to modify the input 2D  matrix directly .
        Do not allocate another 2D matrix and do the rotation .
         */
public class rotate_matrix {
    static void rightRotate(int matrix[][],int n)
    {
        //first find the transpose of the matrix
        for(int i=0;i<n;i++)
        {
     for(int j=i;j<n;j++)
     {
         int temp=matrix[i][j];
         matrix[i][j]=matrix[j][i];
         matrix[j][i]=temp;

     }
        }
        for(int i=0;i<n;i++)
        {
            int low=0,high=1;
            while(low<high)
            {int temp=matrix[i][low];
                matrix[i][low]=matrix[i][high];
                matrix[i][high]=temp;
                low++;
                high--;
        }
    }
        System.out.println("The right rotated matrix");
        //prints matrix after rotation
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "" + "\t");
            }
            System.out.println();
        }
        }
    public static void main(String args[]){
        int n=3;
        int matrix[][]=new  int [][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("The original matrix is");
        //prints matrix

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                //prints the element of the matrix
                System.out.print(matrix[i][j]+""+"\t");

            }
            System.out.println();
        }
        rightRotate(matrix,n);
    }
}
/*Time complexity=O(n^2)
space complexity=O(1)
 */
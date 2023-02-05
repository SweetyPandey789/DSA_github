//Given an integer array nums,return the number of reverse pairs in the array
package reverse_array;

public class javv {
    static int reversepairs(int arr[])
    {
        int pairs=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>2*arr[j])
                    pairs++;
            }
        }
        return pairs;
    }
    public static void main(String[]args)
    {
        int arr[]={1,3,2,3,1};
        System.out.println("The total reverse pairs are"+reversepairs(arr));
    }
}
/*Time complexity=o(n^2)
space complexity=O(1)
 */
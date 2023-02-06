//Given an array having both positive and negative integers.
//The task is to compute the length of the largest subarray with 0 sum.
import java.util.*;
public class largest_subarray_with_zero_sum {
    static int maxlen(int arr[],int N)
    {
        int maxlen=0;
        for(int i=0;i<N;i++)
        {
            int curr_sum=0;
            for(int j=i;j<N;j++)
            {
                curr_sum+=arr[j];
                if(curr_sum==0)
                    maxlen=Math.max(maxlen,j-i+1);
            }
        }
        return maxlen;
    }

    public static void main(String []args)
    {
        int arr[]={15,-2,2,-8,1,7,10,21};
        int N=arr.length;
        System.out.println("length of the longest zero sum"+"subarray is "+maxlen(arr,N));
    }
}
/*Time complexity=o(n^2)
space complexity=o(1)
 */

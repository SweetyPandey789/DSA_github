import java.util.*;
import java.io.*;
public class longest_consecutive_sequence {
    static int findlargest(int arr[],int n)
    {
        Arrays.sort(arr);
        int ans=0,count=0;
        ArrayList<Integer> v=new ArrayList<Integer>();
        v.add(arr[0]);
        for(int i=1;i<n;i++)
        {
            if(arr[i]!=arr[i-1])
            {
                v.add(arr[i]);
            }
        }
        for(int i=0;i<v.size();i++)
        {
            if(i>0 && v.get(i)==v.get(i-1)+1)
                count++;
            else
                count=1;
            ans=Math.max(ans,count);
        }
        return ans;
    }

    public static void main(String[] args)
    {
     int arr[]={1,9,3,10,4,20,2};
     int n=arr.length;
     System.out.println("length of the longest "+"contiguous subsequence is "+findlargest(arr,n));
    }
}

import java.io.*;
public class Repeat_and_missing {
    static void printelement(int arr[],int size)
    {
        int i;
        System.out.print("The repeating elemnet is");
        for(i=0;i<size;i++)
        {
            int abs_Val=Math.abs(arr[i]);
            if(arr[abs_Val - 1]>0)
                arr[abs_Val-1]=-arr[abs_Val-1];
            else System.out.println(abs_Val);
        }
        System.out.print("and the missing number");
        for(i=0;i<size;i++)
        {
            if(arr[i]>0)
                System.out.println(i+1);
        }

    }
    public static void main(String[] args)
    {
        int arr[]={3,2,3,5,1};
        int n=arr.length;
        printelement(arr,n);
    }
}

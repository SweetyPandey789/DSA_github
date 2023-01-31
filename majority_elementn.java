public class majority_elementn {
    public static int AppearN(int arr[],int n)
    {
        int count1=0,count2=0;
        int first=Integer.MIN_VALUE;
        int second=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(first==arr[i])
            {
                count1++;
            }
            else if(second==arr[i])
            {
                count2++;
            }
            else if(count1==0)
            {
                count1++;
                first=arr[i];
            }
            else if(count2==0)
            {
                count2++;
                second=arr[i];
            }
            else {
                count1--;
                count2--;

            }
        }
        count1=0;count2=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==first)
                count1++;
            else if(arr[i]==second)
                count2++;
        }
        if(count1>n/3)
            return first;
        if(count2>n/3)
            return second;
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,3,1,1};
        int n=arr.length;
        System.out.println(AppearN(arr,n));
    }
}
/*TIME COMPLEXITY=O(n)
space complexity=O(1)
 */
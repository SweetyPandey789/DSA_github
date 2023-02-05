//Find the total number of pairs in the first array whose sum is equal to the given value x;
public class target_sum {
    static void pairsum(int []nums,int target)
    {
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
              if(nums[i]+nums[j]==target)
              {
                  System.out.printf("pair found(%d %d)",nums[i],nums[j]);
                  return;

              }
            }
        }
        System.out.printf("pair not found");
    }
    public static void main(String []args)
    {
        int []nums={8,7,2,5,3,1};
        int target=10;
        pairsum(nums,target);

    }
}

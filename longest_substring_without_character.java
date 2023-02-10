public class longest_substring_without_character {
    //Given a string s,find the length of the longest substring without repeating characters
    //Input s="abcabc"
    //output-3
    public int substring(String s)
    {
        int n=s.length();
        int res=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(checkRepetiton(s,i,j))
                {
                    res=Math.max(res,j-i+1);
                }
            }
        }
        return res;

    }
    private boolean checkRepetiton(String s,int start,int end)
    {
        int []chars=new int[128];
        for(int i=start;i<=end;i++)
        {
        char c=s.charAt(i);
        chars[c]++;
        if(chars[c]>1)
        {
            return false;
        }

    }
        return true;

}
public static void main(String args[])
{
    longest_substring_without_character obj=new longest_substring_without_character();
    String s="abcabcabc";
    System.out.println(obj.substring(s));
}
}
/*Time complexity =O(n^2)
space complexity=O(n)
 */
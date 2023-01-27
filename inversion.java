//For a given integer arraylist 'ARR' of size 'N' containing all distinct values.find the total
//number of inversions that may exists.
//An inversion is defined for a pair of integers in the arraylists when the following two conditions are met.
public class inversion {
    static int arr[]=new int []{1,20,6,4,5,6};
    static int getinvcount(int n)
    {
        int invcount=0;
        for(int i=0;i<n-1;i++)
    {
      for(int j=i+1;j<n;j++)
      {
          if(arr[i]>arr[j])
          {
              invcount++;
          }
      }
    }
        return invcount;
    }
    public static void main(String []args)
    {
     System.out.println("number at inversions are "+getinvcount(arr.length));
    }
}

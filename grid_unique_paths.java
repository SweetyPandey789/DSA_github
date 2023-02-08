public class grid_unique_paths {
    static int numberofpaths(int m,int n)
    {
        if(m==1||n==1)
        {
            return 1;
        }
        return numberofpaths(m-1,n)+numberofpaths(m,n-1);
    }
    public static void main(String[] args)
    {
      System.out.println(numberofpaths(3,7));
    }

}

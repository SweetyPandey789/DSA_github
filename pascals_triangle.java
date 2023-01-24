import java.util.Scanner;

public class pascals_triangle {

    //write a program to print pascal's triangle.
    public static void main (String args[]){
        System.out.println("Enter no.of lines");
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        int spaces=num;
        for(int i=0;i<num;i++)
        {
            //nested loop for spaces
            for(int s=1;s<=spaces;s++)
            {
                System.out.print(" ");
            }
            int number=1;
            for(int j=0;j<=i;j++)
            {
                System.out.print(number+" ");
                number=number*(i-j)/(j+1);
            }
            spaces--;
            System.out.println();
        }

    }
}

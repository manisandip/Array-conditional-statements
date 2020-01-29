import java.util.Scanner;

public class FibonacciNumber
{
    //programme to print the series of fibonacci numbers
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Enter the numbers :");
        int n =scanner.nextInt();//stores the value in the integer n
        int i=0,j=1, nextTerm;
        System.out.println( " fibonacci series is :");
        for (int k = 0; k <n ; k++)//condition if integer k=0 and it is less then integer n then do increment by one
        {
            if (k<=0)//condition if integer k is less than equal to 0
                nextTerm =k;// next term is equal to integer k
            else
                //next term =0+1
            {
                nextTerm=i+j;
                i=j;
                j=nextTerm;

            }
            System.out.println( nextTerm);
        }


    }













}

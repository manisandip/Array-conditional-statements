import java.util.Scanner;

public class SumOfEvenAndOdd
{
    //programme for finding odd or even numbers and doing their sum
    public static void main(String[] args)
    {
        int n , i ,evensum =0 , oddsum = 0 ;
        Scanner scanner =new Scanner(System.in);
        //ask the user to enter the number of digits in the array
        System.out.println( " Enter number of elements in the array :");
        n = scanner.nextInt();
        int a [] = new int[n];
        //ask the user to enter any digits equal to the number of elements
        System.out.println( " Enter the elements of the array ");

        for (int i1 = 0; i1 < n ; i1 ++)
        {
            a [i1]= scanner.nextInt();
        }
        for ( i = 0 ; i <n ; i++)
        {
          if (i % 2 ==0)

        {
            evensum = evensum + a[i] ;// even numbers in the digits
        }
        else
            //odd numbers in the total number of digits
        {
            oddsum = oddsum +a[i] ;
        }
        }
        System.out.println( " The sum of even numbers = "+   +evensum); //sum of all the even numbers
        System.out.println( " The sum of odd numbers = " +   + oddsum); // sum of all the odd numbers
    }

}

import java.util.Scanner;

public class SumValueOfArray
{
    //programme for finding the sum values of an array
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int sum = 0;
        //ask the user to enter any 10 number
        System.out.println( "Enter the elements :");
        for (int i = 0; i <10 ; i++)
        {
            array[i]=scanner.nextInt();
        }
        for ( int num :array)
         {
            sum = sum+num;
            
        }
        System.out.println( " sum of the array elements is  :" +sum);//total of the number in the array


    }


}

import java.util.Scanner;

public class ReversingTheNumbers
{
    public static void main(String[] args)
            //programme for reversing the five digit number
    {int num = 0;
    int reversenum=0;
        System.out.println("Input your five digit number and press enter :");
        //this statement will capture  the user input
        Scanner in = new Scanner(System.in);
        //captured input would be stored in number num
        num = in.nextInt();
        while (num!=0)//while loop :logic to find out reverse number
        {
            reversenum = reversenum * 10;
            reversenum = reversenum + num%10;
            num = num /10;

        }

        System.out.println( " Reverse of the number input is  : " +reversenum);

    }
}

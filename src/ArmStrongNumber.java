import java.util.Scanner;

public class ArmStrongNumber
{
    public static void main(String[] args)
    {
        //programme for checking armstrong number
        int num,number, temp,total=0;
        System.out.println( " Enter 3 digit number  :");
        Scanner scanner = new Scanner(System.in);
        num =scanner.nextInt();//stores the value inthe integer num
        scanner.close();//code used to close its input source
        number = num;
        for (  ;number!=0 ; number /=10);//method used to compare if the number is not equal to 0 and equal to divisible by 10
        {
          temp =number % 10 ;//method used to compare integer temp = number if divided by 10
          total = temp*temp*temp;//method used to cube the number

        }
if (total ==num)//condition if total equals integer num
    System.out.println( num + " is a armstrong number ");//then it is a armstrong number
else
    System.out.println( num + " is not a armstrong number ");//rest is not armstrong number
    }
}

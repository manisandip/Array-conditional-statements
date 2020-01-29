import java.util.Scanner;
public class SpecificValue
{
//programme for finding the specific value in the array
    public static void main(String[] args)
    {
        int[] arraynumbers = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        //user ask to enter any value for number of arrays
        System.out.println("Enter a value");
        int num = sc.nextInt();
        //condition if the value of x is 0 and less then the length of the array then do an increment
        for (int x = 0; x < arraynumbers.length; x++)
        {
            //condition if array numbers (x) is not equal to integer num
            if (arraynumbers[x] == num)
            {
                System.out.println("Value exists in array!");
            }
            else
            {
                System.out.println("Value doesn't exists in array!");
            }
        }
    }
}


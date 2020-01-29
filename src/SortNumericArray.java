import java.util.Scanner;

public class SortNumericArray {
    //programme for sorting the numeric array in ascending order
    public static void main(String[] args)
    {
        {
            int count, temp;

            //User inputs the array size
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter number of elements you want in the array: ");
            count = scan.nextInt();

            int num[] = new int[count];
            System.out.println("Enter array elements:");
            //condition if integer i is equal to 0 and  less then total number of integers then do and increment
            for (int i = 0; i < count; i++)
            {
                num[i] = scan.nextInt();
            }
            scan.close();
            for (int i = 0; i < count; i++)
            {
                for (int j = i + 1; j < count; j++)
                {
                    if (num[i] > num[j])
                    {
                        temp = num[i];
                        num[i] = num[j];
                        num[j] = temp;
                    }
                }
            }
            System.out.print("Array Elements in Ascending Order: ");
            for (int i = 0; i < count - 1; i++)
            {
                System.out.print(num[i] + ", ");
            }
            System.out.print(num[count - 1]);
        }
    }
}
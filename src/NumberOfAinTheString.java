import java.util.Scanner;

public class NumberOfAinTheString
{
    public static void main(String[] args)
    {
        //programme for finding number of letter a in the string
        String str = " ";
        int count =0;
        Scanner scanner=new Scanner(System.in);
        System.out.println( " Enter any sentence  :");
        str=scanner.nextLine();
        //condition if integer i =0 and the length of the string is greater than i then do an increment by one
        for (int i = 0; i <str.length() ; ++i)
        {
            //this method is  is used to retuen the character value of the string
       switch (str.charAt(i))
       {
           case 'a':
           case 'A':
               count++; //counts the number of alphabet a in the string
       }
        }
        System.out.println( "The total number of a in the string are :"+ count);

    }
}

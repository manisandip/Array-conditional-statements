import java.util.Scanner;

public class NumberOfSpacesAndWordsInaString
{
    //programme for finding the number of words and spaces in the string
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println( " Enter your sentence :");
        String str = scanner.nextLine();
        int word = 1;
        //condition if integer i = 0 and the length of the string is greater then i then do increment
        for (int i = 0; i <str.length() ; i++)
        {
            //condition if string length is not equal to null string count the the number of spaces
         if (str.charAt(i)==' ')
             word++;//shows  the number of spaces in the sentence
        }
        System.out.println( "Number of words :"+word);
        System.out.println( " Number of spaces :"+(word-1));


    }
}

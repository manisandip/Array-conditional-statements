import java.util.Scanner;

public class Multiplication {
    //programme used for doing any multiplication
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println( "Enter any number for timetable  :");//starts the time table from where use want
        int num1= in.nextInt();
        System.out.println( "Enter the ending number for timetable :");//ends the time table where desired
        int num2 = in.nextInt();
        int i = 1;
        do

        {
            System.out.println( num1+ " x " + i +  " = " +num1 *i+1);
            i ++;//increment of the integer by one
        }
        while (i <=num2); //condition if integer i is less than equal to num2

    }
}

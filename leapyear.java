import java.util.Scanner;
public class leapyear {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the year:");
        int year=sc.nextInt();
        System.out.println("The entered year is "+year);
        //checking whether the given year is leap year or not
        if (year%400==0)
        {
            System.out.println("The given year is a leap year");

        } 
        else if (year%100==0)
        {
            System.out.println("The given year is not  a leap year");
        }
        else if (year%4==0)
        {
            System.out.println("The given year is  a leap year");
        }
        else
        {
            System.out.println("The given year is not a leap year");
        }
        sc.close();
    }
}

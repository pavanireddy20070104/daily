//Write a Java program to check whether a number is even or odd.
import java.util.Scanner;
public class number{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
    System.out.println("enter the number:");
    int num=sc.nextInt();
    if(num%2==0){
      System.out.println("entered number is even");
    } else{
      System.out.println("entered number is odd");
    }
    sc.close();
  }
}

//Write a Java program to check whether a number is positive, negative, or zero.
import java.util.Scanner;
public class number{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
    System.out.println("enter the number:");
    int num=sc.nextInt();
    if (num>0){
     System.out.println("entered  number is positive");
    } else if(num<0){
      System.out.println("entered  number is negative");
    }else{
      System.out.println("number is zero:");
    }
    sc.close();
  }

Write a program to store two integers and print their sum.

import java.util.Scanner;
public class age{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter num1 value:");
  int num1=sc.nextInt();
  System.out.println("enter num2 value:");
  int num2=sc.nextInt();
  int sum=num1+num2;
  System.out.println("sum of numbers is:"+sum);
  sc.close();
   }
}

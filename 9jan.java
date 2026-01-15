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

//Write a Java program to find the largest of two numbers.

import java.util.Scanner;
public class numbers{
 public static void main(String[]args){
 Scanner sc=new Scanner(System.in);
   System.out.println("enter the num1:");
   int num1=sc.nextInt();
   System.out.println("enter the num2:");
   int num2=sc.nextInt();
   if (num1>num2){
    System.out.println(num1);
   } else if(num2>num1){
    System.out.println(num2);
   }else{
    System.out.println("both are equal");
   }
   sc.close();
 }
}

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
}

//Write a Java program to check whether a year is a leap year.
import java.util.Scanner;
public class year{
 public static void main(String[]args);
  
}

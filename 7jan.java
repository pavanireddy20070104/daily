//Write a program to calculate grade using marks:
≥90 → A
≥75 → B
≥50 → C
Else → Fail

import java.util.Scanner;
public class age{
   public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   System.out.println("enter your marks:");
  double marks=sc.nextDouble();
  if (marks>=90){
    System.out.println("grade A");
   } else if(marks >=75){
     System.out.println("grade B");
  } else if (marks >=50){
     System.out.pritnln("grade C");
  }else{
    System.out.printlm("FAIL");
  }
sc.close();
}
}

// DATA TYPES LEARNING

import java.util.Scanner;
public class DataType{
   public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.println("ENTER NAME, AGE, SALARY ");
   String name = sc.nextLine();
   int age = sc.nextInt();
   double salary = sc.nextDouble();
   System.out.println("name of the user " + name);
   System.out.println("age of the user " + age);
   System.out.println("salary of the user " + salary);
   sc.close();
   }
}

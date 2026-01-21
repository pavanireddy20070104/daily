// NESTED IF CONCEPT

import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = sc.nextInt();
        sc.nextLine();   
        System.out.println("Enter your nationality:");
        String nationality = sc.nextLine();
        if (age >= 18) {
            if (nationality.equals("Indian")) {
                System.out.println("You are eligible to vote");
            } else {
                System.out.println("You are not of this nationality");
            }
        } else {
            System.out.println("You are not eligible to vote");
        }

        sc.close();
    }
}


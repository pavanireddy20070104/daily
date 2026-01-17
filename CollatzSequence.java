import java.util.Scanner;
public class CollatzSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number:");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Entered number is not positive.Enter a positive integer.");
        } else {
            System.out.println("Collatz sequence:");
            while (n != 1) {
                System.out.print(n + " ");

                if (n % 2 == 0) {
                    n = n / 2;      
                } else {
                    n = 3 * n + 1;   
                }
            }
            System.out.print(1); 
        }

        sc.close();
    }
}

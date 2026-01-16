import java.util.Scanner;
public class uppertolower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an uppercase letter:");
         char uppercase = sc.next().charAt(0);

        // Check if input is uppercase
        if (uppercase >= 'A' && uppercase <= 'Z') {
            char lowercase = (char)(uppercase + 32); 
            System.out.println("Lowercase letter: " + lowercase);
        } else {
            System.out.println("The entered character is not an uppercase letter.");
        }

        sc.close();
    }
}

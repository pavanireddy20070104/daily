import java.util.Scanner;
public class duplicatecharacters{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        boolean foundDuplicate = false;
        System.out.println("Duplicate characters are:");
        for (int i = 0; i < chars.length; i++) {
            int count = 1;
            if (chars[i] == '0')
                continue;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    chars[j] = '0';
                }
            }
            if (count > 1 && chars[i] != ' ') {
                System.out.println(chars[i]);
                foundDuplicate = true;
            }
        }
        if (!foundDuplicate) {
            System.out.println("No duplicate characters found.");
        }

        sc.close();
    }
}



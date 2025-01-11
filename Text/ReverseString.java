package Text;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String stringToReverse = getString();
        String reversedString = reverseString(stringToReverse);
        System.out.println(reversedString);
    }

    static String getString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence you want to reverse:");

        String stringToReverse = scanner.nextLine();

        scanner.close();
        return stringToReverse;
    }

    static String reverseString(String args) {
        String reversedString = "";
        String[] splittedString = args.split(" ");
        for (int i = splittedString.length - 1; i >= 0; i--) {
            reversedString = reversedString.concat(splittedString[i]).concat(" ");
        }
        return reversedString;
    }
}

package Text;
import java.util.Scanner;

public class PigLatin {
    static String getString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So you wanna speak Pig Latin?");
        System.out.println("Ivegay emay ahay entencesay: (Give me a sentence:)");

        String stringToPig = scanner.nextLine();

        scanner.close();

        return stringToPig;
    }

    static String pigging(String inputString) {
        String piggedString = "";

        String[] splittedString = inputString.toLowerCase().split(" ");

        for (String word : splittedString) {
            char symbol = 0;
            char c = word.charAt(0);
                if (isVowel(c)) {
                    word = word.concat("yay");
                } else {
                    String newWord = "";
                    for (int i = 1; i < word.length(); i++) {
                        if (Character.isLetter(word.charAt(i))) {
                            newWord = newWord + word.charAt(i);
                        } else {
                            symbol = word.charAt(i);
                        }
                    }
                    newWord = newWord + c;
                    word = newWord + "ay" + symbol;
                }
            piggedString = piggedString.concat(word) + " ";
        }

        return piggedString;
    }

    static boolean isVowel(char c) {
        switch (c) {
            case 'a':
            case 'e':
            case 'o':
            case 'i':
            case 'u':
                return true;
        
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        String string = getString();
        String pigged = pigging(string);

        System.out.println(pigged);
    }
}

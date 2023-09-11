import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {

            int letter = 0;
            int digit = 0;
            int spaceChar = 0;
            int other = 0;

            Scanner sc = new Scanner(System.in);
            System.out.println("Input a string: ");
            char[] letters = sc.nextLine().toCharArray();
            System.out.println("\nQuantity of characters is " + letters.length + "\n");

            for (int i = 0; i < letters.length; i++) {

                if (Character.isLetter(letters[i])) {
                    letter++;
                }
                else if (Character.isDigit(letters[i])) {
                    digit++;
                }
                else if (Character.isSpaceChar(letters[i])) {
                    spaceChar++;
                }
                else {
                    other++;
                }
            }

            System.out.println("Letters: " + letter);
            System.out.println("Digits: " + digit);
            System.out.println("Whitespace: " + spaceChar);
            System.out.println("Others: " + other + "\n");
        }
    }
}
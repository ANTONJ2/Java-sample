package practise;

import java.util.Scanner;

public class looptests {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a space-separated string: ");
        String input = scanner.nextLine();

        String[] words = input.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            // Reverse each word
            String reversedWord = reverseWord(word);

            // Check if the reversed word is not a palindrome
            if (!isPalindrome(reversedWord)) {
                result.append(reversedWord).append(" ");
            }
        }

        System.out.println("Modified String: " + result.toString().trim());
    }

    private static String reverseWord(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    private static boolean isPalindrome(String word) {
        String reversedWord = reverseWord(word);
        return word.equals(reversedWord);
	
		
		
	}

}

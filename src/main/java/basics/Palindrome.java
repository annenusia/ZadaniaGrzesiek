package basics;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println(Palindrome.isNumberPalindrome(2552));

    }

    public static boolean isNumberPalindrome(int number) {
        int palindromeNumber = number;
        int reverseNumber = 0;

        // Compute the reverse
        while (palindromeNumber != 0) {
            int remainder = palindromeNumber % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            palindromeNumber = palindromeNumber / 10;
        }
        if (number == reverseNumber) {
            return true;
        }
        return false;
    }
        }



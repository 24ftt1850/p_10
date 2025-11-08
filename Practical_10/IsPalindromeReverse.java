import java.util.Scanner;

public class IsPalindromeReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = (int)(Math.random() * 900) + 100; // random number between 100–999
        System.out.print("Enter the reverse of " + number + ": ");
        int reverseInput = input.nextInt();

        while (reverseInput < 100 || reverseInput > 999) {
            System.out.println("Please enter a 3-digit reverse number of " + number + ": ");
            reverseInput = input.nextInt();
        }

        boolean result = isPalindrome(number, reverseInput);

        System.out.println("The digit " + reverseInput + " is palindrome of " + number + " is " + result + ".");
    }

    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    public static boolean isPalindrome(int number, int reverseInput) {
        int reversed = reverse(number);
        return reversed == reverseInput;
    }
}

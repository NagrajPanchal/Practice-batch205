// Check Whether an Alphabet is Vowel or Consonant

package com.bridgelabz.basiccore;
import java.util.Scanner;
public class AlphabetVowelConsonant
{
    static void alphabet()
    {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter any Charctore : ");
            char c = scanner.next().charAt(0);
            if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
    }
    public static void main(String[] args)
    {
        alphabet();
    }
}

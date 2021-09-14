/*
 *  UCF COP3330 Fall 2021 Assignment 24 Solution
 *  Copyright 2021 Ihosvany Marquez
 */

package Exercise24;


import java.util.Scanner;
import java.util.Arrays;

public class Solution24
{
    static boolean isAnagram(String str1, String str2)
    {
        String first = str1.replaceAll("\\s", "");
        String second = str2.replaceAll("\\s", "");
        boolean status;

        if (first.length() != second.length())
        {
            status = false;
        }
        else
        {
            char[] ArrayS1 = first.toLowerCase().toCharArray();
            char[] ArrayS2 = second.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }
        return status;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");

        System.out.println("Enter the first string: ");
        String word1 = scan.nextLine();

        System.out.println("Enter the second string: ");
        String word2 = scan.nextLine();

        if (isAnagram(word1, word2))
            System.out.println(word1 + " and " + word2 + " are anagrams");
        else
            System.out.println(word2 + " and " + word2 + " are not anagrams");

    }
}

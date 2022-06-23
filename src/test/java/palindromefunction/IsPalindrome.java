package palindromefunction;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IsPalindrome {


    public static Boolean isPalindrome(String str) {

        str = str.replaceAll("\\s", "");

        if (str.length() < 3) {
            System.out.println("String is too short");
            return false;
        }

        String reversed = "".toLowerCase();

        for (int i = str.length() - 1; i >= 0; i--) {

            reversed += str.charAt(i);

        }

            if (str.toLowerCase().equalsIgnoreCase(reversed)) {
                System.out.println("The String is a Palindrome");
                return true;
            } else {
                System.err.println("The String is not a Palindrome");
                return false;
            }


    }


    public static void isPalindrome(ArrayList<String> stringList) {
        String reversed = "".toLowerCase();

        if (stringList.size() < 1){
            throw new RuntimeException("List is empty");
        }

        for (String each : stringList) {

            each = each.replaceAll("\\s", "");

            if (each.length() < 3) {
                System.err.println("String is too short");
                continue;

            }


            for (int i = each.length() - 1; i >= 0; i--) {

                reversed += each.charAt(i) ;

            }


                if (each.toLowerCase().equalsIgnoreCase(reversed)) {
                    System.out.println("The String is a Palindrome");

                } else {
                    System.err.println("The String is not a Palindrome");

                }

                reversed = "";

            }
        }

    public static void isPalindrome(String [] arr) {
        String reversed = "".toLowerCase();

        if (arr.length < 1){
            throw new RuntimeException("Array is empty");
        }

        for (String each : arr) {

            each = each.replaceAll("\\s", "");

            if (each.length() < 3) {
                System.err.println("String is too short");
                  continue;
            }


            for (int i = each.length() - 1; i >= 0; i--) {

                reversed += each.charAt(i);

            }


            if (each.toLowerCase().equalsIgnoreCase(reversed)) {
                System.out.println("The String is a Palindrome");

            } else {
                System.err.println("The String is not a Palindrome");

            }

            reversed = "";

        }
    }

    }


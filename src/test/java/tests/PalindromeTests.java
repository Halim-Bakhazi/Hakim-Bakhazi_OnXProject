package tests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import palindromefunction.IsPalindrome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromeTests extends IsPalindrome {



    @Test(priority = 0)
    public void simpleValidPalindromeStringTest(){

        isPalindrome("  C  iv  ic  ");

    }

    @Test(priority = 1)
    public void simpleInvalidPalindromeStringTest(){

       isPalindrome("He alt h");

    }

    @Test(priority = 2)
    public void simpleInvalidLengthPalindromeStringTest(){

        isPalindrome("H   e   ");

    }

    @Test(priority = 3)
    public void simpleValidPalindromeStringSentenceTest(){

        isPalindrome("Too hot to hoot");

    }

    @Test(priority = 4)
    public void listOfStringPalindromeTest(){

        ArrayList<String> list = new ArrayList<>(Arrays.asList("R O T O R", "MobILE","HA  ", "","HAHAH"));

         isPalindrome(list);


    }

    @Test(priority = 5)

    public void arrayOfStringPalindromeTest(){

        String[] arr = {"Race CAR", "HEllo", "I", "YAY", "TELeVisi on"};

        isPalindrome(arr);


    }


}

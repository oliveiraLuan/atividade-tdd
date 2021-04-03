package com.example.palindrome.model;

import com.example.palindrome.utils.PalindromeChecker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PalindromeTest {
    @Test
    void testWordsAndPhrases(){
        assertEquals(true, PalindromeChecker.isPalindrome("rotator"));
        assertEquals(true, PalindromeChecker.isPalindrome("bob"));
        assertEquals(true, PalindromeChecker.isPalindrome("madam"));
        assertEquals(true, PalindromeChecker.isPalindrome("mAlAyAlam"));
        assertEquals(true, PalindromeChecker.isPalindrome("1"));
        assertEquals(true, PalindromeChecker.isPalindrome("Able was I, ere I saw Elba"));
        assertEquals(true, PalindromeChecker.isPalindrome("Madam I’m Adam"));
        assertEquals(true, PalindromeChecker.isPalindrome("Step on no pets"));
        assertEquals(true, PalindromeChecker.isPalindrome("Top spot!"));

        assertEquals(false, PalindromeChecker.isPalindrome("xyz"));
        assertEquals(false, PalindromeChecker.isPalindrome("elephant"));
        assertEquals(false, PalindromeChecker.isPalindrome("Country"));
        assertEquals(false, PalindromeChecker.isPalindrome("Top . post!"));
        assertEquals(false, PalindromeChecker.isPalindrome("Wonderful-fool"));
        assertEquals(false, PalindromeChecker.isPalindrome("Wild imagination!"));
    }
    @Test
    void testPalindromeFailureNullArgument(){
        assertThrows(NullPointerException.class, () -> {
           PalindromeChecker.isPalindrome(null);
        });
    }
}

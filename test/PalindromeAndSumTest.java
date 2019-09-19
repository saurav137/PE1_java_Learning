package test;

import com.company.*;
import org.junit.*;

import static org.junit.Assert.*;

public class PalindromeAndSumTest {
    private static PalindromeAndSum palindromeAndSum=new PalindromeAndSum();
    private static TomAndJerry tomAndJerry= new TomAndJerry();
    private static CharacterCheck characterCheck= new CharacterCheck();
    private static ConsonantAndVowel consonantAndVowel = new ConsonantAndVowel();
    private static Pattern pattern = new Pattern();

      // private PalindromeAndSum palindromeAndSum= new PalindromeAndSum();

    @Test
        public void Palindrome(){
           // private PalindromeAndSum palindromeAndSum= new PalindromeAndSum();
            String result=palindromeAndSum.func("121");
            assertEquals("121 is Palindrome and sum of even numbers is not greater than 25",result);

          String result2=palindromeAndSum.func(null);
            assertNotNull("Null Value",result2);

            String result3=palindromeAndSum.func("12345678900987654321");
            assertEquals("12345678900987654321 is Palindrome and sum of even numbers is greater than 25",result3);

            String result4=palindromeAndSum.func("wert567");
        assertEquals("Not a Valid number",result4);
        }

        @Test
        public void Tom_Jerry(){
            String result=tomAndJerry.solve(24);
            assertEquals("Jerry",result);
        }
        @Test
         public void Character_check(){
            String result=characterCheck.solve('A');
            assertEquals("Character is a Capital letter",result);
        }
    @Test
    public void Vowel_Consonant(){
        String result=consonantAndVowel.ConsonantAndVowel("werty");
        assertEquals("ConsonantVowelConsonantConsonantConsonant",result);
    }

    @Test
    public void solve_Pattern(){
        String result=pattern.solve_Pattern(5);
        assertEquals("122333444455555",result);
    }
}
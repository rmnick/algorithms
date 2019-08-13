package ru.chubaka;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Tests {
    @Test
    public void reverseIntegerTest() {
        ReverseInteger ri = new ReverseInteger();
        assertThat(ri.reverse(123), is(321));
        assertThat(ri.reverse(-123), is(-321));
    }

    @Test
    public void palindromNumberTest() {
        PalindromNumber pn = new PalindromNumber();
        assertThat(pn.isPalindrome(12321), is(true));
        assertThat(pn.isPalindrome(123421), is(false));
        assertThat(pn.isPalindromeUseChar(12321), is(true));
        assertThat(pn.isPalindromeUseChar(123421), is(false));
    }

    @Test
    public void romanToIntegerTest() {
        RomanToInteger rti = new RomanToInteger();
        assertThat(rti.romanToInt("III"), is(3));
        assertThat(rti.romanToInt("XXIV"), is(24));
    }

    @Test
    public void longestCommonPrefix() {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        assertThat(lcp.longestCommonPrefix(new String[]{"flower", "flow", "flight"}), is("fl"));
        assertThat(lcp.longestCommonPrefix(new String[]{"abca","aba","aaab"}), is("a"));
    }

}

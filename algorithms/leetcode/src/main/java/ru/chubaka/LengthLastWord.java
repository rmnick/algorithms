package ru.chubaka;

public class LengthLastWord {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        if (arr.length == 0 || arr[arr.length - 1].equals("")) {
            return 0;
        }
        char[] cArr = arr[arr.length - 1].toCharArray();
        int n = 0;
        for (char c : cArr) {
            n++;
        }
        return n;
    }
}

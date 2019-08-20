package ru.chubaka;

public class AddBinary {

    public String addBinary(String a, String b) {
        char[] acs = a.toCharArray();
        char[] bcs = b.toCharArray();
        char[] ans = new char[Math.max(acs.length, bcs.length)];
        int flag = 0;
        for (int i = acs.length - 1, j = bcs.length - 1, n = ans.length - 1;
             i >= 0 || j >= 0;
             i--, j--, n--) {
            char ac = i < 0 ? '0' : acs[i];
            char bc = j < 0 ? '0' : bcs[j];
            ans[n] = (char) (ac + bc + flag - '0');
            if (ans[n] > '1') {
                flag = 1;
                ans[n] -= 2;
            } else {
                flag = 0;
            }
        }
        String ansStr = new String(ans);
        return flag > 0 ? "1" + ansStr : ansStr;
    }
}

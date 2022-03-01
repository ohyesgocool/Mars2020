package strings;

//https://leetcode.com/problems/reverse-string/
public class ReverseString {
    public void reverseString(char[] s) {
        char hold = 0;
        int len = s.length;
        if (len == 0) return;
        else if (len == 1) return;
        for (int i = 0; i < (len / 2); i++) {
            hold = s[i];
            s[i] = s[len - 1 - i];
            s[len - 1 - i] = hold;
        }

    }
}

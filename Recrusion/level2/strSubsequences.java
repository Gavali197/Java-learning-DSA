package Recrusion.level2;

public class strSubsequences {

    public static void Subsequence(String str, String newString, int idx) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);

        //if want to be
        Subsequence(str, newString + currChar, idx + 1);
        //not to be
        Subsequence(str, newString, idx + 1);
    }

    public static void main(String[] args) {

        String str = "abc";

        Subsequence(str, "", 0);
    }
}

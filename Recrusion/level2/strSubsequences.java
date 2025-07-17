package Recrusion.level2;

public class strSubsequences {

    //mobile key pad matching combination quetion quetion 
    public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printCombo(String newString, String str, int idx) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        String mappinng = keypad[currChar - '0'];

        for (int i = 0; i < mappinng.length(); i++) {
            printCombo(newString + mappinng.charAt(i), str, idx + 1);
        }
    }

    //subsequence of all char
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

        String str = "23";
        printCombo("", str, 0);
        // Subsequence(str, "", 0);
    }
}

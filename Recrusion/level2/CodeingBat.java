package Recrusion.level2;

public class CodeingBat {

// QUETION 1 COUNT X 
// Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
// countX("xxhixx") → 4
// countX("xhixhix") → 3
// countX("hi") → 0
    //sovle my hand other logic 
    public static void xCount(int idx, int count, String str) {
        if (idx == str.length()) {
            System.out.println(count);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == 'x') {
            count++;
        }
        xCount(idx + 1, count, str);
    }

    //try to use diffrents things
    public int countX(String str) {

        if (str.length() == 0) {
            return 0;
        }
        int count = countX(str.substring(1));

        if (str.charAt(0) == 'x') {
            count++;
        }

        return count;

    }

// QUETION 2 COUNT WORD(HI)
// Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
// countHi("xxhixx") → 1
// countHi("xhixhix") → 2
// countHi("hi") → 1
    public static int countHi(String str) {
        // Base case: if the string is too short to contain "hi"
        if (str.length() < 2) {
            return 0;
        }
// If the first two characters are "hi"
        if (str.substring(0, 2).equals("hi")) {
            return 1 + countHi(str.substring(2));   // Move ahead by 2 to avoid overlap
        } else {
            return countHi(str.substring(1));   // Move ahead by 1
        }

    }

    public static void main(String[] args) {
        String str = "xhibcvemhi";
        int result = countHi(str);
        System.out.println(result);
    }
}

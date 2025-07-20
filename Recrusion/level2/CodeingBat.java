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

    //same code try use for loop
    public static void countXusefor() {
        String str = "xhibcvemhi";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                count++;
            }
        }
        System.out.println(count);
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

// QUETION 3 CHANGE XY IN STRING
// Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.
// changeXY("codex") → "codey"
// changeXY("xxhixx") → "yyhiyy"
// changeXY("xhixhix") → "yhiyhiy"
    public String changeXY(String str) {
        if (str.length() == 0) {
            return "";
        }
        char currChar = str.charAt(0);
        if (currChar == 'x') {
            return 'y' + changeXY(str.substring(1));
        } else {
            return currChar + changeXY(str.substring(1));
        }
    }

// QUETION 4 CHANGE PI 
//Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".
// changePi("xpix") → "x3.14x"
// changePi("pipi") → "3.143.14"
// changePi("pip") → "3.14p"
    public static String changePi(String str) {
        if (str.length() < 2) {
            return str;
        }
        if (str.substring(0, 2).equals("pi")) {
            return "3.14" + changePi(str.substring(2));
        }
        return str.charAt(0) + changePi(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(changePi("abpigh"));
    }
}

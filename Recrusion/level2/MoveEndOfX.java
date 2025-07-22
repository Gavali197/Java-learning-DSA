package Recrusion.level2;

public class MoveEndOfX {

    public static void xMove(String newString, String str, int idx, int count) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == 'x') {
            count++;
            xMove(newString, str, idx + 1, count);
        } else {
            newString += currChar;
            xMove(newString, str, idx + 1, count);
        }
    }

    public static void main(String[] args) {
        String str = "abxxcdxxexfjiax";
        xMove("", str, 0, 0);
    }
}

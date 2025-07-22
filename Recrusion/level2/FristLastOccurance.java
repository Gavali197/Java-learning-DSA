package Recrusion.level2;

public class FristLastOccurance {

    public static int Frist = -1;
    public static int Last = -1;

    public static void fristOccurance(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println(Frist);
            System.out.println(Last);
            return;
        }
        char curr = str.charAt(idx);
        if (curr == element) {
            if (Frist == -1) {
                Frist = idx;
            } else {
                Last = idx;
            }
        }
        fristOccurance(str, idx + 1, element);
    }

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        fristOccurance(str, 0, 'a');
    }
}

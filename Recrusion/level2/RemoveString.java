package Recrusion.level2;

public class RemoveString {

    public static boolean map[] = new boolean[26];

    public static void removeDublicate(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a']) {
            removeDublicate(str, idx + 1, newString);
        } else {
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDublicate(str, idx + 1, newString);
        }
    }

    public static void main(String[] args) {
        String str = "abbccda";
        removeDublicate(str, 0, "");
    }
}

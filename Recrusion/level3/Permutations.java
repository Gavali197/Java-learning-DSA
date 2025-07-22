package Recrusion.level3;

public class Permutations {

    //permutation mean collection of the string like "abc" -> abc, acb, cba, cab, bac, bca
    public static void permu(String str, String permutation) {
        // base class
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + 1);
            permu(newstr, permutation + currChar);
        }
    }


    public static void main(String[] args) {
        permu("abc", "");
    }
}

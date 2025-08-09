public class Backtracking {
    //analysis backtracking
    public static void backtrack(String str, String permu, int idx){
        if(str.length() == 0){
            System.out.println(permu);
            return;
        }

        for(int i =0; i < str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            backtrack(newStr, permu+ currChar, idx +1);
        }
    }
    public static void main(String[] args) {
        backtrack("abc", "", 0);
    }
}
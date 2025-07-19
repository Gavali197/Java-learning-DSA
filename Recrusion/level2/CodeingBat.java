package Recrusion.level2;

public class CodeingBat {

// QUETION 1 COUNT X 


// Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.


// countX("xxhixx") → 4
// countX("xhixhix") → 3
// countX("hi") → 0

    //sovle my hand other logic 
    public static void xCount(int idx, int count, String str){
        if(idx == str.length()){
            System.out.println(count);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
        }
        xCount(idx+1, count, str);
    }

    public static void main(String[] args) {
        String str = "xxxabcxx";
        xCount(0, 0, str);
    }
} 

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






    // QUETION 5 remove X (no X)
// Given a string, compute recursively a new string where all the 'x' chars have been removed.
// noX("xaxb") → "ab"
// noX("abc") → "abc"
// noX("xx") → ""
    public String noX(String str) {
        if (str.isEmpty()) {
            return "";
        }
        char currChar = str.charAt(0);
        if (currChar == 'x') {
            return noX(str.substring(1));
        } else {
            return currChar + noX(str.substring(1));
        }
    }







    // QUETION 6 FIND IN ARRAY 6 
// Given an array of ints, compute recursively if the array contains a 6. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
// array6([1, 6, 4], 0) → true
// array6([1, 4], 0) → false
// array6([6], 0) → true
    public boolean array6(int[] nums, int index) {
        // Base case: If index goes past the array length, 6 not found
        if (index >= nums.length) {
            return false;
        }

        // If current element is 6, return true
        if (nums[index] == 6) {
            return true;
        }

        // Recurse on the next index
        return array6(nums, index + 1);
    }





    // QUETION 7 COUNT 11 HOW MANY TIME ARRAY COUNT 
// Given an array of ints, compute recursively the number of times that the value 11 appears in the array. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
// array11([1, 2, 11], 0) → 1
// array11([11, 11], 0) → 2
// array11([1, 2, 3, 4], 0) → 0
    public int array11(int[] nums, int index) {
        if (index >= nums.length) {
            return 0;
        }
        int count = 0;
        if (nums[index] == 11) {
            count++;
        }
        return count + array11(nums, index + 1);
    }

    // SAME QUETION SOVLE WITH OUT COUNT VERIABLE 
    public int array11Count(int[] nums, int index) {
        if (index >= nums.length) {
            return 0;
        }

        if (nums[index] == 11) {
            return 1 + array11(nums, index + 1);
        } else {
            return array11(nums, index + 1);
        }
    }








    // QUETION 7 ARRAY 220
    
// Given an array of ints, compute recursively if the array contains somewhere a value followed in the array by that value times 10. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
// array220([1, 2, 20], 0) → true
// array220([3, 30], 0) → true
// array220([3], 0) → false

    public boolean array220(int[] nums, int index) {
  if(index >= nums.length - 1){
        return false;
      }

        if(nums[index+1] == nums[index] * 10){
            return true; 
        }else{
            return array220(nums, index + 1);
        }
}








//QUETION 8 ALLSTAR
// Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".


// allStar("hello") → "h*e*l*l*o"
// allStar("abc") → "a*b*c"
// allStar("ab") → "a*b"


    public String allStar(String str) {
  if(str.length() <= 1){
    return str;
  }
  return str.charAt(0) + "*" + allStar(str.substring(1));
}






// QUETION 9 PAIR STAR
    
// Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
// pairStar("hello") → "hel*lo"
// pairStar("xxyy") → "x*xy*y"
// pairStar("aaaa") → "a*a*a*a"

    public String pairStar(String str) {
  if(str.length() <= 1){
    return str;
  }
  if (str.charAt(0) == str.charAt(1)) {
    return str.charAt(0) + "*" + pairStar(str.substring(1));
  } else {
    return str.charAt(0) + pairStar(str.substring(1));
  }
  }




// QUETION 10 MOVE X END
  
// Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.
// endX("xxre") → "rexx"
// endX("xxhixx") → "hixxxx"
// endX("xhixhix") → "hihixxx"


public String endX(String str) {
  if(str.length() <= 1){
    return str;
  }
  char frist = str.charAt(0);
  String rest = endX(str.substring(1));
  if(frist == 'x'){
    return rest + 'x';
  }else{
    return frist + rest;
  }
}




// QUETION 11 COUNT PAIRS

// We'll say that a "pair" in a string is two instances of a char separated by a char. So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. Recursively compute the number of pairs in the given string.
// countPairs("axa") → 1
// countPairs("axax") → 2
// countPairs("axbx") → 1


public int countPairs(String str) {
    if(str.length() < 3){
        return 0;
    }
    if(str.charAt(0) == str.charAt(2)){
    return 1 + countPairs(str.substring(1));
    }else{
    return countPairs(str.substring(1));
  }
}





// Count recursively the total number of "abc" and "aba" substrings that appear in the given string.
// countAbc("abc") → 1
// countAbc("abcxxabc") → 2
// countAbc("abaxxaba") → 2


    public int countAbc(String str) {
        if(str.length() < 3){
            return 0;
        }
       String sub = str.substring(0,3);
       if(sub.equals("abc") || sub.equals("aba")){
        return 1 + countAbc(str.substring(1));
       }else{
        return countAbc(str.substring(1));
       }
    }



    
// Given a string, compute recursively (no loops) the number of "11" substrings in the string. The "11" substrings should not overlap.


// count11("11abc11") → 2
// count11("abc11x11x11") → 3
// count11("111") → 1


    public int count11(String str) {
  if(str.length() < 2){
    return 0;
  }
  if(str.substring(0, 2).equals("11")){
    return 1 + count11(str.substring(2));
  }else{
    return count11(str.substring(1));
  }
}




    public static void main(String[] args) {

    }
}

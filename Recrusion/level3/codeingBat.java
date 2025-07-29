package Recrusion.level3;

public class codeingBat {

// Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target?
    //This is a classic backtracking recursion problem. Once you understand the recursive backtracking strategy in this problem, you 
// can use the same pattern for many problems to search a space of choices. Rather than looking at the whole array, our convention 
    //is to consider the part of the array starting at index start and continuing to the end of the array. The caller can specify the 
    //whole array simply by passing start as 0. No loops are needed -- the recursive calls progress down the array.
    // groupSum(0, [2, 4, 8], 10) → true
// groupSum(0, [2, 4, 8], 14) → true
// groupSum(0, [2, 4, 8], 9) → false
    public boolean groupSum(int start, int[] nums, int target) {
        if (start == nums.length) {
            return target == 0;
        }

        if (groupSum(start + 1, nums, target - nums[start])) {
            return true;
        }

        if (groupSum(start + 1, nums, target)) {
            return true;
        }

        return false;
    }


    
    // Given an array of ints, is it possible to choose a group of some of the ints, beginning at the start index, 
    // such that the group sums to the given target?
    // However, with the additional constraint that all 6's must be chosen. (No loops needed.)
    // groupSum6(0, [5, 6, 2], 8) → true
    // groupSum6(0, [5, 6, 2], 9) → false
    // groupSum6(0, [5, 6, 2], 7) → false


    public boolean groupSum6(int start, int[] nums, int target) {
      
       // ✅ Base case: If we've gone through all elements
    if (start == nums.length) {
        return target == 0;
    }

    // ✅ If current number is 6, we must include it
    if (nums[start] == 6) {
        return groupSum6(start + 1, nums, target - nums[start]);
    }
      
        if(groupSum6(start+ 1, nums, target - nums[start])){
            return true;
        }
        if(groupSum6(start + 1, nums, target)){
            return true;
        }

        return false;
    }



    
// Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target with this additional constraint: If a value in the array is chosen to be in the group, the value immediately following it in the array must not be chosen. (No loops needed.)


// groupNoAdj(0, [2, 5, 10, 4], 12) → true
// groupNoAdj(0, [2, 5, 10, 4], 14) → false
// groupNoAdj(0, [2, 5, 10, 4], 7) → false

    public boolean groupNoAdj(int start, int[] nums, int target) {
    
    // If the target becomes 0, a valid group is found
    if (target == 0) {
        return true;
    }

    // If we've gone past the array, check if target is exactly 0
    if (start >= nums.length) {
        return target == 0;
    }

    // Choice 1: Include nums[start], skip next (i.e., move to start + 2)
    if (groupNoAdj(start + 2, nums, target - nums[start])) {
        return true;
    }

    // Choice 2: Skip nums[start], move to next (i.e., start + 1)
    if (groupNoAdj(start + 1, nums, target)) {
        return true;
    }

    // If neither choice leads to target, return false
    return false;
}


    public static void main(String[] args) {

    }
}

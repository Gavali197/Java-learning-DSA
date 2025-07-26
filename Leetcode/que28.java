package Leetcode;

public class que28 {
    // 28. Find the Index of the First Occurrence in a String

    public int strStr(String haystack, String needle) {
        return helper(haystack, needle, 0);
    }

    public static int helper(String haystack, String needle, int index) {
        if (haystack.length() < needle.length()) {
            return -1;
        }
        if (haystack.startsWith(needle)) {
            return index;
        } else {
            return helper(haystack.substring(1), needle, index + 1);
        }
    }
}

// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
// Example 1:
// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.
// Example 2:
// Input: haystack = "leetcode", needle = "leeto"
// Output: -1
// Explanation: "leeto" did not occur in "leetcode", so we return -1.


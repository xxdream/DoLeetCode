package com.update.easy._344;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

    }
    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = chars.length-1; i >=0; i--) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }

}
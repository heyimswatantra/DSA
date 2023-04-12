package LEETCODE;
import java.util.*;

public class longestCommonSubsequenceWithoutRepeating {
    public static int lcs(String s){
        int ans = 0;
        int i = 0, j = 0;
        int n = s.length();

        HashSet<Character> set = new HashSet<>();

        while (i < n && j < n){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j-i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lcs(s));

//        HashSet<Character> newSet = new HashSet<>();
//        newSet.add('p');
//        newSet.add('w');
//        System.out.println(newSet);
//        newSet.remove('w');
//        System.out.println(newSet.contains('w'));
    }
}

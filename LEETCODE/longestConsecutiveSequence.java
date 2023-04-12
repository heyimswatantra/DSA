package LEETCODE;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class longestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {100,4,200,1,2,3};

        System.out.println(longestConsecutive(arr));

    }
    public  static int longestConsecutive(int[] nums){
        Set<Integer> hashSet = new HashSet<>();

        int longestSequence = 0;
        for(int n : nums){
            hashSet.add(n);
        }

        for(int n : nums){
            if(!hashSet.contains(n-1)){
                int lengthOfSeq = 0;
                while (hashSet.contains(n + lengthOfSeq)){
                    lengthOfSeq++;
                }
                longestSequence = Math.max(longestSequence, lengthOfSeq);
            }
        }
        return longestSequence;
    }
    }


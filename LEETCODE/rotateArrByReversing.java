package LEETCODE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class rotateArrByReversing {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;

        List< Integer > numbers = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            numbers.add(nums[i]);
        }
        System.out.println( numbers );
 	    Collections.reverse(numbers.subList( 0 , numbers.size()-1 ));
        Collections.reverse(numbers.subList( 0 , + k ));
        Collections.reverse(numbers.subList( 0 + k, numbers.size()-1 ));



//        Collections.reverse(Array);

//        reverse(nums.begin(),nums.end());
//        reverse(nums.begin(),nums.begin()+k);
//        reverse(nums.begin()+k,nums.end());
        System.out.println(numbers);
    }

    public static void main(String[] args) {
                int[] nums = {1,2,3,4,5,6,7};
                rotate(nums, 2);
    }
}

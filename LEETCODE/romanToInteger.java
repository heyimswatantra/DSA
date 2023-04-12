package LEETCODE;

import java.util.HashMap;
import java.util.Map;

public class romanToInteger {
    public static void main(String args[]){
        String s = "LIV";
//        for (int i = 0; i<s.length(); i++){
//            char c = s.charAt(i);
//            switch (c){
//                case 'L' :
//                    val += 50;
//                    break;
//                case 'V' :
//                    val += 5;
//                    break;
//                case 'I' :
//                    val += 1;
//                    break;
//                case 'C' :
//                    val += 100;
//                    break;
//                default:
//                    System.out.println("invalid symbol");
//                    return;
//            }
//        }
        int val = 0;
        Map<Character, Integer> map = new HashMap<Character,Integer>();
        map.put('I', 1);
        map.put('L', 50);
        map.put('V', 5);
        map.put('C', 100);
        map.put('X', 10);
        map.put('D',500);
        map.put('M', 1000);
        s=s.replace("IV" ,"IIII");
        s=s.replace("IX", "VIIII");
        s=s.replace("XL", "XXXX");
        s=s.replace("XC", "LXXXX");
        s=s.replace("CD", "CCCC");
        s=s.replace("CM", "DCCCC");

        for (int i = 0; i < s.length(); i++) {
            val = val + (map.get(s.charAt(i)));
        }

    }
}

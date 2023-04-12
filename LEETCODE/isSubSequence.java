package LEETCODE;

import java.util.HashMap;

public class isSubSequence {
    public static boolean isSubsequence(String s, String t) {
        int i = 0 , j = 0;

        char [] ss = s.toCharArray();
        char [] tt = t.toCharArray();

        if(s.length() < 1)return false;

        while (i<t.length()){
            if(tt[i] == ss[j]){
                j++;
            }
            i++;
            if(j==s.length())return true;
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
    }

}


//
//    int i=0,j=0;
//    int n=t.length()
//    int m=s.length();
//    char ss[]=s.toCharArray();
//    char tt[]=t.toCharArray();
//    if(m<1)
//        return true;
//        while(i<n){
//        if(tt[i]==ss[j]){
//        j++;
//        }
//        i++;
//        if(j==m)
//        return true;
//        }
//        return false;
//        }

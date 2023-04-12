package LEETCODE;
import java.util.ArrayList;
import java.util.List;



public class palindromePartitioning {

    public static List<List<String>> partition(String s){
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        func(0, s, path, res);
        return res;
    }
    static void func(int indx, String s, List<String> path, List<List<String>> res){
        if(indx == s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = indx; i < s.length(); ++i){
            if(isPalindrome(s, indx, i)){
                path.add(s.substring(indx, i+1));
                func(i+1, s, path, res);
                path.remove(path.size() - 1);
            }
        }
    }
    static boolean isPalindrome(String s, int start, int end){
        while(start <= end){
            if(s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }

    public static void main(String arg[]){
        String s = "abb";
        System.out.print(partition(s));

    }
}

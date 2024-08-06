import java.util.HashMap;

public class isomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {
        int[] ss = new int[256];
        int[] tt = new int[256];

        for (int i = 0; i < s.length(); i++) {
            if(ss[s.charAt(i)] != tt[t.charAt(i)]) return false;

            ss[s.charAt(i)] = i+1;
            tt[t.charAt(i)] = i+1;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("eg", "dd"));
    }
}

public class addBinary {
    public static void main(String[] args) {
        System.out.println(findDiff("abcde", "abcd"));
    }
    public static String addBinary(String a, String b) {
        int n = 0;
        int carry = 0;
        String res = "";
        boolean flag = true;
        if (a.length() > b.length()) {
            n = a.length();
            for (int i = 0; i < n - b.length(); i++) {
                res += "0";
            }
            res += b;
        } else {
            flag = false;
            n = b.length();
            for (int i = 0; i < n - a.length(); i++) {
                res += "0";
            }
            res += a;
        }

        if (flag) b = res;
        else a = res;
        res = "";

        for (int i = n - 1; i >= 0; i--) {
            if (a.charAt(i) == '1' && b.charAt(i) == '1') {
                if (carry == 1) {
                    res = "1" + res;
                    carry = 1;
                } else {
                    res = "0" + res;
                    carry = 1;
                }
            } else if (a.charAt(i) == '0' && b.charAt(i) == '0') {
                if (carry == 1) {
                    res = "1" + res;
                    carry = 0;
                } else {
                    res = "0" + res;
                }
            } else {
                if (carry == 1) {
                    res = "0" + res;
                    carry = 1;
                }
                else {
                    res = "1" + res;
                }
            }
        }
        if(carry == 1) res = "1" + res;
        return res;

    }
    public static int titleToNumber(String columnTitle) {
        int n = columnTitle.length();
        int res = 0;
        int j = 0;
        for (int i = n-1; i >= 0; i--) {
            int x = columnTitle.charAt(i) - 'A' + 1;
            res += (int) (Math.pow(26, j++) * x);
        }
        return res;
    }
    public static String convertToTitle(int columnNumber) {
        String res = "";

        while (columnNumber >= 26) {
            int n = (columnNumber/26);
            char ch = (char)(n+64);

            res = res + ch;
            columnNumber = columnNumber % 26;
        }

        if (columnNumber > 0) columnNumber += 64;
        return res = res + ((char) columnNumber);
    }
    public static String cnt(int columnNumber) {
        int col = columnNumber;
        String res = "";

        while(col > 26) {
            int n = (col % 26) + 64;
            if (col % 26 == 0) { col /= 26; n = 90; }

            char character = (char) n;
            res = character + res;
            col /= 26;
        }
        col += 65;
        res = (char) col + res;
        return res;
    }

    public static char findDiff(String s, String t) {
        int[] arr = new int[26];

        int j = 0;
        for (int i = 0; i < t.length(); i++) {
            j = Math.abs(97 - t.charAt(i));
            arr[j]++;

            j = Math.abs(97 - s.charAt(i));
            arr[j]--;

        }
        System.out.println(arr[4]);

        int idx = Math.abs(97 - s.charAt(s.length()-1));
        arr[idx]--;

        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (arr[i] < 0) {
                res = i + 97;
                break;
            }
        }
        return (char) res;
    }
}

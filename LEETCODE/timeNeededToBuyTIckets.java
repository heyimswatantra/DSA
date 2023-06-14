package LEETCODE;
import java.util.*;

public class timeNeededToBuyTIckets {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> queue = new LinkedList<>();
        int ans = 0;
        for(int i = 0; i < tickets.length; i++) queue.add(i);

        while(!queue.isEmpty()){
            int index = queue.poll();
            tickets[index]--;
            ans++;
            if(tickets[index] == 0 && index == k) return ans;

            if(tickets[index] > 0) queue.add(index);
        }
        return ans;
//        int a = 0;
//        int cnt = 0;
//        while (tickets[a++] >= 1) {
//            for (int i = 0; i < tickets.length; i++) {
//                if (tickets[i] >= 1) tickets[i] -= 1;
//                cnt++;
//            }
//        }
//        return cnt;
    }

    public static void main(String[] args) {
        int[] t = {5,1,1,1};
        System.out.println(timeRequiredToBuy(t, 0));
    }
}

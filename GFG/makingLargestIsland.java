import java.util.HashMap;
import java.util.HashSet;

public class makingLargestIsland {

    static HashMap<Integer, Integer> hm = new HashMap<>();

    public int largestIsland(int n, int[][] grid) {
        // code here
        // first dfs traversal to all the nodes and marking with names
        int name = 2;
        boolean vis[][] = new boolean[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (grid[i][j]==1 && !vis[i][j]) {
                    int count = dfs(i,j,grid,vis,name,n);
                    hm.put(name++,count);
                }
            }
        }

        // if we encounter any zero then check its four directions for islands and
        // check for adjacent islands and sum up their counts;
        int ans = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (grid[i][j] == 0) {

                    int d = (i+1<n) ? grid[i+1][j] : 0;
                    int u = (i-1>=0) ? grid[i-1][j] : 0;
                    int r = (j+1<n) ? grid[i][j+1] : 0;
                    int l = (j-1>=0) ? grid[i][j-1] : 0;

                    HashSet<Integer> set = new HashSet<>();
                    set.add(d); set.add(u); set.add(r); set.add(l);
                    int res = 1;
                    //adding the no. of islands
                    for (int val : set) {
                        res = res + hm.getOrDefault(val,0);
                    }
                    ans = Math.max(ans, res);
                }
            }
        }

        //if no zero is found in the matrix, then return size of grid (n^2)
        if (ans == 0) return n*n;
        return ans;
    }



    static int dfs(int i, int j, int[][] grid, boolean[][] vis, int name, int n) {
        if (i<0 || j<0 || i>=n || j>=n || grid[i][j] == 0 || vis[i][j]) return 0;
        vis[i][j] = true;
        grid[i][j] = name;

        //up -1 0  right 0 +1 down +1 0 left 0 -1
        int count = 1 + dfs(i+1, j, grid, vis, name, n)
                + dfs(i-1, j, grid, vis, name, n)
                + dfs(i, j+1, grid, vis, name, n)
                + dfs(i, j-1, grid, vis, name, n);
        return count;
    }
}

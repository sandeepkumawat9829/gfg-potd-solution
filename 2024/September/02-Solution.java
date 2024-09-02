class Solution {
    static class Cell implements Comparable<Cell> {
        int x;
        int y;
        int distance;
        Cell(int x,int y,int distance) {
            this.x=x;
            this.y=y;
            this.distance=distance;
        }

        public int compareTo(Cell other) {
            return Integer.compare(this.distance, other.distance);
        }
    }
    //Function to return the minimum cost to react at bottom
	//right cell from top left cell.
    public int minimumCostPath(int[][] grid)
    {
        // Code here
        int n=grid.length;
        int m=grid[0].length;
        int[][] dp=new int[n][m];
        for(int[] row:dp){
            Arrays.fill(row,Integer.MAX_VALUE);
        }
        PriorityQueue<Cell> pq=new PriorityQueue<>();
        int[] dx={-1,1,0,0};
        int[] dy={0,0,-1,1};
        dp[0][0]=grid[0][0];
        pq.offer(new Cell(0,0,dp[0][0]));
        while(!pq.isEmpty()){
            Cell cur=pq.poll();
            int x=cur.x;
            int y=cur.y;
            int dist=cur.distance;
            if(dist>dp[x][y]){
                continue;
            }
            for(int i=0;i<4;i++){
                int nx=x+dx[i];
                int ny=y+dy[i];
                if (nx>=0&& nx<n&& ny>=0&& ny<m){
                    int newDist=dp[x][y]+grid[nx][ny];
                    if (newDist<dp[nx][ny]) {
                        dp[nx][ny]=newDist;
                        pq.offer(new Cell(nx,ny,newDist));
                    }
                }
            }
        }
        return dp[n-1][m-1];
    }
}
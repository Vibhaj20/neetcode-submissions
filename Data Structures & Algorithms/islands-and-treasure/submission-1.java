class Solution {
    public void islandsAndTreasure(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==0){
                    dfs(i,j,0,grid);
                }
            }
        }
    }
    void dfs(int i, int j, int dist, int[][] grid){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j] < dist){
            return;
        }
        if(grid[i][j]==-1){
            return;
        }
        grid[i][j] = dist;
        
        dfs(i+1,j,dist+1,grid);
        dfs(i-1,j,dist+1,grid);
        dfs(i,j+1,dist+1,grid);
        dfs(i,j-1,dist+1,grid);
    }
}

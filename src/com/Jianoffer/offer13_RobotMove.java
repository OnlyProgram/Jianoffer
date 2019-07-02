package com.Jianoffer;
/*
机器人从（0,0）出发，不能进入数位之和大于k的格子，例如k=18，不能进入（35,38），因为3+5+3+8 = 19，
可进入（35,37）
 */
public class offer13_RobotMove {
    //求数位和
    private int GetDigitSum(int number){
        int sum = 0;
        while(number>0){
            sum += number%10;
            number /= 10;
        }
        return sum;
    }
    //检查是否能否进入
    private boolean CheckFunc(int forbid,int currow,int curcol,int row,int col,boolean [][] visited){
        if(currow>=0 && currow<row && curcol>=0 && curcol<col && !visited[currow][curcol] && GetDigitSum(curcol)+GetDigitSum(currow)<=forbid){
            //符合条件
            return true;
        }
        return false;
    }
    private int MovingCountCore(int forbid,int currow,int curcol,int row,int col,boolean[][] visited){
        int count = 0;
        //判断是否能移动到这个格子
        if (CheckFunc(forbid,currow,curcol,row,col,visited)){

            visited[currow][curcol] = true;
            count = 1 +
                    MovingCountCore(forbid,currow-1,curcol,row,col,visited) +
                    MovingCountCore(forbid,currow,curcol-1,row,col,visited)+
                    MovingCountCore(forbid,currow+1,curcol,row,col,visited)+
                    MovingCountCore(forbid,currow,curcol+1,row,col,visited);
        }
        return count;
    }
    public int Solution(int forbid,int row,int col){
        if(forbid<0||row<=0||col<0){
            return 0;
        }
        boolean[][] visited = new boolean[row][col];
        for (int i = 0; i < visited.length; i++) {
            for (int j = 0; j < visited[i].length ; j++) {
                visited[i][j] = false;
            }
        }
        int count = MovingCountCore(forbid,0,0,row,col,visited);
        return count;
    }
}

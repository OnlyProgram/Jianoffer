package com.Jianoffer;

/*
矩阵中的路径，设计一函数判断矩阵中是否存在一条包含某字符串所有字符的路径，可以从矩阵中的任意格开始
如果一条路径经过了矩阵的某一格，则该路径不能再次进入该格子
 */
public class offer12_Path_of_matrix {
    public boolean HasPath(char[][] matrix,int row,int col,String str){
        if(row<1||col<1||str==null||matrix==null){
            return false;
        }
        boolean[][] visited = new boolean[row][col];
        for (int i = 0; i < visited.length; i++) {
            for (int j = 0; j < visited[i].length ; j++) {
                visited[i][j] = false;
            }
        }

        int pathLength = 0; //字符串下标
        // 以每一个点为起始进行搜索
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(HaspathCore(matrix,row,col,i,j,str,pathLength,visited)){
                    return true;
                }
            }
        }

        return false;
    }
    private boolean HaspathCore(char[][] matrix,int row,int col,int currow,int curcol,String str,int pathlen,boolean[][] visit){
        if(pathlen==str.length()){
            return true;
        }
        boolean haspath = false;
        if(currow>=0 && currow<row && curcol>=0 && curcol<col && matrix[currow][curcol]==str.charAt(pathlen) && !visit[currow][curcol]){
            ++pathlen;
            visit[currow][curcol] = true;
            haspath = HaspathCore(matrix,row,col,currow,curcol-1,str,pathlen,visit)
                    ||  HaspathCore(matrix,row,col,currow-1,curcol,str,pathlen,visit)
                    || HaspathCore(matrix,row,col,currow,curcol+1,str,pathlen,visit)
                    || HaspathCore(matrix,row,col,currow+1,curcol,str,pathlen,visit);
            if(!haspath){
                --pathlen;
                visit[currow][curcol]=false;
            }
        }
        return haspath;
    }
}

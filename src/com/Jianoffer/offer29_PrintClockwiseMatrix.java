package com.Jianoffer;
/*
实现顺时针打印矩阵
 */
public class offer29_PrintClockwiseMatrix {
    void PrintMatrix(int[][] matrix){
        if(matrix==null||matrix.length==0){
            System.out.println("No Exist");
        }
        int columns = matrix.length;
        int rows = matrix[0].length;
        int start = 0;
        while (start*2<=columns && start*2<=rows){
            CyclePrint(matrix,start);
            start++;
        }
        System.out.println("null");
    }
    //每一圈的输出
    void CyclePrint(int[][] matrix,int start){
        int rows = matrix.length; //行
        int columns = matrix[0].length;//列
        int endx = columns - start ;
        int endy = rows - start;
        //左->右
        for (int i = start; i < endx; i++) {
            System.out.print(matrix[start][i]+"->");
        }
        //上->下  环的高度至少为2，才会输出右边列
        if (rows - start - 1 > start){
            for (int i = start+1; i < endy; i++) {
                System.out.print(matrix[i][endx-1]+"->");
            }
        }
        //右->左 环的高度至少是2并且环的宽度至少是2才会输出下面那一行
        if (rows - start - 1 > start && columns - 1 - start > start){
            for (int i = endx-2; i >= start ; i--) {
                System.out.print(matrix[endy-1][i]+"->");
            }
        }

        //下->上
        // 环的宽度至少是2并且环的高度至少是3才会输出最左边那一列
        // rows-x-1：表示的是环最下的那一行的行号
        if (columns - 1 - start > start && rows - 1 - start > start + 1) {
            for (int i = endy-2; i > start ; i--) {
                System.out.print(matrix[i][start]+"->");
            }
        }
    }
}

package com.Jianoffer.Dp;
/*
剪绳子，将长度为n的绳子剪为m段（m，n 均大于1），使得每段绳子长度的乘积最大
如：n=8,m=3（2,3,3）,此时乘积为18,乘积最大
f(n)代表长度为n，剪为若干段之后的最大乘积
动态规划：f(n) = max(f(i)*f(n-i)) 0<i<n
贪婪算法：当n>=5时，应该尽可能剪长度为3的绳子，当剩下的绳子长度为4 时，应该剪为两个长度为2的绳子
 */
public class offer14_CutRope {
    public int Solution(int n){
        if(n<2){
            return 0;
        }
        if(n==2){
            return 1;
        }
        if(n==3){
            return 2;
        }
        int[] MaxArray = new int[n+1];
        MaxArray[0] = 0;
        MaxArray[1] = 0;
        MaxArray[2] = 1;
        MaxArray[3] = 2;
        int maxProduct = 0;
        for (int i = 4; i <=n ; i++) {
            maxProduct=0;
            for (int j = 0; j <= i/2; j++) {
                int product = MaxArray[j]*MaxArray[i-j];
                if(maxProduct<product){
                    maxProduct = product;
                }
            }
            MaxArray[i] = maxProduct;
        }
        maxProduct = MaxArray[n];
        return maxProduct;
    }
    public int Soution2(int length){
        //贪婪算法
        if (length<2){
            return 0;
        }
        if(length==2){
            return 1;
        }
        if(length==3){
            return 2;
        }
        int numsof3 = length/3;//除3取整
        int temcount = numsof3*3;
        if (length-temcount==1){
            numsof3 -= 1;
        }
        int numsof2 = (length-numsof3*3)/2;
        return (int)(Math.pow(3,numsof3))*(int)(Math.pow(2,numsof2));

    }
}

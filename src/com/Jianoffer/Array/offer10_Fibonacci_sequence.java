package com.Jianoffer.Array;
/*
写一个函数，输入n，求斐波那契（Fibonacci) 数列的第n项
f(n) = 0(n=0) 1(n=1) f(n-1)+f(n-2) n>1
采取从下到上的计算方法
 */
public class offer10_Fibonacci_sequence {
    public long Fibonacci(int n){
        if (n<=0){
            return 0;
        }
        if (n==1||n==2){
            return 1;
        }
        long prepre = 0;//记录前n-2的值
        long pre = 1;  //记录前n-1的值
        long cur = 0;  //当前值
        for (int i = 2; i <= n; i++) {
            cur = prepre + pre;
            prepre = pre;
            pre = cur;
        }
        return cur;
    }
}

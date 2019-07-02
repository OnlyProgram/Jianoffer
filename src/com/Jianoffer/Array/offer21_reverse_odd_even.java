package com.Jianoffer.Array;
/*
Description：实现一个函数，使其能够将一个数组中的奇数位于数组的前半部分
初始思路：开辟两个新数组，然后合并
双指针思路
 */
public class offer21_reverse_odd_even {
    void ReorderOddEven(int[] num){
        if(num==null||num.length==0){
            return;
        }
        int HeadPoint = 0;
        int TailPoint = num.length-1;
        while (HeadPoint<TailPoint){
            //向后移动，直到移动到偶数
            while(HeadPoint<TailPoint&&num[HeadPoint]%2!=0){
                HeadPoint++;

            }
            //向前移动，直到移动到奇数
            while(HeadPoint<TailPoint&&num[TailPoint]%2==0){
                TailPoint--;
            }
            if(HeadPoint<TailPoint){
                int tem = num[HeadPoint];
                num[HeadPoint] = num[TailPoint];
                num[TailPoint] = tem;
            }

        }
    }
}

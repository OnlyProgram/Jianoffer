package com.Jianoffer.Bit_operation;
/*
输入整数，求转换为二进制后1的个数
 */
public class offer15_nums_of1 {
    //输入负数容易死循环
    public int Counts(int n){
        int count = 0;
        while(n!=0){
            int result = n&1;
            if(result==1){
                count += 1;
            }
            n = n>>1;
        }
        return count;
    }
}

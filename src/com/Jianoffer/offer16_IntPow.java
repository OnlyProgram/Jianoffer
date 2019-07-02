package com.Jianoffer;
/*
description：
实现数值的整数次方 ，无需考虑大数，不能调用库函数

优化：
如：16次方是8次方的平方  位运算代替乘除法也能提高效率
 */
public class offer16_IntPow {
    public double Power(double base,int exponent){
        if(Math.abs(base-0)<=1e-6){
            return 0;
        }
        if(exponent==0){
            return 1;
        }
        if(exponent==1){
            return base;
        }
        int posexponnent = Math.abs(exponent);
        double temresult = Power(base,posexponnent-1)*base;
        if(exponent>0){
            return temresult;
        }
        else {
            return 1/temresult;
        }
    }
    public double Pow2(double base,int eponent){
        if(base-0<1e-6){
            return 0;
        }
        if(eponent==0){
            return 1;
        }
        if(eponent==1){
            return base;
        }
        double result = Pow2(base,eponent>>1);
        result *= result;
        int tem = eponent&0x1;
        if(tem ==1){
            result *= base;
        }
        return result;
    }
}

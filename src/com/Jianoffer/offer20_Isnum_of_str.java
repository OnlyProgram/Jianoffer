package com.Jianoffer;
/*
Description：实现一个函数用来判断字符串是否表示数值，字符串“+100”，"5e2"表示数值
"12e","12E+5.4"不表示数值
数值遵循的模式：A[.[B]][e|E C] 或者.B[e|E C]
 */
public class offer20_Isnum_of_str {
    public boolean IsNumber(String str){
        if(str==null){
            return false;
        }
        int index = 0;
        //扫描第一个是否为+ 或者 -
        if (str.charAt(index) == '+' || str.charAt(index) == '-') {
            index++;
        }
        // 已经到达字符串的末尾了
        if (index >= str.length()) {
            return false;
        }
        boolean flag = true;
        index = ScanDigit(str,index);
        //未扫描结束
        if(index<str.length()){
            //是小数
            if(str.charAt(index)=='.'){
                index++;
                index = ScanDigit(str,index);
                if(index>=str.length()){
                    return true;
                }
                else{
                    if(str.charAt(index)=='E'||str.charAt(index)=='e'){
                        flag = Scanexponent(str,index+1);
                    }
                    else {
                        flag = false;
                    }
                }
            }
            //指数
            else {
                if(str.charAt(index)=='E'||str.charAt(index)=='e'){
                    flag = Scanexponent(str,index+1);
                }
                else {
                    flag = false;
                }
            }
        }
        else {
            return true;
        }
        return flag;
    }
    //扫面.前方的子串
    int ScanDigit(String str,int index){
        while (index < str.length() && str.charAt(index) >= '0' && str.charAt(index) <= '9') {
            index++;
        }
        return index;
    }
    boolean Scanexponent(String str,int index){
        if(index>=str.length()){
            return false;
        }
        if (str.charAt(index) == '+' || str.charAt(index) == '-') {
            index++;
        }

        if(index>=str.length()){
            return false;
        }
        index = ScanDigit(str,index);
        return index>=str.length();
    }
}

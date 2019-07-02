package com.Jianoffer;
/*
Description:用一个函数实现包含* .的正则表达式，.可表示任意一个字符，*表示它前面的字符可出现任意次（含0次）
过程：
1、如果模式字符ch为'.',那么可以匹配任意的字符，如果不是.,当能够匹配时，直接匹配后面的字符；
2、如果字符不是*,相符则后移，否则返回false；
3、如果字符为*，则有两种选择：匹配多次或者不匹配，如果模式串和字符串中的第一个字符能够匹配，则模式串能够有两种选择：保持不变，或者移动两个位置
 */
public class offer_19_Regular_expression {
    boolean Reexpression(String str,String pattern){
        if(str==null||pattern==null){
            return false;
        }
        return matchCore(str, 0, pattern, 0);
    }
    boolean matchCore(String input,int i,String pattern,int p){
        //字符串与模式串均已经匹配的最后一个字符
        if(i>=input.length()&&p>=pattern.length()){
            return true;
        }
        //模式串匹配至最后一个字符，但是字符串没有到达最后一个字符
        if(i<input.length()&&p>=pattern.length()){
            return false;
        }
        //模式串匹配未结束，且下一个字符为*
        if (p + 1 < pattern.length() && pattern.charAt(p + 1) == '*') {
            //字符串结束
            if (i >= input.length()) {
                return matchCore(input, i, pattern, p + 2);
            }
            //字符串未结束
            else {
                if (input.charAt(i) == pattern.charAt(p) || pattern.charAt(p) == '.') {
                    ////字符串的位置i与模式串的位置p能匹配，p+1位置为*的情况
                    // 匹配串向后移动一个位置，模式串向后移动两个位置，*只匹配前方字符一次
                    return  matchCore(input, i + 1, pattern, p + 2)
                            // 匹配串向后移动一个位置，模式串不移动，*匹配两次前方字符
                            || matchCore(input, i + 1, pattern, p)
                            // 匹配串不移动，模式串向后移动两个位置，*以及其前方的字符被忽略
                            || matchCore(input, i, pattern, p + 2);
                }
                else {
                    //字符串的位置i与模式串的位置p不能匹配，且p+1位置为*，则直接跳2位置，忽略*
                    return matchCore(input, i, pattern, p + 2);
                }
            }
        }
        //对应位置匹配，字符相同或者模式串当前位置为.
        // 匹配串已经结束
        if (i >= input.length()) {
            return false;
        }
        // 匹配串还没有结束
        else {
            if (input.charAt(i) == pattern.charAt(p) || pattern.charAt(p) == '.') {
                return matchCore(input, i + 1, pattern, p + 1);
            }
        }
        return false;
    }
}

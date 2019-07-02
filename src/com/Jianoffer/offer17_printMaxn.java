package com.Jianoffer;
import java.util.Arrays;
/*
Description：按顺序打印从1到最大的n位十进制数
如：输入3，则打印出1,2,3一直到最大的3位数999

陷阱：大数问题(C++涉及)，没有设定n的范围，可能会出现溢出,采用字符串或字符数组表示时如何判断到达最大数是陷阱。
第二种思路：全排列，只是在打印的时候对于098这种情况输出98
 */
class offer17_printMaxn {
     void Print1toMaxofNDigits(int n) {
        if(n<=0){
            throw new RuntimeException("The input number must larger than 0");
        }
        int[] arr = new int[n];
        printOneToNthDigits(0, arr);
    }
    void printOneToNthDigits(int n,int[] number){
        // n代表正在处理的第n个元素
        if(n>=number.length){
            printArray(number);
        }
        else {
            for (int i = 0; i <= 9; i++) {
                number[n] = i;
                printOneToNthDigits(n + 1, number);
            }
        }
    }
    //从第一个非零开始打印
    void printArray(int[] arr) {
        // 找第一个非0的元素
        int index = 0;
        while (index < arr.length && arr[index] == 0) {
            index++;
        }
        // 从第一个非0值到开始输出到最后的元素。
        for (int i = index; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        // 条件成立说明数组中有非零元素，所以需要换行
        if (index < arr.length) {
            System.out.println();
        }
    }
    /**
     * 输入数字n，按顺序打印出从1最大的n位十进制数。比如输入3，则打印出1、2、3 一直到最大的3位数即999。
     * 【第二种方法，比上一种少用内存空间】
     *
     * @param n 数字的最大位数
     */
    void printOneToNthDigits2(int n) {
        // 输入值必须大于0
        if (n < 1) {
            throw new RuntimeException("The input number must larger than 0");
        }

        // 创建一个长度为n的数组
        int[] arr = new int[n];
        // 为数组元素赋初始值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }

        // 求结果，如果最高位没有进位就一直进行处理
        while (addOne(arr) == 0) {
            printArray(arr);
        }
    }

    /**
     * 对arr表示的数组的最低位加1 arr中的每个数都不能超过9不能小于0，每个位置模拟一个数位
     *
     * @param arr 待加数组
     * @return 判断最高位是否有进位，如果有进位就返回1，否则返回0
     */
    int addOne(int[] arr) {
        // 保存进位值，因为每次最低位加1
        int carry = 1;
        // 最低位的位置的后一位
        int index = arr.length;

        do {
            // 指向上一个处理位置
            index--;
            // 处理位置的值加上进位的值
            arr[index] += carry;
            // 求处理位置的进位
            carry = arr[index] / 10;
            // 求处理位置的值
            arr[index] %= 10;
        } while (carry != 0 && index > 0);

        // 如果index=0说明已经处理了最高位，carry>0说明最高位有进位，返回1
        if (carry > 0 && index == 0) {
            return 1;
        }
        // 无进位返回0
        return 0;
    }
}

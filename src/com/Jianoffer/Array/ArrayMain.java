package com.Jianoffer.Array;
import java.util.Arrays;
public class ArrayMain {
    public static void main(String[] args) {
        offer10_Fibonacci_sequence Fib = new offer10_Fibonacci_sequence();
        System.out.println(Fib.Fibonacci(0));
        System.out.println(Fib.Fibonacci(1));
        System.out.println(Fib.Fibonacci(2));
        System.out.println(Fib.Fibonacci(7));
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        offer21_reverse_odd_even reverse = new offer21_reverse_odd_even();
        reverse.ReorderOddEven(array);
        System.out.println(Arrays.toString(array));
    }
}

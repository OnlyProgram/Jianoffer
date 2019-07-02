package com.Jianoffer;

public class Main_Function {
    public static void main(String[] args) {
        offer12_Path_of_matrix test =new offer12_Path_of_matrix();
        char[][] matrix = {{'A','B','C','D'},{'S','F','C','S'},{'A','D','E','E'}};
        String str = "AAAA";
        System.out.println(test.HasPath(matrix,3,4,str));
        offer13_RobotMove robot = new offer13_RobotMove();
        System.out.println(robot.Solution(5,10,10)+"——[21]");
        System.out.println(robot.Solution(15, 20, 20) + "——[359]");
        offer16_IntPow Pow = new offer16_IntPow();
        System.out.println(Pow.Power(0,0));
        System.out.println(Pow.Pow2(0,0));
        offer17_printMaxn printmax = new offer17_printMaxn();
        printmax.Print1toMaxofNDigits(3);
        offer_19_Regular_expression Re = new offer_19_Regular_expression();
        System.out.println(Re.Reexpression("aaca", "ab*a*c*a"));
        System.out.println(Re.Reexpression("aaba", "ab*a*c*a") + "[" + false + "]");
        System.out.println(Re.Reexpression("bbbba", ".*a*a") + "[" + true + "]");
        System.out.println(Re.Reexpression("bcbbabab", ".*a*a") + "[" + false + "]");
        offer20_Isnum_of_str Isnum = new offer20_Isnum_of_str();
        System.out.println("*************************************");
        System.out.println(Isnum.IsNumber("100") + "[" + true + "]");
        System.out.println(Isnum.IsNumber("12e") + "[" + false + "]");
        System.out.println(Isnum.IsNumber("1a3.14") + "[" + false + "]");
        System.out.println(Isnum.IsNumber("1+23") + "[" + false + "]");
        System.out.println(Isnum.IsNumber("1.2.3") + "[" + false + "]");
        System.out.println(Isnum.IsNumber("+-5") + "[" + false + "]");
        System.out.println(Isnum.IsNumber("12e+5.4") + "[" + false + "]");
        System.out.println(Isnum.IsNumber("100") + "[" + true + "]");
        System.out.println(Isnum.IsNumber("123.45e+6") + "[" + true + "]");
        System.out.println(Isnum.IsNumber("+500") + "[" + true + "]");
        System.out.println(Isnum.IsNumber("5e2") + "[" + true + "]");
        System.out.println(Isnum.IsNumber("3.1416") + "[" + true + "]");
        int[][] numbers2 = {
                {1, 2, 3, 4, 5, 6, 7, 8},
                {22, 23, 24, 25, 26, 27, 28, 9},
                {21, 36, 37, 38, 39, 40, 29, 10},
                {20, 35, 34, 33, 32, 31, 30, 11},
                {19, 18, 17, 16, 15, 14, 13, 12},

        };
        offer29_PrintClockwiseMatrix pr = new offer29_PrintClockwiseMatrix();
        pr.PrintMatrix(numbers2);
    }
}

package com.learn;

/**
 * @desc
 * @since 2024/7/23 14:07
 */
public class PrintBinary {

    public static void print(int num) {
        for (int i = 31; i >= 0; i--) {
            // 左移没有带符号的,右移有带符号的
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 32位
        int num = 4;
        print(num);
    }

}


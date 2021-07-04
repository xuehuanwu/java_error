package com.java.error;

/**
 * Exception in thread "main" java.lang.StackOverflowError
 * 栈内存溢出：一般程序递归太深而发生栈溢出
 */
public class StackOverflowErrorDemo {

    public static void main(String[] args) {
        stackOverflowError();
    }

    private static void stackOverflowError() {
        stackOverflowError();
    }
}

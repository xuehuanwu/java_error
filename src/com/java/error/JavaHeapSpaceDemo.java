package com.java.error;

import java.util.Random;

/**
 * Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
 * OOM：堆内存溢出
 * =====================================================================================================================
 * jvm参数：-Xms10m -Xmx10m
 * 造成原因：大对象或者对象过多
 */
public class JavaHeapSpaceDemo {

    public static void main(String[] args) {
        // 大对象
        byte[] bytes = new byte[80 * 1024 * 1024];

        // 对象过多
        String str = "java";
        while (true) {
            str += str + new Random().nextInt(111) + new Random().nextInt(222);
            str.intern();
        }
    }
}

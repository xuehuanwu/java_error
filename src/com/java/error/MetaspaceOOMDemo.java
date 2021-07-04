package com.java.error;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 故障现象：
 * java.lang.OutOfMemoryError: Metaspace
 * =====================================================================================================================
 * jvm参数配置演示
 * -XX:MetaspaceSize=8m -XX:MaxMetaspaceSize=8m
 * =====================================================================================================================
 * Metaspace是方法区在HotSpot中的实现，它与持久代最大的区别在于：Metaspace并不在虚拟机内存中，而是使用本地内存
 * 也即在java8中，classes metadata(the virtual machines internal presentation of Java class)，
 * 被存储在叫做Metaspace的native memory
 * =====================================================================================================================
 * 永久代(java8后被元空间Metaspace取代了)存放了一下信息：
 * 虚拟机加载的类信息
 * 常量池
 * 静态变量
 * 即时编译后的代码
 * =====================================================================================================================
 * 模拟Metaspace空间溢出，我们不断生成类往元空间灌，类占据的空间总数会超过Metaspace指定的空间大小
 */
public class MetaspaceOOMDemo {

    // 静态内部类
    static class OOMTest {

    }

    public static void main(String[] args) {
        // 模拟计数多少次以后发生异常
        int i = 0;

        try {
            while (true) {
                i++;
                // cglib enhancer 增强类对象
                Enhancer enhancer = new Enhancer();
                // 设置增强类型
                enhancer.setSuperclass(OOMTest.class);
                // 设置缓存
                enhancer.setUseCache(false);
                // 设置回调函数
                enhancer.setCallback(new MethodInterceptor() {
                    @Override
                    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                        // cglib反射调用真实对象方法
                        return methodProxy.invokeSuper(o, args);
                    }
                });
                // 生成并返回代理对象
                enhancer.create();
            }
        } catch (Throwable e) {
            System.out.println("多少次后发生了异常: " + i);
            e.printStackTrace();
        }
    }
}

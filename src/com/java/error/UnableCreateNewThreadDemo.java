package com.java.error;

/**
 * 故障现象：高并发请求服务器时，经常出现，准确讲该native thread异常与对应的平台有关
 * Exception in thread "main" java.lang.OutOfMemoryError: unbale to create new native thread
 * ps：这个错误不要尝试，否则windows会直接卡死
 * =====================================================================================================================
 * 导致原因：
 * 1、你的应用创建了太多线程，一个应用进程创建多个线程，超过系统承载极限
 * 2、你的服务器并不允许你的应用创建那么多线程，linux系统默认允许单个进程可以创建的线程数是1024个
 * ps：线程数最好控制在总数的2/3，因为还有一些系统的默认线程。
 * =====================================================================================================================
 * 解决办法：
 * 1、降低你应用程序创建线程的数量，分析应用是否真的需要创建这么多线程，如果不是，改代码将线程数降到最低
 * 2、对于有的应用，确实需要创建很多线程，远超过linux系统的默认1024个线程的限制，可以通过修改linux服务器配置，扩大linux默认限制
 * =====================================================================================================================
 * 服务器级别参数调优：
 * ulimit -u    查看linux最大进程数
 * vim /etc/security/limits.d/90-nproc.conf 修改系统用户最大进程数
 * vim /etc/security/limits.conf    修改系统用户最大文件打开数
 */
public class UnableCreateNewThreadDemo {

    public static void main(String[] args) {
        // 注意这里for循环i没有设置跳出范围
        for (int i = 0; ; i++) {
            System.out.println("******* i: " + i);
            new Thread(() -> {
                try {
                    Thread.sleep(Integer.MAX_VALUE);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, "" + i).start();
        }
    }
}

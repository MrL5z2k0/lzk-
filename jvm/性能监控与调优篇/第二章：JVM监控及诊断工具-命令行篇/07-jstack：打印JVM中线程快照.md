### jstack:打印JVM中线程快照

jstack( JVM Stack Trace)：

用于生成虚拟机指定进程当前时刻的线程快照（虚拟机堆栈跟踪)。线程快照就是当前虚拟机内指定进程的每一条线程正在执行的方法堆栈的集合

生成线程快照的作用：可用于定位线程出现长时间停顿的原因，如线程间死锁、死循环、请求外部资源导致的长时间等待等问题。这些都是导致线程长时间停顿的常见原因。当线程出现停顿时，就可以用jstack显示各个线程调用的堆栈情况。

在thread dump中，要留意下面几种状态：

- **死锁，，Deadlock（重点关注）**
- **等待资源， Waiting on condition（重点关注）**
- **等待获取监视器， Waiting on monitor entry（重点关注）**
- **阻塞， Blocked（重点关注）**
- 执行中， Runnable
- 暂停， Suspended
  

![image-20210413142004139](C:\Users\93138\AppData\Roaming\Typora\typora-user-images\image-20210413142004139.png)
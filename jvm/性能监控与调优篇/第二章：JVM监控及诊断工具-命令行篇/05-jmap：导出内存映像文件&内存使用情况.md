## 基本情况

jmap( JVM Memory Map):作用一方面是获取dump文件(堆转储快照文件，二进制文件)，它还可以获取目标Java进程的内存相关信息，包括Java堆各区域的使用情况、堆中对象的统计信息、类加载信息等。

开发人员可以在控制台中输入命令“jmap -help”查阅jmap工具的具体使用方式和一些标准选项配置。


## 基本语法

![image-20210408221405254](C:\Users\93138\AppData\Roaming\Typora\typora-user-images\image-20210408221405254.png)

![image-20210408221518089](C:\Users\93138\AppData\Roaming\Typora\typora-user-images\image-20210408221518089.png)



## 使用一：导出内存映像文件

一般来说，使用jmap指令生成dump文件的操作算得上是最常用的jmap命令之一，将堆中所有存活对象导出至一个文件之中。

Heap Dump又叫做堆存储文件，指一个Java进程在某个时间点的内存快照。 Heap Dump在触发内存快照的时候会保存此刻的信息如下：

- All Objects
  Class, fields, primitive values and references
- All Classes
  Classloader, name, super class, static fields
- Garbage Collection Roots
  Objects defined to be reachable by the JVM
- Thread Stacks and Local Variables
  The call-stacks of threads at the moment of the snapshot, and per-frameinformation about local objects

说明：

1. 通常在写 Heap Dump文件前会触发一次Full GC,所以 heap dump文件里保存的都是Fu116C后留下的对象信息。
2. 由于生成dump文件比较耗时，因此大家需要耐心等待，尤其是大内存镜像生成dump文件则需要耗费更长的时间来完成。

![image-20210408222047920](C:\Users\93138\AppData\Roaming\Typora\typora-user-images\image-20210408222047920.png)

手动方式

由于jmap将访问堆中的所有对象，为了保证在此过程中不被应用线程干扰，map需要借助安全点机制，让所有线程停留在不改变堆中数据的状态。也就是说，由jmap导出的堆快照必定是安全点位置的。这可能导致基于该堆快照的分析结果存在偏差。

举个例子，假设在编译生成的机器码中，某些对象的生命周期在两个安全点之间，那么live选项将无法探知到这些对象。另外，如果某个线程长时间无法跑到安全点，jmap将一直等下去。与前面讲的 jstat则不同,垃圾回收器会主动将 jstat所需要的摘要数据保存至固定位置之中，而jstat只需直接读取即可。

自动的方式

当程序发生OOM退出系统时，一些瞬时信息都随着程序的终止而消失，而重现OOM问题往往比较困难或者耗时。此时若能在OOM时，自动导出dump文件就显得非常迫切。

这里介绍一种比较常用的取得堆快照文件的方法，即使用

- -XX:+HeapDumpOnOutOfMemoryError:在程序发生OOM时，导出应用程序的当前堆快照。
- -XX: HeapDumpPath:可以指定堆快照的保存位置。

比如
-Xmx100m -XX: +HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=D: \m.hprof
![image-20210413135332116](C:\Users\93138\AppData\Roaming\Typora\typora-user-images\image-20210413135332116.png)

![image-20210413135341611](C:\Users\93138\AppData\Roaming\Typora\typora-user-images\image-20210413135341611.png)
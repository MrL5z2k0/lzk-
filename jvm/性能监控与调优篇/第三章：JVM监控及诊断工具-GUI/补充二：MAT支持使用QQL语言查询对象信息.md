### 支持使用OQL语言查询对象信息

## 1 SELECT子句

![image-20210415143312655](https://github.com/MrL5z2k0/zkNode/tree/main/images\image-20210415143312655.png)

## 2 FROM子句

![image-20210415143332606](https://github.com/MrL5z2k0/zkNode/tree/main/images\image-20210415143332606.png)

## 3 WHERE子句

![image-20210415143350090](https://github.com/MrL5z2k0/zkNode/tree/main/images\image-20210415143350090.png)

## 4 内置对象与方法

![image-20210415143416534](https://github.com/MrL5z2k0/zkNode/tree/main/images\image-20210415143416534.png)

(Java Process Status)显示指定系统内所有的HotSpot虚拟机进程(查看虚拟机进程信息），可用于查询正在运行的虚拟机进程.

说明：对于本地虚拟机进程来说，进程的本地虚拟机ID与操作系统的进程ID是一致的，是唯一的。

- -q:仅仅显示 LVMID(loca1 virtual machine id),即本地虚拟机唯一id。不显示主类的名称等

- -l:输出应用程序主类的全类名或如果进程执行的是jar包，则输出ar完整路径

- -m:输出虚拟机进程启动时传递给主类main()的参数

- -v:列出虚拟机进程启动时的JVM参数。比如：-Xms20m -Xmx5m是启动程序指定的jvm参数。

说明：以上参数可以综合使用

补充:

eperfdata如果某Java进程关闭了默认开启的UserPerfData参数（即使用参数-XX:-UsePerfdata),那么jps命令(以及下面介绍的jstat)将无法探知该Java进程。

更多请查看：https://blog.csdn.net/unique_perfect/article/details/114488786及https://www.bilibili.com/video/BV1PJ411n7xZ?p=339&spm_id_from=pageDriver
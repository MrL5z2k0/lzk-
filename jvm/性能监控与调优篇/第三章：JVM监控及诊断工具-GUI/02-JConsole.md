# 基本概述

![image-20210413144549474](C:\Users\93138\AppData\Roaming\Typora\typora-user-images\image-20210413144549474.png)

## 启动

在jdk安装目录中找到jconsole.exe，双击该可执行文件就可以 打开DOS窗口，直接输入jconsole就可以了。



## 三种连接方式

Local 使用JConsole连接一个正在本地系统运行的JVM，并且执行程序的和运行JConsole的需要是同一个用户。JConsole使用文件系统的授权通过RMI连接起链接到平台的MBean的服务器上。这种从本地连接的监控能力只有Sun的JDK具有。

注意：本地连接要求 启动jconsole的用户 和 运行当前程序的用户 是同一个用户  具体操作如下： 1 在DOS窗口中输入jconsole

![image-20210413144928638](C:\Users\93138\AppData\Roaming\Typora\typora-user-images\image-20210413144928638.png)

![image-20210413144851417](C:\Users\93138\AppData\Roaming\Typora\typora-user-images\image-20210413144851417.png)

![image-20210413145011738](C:\Users\93138\AppData\Roaming\Typora\typora-user-images\image-20210413145011738.png)
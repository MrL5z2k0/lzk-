# Visual VM

## 基本概述 

![image-20210413170508338](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210413170508338.png)

使用： 在jdk安装目录中找到jvisualvm.exe，然后双击执行即可 打开DOS窗口，输入jvisualvm就可以打开该软件。

## 插件的安装

![image-20210413171821895](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210413171821895.png)

![image-20210413171844926](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210413171844926.png)

![image-20210413171900880](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210413171900880.png)

## 连接方式

### 本地连接

监控本地Java进程的CPU、类、线程等

### 远程连接

1. 确定远程服务器的ip地址
2. 添加JMX（通过JMX技术具体监控远程服务器哪个Java进程）
3. 修改bin/catalina.sh文件，连接远程的tomcat
4. 在…/conf中添加jmxremote.access和jmxremote.password文件
5. 将服务器地址改成公网ip地址
6. 设置阿里云安全策略和防火墙策略
7. 启动tomcat，查看tomcat启动日志和端口监听
8. JMX中输入端口号、用户名、密码登录
   


## 主要功能

#### 1 生成/读取堆内存快照

##### 一 生成堆内存快照 

1 方式1：

![image-20210414100231323](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414100231323.png)

2 方式2：

![image-20210413184253900](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210413184253900.png)

注意： 生成堆内存快照如下图：

![image-20210413184303080](C:\Users\93138\AppData\Roaming\Typora\typora-user-images\image-20210413184303080.png)

这些快照存储在内存中，当线程停止的时候快照就会丢失，如果还想利用，可以将快照进行另存为操作，如下图：

![image-20210414100330059](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414100330059.png)

##### 二 装入堆内存快照

![image-20210414100449115](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414100449115.png)

![image-20210414100521078](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414100521078.png)

#### 2 查看JVM参数和系统属性

#### 3 查看运行中的虚拟机进程

#### 4 生成/读取线程快照

##### 一 生成线程快照 

1 方式1：

![image-20210414100955271](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414100955271.png)

2 方式2：  注意： 生成线程快照如下图：

![image-20210413184509316](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210413184509316.png)

这些快照存储在内存中，当线程停止的时候快照就会丢失，如果还想利用，可以将快照进行另存为操作，如下图：

![image-20210414101220238](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414101220238.png)

#####  二 装入线程快照

![image-20210414101151286](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414101151286.png)

#### 5 程序资源的实时监控

#### 6 其他功能

- JMX代理连接 
- 远程环境监控 
- CPU分析和内存分析
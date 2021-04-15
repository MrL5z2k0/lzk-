## 基本概述

![image-20210414102407334](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414102407334.png)

![image-20210414102421560](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414102421560.png)

![image-20210414102433442](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414102433442.png)

## 获取堆dump文件

### dump文件内存

![image-20210414102459509](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414102459509.png)

### 两点说明

![image-20210414102518812](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414102518812.png)

### 获取dump文件

![image-20210414102557659](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414102557659.png)

![image-20210414102608343](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414102608343.png)

### 分析堆dump文件

histogram 展示了各个类的实例数目以及这些实例的Shallow heap或者Retained heap的总和

![image-20210414102654533](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414102654533.png)

![image-20210414102703526](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414102703526.png)

thread overview 

查看系统中的Java线程 

查看局部变量的信息

![image-20210414102735138](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414102735138.png)

![image-20210414102809362](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414102809362.png)

### 获得对象互相引用的关系

with outgoing references

![image-20210414102831566](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414102831566.png)

![image-20210414102841402](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414102841402.png)

with incoming references

![image-20210414102857609](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414102857609.png)

![image-20210414102905277](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414102905277.png)

### 浅堆与深堆

#### shallow heap

![image-20210414102925104](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414102925104.png)

对象头代表根据类创建的对象的对象头，还有对象的大小不是可能向8字节对齐，而是就向8字节对齐

#### retained heap

![image-20210414102945546](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414102945546.png)

注意： 当前深堆大小 = 当前对象的浅堆大小 + 对象中所包含对象的深堆大小

补充：对象实际大小

![image-20210414103003696](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414103003696.png)

![image-20210414103030173](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414103030173.png)

![image-20210414103038250](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414103038250.png)

![image-20210414103050909](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414103050909.png)

### 支配树

![image-20210414103142839](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414103142839.png)

![image-20210414103151630](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414103151630.png)

注意：
跟随我一起来理解如何从“对象引用图---》支配树”，首先需要理解支配者（如果要到达对象B，毕竟经过对象A，那么对象A就是对象B的支配者，可以想到支配者大于等于1），然后需要理解直接支配者（在支配者中距离对象B最近的对象A就是对象B的直接支配者，你要明白直接支配者不一定就是对象B的上一级，然后直接支配者只有一个），然后还需要理解支配树是怎么画的，其实支配树中的对象与对象之间的关系就是直接支配关系，也就是上一级是下一级的直接支配者，只要按照这样的方式来作图，肯定能从“对象引用图---》支配树”

在Eclipse MAT工具中如何查看支配树：
![image-20210414103212840](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414103212840.png)

### Tomcat堆溢出分析

![image-20210414103231547](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414103231547.png)

![image-20210414103239739](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414103239739.png)

![image-20210414103250467](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414103250467.png)

![image-20210414103300738](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414103300738.png)

![image-20210414103309581](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414103309581.png)

![image-20210414103318159](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414103318159.png)

![image-20210414103327237](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414103327237.png)

![image-20210414103337766](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414103337766.png)

![image-20210414103345338](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210414103345338.png)

支持使用OQL语言查询对象信息

- SELECT子句 
- FROM子句 
- WHERE子句 
- 内置对象与方法
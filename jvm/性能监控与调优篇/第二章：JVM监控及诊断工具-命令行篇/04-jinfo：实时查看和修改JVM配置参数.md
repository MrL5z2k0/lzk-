## 基本情况

jinfo(Configuration Info for Java)
查看虚拟机配置参数信思，也可用于调整虚拟机的配置参数。

在很多情况下，Java应用程序不会指定所有的Java虚拟机参数。而此时，开发人员可能不知道某一个具体的Java虚拟机参数的默认值。在这种情况下，可能需要通过查找文档获取某个参数的默认值。这个查找过程可能是非常艰难的。但有了 jinfo工具，开发人员可以很方便地找到Java虚拟机参数的当前值。

![image-20210408215910185](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210408215910185.png)



## 基本语法

![image-20210408220005997](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210408220005997.png)

jinfo不仅可以查看运行时某一个Java虚拟机参数的实际取值，甚至可以在运行时修改部分参数，并使之立即生效。

但是，并非所有参数都支持动态修改。参数只有被标记为manageable的flag可以被实时修改。其实，这个修改能力是极其有限的。

java -XX: -PrintFlagslnitial 查看所有JVM参数启动的初始值
java -XX: +PrintFlagsFinal 查看所有JVM参数的最终值
java -XX: +PrintCommandLineflags 查看那些已经被用户或者JVM设置过的详细的XX参数的名称和值

![image-20210408220549266](https://github.com/MrL5z2k0/zkNode/blob/main/images/image-20210408220549266.png)


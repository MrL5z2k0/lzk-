### jhat:JDK自带堆分析工具

基本情况

jhat(JVM Heap Analysis Tool):

Sun JDK提供的jhat命令与jmap命令搭配使用，用于分析jmap生成的 heap dump文件（堆转
储快照）。jhat内置了一个微型的HTTP/HTML服务器，生成dump文件的分析结果后，用户可以在浏览器中查看分析结果（分析虚拟机转储快照信息）。

使用了jhat命令，就启动了一个http服务，端口是7000,即http://localhost:7000/就可以在浏览器里分析。

说明:jhat命令在JDK9、JDK10中已经被删除，官方建议用 VisualVM代替。


![image-20210413140309417](C:\Users\93138\AppData\Roaming\Typora\typora-user-images\image-20210413140309417.png)
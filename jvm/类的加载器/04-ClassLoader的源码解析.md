# ClassLoader源码解析

ClassLoader与现有类加载器的关系：

![image-20210405134159959](C:\Users\93138\AppData\Roaming\Typora\typora-user-images\image-20210405134159959.png)

除了以上虚拟机自带的加载器外，用户还可以定制自己的类加载器。Java提供了抽象类Java.lang.ClassLoader，所有用户自定义加载器都应该继承ClassLoader类。

## 1、ClassLoader的主要方法

![image-20210405140551426](C:\Users\93138\AppData\Roaming\Typora\typora-user-images\image-20210405140551426.png)

## 2、SecureClassLoader与URLClassLoader

![image-20210405141409049](C:\Users\93138\AppData\Roaming\Typora\typora-user-images\image-20210405141409049.png)

![image-20210405141436964](C:\Users\93138\AppData\Roaming\Typora\typora-user-images\image-20210405141436964.png)

![image-20210405141605318](C:\Users\93138\AppData\Roaming\Typora\typora-user-images\image-20210405141605318.png)
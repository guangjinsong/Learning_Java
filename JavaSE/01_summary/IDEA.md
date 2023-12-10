# IDEA目录

## src目录

* Sources 一般用于标注类似 src 这种可编译目录。有时候我们不单单项目的 src 目录要可编译，还有其他一些特别的目录也许我们也要作为可编译的目录，就需要对该目录进行此标注。只有 Sources 这种可编译目录才可以新建 Java 类和包，这一点需要牢记

> 1. [IDEA各文件夹什么意思 Java idea项目中各个文件的作用](https://blog.51cto.com/u_13416/7519833)



# 抑制警告信息

> 1. [@SuppressWarnings注解用法详解](https://www.cnblogs.com/weixiuli/p/6407248.html)



# Idea中自动注释的缩进（避免添加注释自动到行首），且带空格

![动画](https://dawn1314.oss-cn-beijing.aliyuncs.com/typoraimg/202311061621589.gif)



## 设置`pvt`实时模板

![image-20231106171603451](https://dawn1314.oss-cn-beijing.aliyuncs.com/typoraimg/202311061716516.png)



# 自动给类添加注释

![image-20231108095939396](https://dawn1314.oss-cn-beijing.aliyuncs.com/typoraimg/202311080959470.png)



# 项目设置

![image-20231115092215252](https://dawn1314.oss-cn-beijing.aliyuncs.com/typoraimg/202311150922292.png)



# 系统设置

## **默认启动项目配置** 

* 启动 IDEA 时，默认自动打开上次开发的项目, 还是自己选择

![image-20231115093526667](https://dawn1314.oss-cn-beijing.aliyuncs.com/typoraimg/202311150935712.png)



## 设置菜单和窗口字体和大小

![image-20231115094259373](https://dawn1314.oss-cn-beijing.aliyuncs.com/typoraimg/202311150942409.png)



# 设置编辑器主题样式

## 编辑器区域

![image-20231115094801846](https://dawn1314.oss-cn-beijing.aliyuncs.com/typoraimg/202311150948939.png)



## 自动删除不需要的已导入的包

![image-20231115094643496](https://dawn1314.oss-cn-beijing.aliyuncs.com/typoraimg/202311150946534.png)



## 字体和颜色

![图片](https://dawn1314.oss-cn-beijing.aliyuncs.com/typoraimg/202311150951838.png)

* 温馨提示：如果选择某个 font 字体，中文乱码，可以在 fallback font（备选字体）中选择一个支持中文的字体



## 注释的字体颜色

![图片](https://dawn1314.oss-cn-beijing.aliyuncs.com/typoraimg/202311150953851.png)

* Block comment：修改多行注释的字体颜色

* Doc Comment –> Text：修改文档注释的字体颜色

* Line comment：修改单行注释的字体颜色



# 显示行号与方法分隔符

![图片](https://dawn1314.oss-cn-beijing.aliyuncs.com/typoraimg/202311150954010.png)



# 代码智能提示功能

![图片](https://dawn1314.oss-cn-beijing.aliyuncs.com/typoraimg/202311150954542.png)

* IntelliJ IDEA 的代码提示和补充功能有一个特性：*区分大小写*。 如果想不区分大小写的话，就把这个对勾去掉。建议去掉勾选。



# 导包

## 手动导包

![图片](https://dawn1314.oss-cn-beijing.aliyuncs.com/typoraimg/202311150958055.png)

* 默认需要自己手动导包，Alt+Enter 快捷键

## 自动导包

![图片](https://dawn1314.oss-cn-beijing.aliyuncs.com/typoraimg/202311150958600.png)

* 动态导入明确的包：Add unambiguous imports on the fly，该设置具有全局性

* 优化动态导入的包：Optimize imports on the fly，该设置只对当前项目有效



# 设置项目文件编码

![图片](https://dawn1314.oss-cn-beijing.aliyuncs.com/typoraimg/202311151002094.png)

* Transparent native-to-ascii conversion 主要用于转换 ascii，显式原生内容。一般都要勾选

> 1. [Intellij Idea Create UTF-8 Files with BOM](https://blog.csdn.net/hadues/article/details/90138693)



# 设置控制台的字符编码

![图片](https://dawn1314.oss-cn-beijing.aliyuncs.com/typoraimg/202311151038514.png)



#  修改类头的文档注释信息

![图片](https://dawn1314.oss-cn-beijing.aliyuncs.com/typoraimg/202311151040714.png)

1. ${PACKAGE_NAME} - the name of the target package where the new class or interface will be created.
2. ${PROJECT_NAME} - the name of the current project.
3. ${FILE_NAME} - the name of the PHP file that will be created.
4. ${NAME} - the name of the **new** file which you specify in the New File dialog box during the file creation.
5. ${USER} - the login name of the current user.
6. ${DATE} - the current system date.
7. ${TIME} - the current system time.
8. ${YEAR} - the current year.
9. ${MONTH} - the current month.
10. ${DAY} - the current day of the month.
11. ${HOUR} - the current hour.
12. ${MINUTE} - the current minute.
13. ${PRODUCT_NAME} - the name of the IDE in which the file will be created.
14. ${MONTH_NAME_SHORT} - the first 3 letters of the month name. Example:Jan, Feb, etc.
15. ${MONTH_NAME_FULL} - full name of a month. Example: January, February, etc.



# 设置自动编译

![](https://dawn1314.oss-cn-beijing.aliyuncs.com/typoraimg/202311151042816.png)



# 代码模板的使用

## 查看 Postfix Completion 模板(后缀补全)



![图片](https://dawn1314.oss-cn-beijing.aliyuncs.com/typoraimg/202311151114349.png)



## 查看 Live Templates 模板(实时模板)

![图片](https://dawn1314.oss-cn-beijing.aliyuncs.com/typoraimg/202311151115084.png)



## 常用代码模板

### 非空判断

1. 变量.null：if(变量 == null)

2. 变量.nn：if(变量 != null) 

3. 变量.notnull：if(变量 != null)  

4. ifn：if(xx == null)

5. inn：if(xx != null)

   

### 遍历数组和集合

1. 数组或集合变量.fori：for 循环

2. 数组或集合变量.for：增强 for 循环

3. 数组或集合变量.forr：反向 for 循环

4. 数组或集合变量.iter：增强 for 循环遍历数组或集合



### 输出语句

1. sout：相当于 System.out.println

2. soutm：打印当前方法的名称

3. soutp：打印当前方法的形参及形参对应的实参值

4. soutv：打印方法中声明的最近的变量的值
5. 变量.sout：打印当前变量值
6. 变量.soutv：打印当前变量名及变量值



### **对象操作** 

* 创建对象
  * Xxx.new .var ：创建 Xxx 类的对象，并赋给相应的变量
  * Xxx.new .field：会将方法内刚创建的 Xxx 对象抽取为一个属性

* 强转
  * 对象.cast：将对象进行强转
  * 对象.castvar：将对象强转后，并赋给一个变量



**静态常量声明**

1. psf：public static final

2. psfi：public static final int 

3. psfs：public static final String

4. prsf：private static final

5. pvt

   ![image-20231115112047530](https://dawn1314.oss-cn-beijing.aliyuncs.com/typoraimg/202311151120572.png) 



## 自定义代码模板

### 自定义后缀补全模板

![图片](https://dawn1314.oss-cn-beijing.aliyuncs.com/typoraimg/202311151123736.png)

![图片](https://dawn1314.oss-cn-beijing.aliyuncs.com/typoraimg/202311151123451.png)



### 自定义 Live Templates 

![《Java从入门到精通(JDK17版)》_尚硅谷电子书_00](https://dawn1314.oss-cn-beijing.aliyuncs.com/typoraimg/202311151125949.png)

# 快捷键



# 工程与模块管理

## IDEA项目结构

* 层级关系

  *  project(工程) - module(模块) - package(包) - class(类)

* 具体关系

  * 一个 project 中可以创建多个 module

  * 一个 module 中可以创建多个 package

  * 一个 package 中可以创建多个 class

    

## Project 和 Module 的概念

![图片](https://dawn1314.oss-cn-beijing.aliyuncs.com/typoraimg/202311151046143.png)

* 在 IntelliJ IDEA 中 Project 是*最顶级的结构单元*，然后就是 Module。目前，主流的大型项目结构基本都是多 Module 的结构，这类项目一般是*按功能划分*的，比如：user-core-module、user-facade-module 和 user-hessian-module 等等，模块之间彼此可以*相互依赖*，有着不可分割的业务关系

* 对于一个Project 来说

  * 当为单 Module 项目的时候，这个单独的 Module 实际上就是一个 Project。

  * 当为多 Module 项目的时候，多个模块处于同一个 Project 之中，此时彼此之间具有

    互相依赖的关联关系

  * 当然多个模块没有建立依赖关系的话，也可以作为单独一个“小项目”运行



## Module 和 Package命名规范

在一个 module 下，可以声明多个包（package），一般命名规范如下

1. 不要有中文

2. 不要以数字开头

3. 给包取名时一般都是公司域名倒着写,而且都是小写

   比如：尚硅谷网址是 www.atguigu.com那么我们的 package 包名应该写成：com.atguigu.子名字







## 创建 Module

![《Java从入门到精通(JDK17版)》_尚硅谷电子书_00](https://dawn1314.oss-cn-beijing.aliyuncs.com/typoraimg/202311151105770.png)

> 1. [IDEA 中新建 Empty project（空白项目）](https://blog.csdn.net/zxl2029/article/details/113775919)


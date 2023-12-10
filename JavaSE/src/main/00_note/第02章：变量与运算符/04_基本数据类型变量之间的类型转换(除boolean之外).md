# 简介

* 在`Java`程序中, 不同的的基本数据类型(只有7种, 不包含boolean类型)变量的值经常需要进行相互转换. 
* 转换的格式有两种: 自动类型提升和强制类型转换



# 自动类型提升

## 规则

1.  **规则一:** 将取值范围小的(或容量小)的类型自动提升为取值范围大(或容量大)的类型![image-20231108111502642](https://dawn1314.oss-cn-beijing.aliyuncs.com/typoraimg/202311081115685.png)   

2. **规则二:** 当存储范围小的数据类型与存储范围大的数据类型一起混合运算时, 会按照其中最大的类型运算

   ![image-20231108112145491](https://dawn1314.oss-cn-beijing.aliyuncs.com/typoraimg/202311081121523.png) 

3. **规则三:** 当byte, short和char数据类型的变量进行算术运算时, 按照int类型处理

​	![image-20231108112222653](https://dawn1314.oss-cn-beijing.aliyuncs.com/typoraimg/202311081122690.png) 

## 总结

1. 整形的字面量(默认是int型)的直接赋值

   * 直接赋值给long整型 
     * 如果字面量不超int型的范围, 可以直接赋值给long型(会先自动类型提升到long整型), 例如: `long l1 = 12344;`
     * 如果字面量超int型的范围, 那么字面量末尾就必须加L或l(此时表示该字面量为long整型), 然后赋值, 例如: `long l2 = 1_000_000_000_000_000L `
   *  直接赋值给char, short和byte整型
     * 如果字面量不超char, short和byte的范围, 那么可以直接赋值给这三种变量类型(会先自动转换), 例如: `char c = 1; short s = 1; byte b = 1;`

2. 浮点字面量后面必须加f或F才可以赋值给float类型的变量

   ```java
   // float f3 = 12.3; // 12.3是double类型, 不可以自动转换成float, 所以会报错
    float f4 = 12.3f; // 浮点型字面量常量后面加f, 就可以看成float型字面量
   ```

> [为什么Java中可以把int型直接数赋值给byte型，但不能把int型计算结果赋值给byte型？](https://www.zhihu.com/question/450763080)



# 强制类型转换

* 规则: 将取值范围大（或容量大）的类型强制转换成取值范围小（或容量小）的类型

* 格式:  数据类型1 变量名 = (数据类型1)被强转数据值; // ()中的数据类型必须小于等于数据类型1

* 总结

  1. 自动类型提升是 Java 自动执行的，而强制类型转换是自动类型提升的逆运算，需要我们自己手动执行

  2. 当把存储范围大的值（常量值、变量的值、表达式计算的结果值）强制转换为存储范围小的变量时，可能会**损失精度或溢出**

     ```java
     int i = (int)3.14;//损失精度
     
     double d = 1.2;
     int num = (int)d;//损失精度
     
     int i = 200;
     byte b = (byte)i;//溢出 
     ```

  3. 当某个值想要提升数据类型时，也可以使用强制类型转换。这种情况的强

     制类型转换是没有风险的, 但通常省略

     ```java
     int i = 1;
     int j = 2;
     double bigger = (double)(i/j);
     ```

  4. 声明 long 类型变量时，可以出现省略后缀的情况, 而float 则不同

     ```java
     long l1 = 123L;
     long l2 = 123;//如何理解呢？ 此时可以看做是 int 类型的 123 自动类型提升为 long 类型
     
     //long l3 = 123123123123; //报错，因为 123123123123 超出了 int 的范围。
     long l4 = 123123123123L;
     
     //float f1 = 12.3; //报错，因为 12.3 看做是 double，不能自动转换为 float类型
     float f2 = 12.3F;
     float f3 = (float)12.3;
     ```

     

# **基本数据类型与 String 的运算**

* 简介

  * String 不是基本数据类型，属于引用数据类型
  * 使用一对*""*来表示一个字符串，内部可以包含 0 个、1 个或多个字符
  * 声明方式与基本数据类型类似。例如：`String str = “sgj”;`

* 运算规则

  1. 任意八种基本数据类型的数据与 String 类型只能进行连接“+”运算，且结果一定也是 String 类型

     ```java
     System.out.println("" + 1 + 2);//12
     
     int num = 10;
     boolean b1 = true;
     String s1 = "abc";
     String s2 = s1 + num + b1;
     System.out.println(s2);//abc10true
     
     // 编译不通过，因为 int 类型不能与 boolean 运算
     // 换种解释, 第一个"+"是运算符, 第二个"+"是连接符
     // 而且第一个"+"比第二个"+"先进行计算, 且第一个"+"
     // 是编译不通过的
     //String s3 = num + b1 + s1;
     String s4 = num + (b1 + s1);//编译通过
     ```

  2. String 类型不能通过强制类型()转换，转为其他的类型

     ```java
     String str = "123";
     int num = (int)str;//错误的
     ```

     
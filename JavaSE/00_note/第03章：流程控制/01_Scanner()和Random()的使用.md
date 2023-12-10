# Scanner()

* 操作步骤
  * 导包：import java.util.Scanner
  * 创建 Scanner 类型的对象：Scanner scan = new Scanner(System.in)
  * 调用 Scanner 类的相关方法（next() / nextXxx()），来获取指定类型的变量
  * 释放资源：scan.close() 
* 总结
  * Scanner类中提供了获取byte/short/int/long/float/double/boolean/String类型变量的方法
  * 没有提供char类型变量的方法, 需要使用next().charAt(0)来获取char类型变量
  * 需要根据相应的方法，来输入指定类型的值。如果输入的数据类型与要求的类型不匹配时，会报异常导致程序终止。

```java
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // next(): 获取String类型的数据
    String name = scanner.next();
    System.out.println("name = " + name);

    // nextInt(): 获取int型类型的数据
    int age = scanner.nextInt();
    System.out.println("age = " + age);

    // nextDouble(): 获取double型类型的数据
    double weight = scanner.nextDouble();
    System.out.println("weight = " + weight);

    // nextBoolean(): 获取Boolean型类型的数据
    boolean isSingle = scanner.nextBoolean();
    System.out.println("isSingle = " + isSingle);

    // 通过转换获取char类型的数据
    char gender = scanner.next().charAt(0);
    System.out.println("gender = " + gender);

    // 关闭资源
    scanner.close();
}
```



# Random()

```java
public class RandomTest {
    @Test
    public void test01(){
        // 获取一个[0.0 1.0)的double随机数
        double random1 = random();

        // 获取一个[0 100]的int随机数
        int random2 = (int)(Math.random() * 101);

        // 获取一个[1 100]的int随机数
        int random3 = (int)(Math.random() * 100) + 1;

        // 获取一个[a b]的int随机数
        // int random4 = (int)(Math.random() * (b - a + 1)) + a;
    }
}
```
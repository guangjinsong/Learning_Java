# 1. 像素的概念

* **简介**
  * 我们的电脑屏幕是，是由一个一个“小点”组成的，每个“小点”，就是一个像素（px）
  * 规律：像素点越小，呈现的内容就越清晰、越细腻。

* **总结**

  * 注意点：如果电脑设置中开启了缩放，那么就会影响一些工具的测量结果，但这无所谓，因为我们工作中都是参考详细的设计稿，去给元素设置宽高

    

# 2. 颜色的表示

## 2.1. 表示方式一: 颜色名

* 编写方式
  * 直接使用颜色对应的英文单词，编写比较简单, 如下
    * 红色：red
    * 绿色：green
    * 蓝色：blue
    * 紫色：purple
    * 橙色：orange
    * 灰色：gray
    * ......
* **总结**
  * 颜色名这种方式，表达的颜色比较单一，所以用的并不多



## 2.2. 表示方式二：rgb **或** rgba

* **编写方式**
  * 使用 **红、黄、蓝** 这三种光的三原色进行组合
    * **r** 表示 **红色**
    * **g** 表示 **绿色**
    * **b** 表示 **蓝色**
    * **a** 表示 **透明度**

* **总结**

  * 若三种颜色值相同，呈现的是灰色，值越大，灰色越浅。
  * rgb(0, 0, 0) 是黑色， rgb(255, 255,255) 是白色。
  * 对于 rbga 来说，前三位的 rgb 形式要保持一致，要么都是 0~255 的数字，要么都是百分比 

* **示例**

  ```html
  <!DOCTYPE html>
  <html lang="en">
      <head>
          <meta charset="UTF-8">
          <title>03_颜色_第2种表示_rgb或rgba</title>
          <style>
              .col1 {
                  color: rgb(255, 0, 0);
              }
              .col2 {
                  color: rgb(100%, 0%, 0%);
                  /*不可以混着来*/
                  /*color: rgb(6, 0%, 0%);*/
              }
              /*a表示是透明度*/
              /*0是完全透明*/
              /*1是完全不透明*/
              .col3 {
                  color: rgba(255, 0, 0, 0.4);
                  /*透明度可以混着来*/
                  /*color: rgba(255, 0, 0, 40%);*/
              }
          </style>
      </head>
      <body>
          <h2 class="col1">color1</h2>
          <h2 class="col2">color2</h2>
          <h2 class="col3">color3</h2>
      </body>
  </html>
  ```

  ![image-20231127194918751](https://dawn1314.oss-cn-beijing.aliyuncs.com/typoraimg/202311271949805.png) 

 

## 2.3. 表示方式三：HEX或HEXA

* **简介**

  * HEX 的原理同与 rgb 一样，依然是通过：**红**、**绿**、**蓝色** 进行组合，只不过要用 **6**位（分成3组）来表达

* **格式**

  * **#** **rrggbb**
  * 每一位数字的取值范围是： 0 ~ f ，即：（ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, a, b, c, d, e, f ）

  * 每一种光的最小值是： 00 ，最大值是： ff

* **总结**

  <img src="https://dawn1314.oss-cn-beijing.aliyuncs.com/typoraimg/202311272006194.png" alt="image-20231127200617148" style="zoom: 67%;" /> 

  

## 2.4. 表示方式四：HSL或HSLA

* **简介**

  * HSL 是通过：色相、饱和度、亮度，来表示一个颜色的
  * HSLA 其实就是在 HSL 的基础上，添加了透明度

* **格式**

  *  **hsl(色相,饱和度,亮度)**

  * **色相**：取值范围是 0~360 度，具体度数对应的颜色

    <img src="https://dawn1314.oss-cn-beijing.aliyuncs.com/typoraimg/202311272022832.png" alt="image-20231127202255763" style="zoom:67%;" /> 

  * **饱和度**: 取值范围是 0%~100% 。（向色相中对应颜色中添加灰色， 0% 全灰， 100% 没有

    灰）

  * **亮度**：取值范围是 0%~100% 。（ 0% 亮度没了，所以就是黑色。 100% 亮度太强，所以就是白色了）



# 3. 字体属性

## 3.1. 字体大小

* **属性名**

  *   `font-size`

* **作用**

  * 控制字体的大小

* **总结**

  * Chrome 浏览器支持的最小文字为 12px ，默认的文字大小为 16px ，并且 0px 会自动消失

  * 不同浏览器默认的字体大小可能不一致，所以最好给一个明确的值，不要用默认大小

  * 通常以给 body 设置 font-size 属性，这样 body 中的其他元素就都可以继承了

  * 由于字体设计原因，文字最终呈现的大小，并不一定与 font-size 的值一致，可能大，也可能小,. font-size 设为 40px ，最终呈现的文字，可能比 40px 大，也可能比 40px小

  * `font-size`是指框的高度

    ![image-20231209215635073](https://dawn1314.oss-cn-beijing.aliyuncs.com/typoraimg/202312092156139.png)

    

* **示例**

  ![image-20231127204716725](https://dawn1314.oss-cn-beijing.aliyuncs.com/typoraimg/202311272047760.png)



## 3.2. 字体族

* **简介**
  * 属性名： `font-family`
  * 作用：控制字体类型

* **总结**

  * 使用字体的英文名字兼容性会更好，具体的英文名可以自行查询，或在电脑的设置里去寻找
  * 如果字体名包含空格，必须使用引号包裹起来
  * 可以设置多个字体，按照从左到右的顺序逐个查找，找到就用，没有找到就使用后面的，且通常在最后写上 serif （衬线字体: 有棱角）或 sans-serif （非衬线字体: 无棱角. 用的较多）
  * windows 系统中，默认的字体就是微软雅黑
  * 最好都是英文名
  * `sans-serif`: 如果前面的字体都不可用, 就会联系浏览器选择一个现有的非衬线字体

* **示例**

  ```html
  <style>
      .sgj1 {
          font-size: 50px;
          font-family: "宋体";
      }
      .sgj2 {
          font-size: 50px;
          font-family: "Times New Roman";
      }
      .sgj3 {
          font-size: 50px;
          font-family: "Book Antiqua";
      }
      /*1. 先检查第一个字体是否可用, 如果可用就用第一个字体, 否则依次
        从后检查*/
      /*2. 如果是多个字体, 最好都是衬线或者非衬线字体, 不要混合*/
      /*3. sans-serif: 如果前面的字体都不可用, 就会联系浏览器选择一个
      现有的非衬线字体*/
      /*4. 最好都是英文名*/
      .sgj4 {
          font-size: 50px;
          font-family: "Arial Narrow", "Microsoft JhengHei", sans-serif;
      }
  </style>
  ```

  

## 3.3. 字体风格

* **简介**
  * 属性名: `font-style`
  * 作用：控制字体是否为斜体
  * 常用值
    * `normal `：正常（默认值）
    * `italic `：斜体（使用字体自带的斜体效果, **推荐**）
    * `oblique` ：斜体（强制倾斜产生的斜体效果）
* **总结**
  * 语义的事交给html, 样式的事情交给css

* **示例**

  ```html
  <style>
      .sgj1 {
          font-style: normal; /*默认风格*/
      }
      .sgj2 {
          font-style: italic;
      }
      .sgj3 {
          font-style: oblique;
      }
      /*语义的事交给html, 样式的事情交给css*/
      em {
          font-style: normal;
      }
  </style>
  ```

  

## 3.4. 字体粗细

* **简介**

  * 属性名： `font-weight`

  * 作用：控制字体的粗细

  * 常用值

    * 关键词

      * lighter ：细
      * normal ： 正常
      * bold ：粗
      * bolder ：很粗 （多数字体不支持）

    * 数值

      * 100~1000 且无单位，数值越大，字体越粗 （或一样粗，具体得看字体设计时的

      精确程度）

      * 100~300 等同于 lighter ， 400~500 等同于 normal ， 600 及以上等同于bold 

* **示例**

  ```html
  <style>
      .sgj1 {
          /*font-weight: lighter;*/
          font-weight: 150;
      }
      .sgj2 {
          /*font-weight: normal;*/
          font-weight: 450;
      }
      .sgj3 {
          /*font-weight: bold;*/
          font-weight: 800;
      }
  </style>
  ```

  

## 3.5. 字体复合写法

* **简介**

  * 属性名： `font` ，可以把上述字体样式合并成一个属性
  * 作用：将上述所有字体相关的属性复合在一起编写
  * 编写规则：
    * 字体大小、字体族必须都写上。
    * 字体族必须是最后一位、字体大小必须是倒数第二位。
    * 各个属性间用空格隔开。

* **总结**

  * 实际开发中更推荐复合写法，但这也不是绝对的，比如只想设置字体大小，那就直接用 font-size 属性

* **示例**

  ```html
  <style>
      /*大小(必须放在第一位) 字体族(必须放在最后一位)*/
      .sgj {
          font:  italic 100px "songti","Microsoft JhengHei";
      }
  </style>
  ```




# 4. 常用文本属性

## 4.1. 文本颜色

* **简介**
  * 属性名: `color`
  * 作用: 控制文字颜色
  * 可选值
    * 颜色名
    * `rgb` 或 `rgba`
    * `HEX` 或 `HEXA` （十六进制）
    * `HSL` 或 `HSLA`

* **总结**
  * 开发中常用的是： `rgb/rgba` 或 `HEX/HEXA` （十六进制）。

* **示例**

  ```html
  <!DOCTYPE html>
  <html lang="en">
      <head>
          <meta charset="UTF-8">
          <title>01_文本颜色</title>
          <style>
              .color {
                  color: rgb(255, 0, 0);
              }
          </style>
  
      </head>
      <body>
          <div class="color">奔赴山海</div>
      </body>
  </html>
  ```



## 4.2. 文本间距

* **简介**
  * **分类**
    * 字母间距: `letter-spacing`
    * 单词间距: `word-spacing`
  * **属性值**
    * 单位为`px`, 正值让间距增大, 负值让间距缩小

* **示例**

  ```html
  <!DOCTYPE html>
  <html lang="en">
      <head>
          <meta charset="UTF-8">
          <title>02_文本间距</title>
          <style>
              div {
                  /* 字母间距 */
                 letter-spacing: 1px;
                 /* 单词间距 */
                 /* 根据空格判断单词 */
                 word-spacing: 5px;
              }
          </style>
      </head>
      <body>
          <div>you got a dream, you gotta protect it.</div>
      </body>
  </html>
  ```

  

## 4.3. 文本修饰

* **简介**

  * 属性名: `text-decoration`
  * 作用: 控制文本的各种装饰线
  * 可选值
    * none ： 无装饰线（常用）
    * underline ：下划线（常用）
    * overline ： 上划线
    * line-through ： 删除线
  * 搭配值
    * dotted ：虚线
    * wavy ：波浪线
    * 也可以指定颜色

* **示例**

  ```html
  <!DOCTYPE html>
  <html lang="en">
      <head>
        <meta charset="UTF-8">
        <title>03_文本修饰</title>
        <style>
          div {
            /*text-decoration: overline;*/
            /*text-decoration: underline;*/
            /*上划的绿色虚线*/
            text-decoration: underline dotted red;
            /*text-decoration: line-through;*/
            /*text-decoration: none;*/
          }
          a {
            <!--去掉超链接的下划线-->  
            text-decoration: none;
          }
        </style>
      </head>
      <body>
          <div>
            奔赴山海
          </div>
        <a href="www.baidu.com">baidu</a>
        <ins>测试1</ins>
        <del>测试1</del>
      </body>
  </html>
  ```



## 4.4. 文本缩进

* **简介**

  * 属性名: `text-indent`
  * 作用: 控制文本首字母的缩进
  * 属性值: `css`中的长度单位, 例如`px`

* **示例**

  ```html
  <!DOCTYPE html>
  <html lang="en">
      <head>
        <meta charset="UTF-8">
        <title>04_文本缩进</title>
        <style>
          div {
            font-size: 10px;
            text-indent: 20px;
          }
        </style>
      </head>
      <body>
        <div>1111111111111111111111111111111111111</div>
      </body>
  </html>
  ```



## 4.5. 文本对齐_水平

* **简介**

  * 属性名: `text-align`
  * 作用: 控制文本的水平对齐方式
  * 常用值
    * left ：左对齐（默认值）
    * right ：右对齐
    * center ：居中对齐

* **示例**

  ```html
  <!DOCTYPE html>
  <html lang="en">
      <head>
          <meta charset="UTF-8">
          <title>05_文本对齐_水平</title>
          <style>
              div {
                  font-size: 10px;
                  /*text-align: center;*/
                  /*text-align: left;*/
                  text-align: right;
              }
          </style>
      </head>
      <body>
          <div>111</div>
      </body>
  </html>
  ```




## 4.7. 行高

* **简介**

  * 属性名：`line-height`
  * 作用：控制一行文字的高度
  * 可选值
    * `normal`：由浏览器根据文字大小决定的一个默认值
    * `px`：像素
    * `font-size`：参考自身`font-size`的倍数（**推荐**）
    * `%`：参考自身`font-size`的百分比

* **应用场景**

  * 对于多行文字：控制行与行之间的距离
  * 对于单行文字：让height等于line-height，可以实现文字垂直居中
  * 由于字体设计原因，靠上述办法实现的居中，并不是绝对的垂直居中，但如果一行中都是文字，不会太影响观感

* **总结**

  * 由于字体设计原因，文字在一行中，并不是绝对垂直居中，若一行中都是文字，不会太影响观感
  * line-height过小，文字会产生重叠，且最小值是0，不能为负
  * line-height是可以继承的，且为了能更好的呈现文字，最好写数值
  * line-height和height的关系
    * 设置了height，那么高度就是height的值
    * 不设置height的时候，会根据line-height计算高度

* **示例**

  ```css
  div {
  	line-height: 60px;
  	line-height: normal;
  	line-height: 1.5;
  	line-height: 150%;
  }
  ```

  

## 4.8. vertical-aline

* **简介**
  * 属性名: `vertical-align`
  * 作用: 用于同一行元素之间, 或表格单元格内文字的垂直对齐方式
  * 常用值
    * `baseline`(默认值): 使元素的基线与父元素的基线对齐
    * top：使元素的顶部与其所在行的顶部对齐
    * middle：使元素的中部与父元素的基线加上父元素字母x的一半对齐
    * bottom：使元素的底部与其所在行的底部对齐
* 总结
  * `vertical-align`不能控制块元素



# 6. 列表相关的属性

* **简介**

  列表相关属性可以用在`ul`,`ol` ,`li`

* **总结**

  |       属性名        |       功能       |                            属性值                            |
  | :-----------------: | :--------------: | :----------------------------------------------------------: |
  |  list-style-sytle   |   设置列表符号   | 常用值如下: ① none: 不显示前面的表示; ② square: 实心方块; ③ disc: 圆形; ④ decimal: 数字; ⑤ lower-roman: 小写罗马字母; ⑥ upper-roman: 大写罗马字母; ⑦ lower-alpha: 小写字母; ⑧ upper-alpha: 大写字母 |
  | list-style-position | 设置列表符号位置 |         ① inside: 在li的里面; ② outside: 在li的外边          |
  |  list-style-image   |  自定义列表符号  |                        url(图片地址)                         |
  |     list-style      |     符号属性     |                      没有数量, 顺序要求                      |

* **示例**

  ```css
  ul {
      /*列表符号*/
      /*list-style-type: none;*/
      /*list-style-type: square;*/
  
      /* 列表符号的位置*/
      /*list-style-position: inside;*/
      /*list-style-position: outside;*/
  
      list-style: square outside;
  }
  ```

  

# 7. 表格相关属性

## 7.1. 边框相关属性（其他元素也能用）

* 总结

  以下4个边框相关的属性, 其他元素可以用, 例如`span`, `h1`

  |    属性名    |     功能     |                            属性值                            |
  | :----------: | :----------: | :----------------------------------------------------------: |
  | border-width |   边框宽度   |                      CSS中可用的长度值                       |
  | border-color |   边款颜色   |                      CSS中可用的颜色值                       |
  | border-style |   边框风格   | ① 默认值； ② solid：实线； ③ dashed： 虚线； ④ dotted：点线；⑤ double双实线 |
  |    border    | 边框复合属性 |                     没有数量和顺序的要求                     |

* 示例

  ```css
  <style>
      table {
          /*整体加上边框*/
          /*border-color: black;*/
          /*border-style: dashed;*/
          /*border-width: 2px;*/
          border: 2px green solid;
      }
  
      td, th {
          border: 2px green dashed;
      }
  
      span {
          border: 2px green dashed;
      }
      h1 {
          border: 2px green dashed;
      }
  </style>
  ```

  

## 7.2. 表格独有属性（只有table标签才可以使用）

* **简介**

  |     属性名      |         功能         |                            属性值                            |
  | :-------------: | :------------------: | :----------------------------------------------------------: |
  |  table-layout   |      设置列宽度      | ① auto：自动，列宽根据内容计算（默认值）；② fixed：固定列宽，平均分 |
  | border-spacing  |      单元格间距      |        CSS中可用的长度值，生效的前提是单元格不能合并         |
  | border-collapse |    合并单元格边框    |             ① collapse：合并；② separate：不合并             |
  |   empty-cells   | 隐藏没有内容的单元格 | ① show：显示（默认）；② hide：隐藏，生效前提：单元格不能合并 |
  |  caption-side   |  设置表格标题的位置  |            ① 上面（默认值）；② bottom：在表格下面            |

* **示例**

  ```html
  <!DOCTYPE html>
  <html lang="en">
  <head>
      <meta charset="UTF-8">
      <title>02_表格独有属性</title>
      <style>
          table {
              border: 2px green solid;
              width: 500px;
              /* 控制表格的列宽 */
              table-layout: fixed;
              /* 控制单元格之间的间距（生效的前提，不合并单元格的边框）*/
              border-spacing: 2px;
              /*合并相邻单元格的边框*/
              border-collapse: collapse;
              /*隐藏没有内容的单元格（生效的前提，不合并单元格的边框）*/
              empty-cells: hide;
              /*设置表格标题的位置*/
              caption-side: bottom;
          }
          td, th {
              border: 2px orange solid;
          }
      </style>
  </head>
  <body>
      <table>
          <caption>人员信息</caption>
          <thead>
          <tr>
              <th>序号</th>
              <th>姓名</th>
              <th>性别</th>
              <th>年龄</th>
              <th>政治面貌</th>
          </tr>
          </thead>
          <tbody>
          <tr>
              <td>1</td>
              <td>张三</td>
              <td>男</td>
              <td>18</td>
              <td>团员</td>
          </tr>
          <tr>
              <td>2</td>
              <td></td>
              <td>男</td>
              <td>19</td>
              <td>党员</td>
          </tr>
          <tr>
              <td>3</td>
              <td>王五</td>
              <td>男</td>
              <td>19</td>
              <td>积极分子</td>
          </tr>
          </tbody>
      </table>
  </body>
  </html>
  ```



# 8. 背景相关属性

* **简介**

  |       属性名        |       功能       |                            属性值                            |
  | :-----------------: | :--------------: | :----------------------------------------------------------: |
  |  background-color   |   设置背景颜色   |       符合CSS中颜色规范的值。默认背景颜色是transparent       |
  |  background-image   |   设置背景图片   |                       url(图片的地址)                        |
  |  background-repeat  | 设置背景重复方式 | ① repeat：重复，铺满整个元素，默认值； ② repeat-x：只在水平方向重复； ③ repeat-y：只在垂直方向重复；④no-repeat：不重复 |
  | background-position | 设置背景图片位置 | ![image-20231215145610394](https://dawn1314.oss-cn-beijing.aliyuncs.com/typoraimg/202312151456451.png) |
  |     background      |     复合属性     |                      没有数量和顺序要求                      |

* **示例**

  ```html
  <!DOCTYPE html>
  <html lang="en">
      <head>
          <meta charset="UTF-8">
          <title>背景相关的属性</title>
          <style>
              div {
                  width: 500px;
                  height: 1000px;
                  border: 2px black solid;
                  font-size: 40px;
                  /*设置背景颜色 默认值是transparent（透明，即使用浏览器的背景）*/
                  background-color: skyblue;
                  /*设置背景图片*/
                  background-image: url("美丽的天空.jpg");
                  /*设置背景图片的重复方式*/
                  background-repeat: no-repeat;
                  /*控制背景图片的位置*/
                  background-position: left top; /*使用关键词*/
                  background-position: 70px 120px; /*使用具体的像素值*/
                  /*复合属性*/
                  backgroud: skyblue url("美丽的天空.jpg") no-repeat 300px;
              }
          </style>
      </head>
      <body>
          <div> hello!</div>
      </body>
  </html>
  ```

  

# 9. 鼠标相关属性

* **简介**

  | 属性名 |        功能        |                            属性值                            |
  | :----: | :----------------: | :----------------------------------------------------------: |
  | cursor | 设置鼠标光标的样式 | ① pointer: 小手; ② move: 移动图标; ③ text: 文字选择器; ④ crossshair: 十字架; ⑤ help: 帮助; ⑥ wait: 等待 |

* **示例**

  ```html
  <!DOCTYPE html>
  <html lang="en">
      <head>
          <meta charset="UTF-8">
          <title>鼠标相关属性</title>
          <style>
              div {
                  width: 400px;
                  height: 400px;
                  background-color: skyblue;
                  cursor: wait; /* 鼠标属性 */
              }
          </style>
      </head>
      <body>
          <div>
              把鼠标放进来看一看
              <input type="text">
              <a href="#">百度</a>
          </div>
      </body>
  </html>
  ```

  

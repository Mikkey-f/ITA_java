## 1.HTML

![]()![7EF5DC5332D30E8705CE0D6FDF94A9D0](C:%5CUsers%5C23139%5COneDrive%5CPictures%5C7EF5DC5332D30E8705CE0D6FDF94A9D0.jpg)

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5C61EF99AB9B3B066ADCBC5A36812123BE.jpg)



<p>为开始标签,</p>为结束标签

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5CD2D19E3CF3CD46A26F8D279D7976AB45.jpg)

### HTML基础结构

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5CE94EA26E70A0CBC3B4B49A4ADFB7EE9A.jpg)

注释的写法:<!--   -->

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5C9D867B0A8BE99489B910B106E77D8FB4.jpg)

### 词汇概念

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5CC28017AD931760E868D5B6FDF03996C1.jpg)

<!--1.html文件的根标签<html></html>所有的标签都要在这个标签中间

   2.html根标签下有两个子标签

   <head></head> 头标签 定义那些不直接展示在页面主体上，但又很重要的内容

​         1.字符集 <meta charset="UTF-8"/>告诉浏览器用什么字符集对文件解码

​         2.css引入

​         3.js引入

​         4.其他

​          

  <body>  体标签

​      1.定义要展示到页面主体的标签

-->

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5CDE22C71C498E94F72AE02DFF426BECF9.jpg)

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5CF96B0BB4F0E3123D056138EED7F5D940.jpg)

6."abcdefg"-->"abc'qwer'defg"(嵌套不要用双引号,防止分段错误)

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5C5C385615322B27B5D2BDE379E37FE5A3.jpg)

### 1.标题标签

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!-- 
          标题:     h1-h6 1到6级标题
          段落:     p
          换行:     br  hr   br*n->换行n次 hr:带分割线的换行
    -->
    <h1>hello</h1>
    <h2>hello</h2>
    <h3>hello</h3>
    <h4>hello</h4>
    <h5>hello</h5>
    <h6>hello</h6>
  
  <p>
     吃粽子、赛龙舟、做香囊……外国友人对端午文化有多少了解？
     哪些端午习俗令他们印象深刻？<br/>
     本报采访了几位在华留学生，听听属于他们的端午故事.
  </p>
   <hr>

  <p>
       而就在赖清德抛出"并购论"的前一周，
       美国参议院刚通过《台湾军事融资法案》，<br>
       批准对台军售120亿美元。
  </p>
    
</body>
</html>
```

### 2.列表标签

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5C3058A1C0EEDCBFE9EDF3518106BE1DA0.jpg)

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<!-- #region 
  有序列表 ol
  无序列表 ul  列表前的提示符没有代表顺序的含义
  列表项 li     可以在里面嵌套其他列表
-->

<!-- #region 有序列表-->
  <ol>
    <li>数据类型</li>
     <li>变量</li>
      <li>流程控制</li>
       <li>函数</li>
        <li>面向对象</li>
  </ol>

  <!-- #region 无序列表-->
  <ul>
    <li>Java</li>
    <li>C</li>
    <li>C#</li>
    <li>php</li>
    <li>python</li>
  </ul>

  <!-- #region 嵌套-->
  <ul>
    <li>Java
        <ol>
             <li>数据类型</li>
             <li>变量</li>
             <li>流程控制</li>
             <li>函数</li>
             <li>面向对象</li>
        </ol>
    </li>
  </ul>
</body>
</html>
```



### 3.超链接标签

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5C9D8C0B83458F62B1A8A028835403CC11.jpg)

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!-- #region 
     超链接标签
        a
              属性:href 用于定义要跳转的目标资源的地址
                   1.完整的url:https://osu.ppy.sh/
                   2.相对路径 : 以当前资源的所在路径为出发点去找目标资源
                        开头:    1: ./表示当前资源的所在路径,可以省略不写
                                2: ../表示当前资源路径的上一层路径,需要时必须写出

                   3.绝对路径  无论当前资源在哪里,使用固定的位置作为出发点去找目标资源
                              以/ 开头
                   target 用于定义目标资源的打开方式
                   -self 在当前窗口打开目标资源
                   -blank 重新开启新窗口打开目标资源
    -->
    <a href="https://osu.ppy.sh/" target="_blank">osu!</a>

    <!-- #region 相对路径写法-->
    <a href="02标题段落换行.html" target="_blank">02标题标签</a>
    <a href="a/b/test.html" target="_blank">test</a>

    <!-- #region 绝对路径写法-->
     <a href="/demo1-html/a/b/test.html">test1</a>

</body>
</html>
```

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5CA2885D37F811ED87AB8AF64A69ADB087.jpg)

### 4.图片标签

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5C057AE2BC4B1F19BF9CB4E26F0277D799.jpg)

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!-- #region 
       img 
            src:定义图片的路径
                1.url
                2.相对路径。
                3.绝对路径
            title 定义鼠标悬停时提示的文字
            alt 定义图片加载失败时提示的文字
            300px:像素
    
    -->
            <img src="img/1BBAFEED9572DE53611C14323B653521.jpg" width="300px" title="中二节奏" alt="加载失败"/>
            <br>
            <img src="/demo1-html/img/1BBAFEED9572DE53611C14323B653521.jpg" width="300px" title="chunithm" alt="加载失败"/>
</body>
</html>
```

### 5.表格标签

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5C0ED7721B43A38ABEEB5896E288711D3A.jpg)



```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!-- #region 
          table 整张表格
              thead 表头
              tbody 表体
              tfoot 表尾
                  tr 表格中的一行
                    td 行的一个单元格
                    th 自带加粗居中效果的td
        style="text-align: center;" 样式名称和值，使标题居中
    -->
    <h3 style="text-align: center;">员工技能竞赛评分表</h3>
    <table border="1px" style="margin: 0px auto;width: 300px;"> <!--将表格居中并加上框 -->
        <thead>
                 <tr>
                    <th>排名</th>
                    <th>姓名</th>
                    <th>分数</th>
                    
                 </tr>
        </thead>
        <tbody>
            <tr>
                <td>1</td>
                <td>小明</td>
                <td>100</td>
            </tr>
            <tr>
                <td>2</td>
                <td>李华</td>
                <td>99</td>
            </tr>
            <tr>
                <td>3</td>
                <td>张三</td>
                <td>98</td>
            </tr>

        </tbody>
        <tfoot>
            <tr>
                <td>平均分</td>
                <td>99</td>
                <td></td>
            </tr>

        </tfoot>

    </table>


</body>
</html>ht
```

![]()![1810BC73C0C1FC7F663FFC74B7775EC4](C:%5CUsers%5C23139%5COneDrive%5CPictures%5C1810BC73C0C1FC7F663FFC74B7775EC4.jpg)

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!-- #region 
          table 整张表格
              thead 表头
              tbody 表体
              tfoot 表尾
                  tr 表格中的一行
                    td 行的一个单元格
                    th 自带加粗居中效果的td
        style="text-align: center;" 样式名称和值，使标题居中
    -->
    <h3 style="text-align: center;">员工技能竞赛评分表</h3>
    <table border="1px" style="margin: 0px auto;width: 400px;"> <!--将表格居中并加上框 -->
        <thead>
                 <tr>
                    <th>排名</th>
                    <th>姓名</th>
                    <th>分数</th>
                    <th>备注</th>
                 </tr>
        </thead>
        <tbody>
            <tr>
                <td>1</td>
                <td>小明</td>
                <td>100</td>
                <td rowspan="6">前三名升职加薪</td> <!--该单元格侵占3行 -->
            </tr>
            <tr>
                <td>2</td>
                <td>李华</td>
                <td>99</td>
            </tr>
            <tr>
                <td>3</td>
                <td>张三</td>
                <td>98</td>
            </tr>
            <tr>
                <td>总人数</td>
                <td colspan="2">2000</td>
            </tr>
            <tr>
                <td>平均分</td>
                <td colspan="2">96</td>

            </tr>
            <tr> 
                <td>及格率</td>
                <td colspan="2">80%</td>

            </tr>
        </tbody>
    </table>


</body>
</html>
```

### 6.表单标签(重点)    7.表单项标签(重点)

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!-- #region 
             form
                 action 定义数据的提交地址
                   1.url
                   2.相对路径
                   3.绝对路径
            method 定义数据的提交方式
                  GET  
                        参数会以键值对的形式放在url后提交
                        url?key=value&key=value&key=value(key:参数名)
                        2.数据直接暴露在地址栏上,相对不安全。
                        3.地址栏长度有限制的,所以提交的数据量不大
                        4.地址栏上,只能是字符，不能提交文件
                        5.相比于post,效率高一点
                  Post
                        1.参数默认不会放到url后面
                        2.数据不会直接暴露在地址栏上，相对安全
                        3.数据是单独打包通过请求体发送,提交的数据量比较大
                        4.请求体中，可以是字符,也可以是字节数据,可以提交文件。
                        5.相比于get，效率略低

            表单项标签

            表单项标签一定要定义name属性,该属性1用于明确提交时的参数名
            还需要定义value标签，该属性用于明确提交时的实参
             input
                  type   输入信息的表单项类型
                      text   普通单行文本框
                      password  密码框
                      submit  提交地址
                      reset  重置按钮
                      radio  单选框   特点:多个选项选其一
                             多个单选框使用相同的name属性值,则就会有互斥效果
                      checkbox 复选框  特点:可以选择多个选项
                      hidden 隐藏域  不显示在页面上，提交时会携带

                      file 文件上传框

            textarea 文本域 多行文本框


            select  下拉框
                   option 选项
                             
    -->
    <form action="08welcome.html" method="get">
        <!--添加表单项标签 用户输入信息的标签-->
        <!--希望用户提交一些特定信息,但是考虑安全问题 或者是用户的操作问题,不希望该数据发生改变
            readonly 只读 提交时携带
            disabled 不可用 提交时不携带
        -->
        <input type="hidden" name="id" value="123">
        <input type="text" name="pid" value="456" readonly> <br>
        <input type="text" name="tid" value="789" disabled> <br>
        用户名:<input type="text" name="username"/> <br>
        密码:<input type="password" name="pswd" value="123456"/> <br> <!--value: 类似于设定默认值-->
        性别:
             <input type="radio" name="gender" value="男" checked="true"> 男 <!--设置value,代表gender所对应的性别;否则都为on
                                                                                 checked=true:默认勾选                  
                                                                             -->
             <input type="radio" name="gender" value="女"> 女
             <br>
        爱好:
            <input type="checkbox" name="hobby" value="1" checked="true"> 篮球
            <input type="checkbox" name="hobby" value="2"> 足球
            <input type="checkbox" name="hobby" value="3"> 羽毛球
            <input type="checkbox" name="hobby" value="4"> 乒乓球
            <br>
        个人简介: 
                <textarea name="intro" style="width: 300px; height: 100px;" ></textarea>

        <br>
        籍贯:
            <select name="pro">
                  <option value="1">京</option>   
                  <option value="2">津</option>   
                  <option value="3">冀</option>
                  <option value="0" selected>-请选择-<option>   <!--selected: 默认展示的优先级最高-->        

            </select>
        <br>
        选择头像:
              <input type="file">  
        <br>
        <input type="submit" value="登录"/>
        <input type="reset" value="清空"/> <!--value:类似于起别名-->


    </form>
    
</body>
</html>
```

### 8.布局相关标签

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body style="background-color: blue;"> <!--background-color: 设置背景色-->
    <!--
        css 设置样式的
            通过元素的style属性进行设置
            style= "样式名:样式值; 样式名:样式值;... ..."
                (重点)
        块元素: 自己独占一行的元素 块元素的CSS样式的宽  高等等 往往都是生效的
                div h1-h6....
        
        行内元素: 不会自己独占一行的元素 行内的CSS样式的宽  高等等 很多都是不生效的
                span img a....

    -->       <!--border: 边线-->                                                        <!--margin px: 设置像素级别的上下边距-->
    <div style="border: 1px solid red; width: 500px; height: 200px; margin: 10px auto;background-color: antiquewhite;">123</div>
    <div style="border: 1px solid red; width: 500px; height: 200px; margin: 10px auto;background-color: bisque;">456</div>
    <div style="border: 1px solid red; width: 500px; height: 200px; margin: 10px auto;background-color: chocolate;">
        6月2日下午，<span style="font-size: 30px;color: aqua;font-weight: bold;">中纪委</span>网站发布《反腐月报》显示，5月，中纪委网站受权发布通报97人被查，41人被处分。
    </div>
    <span style="border: 1px solid green;width: 500px;height: 100px;">555</span>
</body>
</html>
```

### 9.特殊字符

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!--
        有特殊含义的符号: 字符实体
        对于html代码来说,某些符号是有特殊含义的,如果想显示某些特殊符号,需要进行转义.
        <
        >

    
    
    -->
    <!--<h1>一级标题</h1>-->
    &lt;h1&gt;一级标题&lt;/h1&gt;
    <br>
    &amp;gt;
</body>
</html>
```

## 2.CSS

### 1.css的引入方式

##### 方法1.行内式

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
       <!--
            引入方式:
            方式1 行内式
                  通过元素的style属性引入样式
                  语法: style="样式名:样式值;样式名: 样式值;... ..."
                  缺点:1. 代码复用度低 不利于维护
                       2. css样式代码和html结构代码交织在一起,影响阅读性,影响文件大小,影响性能

            方式2 内嵌式
                  通过在head标签中的style标签定义本页面的公共样式
                  通过选择器确定样式的作用元素
                  

       -->
       <input type="button" value="按钮"
        style="width: 60px; 
        height: 40px; 
        background-color: rgb(47, 255, 85);
        color: white;
        font-size: 20px;         
        font-family: 隶书;
        border: 2px solid green; 
        border-radius: 5px;
        "   
       >
    <input type="button" value="按钮"
        style="width: 60px; 
        height: 40px; 
        background-color: rgb(47, 255, 85);
        color: white;
        font-size: 20px;         
        font-family: 隶书;
        border: 2px solid green; 
        border-radius: 5px;
        "   
       >
</body>
</html>
```

##### 方法2.内嵌式

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        input{
        width: 60px; 
        height: 40px; 
        background-color: rgb(47, 255, 85);
        color: white;
        font-size: 20px;         
        font-family: 隶书;
        border: 2px solid green; 
        border-radius: 5px; 
       
        }
    </style>
</head>
       <!--
            引入方式:
            方式1 行内式
                  通过元素的style属性引入样式
                  语法: style="样式名:样式值;样式名: 样式值;... ..."
                  缺点:1. 代码复用度低 不利于维护
                       2. css样式代码和html结构代码交织在一起,影响阅读性,影响文件大小,影响性能

            方式2 内嵌式
                  通过在head标签中的style标签定义本页面的公共样式
                  通过选择器确定样式的作用元素
                  

       -->
       <input type="button" value="按钮">
       <input type="button" value="按钮">
</body>
</html>
```

##### 方法3. 外部样式表

```html

                  将css代码单独放入一个.css文件中,那个html需要这些代码,就在head中通过link标签引入
                  <link rel="stylesheet" href="css/btn.css">
css文件中:
input{
        /*元素选择器,通过标签名确定样式的作用元素*/
        width: 60px; 
        height: 40px; 
        background-color: rgb(47, 255, 85);
        color: white;
        font-size: 20px;         
        font-family: 隶书;
        border: 2px solid green; 
        border-radius: 5px; 
       
        }
html文件中:
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="css/btn.css"> <!--rel: 声明引入文件的类型  href: 声明引入文件的路径-->
</head>
<body>
       <input type="button" value="按钮">
       <input type="button" value="按钮">
        <input type="button" value="按钮">
       <input type="button" value="按钮">
       <input type="button" value="按钮">
       <input type="button" value="按钮">
</body>
</html>
```

### 2.css的常用选择器

#### 1.元素选择器

​      语法:标签名{}

​      缺点:某些同名的元素不希望使用某些样式,某些不同名的元素也使用该样式,都无法协调

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        input{
            width: 80px;
            height: 40px;
            background-color: chartreuse;
            color: white;
            border: 3px solid green;
            font-size: 22px;
            font-family:'隶书';
            line-height: 30px;
            border-radius: 5px;
        }
    </style>
</head>
<body>
    <input type="button" value="按钮">
    <input type="button" value="按钮">
    <input type="button" value="按钮">
    <input type="button" value="按钮">
</body>
</html>
```

#### 2. id选择器

根据标签的id值确定样式的作用元素

​           一般每个元素都有id属性,但是在一个页面中,id的值不应该相同,id具有唯一性

​      语法: #id值{}

​      缺点: id具有唯一性,样式只能作用到一个元素上

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
      
        #y1{
            width: 80px;
            height: 40px;
            background-color: chartreuse;
            color: white;
            border: 3px solid green;
            font-size: 22px;
            font-family:'隶书';
            line-height: 30px;
            border-radius: 5px;
        }
    </style>
</head>
<body>
    <input id="y1"type="button" value="按钮">
    <input id="y2"   type="button" value="按钮">
    <input id="y3" type="button" value="按钮">
    <input id="y4" type="button" value="按钮">
</body>
</html>
```

#### 3.  class选择器

根据元素的class属性值确定样式的作用元素

​            元素的class属性值可以重复 而且一个元素的class属性可以有多个值

​      语法:  .class属性值{}

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        /*
        1. 元素选择器
           语法:标签名{}
           缺点:某些同名的元素不希望使用某些样式,某些不同名的元素也使用该样式,都无法协调

        2. id选择器  根据标签的id值确定样式的作用元素
                     一般每个元素都有id属性,但是在一个页面中,id的值不应该相同,id具有唯一性
           语法: #id值{}
           缺点: id具有唯一性,样式只能作用到一个元素上

        3. class选择器 根据元素的class属性值确定样式的作用元素
                       元素的class属性值可以重复 而且一个元素的class属性可以有多个值
            语法:  .class属性值{}

        */
        .shapeClass{
            width: 80px;
            height: 40px;
            border-radius: 5px;
        }
        .colorClass{
            background-color: chartreuse;
            color: white;
            border: 3px solid green;
        }
        .fontClass{
            font-size: 22px;
            font-family:'隶书';
            line-height: 30px;
        }



        /* input{
            width: 80px;
            height: 40px;
            background-color: chartreuse;
            color: white;
            border: 3px solid green;
            font-size: 22px;
            font-family:'隶书';
            line-height: 30px;
            border-radius: 5px;
        } */

        /* #y1{
            width: 80px;
            height: 40px;
            background-color: chartreuse;
            color: white;
            border: 3px solid green;
            font-size: 22px;
            font-family:'隶书';
            line-height: 30px;
            border-radius: 5px;
        } */
    </style>
</head>
<body>
    <input id="y1"type="button" value="按钮">
    <input id="y2" class="shapeClass colorClass"  type="button" value="按钮">
    <input id="y3" type="button" value="按钮">
    <input id="y4" type="button" value="按钮">
</body>
</html>
```

### 3.css浮动

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5CD9EAB38D96A764D9F6F79D968A44F91C.jpg)

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5CF966DD3D1DEA70722082BD8591802E5F.jpg)



```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        /*由于div 是三个块,分别独占一行,如果要让三个都在一行,不能直接用display:inline将其变成行,
          否则会失去原有块的特征.                                   display:block(默认为块)

          可以用float向右或左浮动
  
        */
        .outerDiv{
            width: 500px;
            height: 300px;
            border: 1px solid green;
            background-color: beige;

        }
        .innerDiv{
            width: 100px;
            height: 100px;
            border: 1px solid blue;
        }

        .d1{
            background-color: greenyellow;
            float: left;
        }
        .d2{
            background-color: rgb(210, 119, 119);
            float: left;
        }
        .d3{
            background-color: rgb(143, 209, 215);
            float: left;
        }
    </style>
</head>
<body>
    <div class="outerDiv">
        <div class="innerDiv d1">div1</div>
        <div class="innerDiv d2">div2</div>
        <div class="innerDiv d3">div3</div>
    </div>
</body>
</html>
```

### 4.css定位

postion:

​       static  默认

​       absolute  绝对

​       relative  相对  相对元素原本的位置,不脱离文档流,不会被其他元素占用

​       fixed  相对   相对浏览器窗口,脱离文档流

​    left

​    right

​    top

​    bottom

​    ->距离各个方向多少个像素

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        
        .innerDiv{
            width: 100px;
            height: 100px;
            border: 1px solid blue;
        }

        .d1{
            background-color: greenyellow;
            position: fixed;
            top: 30px;
            left: 30px;
        }
        .d2{
            background-color: rgb(210, 119, 119);
        }
        .d3{
            background-color: rgb(143, 209, 215);
           
        }
        /* 
        postion:
             static  默认
             absolute  绝对
             relative   相对  相对元素原本的位置,不脱离文档流,不会被其他元素占用
             fixed   相对     相对浏览器窗口,脱离文档流
        left
        right
        top
        bottom
        ->距离各个方向多少个像素


        */
    </style>
</head>
<body>
        <div class="innerDiv d1">div1</div>
        <div class="innerDiv d2">div2</div>
        <div class="innerDiv d3">div3</div>

        <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</body>
</html>
```

#### 5.css盒子模型

容量  1.width 100 2.height  100 容量  3. border  边线，不占用容量

外边距: 边线外的留白

内边距：边线内的留白

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5CB6765840F3F80A7D5C9931BE768D21C9.jpg)

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5CF9FB6CDC2201B3002C98D7F1EA5561D9.jpg)

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5CED8852CD58B7BF18E5EE819C671E5325.jpg)

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5CBF1D2C9602497B0E4CA5564B0558E86C.jpg)

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        
        .outerDiv{
            width: 500px;
            height: 300px;
            border: 1px solid green;
            background-color: beige;
            margin: 0px auto; /*auto: 左右平均分配*/

        }
        .innerDiv{
            width: 100px;
            height: 100px;
            border: 1px solid blue;
            float: left;
        }
        /*
        padding：内边距
        margin：外边距


        */
        .d1{
            background-color: greenyellow;
            margin-right: 10px;
            margin-top: 10px;
            margin-left: 10px;
                                /*只写了margin或padding,未指定方向,默认为四周都使用margin/padding方法*/
                                /*margin x y: 分别表示上下和左右外边距*/
            padding-top: 20px;
            padding-left: 20px;
            padding-bottom: 20px;
            padding-right: 20px;
        }
        .d2{
            background-color: rgb(210, 119, 119);
           margin-left: 10px;
        }
        .d3{
            background-color: rgb(143, 209, 215);
            margin: 10px 20px;
            
        }
    </style>
</head>
<body>
    <div class="outerDiv">
        <div class="innerDiv d1">div1</div>
        <div class="innerDiv d2">div2</div>
        <div class="innerDiv d3">div3</div>
    </div>
</body>
</html>
```

## 3.JavaScript

### 1.js的引入方式

外部脚本文件js/button.js:

```html
引入方式
         1.内嵌式 在head中通过一对script标签定义脚本代码
         2.引入外部脚本文件  在head中通过一对script标签引入外部js文件
                          <script src="js/button.js" type="text/javascript"></script>
         注意:
             1 一个html可以有多个script标签
             2 一对script标签不能在引入外部js文件时同时定义内部脚本
             3 script标签如果用于引入外部文件, 中间最好不要有任何字符 包括空格和换行
```



```html
function surprise(){
            //弹窗提示
            alert("hello,我是惊喜!")
        }
```



```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        .btn1{
            width: 150px;
            height: 40px;
            font-size: 24px;
            font-family: '隶书';
            background-color: yellow;
            color: rgb(rgb(145, 15, 15), green, blue);
            border: 3px solid rgb(145, 15, 15);
            border-radius: 5px;
        }
    </style>
    <!--  
         引入方式
         1.内嵌式 在head中通过一对script标签定义脚本代码
         2.引入外部脚本文件  在head中通过一对script标签引入外部js文件
                          <script src="js/button.js" type="text/javascript"></script>
         注意:
             1 一个html可以有多个script标签
             2 一对script标签不能在引入外部js文件时同时定义内部脚本
             3 script标签如果用于引入外部文件, 中间最好不要有任何字符 包括空格和换行
    
    
    -->
    <script>
        /*
        1.js 如何声明函数:   java中的函数 public void surprise(){}
                            js:function surprise(){}
        2.函数如何和单击按钮绑定在一起: onclick="surprise()"
        3.如何弹窗提示: alert("hello,我是惊喜!")

        */
        function surprise(){
            //弹窗提示
            alert("hello,我是惊喜!")
        }
    </script>
    <script>
        function hello(){
            alert("hello,world")
        }
    </script>
</head>
<body>
    <button class="btn1" onclick="surprise()">点我有惊喜</button>
    <button class="btn1" onclick="hello()">Hello</button>
</body>
</html>
```

### 2.js的数据类型

```
JS是弱类型的,不是没有类型,声明变量时不指定类型,赋值时才确定类型,JS中的变量声明 统统使用var
      int i=10 var=10;
      String str="asdf" var str="asdf"
     JS常见的数据类型
          数值类型  number  整数 小数
          字符串类型  string
          布尔类型  boolean
          引用类型  Object
          function类型  function
          命名未赋值  undefined  值 undefined
          赋予null  Object  值  null
     判断数据类型的运算符  typeof
     
js中 使用var声明变量的特点
      1 弱类型变量,可以统一声明成var
      2 var声明的变量可以再次声明
      3 变量可以使用不同的数据类型多次赋值
      4 JS的语句可以以; 结尾,也可以不用
      5 变量标志符严格区分大小写
      6 标志符的命名规则参照JAVA
      7 如果使用了未声明的变量,运行时会报错
      8 如果一个变量只声明不赋值, 那么值是undefined
```



```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script>
    
    //  var i=10;
    //  var str="asdf"
    //  console.log(i) /*打在控制台上*/
    //  console.log(str)

    var i=10
    console.log(i)
    console.log(typeof i)//number

    var i="asdf"
    console.log(i)
    console.log(typeof i)//string

    var i=1>10
    console.log(i)
    console.log(typeof i)//boolean

    var i=new Object()
    console.log(i)
    console.log(typeof i)//object

    function func(){

    }
    console.log(func)
    console.log(typeof func)//function

    var x=null
    console.log(x)//null
    console.log(typeof x)//object

    
    </script>
</head>
<body>
    
</body>
</html>
```

### 3.js的运算符

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script>
        /*
        1  算数   + - * / %
              除0 Infinity
              模0 NaN
        2  复合算数 ++ -- += -= *= %=
        3  关系  > < >= <= != == ===
             ==  如果两端数据类型不一致,会尝试将两端都转换为number再对比
             === 如果两端数据类型不一致,直接返回false,相同则会继续对比
        4  逻辑  || &&
        5  条件  条件表达式? 值1:值2
        6  位  | & ^ << >> >>>
        */
    </script>
</head>
<body>
    
</body>
</html>
```

### 4.js的分支结构

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script>
        /*
             if

             switch
        */
         
        /*
         prompt 返回的结果就是用户在窗口上输入的值,以string类型返回
        */
       var month=prompt("请输入月份");
       console.log(typeof month)
       //字符串转换成整数
       var month=Number.parseInt(month);
       console.log(typeof month)
       if(month==12||month==1||month==2){
        console.log("冬天")
       }
       else if(month>=3&&month<=5){
        console.log("春天")
       }
       else if(month>=6&&month<=8){
        console.log("夏天")
       }else if(month>=9&&month<=11){
         console.log("秋天")
       }

       /*
         1 非空字符串 会判断为 true if("字符串")
         2 非空对象  会判断为 true  if(new Object())
         3 非0number 会判断为 true if(!=0)

       */
    </script>
</head>
<body>
    
</body>
</html>
```

### 5.js的循环结构

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script>
        1.while   document:打印在屏幕上
           var i=1
           while(i<=9){
             var j=1
             while(j<=i){
                 document.write(j+"*"+i+"="+(j*i)+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;")
                 j++
             }
             document.write("<hr>")
             i++
           }
        2.for
        for(var i=1;i<=9;i++){
            for(var j=1;j<=9;j++){
                document.write(j+"*"+i+"="+(j*i)+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;")
            }"
            document.write("<hr>")
          }

        3.forEach 和java不同 for(var t:)中的"":"应该改为in,同时返回的是索引.
        document.write("<ul>")
        var arr=["北京","天津","上海"]
        for(var v in arr){
            document.write("<li>"+arr[v]+"</li>")
        }
        document.write("</ul>")



    </script>
</head>
<body>
    
</body>
</html>
```

### 6.js的函数声明

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script>
       /*
       函数声明的语法
          1. function 函数名(){}
          2. var 函数名=function(){}
     
       和java相比有如下特点
           1 没有访问修饰符
           2 没有返回值类型也没有void 如果有值要返回,直接return即可
           3 没有异常列表
           4 调用方法时,实参和形参可以在数量上不一致, 在方法内部可以通过 arguments获得调用时的实参
           5 函数也可以作为参数传递给另一个方法
       */
      //例:两数相加
      //第一种方法
        function sum(a,b){
         return a+b
       }
       var sum1=sum(10,20)
       console.log(sum1)
      //第二种方法
      var sum=function(a,b){
        return a+b
      }
      function add(getSum){
        return getSum(20,30)
      }

      //调用函数,接收结果
      var sum1=add(sum)
      console.log(sum1)//50

    </script>
</head>
<body>
    
</body>
</html>
```

### 7.js声明对象的语法

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script>
        /*
           Java中  类 >>> 实例化 >>> 对象
           创建对象的语法
           方式1  new Object

           方式2  {属性名:属性值,......,函数名:function(){}}

        */

        /*  方式1
         var person=new Object();
         person.name="张三"
         person.age=10
         person.eat=function(food){
            console.log(this.age+"岁的"+this.name+"正在吃"+food)
         }*/
         
        /*  方式2
            var person={
            "name":"张三",
             "age":10,
             "eat":function(food){
                console.log(this.age+"岁的"+this.name+"正在吃"+food)
             }
         }

        */
         
        //访问属性
         console.log(person.name)
         console.log(person.age)
         person.eat("米饭")//调用方法


    </script>
</head>
<body>
    
</body>
</html>
```

### 8.js中使用JSON串

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script>
       /*
           JSON格式的语法                                           // 对象          //数组              //对象数组
             var personStr='{"属性名":"属性值","属性名":"属性值","属性名":{},"属性名":["","",""],"属性名":[{},{},{}]}'
             属性名必须用"" 包裹上
             属性值 字符串必须用""包好,数字可以不处理
      */
      //JSON 格式的字符串
      var personStr='{"name":"张三","age":10,"dog":{"dname":"usao"},"loveSingers":["王五","李四","赵二"],"friends":[{"fname":"tom"},{"fname":"john"},{"fname":"xec"}]}'
      console.log(personStr)
      console.log(typeof personStr)

      var person=JSON.parse(personStr)
      console.log(person)
      console.log(person.name)
      console.log(person.dog.dname)
      console.log(person.loveSingers[0])
      console.log(person.friends[0].fname)
      //通过JSON.stringify() 将一个对象转换为JSON串
      var personStr2=JSON.stringify(person)
      console.log(personStr2)

    </script>
</head>
<body>
    
</body>
</html>
```

### 9.JSON在服务端中的使用&&10.JSON和Map_List_Array之间的转换关系

```java
package test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import pojo.Dog;
import pojo.person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestJson {

    @Test
    public void testWriteJson() throws JsonProcessingException {
        //实例化person对象  将person对象转换为JSON串
        Dog dog=new Dog("小黄");
        person person=new person("张三",10,dog);

        ObjectMapper objectMapper=new ObjectMapper();
        String personStr = objectMapper.writeValueAsString(person);
        System.out.println(personStr);
    }
    @Test
    public void testReadJson() throws JsonProcessingException {
        //将JSON串转换为对象
        String s="{\"name\":\"张三\",\"age\":10,\"dog\":{\"name\":\"小黄\"}}";
        ObjectMapper objectMapper=new ObjectMapper();
        person person1 = objectMapper.readValue(s, person.class);
        System.out.println(person1);
    }
    /* map */
    @Test
    public void MapToJSON() throws JsonProcessingException {
        Map data=new HashMap();
        data.put("a","valuea");
        data.put("b","valueb");
        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(data);
        System.out.println(s);// {"a":"valuea","b":"valueb"}
    }
    /* list array */
    @Test
    public void testListToJSON() throws Exception {
//        List data=new ArrayList();
//        data.add("a");
//        data.add("b");
//        data.add("c");  ["a","b","c"]

        //String []data={"a","b","c"}; ["a","b","c"]
        Dog dog=new Dog("小黄");
        person person1=new person("张三",10,dog);
        List data=new ArrayList();
        data.add(person1);
        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(data);
        System.out.println(s);// [{"name":"张三","age":10,"dog":{"name":"小黄"}}]
    }

}

```

### 11. JS常见对象

#### 1 数组

> 创建数组的四种方式

+ new Array()                                                   创建空数组
+ new Array(5)                                                 创建数组时给定长度
+ new Array(ele1,ele2,ele3,... ... ,elen);          创建数组时指定元素值
+ [ele1,ele2,ele3,... ... ,elen];                           相当于第三种语法的简写

> 数组的常见API

+ 在JS中,数组属于Object类型,其长度是可以变化的,更像JAVA中的集合

| 方法                                                         | 描述                                                         |
| :----------------------------------------------------------- | :----------------------------------------------------------- |
| [concat()](https://www.runoob.com/jsref/jsref-concat-array.html) | 连接两个或更多的数组，并返回结果。                           |
| [copyWithin()](https://www.runoob.com/jsref/jsref-copywithin.html) | 从数组的指定位置拷贝元素到数组的另一个指定位置中。           |
| [entries()](https://www.runoob.com/jsref/jsref-entries.html) | 返回数组的可迭代对象。                                       |
| [every()](https://www.runoob.com/jsref/jsref-every.html)     | 检测数值元素的每个元素是否都符合条件。                       |
| [fill()](https://www.runoob.com/jsref/jsref-fill.html)       | 使用一个固定值来填充数组。                                   |
| [filter()](https://www.runoob.com/jsref/jsref-filter.html)   | 检测数值元素，并返回符合条件所有元素的数组。                 |
| [find()](https://www.runoob.com/jsref/jsref-find.html)       | 返回符合传入测试（函数）条件的数组元素。                     |
| [findIndex()](https://www.runoob.com/jsref/jsref-findindex.html) | 返回符合传入测试（函数）条件的数组元素索引。                 |
| [forEach()](https://www.runoob.com/jsref/jsref-foreach.html) | 数组每个元素都执行一次回调函数。                             |
| [from()](https://www.runoob.com/jsref/jsref-from.html)       | 通过给定的对象中创建一个数组。                               |
| [includes()](https://www.runoob.com/jsref/jsref-includes.html) | 判断一个数组是否包含一个指定的值。                           |
| [indexOf()](https://www.runoob.com/jsref/jsref-indexof-array.html) | 搜索数组中的元素，并返回它所在的位置。                       |
| [isArray()](https://www.runoob.com/jsref/jsref-isarray.html) | 判断对象是否为数组。                                         |
| [join()](https://www.runoob.com/jsref/jsref-join.html)       | 把数组的所有元素放入一个字符串。                             |
| [keys()](https://www.runoob.com/jsref/jsref-keys.html)       | 返回数组的可迭代对象，包含原始数组的键(key)。                |
| [lastIndexOf()](https://www.runoob.com/jsref/jsref-lastindexof-array.html) | 搜索数组中的元素，并返回它最后出现的位置。                   |
| [map()](https://www.runoob.com/jsref/jsref-map.html)         | 通过指定函数处理数组的每个元素，并返回处理后的数组。         |
| [pop()](https://www.runoob.com/jsref/jsref-pop.html)         | 删除数组的最后一个元素并返回删除的元素。                     |
| [push()](https://www.runoob.com/jsref/jsref-push.html)       | 向数组的末尾添加一个或更多元素，并返回新的长度。             |
| [reduce()](https://www.runoob.com/jsref/jsref-reduce.html)   | 将数组元素计算为一个值（从左到右）。                         |
| [reduceRight()](https://www.runoob.com/jsref/jsref-reduceright.html) | 将数组元素计算为一个值（从右到左）。                         |
| [reverse()](https://www.runoob.com/jsref/jsref-reverse.html) | 反转数组的元素顺序。                                         |
| [shift()](https://www.runoob.com/jsref/jsref-shift.html)     | 删除并返回数组的第一个元素。                                 |
| [slice()](https://www.runoob.com/jsref/jsref-slice-array.html) | 选取数组的一部分，并返回一个新数组。                         |
| [some()](https://www.runoob.com/jsref/jsref-some.html)       | 检测数组元素中是否有元素符合指定条件。                       |
| [sort()](https://www.runoob.com/jsref/jsref-sort.html)       | 对数组的元素进行排序。                                       |
| [splice()](https://www.runoob.com/jsref/jsref-splice.html)   | 从数组中添加或删除元素。                                     |
| [toString()](https://www.runoob.com/jsref/jsref-tostring-array.html) | 把数组转换为字符串，并返回结果。                             |
| [unshift()](https://www.runoob.com/jsref/jsref-unshift.html) | 向数组的开头添加一个或更多元素，并返回新的长度。             |
| [valueOf()](https://www.runoob.com/jsref/jsref-valueof-array.html) | 返回数组对象的原始值。                                       |
| [Array.of()](https://www.runoob.com/jsref/jsref-of-array.html) | 将一组值转换为数组。                                         |
| [Array.at()](https://www.runoob.com/jsref/jsref-at-array.html) | 用于接收一个整数值并返回该索引对应的元素，允许正数和负数。负整数从数组中的最后一个元素开始倒数。 |
| [Array.flat()](https://www.runoob.com/jsref/jsref-flat-array.html) | 创建一个新数组，这个新数组由原数组中的每个元素都调用一次提供的函数后的返回值组成。 |
| [Array.flatMap()](https://www.runoob.com/jsref/jsref-flatmap-array.html) | 使用映射函数映射每个元素，然后将结果压缩成一个新数组。       |

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script>
    /*
      1.数据
         1)数组的创建方式
         2)数组的常见api

    */
   //1.数组拼接-concat
     var fruits=["apple","banana","orange"]
     var fruits2=["荔枝",'桃子','榴莲','榴莲','榴莲']
     var fruitsAll=fruits.concat(fruits2)
    console.log(fruitsAll) // ['apple', 'banana', 'orange', '荔枝', '桃子', '榴莲']
    console.log(fruits)//['apple', 'banana', 'orange']
    console.log(fruits2)//  ['荔枝', '桃子', '榴莲']
    
    //2.移除并返回最后一个元素-pop
    var res=fruitsAll.pop()
    console.log(res) // '榴莲'
    console.log(fruitsAll) // ['apple', 'banana', 'orange', '荔枝', '桃子']

    //3.从尾端增加元素并返回长度-push
    var len=fruitsAll.push('葡萄')
    console.log(len) // 6
    console.log(fruitsAll) // ['apple', 'banana', 'orange', '荔枝', '桃子', '葡萄']

     //4. 查找榴莲
     var index1=fruitsAll.indexOf("榴莲") //5
     var index2=fruitsAll.lastIndexOf("榴莲")//6
     console.log(index1) 
     console.log(index2) 

     //5.反转-reverse
     fruitsAll.reverse()
     console.log(fruitsAll) // ['葡萄', '榴莲', '榴莲', '桃子', '荔枝', 'orange', 'banana', 'apple']

     //6.转换为字符串-join
     console.log(fruitsAll.join("-")) //['葡萄', '榴莲', '榴莲', '桃子', '荔枝', 'orange', 'banana', 'apple']

     //7.截取数据-slice
     console.log(fruitsAll.slice(2,6))// 前闭后开  ['榴莲', '桃子', '荔枝', 'orange']

     //8.删除或者增加数据
     fruitsAll.splice(2,0,'el1','el2') //2:在第二个位置增加el1,el2; 0:删除几个元素
     console.log(fruitsAll)

    
//    var arr=new Array("zhangsan",10,false)
//    console.log(arr) // ['zhangsan', 10, false]
//    console.log(arr.length)//3
//    //添加数据
//    arr[0]="zhangsan"
//    arr[1]=10
//    arr[9]=true
//    arr.length=20
//    console.log(arr)  // ['zhangsan', 10, false, 空 ×6, true, 空 ×10]
//    console.log(arr.length) //20
    </script>
</head>
<body>
    
</body>
</html>
```



#### 2 Boolean对象

> boolean对象的方法比较简单

| 方法                                                         | 描述                               |
| :----------------------------------------------------------- | :--------------------------------- |
| [toString()](https://www.runoob.com/jsref/jsref-tostring-boolean.html) | 把布尔值转换为字符串，并返回结果。 |
| [valueOf()](https://www.runoob.com/jsref/jsref-valueof-boolean.html) | 返回 Boolean 对象的原始值。        |

3 Date对象

> 和JAVA中的Date类比较类似

| 方法                                                         | 描述                                                         |
| :----------------------------------------------------------- | :----------------------------------------------------------- |
| [getDate()](https://www.runoob.com/jsref/jsref-getdate.html) | 从 Date 对象返回一个月中的某一天 (1 ~ 31)。                  |
| [getDay()](https://www.runoob.com/jsref/jsref-getday.html)   | 从 Date 对象返回一周中的某一天 (0 ~ 6)。                     |
| [getFullYear()](https://www.runoob.com/jsref/jsref-getfullyear.html) | 从 Date 对象以四位数字返回年份。                             |
| [getHours()](https://www.runoob.com/jsref/jsref-gethours.html) | 返回 Date 对象的小时 (0 ~ 23)。                              |
| [getMilliseconds()](https://www.runoob.com/jsref/jsref-getmilliseconds.html) | 返回 Date 对象的毫秒(0 ~ 999)。                              |
| [getMinutes()](https://www.runoob.com/jsref/jsref-getminutes.html) | 返回 Date 对象的分钟 (0 ~ 59)。                              |
| [getMonth()](https://www.runoob.com/jsref/jsref-getmonth.html) | 从 Date 对象返回月份 (0 ~ 11)。                              |
| [getSeconds()](https://www.runoob.com/jsref/jsref-getseconds.html) | 返回 Date 对象的秒数 (0 ~ 59)。                              |
| [getTime()](https://www.runoob.com/jsref/jsref-gettime.html) | 返回 1970 年 1 月 1 日至今的毫秒数。                         |
| [getTimezoneOffset()](https://www.runoob.com/jsref/jsref-gettimezoneoffset.html) | 返回本地时间与格林威治标准时间 (GMT) 的分钟差。              |
| [getUTCDate()](https://www.runoob.com/jsref/jsref-getutcdate.html) | 根据世界时从 Date 对象返回月中的一天 (1 ~ 31)。              |
| [getUTCDay()](https://www.runoob.com/jsref/jsref-getutcday.html) | 根据世界时从 Date 对象返回周中的一天 (0 ~ 6)。               |
| [getUTCFullYear()](https://www.runoob.com/jsref/jsref-getutcfullyear.html) | 根据世界时从 Date 对象返回四位数的年份。                     |
| [getUTCHours()](https://www.runoob.com/jsref/jsref-getutchours.html) | 根据世界时返回 Date 对象的小时 (0 ~ 23)。                    |
| [getUTCMilliseconds()](https://www.runoob.com/jsref/jsref-getutcmilliseconds.html) | 根据世界时返回 Date 对象的毫秒(0 ~ 999)。                    |
| [getUTCMinutes()](https://www.runoob.com/jsref/jsref-getutcminutes.html) | 根据世界时返回 Date 对象的分钟 (0 ~ 59)。                    |
| [getUTCMonth()](https://www.runoob.com/jsref/jsref-getutcmonth.html) | 根据世界时从 Date 对象返回月份 (0 ~ 11)。                    |
| [getUTCSeconds()](https://www.runoob.com/jsref/jsref-getutcseconds.html) | 根据世界时返回 Date 对象的秒钟 (0 ~ 59)。                    |
| getYear()                                                    | 已废弃。 请使用 getFullYear() 方法代替。                     |
| [parse()](https://www.runoob.com/jsref/jsref-parse.html)     | 返回1970年1月1日午夜到指定日期（字符串）的毫秒数。           |
| [setDate()](https://www.runoob.com/jsref/jsref-setdate.html) | 设置 Date 对象中月的某一天 (1 ~ 31)。                        |
| [setFullYear()](https://www.runoob.com/jsref/jsref-setfullyear.html) | 设置 Date 对象中的年份（四位数字）。                         |
| [setHours()](https://www.runoob.com/jsref/jsref-sethours.html) | 设置 Date 对象中的小时 (0 ~ 23)。                            |
| [setMilliseconds()](https://www.runoob.com/jsref/jsref-setmilliseconds.html) | 设置 Date 对象中的毫秒 (0 ~ 999)。                           |
| [setMinutes()](https://www.runoob.com/jsref/jsref-setminutes.html) | 设置 Date 对象中的分钟 (0 ~ 59)。                            |
| [setMonth()](https://www.runoob.com/jsref/jsref-setmonth.html) | 设置 Date 对象中月份 (0 ~ 11)。                              |
| [setSeconds()](https://www.runoob.com/jsref/jsref-setseconds.html) | 设置 Date 对象中的秒钟 (0 ~ 59)。                            |
| [setTime()](https://www.runoob.com/jsref/jsref-settime.html) | setTime() 方法以毫秒设置 Date 对象。                         |
| [setUTCDate()](https://www.runoob.com/jsref/jsref-setutcdate.html) | 根据世界时设置 Date 对象中月份的一天 (1 ~ 31)。              |
| [setUTCFullYear()](https://www.runoob.com/jsref/jsref-setutcfullyear.html) | 根据世界时设置 Date 对象中的年份（四位数字）。               |
| [setUTCHours()](https://www.runoob.com/jsref/jsref-setutchours.html) | 根据世界时设置 Date 对象中的小时 (0 ~ 23)。                  |
| [setUTCMilliseconds()](https://www.runoob.com/jsref/jsref-setutcmilliseconds.html) | 根据世界时设置 Date 对象中的毫秒 (0 ~ 999)。                 |
| [setUTCMinutes()](https://www.runoob.com/jsref/jsref-setutcminutes.html) | 根据世界时设置 Date 对象中的分钟 (0 ~ 59)。                  |
| [setUTCMonth()](https://www.runoob.com/jsref/jsref-setutcmonth.html) | 根据世界时设置 Date 对象中的月份 (0 ~ 11)。                  |
| [setUTCSeconds()](https://www.runoob.com/jsref/jsref-setutcseconds.html) | setUTCSeconds() 方法用于根据世界时 (UTC) 设置指定时间的秒字段。 |
| setYear()                                                    | 已废弃。请使用 setFullYear() 方法代替。                      |
| [toDateString()](https://www.runoob.com/jsref/jsref-todatestring.html) | 把 Date 对象的日期部分转换为字符串。                         |
| toGMTString()                                                | 已废弃。请使用 toUTCString() 方法代替。                      |
| [toISOString()](https://www.runoob.com/jsref/jsref-toisostring.html) | 使用 ISO 标准返回字符串的日期格式。                          |
| [toJSON()](https://www.runoob.com/jsref/jsref-tojson.html)   | 以 JSON 数据格式返回日期字符串。                             |
| [toLocaleDateString()](https://www.runoob.com/jsref/jsref-tolocaledatestring.html) | 根据本地时间格式，把 Date 对象的日期部分转换为字符串。       |
| [toLocaleTimeString()](https://www.runoob.com/jsref/jsref-tolocaletimestring.html) | 根据本地时间格式，把 Date 对象的时间部分转换为字符串。       |
| [toLocaleString()](https://www.runoob.com/jsref/jsref-tolocalestring.html) | 根据本地时间格式，把 Date 对象转换为字符串。                 |
| [toString()](https://www.runoob.com/jsref/jsref-tostring-date.html) | 把 Date 对象转换为字符串。                                   |
| [toTimeString()](https://www.runoob.com/jsref/jsref-totimestring.html) | 把 Date 对象的时间部分转换为字符串。                         |
| [toUTCString()](https://www.runoob.com/jsref/jsref-toutcstring.html) | 根据世界时，把 Date 对象转换为字符串。实例：`var today = new Date(); var UTCstring = today.toUTCString();` |
| [UTC()](https://www.runoob.com/jsref/jsref-utc.html)         | 根据世界时返回 1970 年 1 月 1 日 到指定日期的毫秒数。        |
| [valueOf()](https://www.runoob.com/jsref/jsref-valueof-date.html) | 返回 Date 对象的原始值。                                     |

#### 4 Math

>  和JAVA中的Math类比较类似

| 方法                                                         | 描述                                                         |
| :----------------------------------------------------------- | :----------------------------------------------------------- |
| [abs(x)](https://www.runoob.com/jsref/jsref-abs.html)        | 返回 x 的绝对值。                                            |
| [acos(x)](https://www.runoob.com/jsref/jsref-acos.html)      | 返回 x 的反余弦值。                                          |
| [asin(x)](https://www.runoob.com/jsref/jsref-asin.html)      | 返回 x 的反正弦值。                                          |
| [atan(x)](https://www.runoob.com/jsref/jsref-atan.html)      | 以介于 -PI/2 与 PI/2 弧度之间的数值来返回 x 的反正切值。     |
| [atan2(y,x)](https://www.runoob.com/jsref/jsref-atan2.html)  | 返回从 x 轴到点 (x,y) 的角度（介于 -PI/2 与 PI/2 弧度之间）。 |
| [ceil(x)](https://www.runoob.com/jsref/jsref-ceil.html)      | 对数进行上舍入。                                             |
| [cos(x)](https://www.runoob.com/jsref/jsref-cos.html)        | 返回数的余弦。                                               |
| [exp(x)](https://www.runoob.com/jsref/jsref-exp.html)        | 返回 Ex 的指数。                                             |
| [floor(x)](https://www.runoob.com/jsref/jsref-floor.html)    | 对 x 进行下舍入。                                            |
| [log(x)](https://www.runoob.com/jsref/jsref-log.html)        | 返回数的自然对数（底为e）。                                  |
| [max(x,y,z,...,n)](https://www.runoob.com/jsref/jsref-max.html) | 返回 x,y,z,...,n 中的最高值。                                |
| [min(x,y,z,...,n)](https://www.runoob.com/jsref/jsref-min.html) | 返回 x,y,z,...,n中的最低值。                                 |
| [pow(x,y)](https://www.runoob.com/jsref/jsref-pow.html)      | 返回 x 的 y 次幂。                                           |
| [random()](https://www.runoob.com/jsref/jsref-random.html)   | 返回 0 ~ 1 之间的随机数。                                    |
| [round(x)](https://www.runoob.com/jsref/jsref-round.html)    | 四舍五入。                                                   |
| [sin(x)](https://www.runoob.com/jsref/jsref-sin.html)        | 返回数的正弦。                                               |
| [sqrt(x)](https://www.runoob.com/jsref/jsref-sqrt.html)      | 返回数的平方根。                                             |
| [tan(x)](https://www.runoob.com/jsref/jsref-tan.html)        | 返回角的正切。                                               |
| [tanh(x)](https://www.runoob.com/jsref/jsref-tanh.html)      | 返回一个数的双曲正切函数值。                                 |
| [trunc(x)](https://www.runoob.com/jsref/jsref-trunc.html)    | 将数字的小数部分去掉，只保留整数部分。                       |

#### 5 Number

> Number中准备了一些基础的数据处理函数

| 方法                                                         | 描述                                                 |
| :----------------------------------------------------------- | :--------------------------------------------------- |
| [isFinite](https://www.runoob.com/jsref/jsref-isfinite-number.html) | 检测指定参数是否为无穷大。                           |
| [isInteger](https://www.runoob.com/jsref/jsref-isinteger-number.html) | 检测指定参数是否为整数。                             |
| [isNaN](https://www.runoob.com/jsref/jsref-isnan-number.html) | 检测指定参数是否为 NaN。                             |
| [isSafeInteger](https://www.runoob.com/jsref/jsref-issafeInteger-number.html) | 检测指定参数是否为安全整数。                         |
| [toExponential(x)](https://www.runoob.com/jsref/jsref-toexponential.html) | 把对象的值转换为指数计数法。                         |
| [toFixed(x)](https://www.runoob.com/jsref/jsref-tofixed.html) | 把数字转换为字符串，结果的小数点后有指定位数的数字。 |
| [toLocaleString(locales, options)](https://www.runoob.com/jsref/jsref-tolocalestring-number.html) | 返回数字在特定语言环境下的表示字符串。               |
| [toPrecision(x)](https://www.runoob.com/jsref/jsref-toprecision.html) | 把数字格式化为指定的长度。                           |
| [toString()](https://www.runoob.com/jsref/jsref-tostring-number.html) | 把数字转换为字符串，使用指定的基数。                 |
| [valueOf()](https://www.runoob.com/jsref/jsref-valueof-number.html) | 返回一个 Number 对象的基本数字值。                   |

```html
var v1='10'
     var v2=10
     console.log(Number.parseInt(v1+v2)) //1010
```



#### 6 String

> 和JAVA中的String类似

| 方法                                                         | 描述                                                         |
| :----------------------------------------------------------- | :----------------------------------------------------------- |
| [charAt()](https://www.runoob.com/jsref/jsref-charat.html)   | 返回在指定位置的字符。                                       |
| [charCodeAt()](https://www.runoob.com/jsref/jsref-charcodeat.html) | 返回在指定的位置的字符的 Unicode 编码。                      |
| [concat()](https://www.runoob.com/jsref/jsref-concat-string.html) | 连接两个或更多字符串，并返回新的字符串。                     |
| [endsWith()](https://www.runoob.com/jsref/jsref-endswith.html) | 判断当前字符串是否是以指定的子字符串结尾的（区分大小写）。   |
| [fromCharCode()](https://www.runoob.com/jsref/jsref-fromcharcode.html) | 将 Unicode 编码转为字符。                                    |
| [indexOf()](https://www.runoob.com/jsref/jsref-indexof.html) | 返回某个指定的字符串值在字符串中首次出现的位置。             |
| [includes()](https://www.runoob.com/jsref/jsref-string-includes.html) | 查找字符串中是否包含指定的子字符串。                         |
| [lastIndexOf()](https://www.runoob.com/jsref/jsref-lastindexof.html) | 从后向前搜索字符串，并从起始位置（0）开始计算返回字符串最后出现的位置。 |
| [match()](https://www.runoob.com/jsref/jsref-match.html)     | 查找找到一个或多个正则表达式的匹配。                         |
| [repeat()](https://www.runoob.com/jsref/jsref-repeat.html)   | 复制字符串指定次数，并将它们连接在一起返回。                 |
| [replace()](https://www.runoob.com/jsref/jsref-replace.html) | 在字符串中查找匹配的子串，并替换与正则表达式匹配的子串。     |
| [replaceAll()](https://www.runoob.com/jsref/jsref-replaceall.html) | 在字符串中查找匹配的子串，并替换与正则表达式匹配的所有子串。 |
| [search()](https://www.runoob.com/jsref/jsref-search.html)   | 查找与正则表达式相匹配的值。                                 |
| [slice()](https://www.runoob.com/jsref/jsref-slice-string.html) | 提取字符串的片断，并在新的字符串中返回被提取的部分。         |
| [split()](https://www.runoob.com/jsref/jsref-split.html)     | 把字符串分割为字符串数组。                                   |
| [startsWith()](https://www.runoob.com/jsref/jsref-startswith.html) | 查看字符串是否以指定的子字符串开头。                         |
| [substr()](https://www.runoob.com/jsref/jsref-substr.html)   | 从起始索引号提取字符串中指定数目的字符。                     |
| [substring()](https://www.runoob.com/jsref/jsref-substring.html) | 提取字符串中两个指定的索引号之间的字符。                     |
| [toLowerCase()](https://www.runoob.com/jsref/jsref-tolowercase.html) | 把字符串转换为小写。                                         |
| [toUpperCase()](https://www.runoob.com/jsref/jsref-touppercase.html) | 把字符串转换为大写。                                         |
| [trim()](https://www.runoob.com/jsref/jsref-trim.html)       | 去除字符串两边的空白。                                       |
| [toLocaleLowerCase()](https://www.runoob.com/jsref/jsref-tolocalelowercase.html) | 根据本地主机的语言环境把字符串转换为小写。                   |
| [toLocaleUpperCase()](https://www.runoob.com/jsref/jsref-tolocaleuppercase.html) | 根据本地主机的语言环境把字符串转换为大写。                   |
| [valueOf()](https://www.runoob.com/jsref/jsref-valueof-string.html) | 返回某个字符串对象的原始值。                                 |
| [toString()](https://www.runoob.com/jsref/jsref-tostring.html) | 返回一个字符串。                                             |

## 事件的绑定

### 1.什么是事件

>  HTML 事件可以是浏览器行为，也可以是用户行为。 当这些一些行为发生时,可以自动触发对应的JS函数的运行,我们称之为事件发生.JS的事件驱动指的就是行为触发代码运行的这种特点

### 2.常见事件

> 鼠标事件

| 属性                                                         | 描述                                   |
| :----------------------------------------------------------- | :------------------------------------- |
| [onclick](https://www.runoob.com/jsref/event-onclick.html)   | 当用户点击某个对象时调用的事件句柄。   |
| [oncontextmenu](https://www.runoob.com/jsref/event-oncontextmenu.html) | 在用户点击鼠标右键打开上下文菜单时触发 |
| [ondblclick](https://www.runoob.com/jsref/event-ondblclick.html) | 当用户双击某个对象时调用的事件句柄。   |
| [onmousedown](https://www.runoob.com/jsref/event-onmousedown.html) | 鼠标按钮被按下。                       |
| [onmouseenter](https://www.runoob.com/jsref/event-onmouseenter.html) | 当鼠标指针移动到元素上时触发。         |
| [onmouseleave](https://www.runoob.com/jsref/event-onmouseleave.html) | 当鼠标指针移出元素时触发               |
| [onmousemove](https://www.runoob.com/jsref/event-onmousemove.html) | 鼠标被移动。                           |
| [onmouseover](https://www.runoob.com/jsref/event-onmouseover.html) | 鼠标移到某元素之上。                   |
| [onmouseout](https://www.runoob.com/jsref/event-onmouseout.html) | 鼠标从某元素移开。                     |
| [onmouseup](https://www.runoob.com/jsref/event-onmouseup.html) | 鼠标按键被松开。                       |

> 键盘事件

| 属性                                                         | 描述                       |
| :----------------------------------------------------------- | :------------------------- |
| [onkeydown](https://www.runoob.com/jsref/event-onkeydown.html) | 某个键盘按键被按下。       |
| [onkeypress](https://www.runoob.com/jsref/event-onkeypress.html) | 某个键盘按键被按下并松开。 |
| [onkeyup](https://www.runoob.com/jsref/event-onkeyup.html)   | 某个键盘按键被松开。       |

> 表单事件

| 属性                                                         | 描述                                                         |
| :----------------------------------------------------------- | :----------------------------------------------------------- |
| [onblur](https://www.runoob.com/jsref/event-onblur.html)     | 元素失去焦点时触发                                           |
| [onchange](https://www.runoob.com/jsref/event-onchange.html) | 该事件在表单元素的内容改变时触发( <input>, <keygen>, <select>, 和 <textarea>) |
| [onfocus](https://www.runoob.com/jsref/event-onfocus.html)   | 元素获取焦点时触发                                           |
| [onfocusin](https://www.runoob.com/jsref/event-onfocusin.html) | 元素即将获取焦点时触发                                       |
| [onfocusout](https://www.runoob.com/jsref/event-onfocusout.html) | 元素即将失去焦点时触发                                       |
| [oninput](https://www.runoob.com/jsref/event-oninput.html)   | 元素获取用户输入时触发                                       |
| [onreset](https://www.runoob.com/jsref/event-onreset.html)   | 表单重置时触发                                               |
| [onsearch](https://www.runoob.com/jsref/event-onsearch.html) | 用户向搜索域输入文本时触发 ( <input="search">)               |
| [onselect](https://www.runoob.com/jsref/event-onselect.html) | 用户选取文本时触发 ( <input> 和 <textarea>)                  |
| [onsubmit](https://www.runoob.com/jsref/event-onsubmit.html) | 表单提交时触发                                               |



```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script>
        /*
        1 事件的绑定机制 
             1 通过元素的属性绑定
             2 通过DOM编程动态绑定
             注意事项:
                  1.一个事件可以同时绑定多个函数
                  2.一个元素可以同时绑定多个事件
        
        2 常见的事件
              1.鼠标事件
              2.键盘事件
              3.表单事件 onfocus onblur onchange
        */
        function fun1(){
            //alert("单击了")
            console.log("单击了")
        }
        function fun2(){
            //alert("单击了2")
            console.log("单击了2")
        }
        function fun3(){
            //alert("双击了")
            console.log("双击了")
        }
        function fun4(){
            console.log("鼠标悬停了")
        }
        function fun5(){
            console.log("鼠标移动了")
        }
        function fun6(){
            console.log("鼠标离开了")
        }
        function fun7(){
            console.log("按键按下了")
        }
        function fun8(){
            console.log("按键抬起了")
        } 
        function testFocus(){
            console.log("获得焦点了")
        }
        function testBlur(){
            console.log("失去焦点了")
        }
        function testChange(value){//value: 可记录具体改变了什么值.
            console.log(value+" 内容改变了") //当焦点移出后才视作改变
        }
        function testChange1(value){
            console.log(value+" 选项改变了")
        }
        function testSubmit(){
            /*
               弹窗的三种方式
               alert()信息提示框
               prompt()信息输入框
               confirm()信息确认框
            */
            //alert("表单提交了")
            //可以阻止表单提交
            var flag=confirm("确定要提交表单吗")
            if(flag){
                return true
            }
            return false
            //event.preventDefault();//阻止组件的默认行为
        }


    </script>
</head>
<body>
      <form action="01js的引入方式.html" method="get" onsubmit="return testSubmit()"> <!--向浏览器返回true/false-->                                             
        用户昵称:<input type="text" name="realname" onfocus="testFocus()" onblur="testBlur()" onchange="testChange(this.value)"> <br>
        登录账号:<input type="text" name="loginname" onfocus="testFocus()" onblur="testBlur()"> <br>
        选择籍贯:
        <select onchange="testChange1( this.value)">
            <option>北京</option>
            <option>上海</option>
            <option>广州</option>
        </select>
        <br>
        <input type="submit" value="注册">
        <input type="reset" value="清空">

      </form>

      <hr>
    <input type="button"
      value="按钮"
      onclick="fun1(),fun2()"
      ondblclick="fun3()"
    >
    <br>                                                    <!--悬停               移动                       离开-->
    <img src="img/img/1BBAFEED9572DE53611C14323B653521.jpg" onmouseover="fun4()" onmousemove="fun5()" onmouseleave="fun6()">
    <br>
    <input type="text" onkeydown="fun7()" onkeypress="fun8()">
</body>
</html>
```

### 3.jsDOM编程处理事件



```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
        <script>
        /*
            1 事件的绑定机制 
             1 通过元素的属性绑定
             2 通过DOM编程动态绑定
             注意事项:
                  1.一个事件可以同时绑定多个函数
                  2.一个元素可以同时绑定多个事件
        
        2 常见的事件
              1.鼠标事件
              2.键盘事件
              3.表单事件 onfocus onblur onchange
              4.页面加载事件 onload
        
        3 事件的触发
              1. 行为触发
              2. DOM编程触发
        */
        

        function ready(){
            //为div1绑定单击事件
           var div1=document.getElementById("d1")
           div1.onclick=function(){
              div1.style.backgroundColor="red"
           }

            var btn=document.getElementById("btn1")
            btn.onclick=function(){
            alert("按钮单击了")
            // 通过dom编程触发事件,相当于某些事件发生了
            // 通过DOM编程触发div的单击事件
            div1.onclick()
          }
          
           
        }

        </script>

        <style>
              .div1{
                width: 100px;
                height: 100px;
                background-color: yellow;
              }

        </style>
</head>
<body onload="ready()">  <!--onload 当所有代码执行完后才执行 ready()方法-->
     <div id="d1" class="div1">

     </div>


    <button id="btn1">按钮</button>
    <!-- <script> //法1:写在body 里面
        //通过dom获取要操作的元素
        var btn=document.getElementById("btn1")//通过id获得一个对象
        //绑定一个单击事件
        btn.onclick=function(){
            alert("按钮单击了")
        }
    </script> -->
</body>
</html>
```

##  BOM编程

### 1.什么是BOM

+ BOM是Browser Object Model的简写，即浏览器对象模型。

+ BOM由一系列对象组成，是访问、控制、修改浏览器的属性和方法(通过window对象及属性的一系列方法 控制浏览器行为的一种编程)

+ BOM没有统一的标准(每种客户端都可以自定标准)。

+ BOM编程是将浏览器窗口的各个组成部分抽象成各个对象,通过各个对象的API操作组件行为的一种编程

+ BOM编程的对象结构如下

  + window 顶级对象,代表整个浏览器窗口
    + location对象                 window对象的属性之一,代表浏览器的地址栏
    + history对象                   window对象的属性之一,代表浏览器的访问历史
    + screen对象                    window对象的属性之一,代表屏幕
    + navigator对象               window对象的属性之一,代表浏览器软件本身
    + document对象              window对象的属性之一,代表浏览器窗口目前解析的html文档
    + console对象                  window对象的属性之一,代表浏览器开发者工具的控制台
    + localStorage对象          window对象的属性之一,代表浏览器的本地数据持久化存储
    + sessionStorage对象      window对象的属性之一,代表浏览器的本地数据会话级存储

  <img src="images/1681267483366.png" alt="1681267483366" style="zoom:67%;" />

  ![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5C5EBB1A438A1FEC8D74B93C8D9BC59145.jpg)

###  2.window对象的常见属性(了解)

| 属性                                                         | 描述                                                         |
| :----------------------------------------------------------- | :----------------------------------------------------------- |
| [closed](https://www.runoob.com/jsref/prop-win-closed.html)  | 返回窗口是否已被关闭。                                       |
| [defaultStatus](https://www.runoob.com/jsref/prop-win-defaultstatus.html) | 设置或返回窗口状态栏中的默认文本。                           |
| [document](https://www.runoob.com/jsref/dom-obj-document.html) | 对 Document 对象的只读引用。(请参阅[对象](https://www.runoob.com/jsref/dom-obj-document.html)) |
| [frames](https://www.runoob.com/jsref/prop-win-frames.html)  | 返回窗口中所有命名的框架。该集合是 Window 对象的数组，每个 Window 对象在窗口中含有一个框架。 |
| [history](https://www.runoob.com/jsref/obj-history.html)     | 对 History 对象的只读引用。请参数 [History 对象](https://www.runoob.com/jsref/obj-history.html)。 |
| [innerHeight](https://www.runoob.com/jsref/prop-win-innerheight.html) | 返回窗口的文档显示区的高度。                                 |
| [innerWidth](https://www.runoob.com/jsref/prop-win-innerheight.html) | 返回窗口的文档显示区的宽度。                                 |
| [localStorage](https://www.runoob.com/jsref/prop-win-localstorage.html) | 在浏览器中存储 key/value 对。没有过期时间。                  |
| [length](https://www.runoob.com/jsref/prop-win-length.html)  | 设置或返回窗口中的框架数量。                                 |
| [location](https://www.runoob.com/jsref/obj-location.html)   | 用于窗口或框架的 Location 对象。请参阅 [Location 对象](https://www.runoob.com/jsref/obj-location.html)。 |
| [name](https://www.runoob.com/jsref/prop-win-name.html)      | 设置或返回窗口的名称。                                       |
| [navigator](https://www.runoob.com/jsref/obj-navigator.html) | 对 Navigator 对象的只读引用。请参数 [Navigator 对象](https://www.runoob.com/jsref/obj-navigator.html)。 |
| [opener](https://www.runoob.com/jsref/prop-win-opener.html)  | 返回对创建此窗口的窗口的引用。                               |
| [outerHeight](https://www.runoob.com/jsref/prop-win-outerheight.html) | 返回窗口的外部高度，包含工具条与滚动条。                     |
| [outerWidth](https://www.runoob.com/jsref/prop-win-outerheight.html) | 返回窗口的外部宽度，包含工具条与滚动条。                     |
| [pageXOffset](https://www.runoob.com/jsref/prop-win-pagexoffset.html) | 设置或返回当前页面相对于窗口显示区左上角的 X 位置。          |
| [pageYOffset](https://www.runoob.com/jsref/prop-win-pagexoffset.html) | 设置或返回当前页面相对于窗口显示区左上角的 Y 位置。          |
| [parent](https://www.runoob.com/jsref/prop-win-parent.html)  | 返回父窗口。                                                 |
| [screen](https://www.runoob.com/jsref/obj-screen.html)       | 对 Screen 对象的只读引用。请参数 [Screen 对象](https://www.runoob.com/jsref/obj-screen.html)。 |
| [screenLeft](https://www.runoob.com/jsref/prop-win-screenleft.html) | 返回相对于屏幕窗口的x坐标                                    |
| [screenTop](https://www.runoob.com/jsref/prop-win-screenleft.html) | 返回相对于屏幕窗口的y坐标                                    |
| [screenX](https://www.runoob.com/jsref/prop-win-screenx.html) | 返回相对于屏幕窗口的x坐标                                    |
| [sessionStorage](https://www.runoob.com/jsref/prop-win-sessionstorage.html) | 在浏览器中存储 key/value 对。 在关闭窗口或标签页之后将会删除这些数据。 |
| [screenY](https://www.runoob.com/jsref/prop-win-screenx.html) | 返回相对于屏幕窗口的y坐标                                    |
| [self](https://www.runoob.com/jsref/prop-win-self.html)      | 返回对当前窗口的引用。等价于 Window 属性。                   |
| [status](https://www.runoob.com/jsref/prop-win-status.html)  | 设置窗口状态栏的文本。                                       |
| [top](https://www.runoob.com/jsref/prop-win-top.html)        | 返回最顶层的父窗口。                                         |

### 3.window对象的常见方法(了解)

| 方法                                                         | 描述                                                         |
| :----------------------------------------------------------- | :----------------------------------------------------------- |
| [alert()](https://www.runoob.com/jsref/met-win-alert.html)   | 显示带有一段消息和一个确认按钮的警告框。                     |
| [atob()](https://www.runoob.com/jsref/met-win-atob.html)     | 解码一个 base-64 编码的字符串。                              |
| [btoa()](https://www.runoob.com/jsref/met-win-btoa.html)     | 创建一个 base-64 编码的字符串。                              |
| [blur()](https://www.runoob.com/jsref/met-win-blur.html)     | 把键盘焦点从顶层窗口移开。                                   |
| [clearInterval()](https://www.runoob.com/jsref/met-win-clearinterval.html) | 取消由 setInterval() 设置的 timeout。                        |
| [clearTimeout()](https://www.runoob.com/jsref/met-win-cleartimeout.html) | 取消由 setTimeout() 方法设置的 timeout。                     |
| [close()](https://www.runoob.com/jsref/met-win-close.html)   | 关闭浏览器窗口。                                             |
| [confirm()](https://www.runoob.com/jsref/met-win-confirm.html) | 显示带有一段消息以及确认按钮和取消按钮的对话框。             |
| [createPopup()](https://www.runoob.com/jsref/met-win-createpopup.html) | 创建一个 pop-up 窗口。                                       |
| [focus()](https://www.runoob.com/jsref/met-win-focus.html)   | 把键盘焦点给予一个窗口。                                     |
| [getSelection](https://www.runoob.com/jsref/met-win-getselection.html)() | 返回一个 Selection 对象，表示用户选择的文本范围或光标的当前位置。 |
| [getComputedStyle()](https://www.runoob.com/jsref/jsref-getcomputedstyle.html) | 获取指定元素的 CSS 样式。                                    |
| [matchMedia()](https://www.runoob.com/jsref/met-win-matchmedia.html) | 该方法用来检查 media query 语句，它返回一个 MediaQueryList对象。 |
| [moveBy()](https://www.runoob.com/jsref/met-win-moveby.html) | 可相对窗口的当前坐标把它移动指定的像素。                     |
| [moveTo()](https://www.runoob.com/jsref/met-win-moveto.html) | 把窗口的左上角移动到一个指定的坐标。                         |
| [open()](https://www.runoob.com/jsref/met-win-open.html)     | 打开一个新的浏览器窗口或查找一个已命名的窗口。               |
| [print()](https://www.runoob.com/jsref/met-win-print.html)   | 打印当前窗口的内容。                                         |
| [prompt()](https://www.runoob.com/jsref/met-win-prompt.html) | 显示可提示用户输入的对话框。                                 |
| [resizeBy()](https://www.runoob.com/jsref/met-win-resizeby.html) | 按照指定的像素调整窗口的大小。                               |
| [resizeTo()](https://www.runoob.com/jsref/met-win-resizeto.html) | 把窗口的大小调整到指定的宽度和高度。                         |
| scroll()                                                     | 已废弃。 该方法已经使用了 [scrollTo()](https://www.runoob.com/jsref/met-win-scrollto.html) 方法来替代。 |
| [scrollBy()](https://www.runoob.com/jsref/met-win-scrollby.html) | 按照指定的像素值来滚动内容。                                 |
| [scrollTo()](https://www.runoob.com/jsref/met-win-scrollto.html) | 把内容滚动到指定的坐标。                                     |
| [setInterval()](https://www.runoob.com/jsref/met-win-setinterval.html) | 按照指定的周期（以毫秒计）来调用函数或计算表达式。           |
| [setTimeout()](https://www.runoob.com/jsref/met-win-settimeout.html) | 在指定的毫秒数后调用函数或计算表达式。                       |
| [stop()](https://www.runoob.com/jsref/met-win-stop.html)     | 停止页面载入。                                               |
| [postMessage()](https://www.runoob.com/jsref/met-win-postmessage.html) | 安全地实现跨源通信。                                         |

### 4. 通过BOM编程控制浏览器行为演示

>  三种弹窗方式

``` html
    <head>
        <meta charset="UTF-8">
        <title>小标题</title>
      
        <script>
           function testAlert(){
                //普通信息提示框
                window.alert("提示信息");
           }
           function testConfirm(){
                //确认框
                var con =confirm("确定要删除吗?");
                if(con){
                    alert("点击了确定")
                }else{
                    alert("点击了取消")
                }
           }
           function testPrompt(){
                //信息输入对话框
                var res =prompt("请输入昵称","例如:张三");
                alert("您输入的是:"+res)
           }
        </script>
    </head>

    <body>
        <input type="button" value="提示框" onclick="testAlert()"/> <br>
        <input type="button" value="确认框" onclick="testConfirm()"/> <br>
        <input type="button" value="对话框" onclick="testPrompt()"/> <br>
    </body>
```

>  页面跳转

``` html
    <head>
        <meta charset="UTF-8">
        <title>小标题</title>
      
        <script>
           function goAtguigu(){
                var flag =confirm("即将跳转到尚硅谷官网,本页信息即将丢失,确定吗?")
                if(flag){
                    // 通过BOM编程地址栏url切换
                    window.location.href="http://www.atguigu.com"
                }
           }
          
        </script>
    </head>

    <body>
        <input type="button" value="跳转到尚硅谷" onclick="goAtguigu()"/> <br>
    </body>
```

### 5.通过BOM编程实现会话级和持久级数据存储

+ 会话级数据 : 内存型数据,是浏览器在内存上临时存储的数据,浏览器关闭后,数据失去,通过window的sessionStorge属性实现
+ 持久级数据 : 磁盘型数据,是浏览器在磁盘上持久存储的数据,浏览器关闭后,数据仍在,通过window的localStorge实现
+ 可以用于将来存储一些服务端响应回来的数据,比如:token令牌,或者一些其他功能数据,根据数据的业务范围我们可以选择数据存储的会话/持久 级别

``` html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script>
        function saveItem(){
            // 让浏览器存储一些会话级数据
            window.sessionStorage.setItem("sessionMsg","sessionValue")
            // 让浏览器存储一些持久级数据
            window.localStorage.setItem("localMsg","localValue")

            console.log("haha")
        }

        function removeItem(){
            // 删除数据
            sessionStorage.removeItem("sessionMsg")
            localStorage.removeItem("localMsg")
        }

        function readItem(){
            console.log("read")
            // 读取数据
            console.log("session:"+sessionStorage.getItem("sessionMsg"))
            console.log("local:"+localStorage.getItem("localMsg"))
        }
    </script>
</head>
<body>

    <button onclick="saveItem()">存储数据</button>
    <button onclick="removeItem()">删除数据</button>
    <button onclick="readItem()">读取数据</button>

</body>
</html>
```

+ 测试,存储数据后,再读取数据,然后关闭浏览器,获取数据,发现sessionStorge的数据没有了,localStorge的数据还在
+ 通过removeItem可以将这些数据直接删除
+ 在F12开发者工具的应用程序栏,可以查看数据的状态

<img src="images/1690348134594.png" alt="1690348134594" style="zoom: 80%;" />

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script>
        /*
        window 对象是由浏览器提供给我们使用的，无需自己new
               三种弹窗方式
                   alert
                   prompt
                   confirm
        
               定时任务


            history 窗口的访问历史
            location
            sessionStorage 用于存储一些会话级别的数据 (浏览器关闭数据清除)
            localStorage 用于存储一些持久级数据 (浏览器关闭数据还在)
              
        */
         function fun1(){
            window.alert("hello")
         }
         function fun2(){
           var res= window.prompt("hello,请输入姓名")
           console.log(res)
         }
         function fun3(){
            var res=window.confirm("确定要删除吗")
            console.log(res)
         }
         function fun4(){
            window.setTimeout(function(){
                console.log("hello")
            },2000
  
            ) //两个参数 第一个: 实现的方法; 第二个: 多少ms后执行
         }

         function funA(){
            //向后翻页
            history.back()
         }
         function funB(){
            //向前翻页
            //history.forward()
            history.go(1)// 向前翻1页
         }
         function funC(){
            location.href="https://github.com/"
         }
         function funD(){
            //向 sessionStorage中存储数据
            //向 localStorage中存储数据
            sessionStorage.setItem("keya","valuea")
            localStorage.setItem("keyb","valueb")
         }
         function funE(){
            //读取数据
            console.log(sessionStorage.getItem("keya"))
            console.log(localStorage.getItem("keyb"))
         }
         function funF(){
            sessionStorage.removeItem("keya")
            localStorage.removeItem("keyb")
         }


    </script>
</head>
<body>
     <button onclick="funD()">存储数据</button>
     <button onclick="funE()">读取数据</button>
     <button onclick="funF()">清空数据</button>


    <hr>
     <button onclick="funC()">github1</button>
     <button onclick="funA()">上一页</button>
     <button onclick="funB()">下一页</button>
     <a href="https://github.com/">github</a>


    <hr>
    <button onclick="fun1()">信息提示框</button>
    <button onclick="fun2()">信息输入框</button>
    <button onclick="fun3()">信息确认框</button>
    <button onclick="fun4()">两秒后向控制台打印</button>
</body>
</html>
```

## DOM编程

### 1.什么是DOM编程

> 简单来说:DOM(Document Object Model)编程就是使用document对象的API完成对网页HTML文档进行动态修改,以实现网页数据和样式动态变化效果的编程.

+ document对象代表整个html文档，可用来访问页面中的所有元素，是最复杂的一个dom对象，可以说是学习好dom编程的关键所在。
+ 根据HTML代码结构特点,document对象本身是一种树形结构的文档对象。

   ![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5CC2E3B86B9BAF93C856C2483116CFE3F3.jpg)

+ 上面的代码生成的树如下

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5C15D53EC9788EF5ED3DA6C699C0018E1B.jpg)

+ DOM编程其实就是用window对象的document属性的相关API完成对页面元素的控制的编程



+ dom树中节点的类型
  + node  节点,所有结点的父类型
    + element   元素节点,node的子类型之一,代表一个完整标签
    + attribute  属性节点,node的子类型之一,代表元素的属性
    + text          文本节点,node的子类型之一,代表双标签中间的文本

### 2.获取页面元素的几种方式

#### 2.1 在整个文档范围内查找元素结点

| 功能               | API                                     | 返回值           |
| ------------------ | --------------------------------------- | ---------------- |
| 根据id值查询       | document.getElementById(“id值”)         | 一个具体的元素节 |
| 根据标签名查询     | document.getElementsByTagName(“标签名”) | 元素节点数组     |
| 根据name属性值查询 | document.getElementsByName(“name值”)    | 元素节点数组     |
| 根据类名查询       | document.getElementsByClassName("类名") | 元素节点数组     |

#### 2.2 在具体元素节点范围内查找子节点

| 功能               | API                       | 返回值         |
| ------------------ | ------------------------- | -------------- |
| 查找子标签         | element.children          | 返回子标签数组 |
| 查找第一个子标签   | element.firstElementChild | 标签对象       |
| 查找最后一个子标签 | element.lastElementChild  | 节点对象       |

#### 2.3 查找指定子元素节点的父节点

| 功能                     | API                   | 返回值   |
| ------------------------ | --------------------- | -------- |
| 查找指定元素节点的父标签 | element.parentElement | 标签对象 |

#### 2.4  查找指定元素节点的兄弟节点

| 功能               | API                         | 返回值   |
| ------------------ | --------------------------- | -------- |
| 查找前一个兄弟标签 | node.previousElementSibling | 标签对象 |
| 查找后一个兄弟标签 | node.nextElementSibling     | 标签对象 |

``` html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
   <script>
    /* 
    1 获得document  dom树
        window.document
    2 从document中获取要操作的元素
        1. 直接获取
            var el1 =document.getElementById("username") // 根据元素的id值获取页面上唯一的一个元素
            var els =document.getElementsByTagName("input") // 根据元素的标签名获取多个同名元素
            var els =document.getElementsByName("aaa") // 根据元素的name属性值获得多个元素
            var els =document.getElementsByClassName("a") // 根据元素的class属性值获得多个元素
        2. 间接获取
            var cs=div01.children // 通过父元素获取全部的子元素
            var firstChild =div01.firstElementChild  // 通过父元素获取第一个子元素
            var lastChild = div01.lastElementChild   // 通过父元素获取最后一个子元素
            var parent = pinput.parentElement  // 通过子元素获取父元素
            var pElement = pinput.previousElementSibling // 获取前面的第一个元素
            var nElement = pinput.nextElementSibling // 获取后面的第一个元素
    3 对元素进行操作
        1. 操作元素的属性
        2. 操作元素的样式
        3. 操作元素的文本
        4. 增删元素   
    */
   function fun1(){
        //1 获得document
        //2 通过document获得元素
        var el1 =document.getElementById("username") // 根据元素的id值获取页面上唯一的一个元素
        console.log(el1)
   }
   function fun2(){
        var els =document.getElementsByTagName("input") // 根据元素的标签名获取多个同名元素
        for(var i = 0 ;i<els.length;i++){
            console.log(els[i])
        }
   }
   function fun3(){
        var els =document.getElementsByName("aaa") // 根据元素的name属性值获得多个元素
        console.log(els)
        for(var i =0;i< els.length;i++){
            console.log(els[i])
        }
   }

   function fun4(){
    var els =document.getElementsByClassName("a") // 根据元素的class属性值获得多个元素
    for(var i =0;i< els.length;i++){
            console.log(els[i])
        }
   }

   function fun5(){
    // 先获取父元素
     var div01 = document.getElementById("div01")
     // 获取所有子元素
     var cs=div01.children // 通过父元素获取全部的子元素
     for(var i =0;i< cs.length;i++){
            console.log(cs[i])
     }

     console.log(div01.firstElementChild)  // 通过父元素获取第一个子元素
     console.log(div01.lastElementChild)   // 通过父元素获取最后一个子元素
   }

   function fun6(){
        // 获取子元素
        var pinput =document.getElementById("password")
        console.log(pinput.parentElement) // 通过子元素获取父元素
   }

   function fun7(){
        // 获取子元素
        var pinput =document.getElementById("password")
        console.log(pinput.previousElementSibling) // 获取前面的第一个元素
        console.log(pinput.nextElementSibling) // 获取后面的第一个元素
   }
   </script>
</head>
<body>
    <div id="div01">
        <input type="text" class="a" id="username" name="aaa"/>
        <input type="text" class="b" id="password" name="aaa"/>
        <input type="text" class="a" id="email"/>
        <input type="text" class="b" id="address"/>
    </div>
    <input type="text" class="a"/><br>

    <hr>
    <input type="button" value="通过父元素获取子元素" onclick="fun5()" id="btn05"/>
    <input type="button" value="通过子元素获取父元素" onclick="fun6()" id="btn06"/>
    <input type="button" value="通过当前元素获取兄弟元素" onclick="fun7()" id="btn07"/>
    <hr>

    <input type="button" value="根据id获取指定元素" onclick="fun1()" id="btn01"/>
    <input type="button" value="根据标签名获取多个元素" onclick="fun2()" id="btn02"/>
    <input type="button" value="根据name属性值获取多个元素" onclick="fun3()" id="btn03"/>
    <input type="button" value="根据class属性值获得多个元素" onclick="fun4()" id="btn04"/>
    
</body>
</html>
```



### 3 操作元素属性值

#### 3.1 属性操作

| 需求       | 操作方式                   |
| ---------- | -------------------------- |
| 读取属性值 | 元素对象.属性名            |
| 修改属性值 | 元素对象.属性名=新的属性值 |

#### 3.2 内部文本操作

| 需求                         | 操作方式          |
| ---------------------------- | ----------------- |
| 获取或者设置标签体的文本内容 | element.innerText |
| 获取或者设置标签体的内容     | element.innerHTML |

``` html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
   <script>
    /* 
    1 获得document  dom树
        window.document
    2 从document中获取要操作的元素
        1. 直接获取
            var el1 =document.getElementById("username") // 根据元素的id值获取页面上唯一的一个元素
            var els =document.getElementsByTagName("input") // 根据元素的标签名获取多个同名元素
            var els =document.getElementsByName("aaa") // 根据元素的name属性值获得多个元素
            var els =document.getElementsByClassName("a") // 根据元素的class属性值获得多个元素
        2. 间接获取
            var cs=div01.children // 通过父元素获取全部的子元素
            var firstChild =div01.firstElementChild  // 通过父元素获取第一个子元素
            var lastChild = div01.lastElementChild   // 通过父元素获取最后一个子元素
            var parent = pinput.parentElement  // 通过子元素获取父元素
            var pElement = pinput.previousElementSibling // 获取前面的第一个元素
            var nElement = pinput.nextElementSibling // 获取后面的第一个元素
    3 对元素进行操作
        1. 操作元素的属性   元素名.属性名=""
        2. 操作元素的样式   元素名.style.样式名=""  样式名"-" 要进行驼峰转换
        3. 操作元素的文本   元素名.innerText   只识别文本
                           元素名.innerHTML   同时可以识别html代码 
        4. 增删元素   
    */
   function changeAttribute(){
        var in1 =document.getElementById("in1")
        // 语法 元素.属性名=""
        // 获得属性值
        console.log(in1.type)
        console.log(in1.value)
        // 修改属性值
        in1.type="button"
        in1.value="嗨"
   }
   function changeStyle(){
        var in1 =document.getElementById("in1")
        // 语法  元素.style.样式名=""   原始样式名中的"-"符号 要转换驼峰式  background-color > backgroundColor
        in1.style.color="green"
        in1.style.borderRadius="5px"
        
   }
   function changeText(){
        var div01 =document.getElementById("div01")
        /* 
        语法  元素名.innerText   只识别文本
              元素名.innerHTML   同时可以识别html代码
        */
        console.log(div01.innerText)
        div01.innerHTML="<h1>嗨</h1>"
   }

   </script>
   <style>
    #in1{
        color: red;
    }
   </style>
</head>
<body>
    <input id="in1" type="text" value="hello">
    <div id="div01">
        hello
    </div>

    <hr>
    <button onclick="changeAttribute()">操作属性</button>
    <button onclick="changeStyle()">操作样式</button>
    <button onclick="changeText()">操作文本</button>
    
</body>
</html>
```



### 4 增删元素

#### 4.1 对页面的元素进行增删操作

| API                                      | 功能                                       |
| ---------------------------------------- | ------------------------------------------ |
| document.createElement(“标签名”)         | 创建元素节点并返回，但不会自动添加到文档中 |
| document.createTextNode(“文本值”)        | 创建文本节点并返回，但不会自动添加到文档中 |
| element.appendChild(ele)                 | 将ele添加到element所有子节点后面           |
| parentEle.insertBefore(newEle,targetEle) | 将newEle插入到targetEle前面                |
| parentEle.replaceChild(newEle, oldEle)   | 用新节点替换原有的旧子节点                 |
| element.remove()                         | 删除某个标签                               |

``` html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
   <script>
    /* 
    1 获得document  dom树
        window.document
    2 从document中获取要操作的元素
        1. 直接获取
            var el1 =document.getElementById("username") // 根据元素的id值获取页面上唯一的一个元素
            var els =document.getElementsByTagName("input") // 根据元素的标签名获取多个同名元素
            var els =document.getElementsByName("aaa") // 根据元素的name属性值获得多个元素
            var els =document.getElementsByClassName("a") // 根据元素的class属性值获得多个元素
        2. 间接获取
            var cs=div01.children // 通过父元素获取全部的子元素
            var firstChild =div01.firstElementChild  // 通过父元素获取第一个子元素
            var lastChild = div01.lastElementChild   // 通过父元素获取最后一个子元素
            var parent = pinput.parentElement  // 通过子元素获取父元素
            var pElement = pinput.previousElementSibling // 获取前面的第一个元素
            var nElement = pinput.nextElementSibling // 获取后面的第一个元素
    3 对元素进行操作
        1. 操作元素的属性   元素名.属性名=""
        2. 操作元素的样式   元素名.style.样式名=""  样式名"-" 要进行驼峰转换
        3. 操作元素的文本   元素名.innerText   只识别文本
                           元素名.innerHTML   同时可以识别html代码 
        4. 增删元素
            var element =document.createElement("元素名") // 创建元素
            父元素.appendChild(子元素)               // 在父元素中追加子元素
            父元素.insertBefore(新元素,参照元素)     // 在某个元素前增加元素
            父元素.replaceChild(新元素,被替换的元素) // 用新的元素替换某个子子元素
            元素.remove()                            // 删除当前元素
    */
   function addCs(){
        // 创建一个新的元素
        // 创建元素
        var csli =document.createElement("li") // <li></li>
        // 设置子元素的属性和文本 <li id="cs">长沙</li>
        csli.id="cs"
        csli.innerText="长沙"
        // 将子元素放入父元素中
        var cityul =document.getElementById("city")
        // 在父元素中追加子元素
        cityul.appendChild(csli)
   }
   function addCsBeforeSz(){
        // 创建一个新的元素
        // 创建元素
        var csli =document.createElement("li") // <li></li>
        // 设置子元素的属性和文本 <li id="cs">长沙</li>
        csli.id="cs"
        csli.innerText="长沙"
        // 将子元素放入父元素中
        var cityul =document.getElementById("city")
        // 在父元素中追加子元素
        //cityul.insertBefore(新元素,参照元素)
        var szli =document.getElementById("sz")
        cityul.insertBefore(csli,szli)
   }

   function replaceSz(){
        // 创建一个新的元素
        // 创建元素
        var csli =document.createElement("li") // <li></li>
        // 设置子元素的属性和文本 <li id="cs">长沙</li>
        csli.id="cs"
        csli.innerText="长沙"
        // 将子元素放入父元素中
        var cityul =document.getElementById("city")
        // 在父元素中追加子元素
        //cityul.replaceChild(新元素,被替换的元素)
        var szli =document.getElementById("sz")
        cityul.replaceChild(csli,szli)
   }

   function removeSz(){
        var szli =document.getElementById("sz")
        // 哪个元素调用了remove该元素就会从dom树中移除
        szli.remove()
   }

   function clearCity(){
        
        var cityul =document.getElementById("city")

        /* var fc =cityul.firstChild
        while(fc != null ){
            fc.remove()
            fc =cityul.firstChild
        } */
        cityul.innerHTML=""
        //cityul.remove()
        
   }
   
   </script>
   
</head>
<body>
    <ul id="city">
        <li id="bj">北京</li>
        <li id="sh">上海</li>
        <li id="sz">深圳</li>
        <li id="gz">广州</li>
    </ul>

    <hr>
    <!-- 目标1 在城市列表的最后添加一个子标签  <li id="cs">长沙</li>  -->
    <button onclick="addCs()">增加长沙</button>
    <!-- 目标2 在城市列表的深圳前添加一个子标签  <li id="cs">长沙</li>  -->
    <button onclick="addCsBeforeSz()">在深圳前插入长沙</button>
    <!-- 目标3  将城市列表的深圳替换为  <li id="cs">长沙</li>  -->
    <button onclick="replaceSz()">替换深圳</button>
    <!-- 目标4  将城市列表删除深圳  -->
    <button onclick="removeSz()">删除深圳</button>
    <!-- 目标5  清空城市列表  -->
    <button onclick="clearCity()">清空</button>
    
</body>
</html>
```



## 正则表达式

### 1.正则表达式简介

> 正则表达式是描述字符模式的对象。正则表达式用于对字符串模式匹配及检索替换，是对字符串执行模式匹配的强大工具。

+ 语法 

``` javascript
var patt=new RegExp(pattern,modifiers);
或者更简单的方式:
var patt=/pattern/modifiers; 
```

> 修饰符

| 修饰符                                             | 描述                                                     |
| :------------------------------------------------- | :------------------------------------------------------- |
| [i](https://www.runoob.com/js/jsref-regexp-i.html) | 执行对大小写不敏感的匹配。                               |
| [g](https://www.runoob.com/js/jsref-regexp-g.html) | 执行全局匹配（查找所有匹配而非在找到第一个匹配后停止）。 |
| m                                                  | 执行多行匹配。                                           |

> 方括号

| 表达式                                                       | 描述                               |
| :----------------------------------------------------------- | :--------------------------------- |
| [[abc\]](https://www.runoob.com/jsref/jsref-regexp-charset.html) | 查找方括号之间的任何字符。         |
| [[^abc\]](https://www.runoob.com/jsref/jsref-regexp-charset-not.html) | 查找任何不在方括号之间的字符。     |
| [0-9]                                                        | 查找任何从 0 至 9 的数字。         |
| [a-z]                                                        | 查找任何从小写 a 到小写 z 的字符。 |
| [A-Z]                                                        | 查找任何从大写 A 到大写 Z 的字符。 |
| [A-z]                                                        | 查找任何从大写 A 到小写 z 的字符。 |
| [adgk]                                                       | 查找给定集合内的任何字符。         |
| [^adgk]                                                      | 查找给定集合外的任何字符。         |
| (red\|blue\|green)                                           | 查找任何指定的选项。               |

> 元字符

| 元字符                                                       | 描述                                        |
| :----------------------------------------------------------- | :------------------------------------------ |
| [.](https://www.runoob.com/jsref/jsref-regexp-dot.html)      | 查找单个字符，除了换行和行结束符。          |
| [\w](https://www.runoob.com/jsref/jsref-regexp-wordchar.html) | 查找数字、字母及下划线。                    |
| [\W](https://www.runoob.com/jsref/jsref-regexp-wordchar-non.html) | 查找非单词字符。                            |
| [\d](https://www.runoob.com/jsref/jsref-regexp-digit.html)   | 查找数字。                                  |
| [\D](https://www.runoob.com/jsref/jsref-regexp-digit-non.html) | 查找非数字字符。                            |
| [\s](https://www.runoob.com/jsref/jsref-regexp-whitespace.html) | 查找空白字符。                              |
| [\S](https://www.runoob.com/jsref/jsref-regexp-whitespace-non.html) | 查找非空白字符。                            |
| [\b](https://www.runoob.com/jsref/jsref-regexp-begin.html)   | 匹配单词边界。                              |
| [\B](https://www.runoob.com/jsref/jsref-regexp-begin-not.html) | 匹配非单词边界。                            |
| \0                                                           | 查找 NULL 字符。                            |
| [\n](https://www.runoob.com/jsref/jsref-regexp-newline.html) | 查找换行符。                                |
| \f                                                           | 查找换页符。                                |
| \r                                                           | 查找回车符。                                |
| \t                                                           | 查找制表符。                                |
| \v                                                           | 查找垂直制表符。                            |
| [\xxx](https://www.runoob.com/jsref/jsref-regexp-octal.html) | 查找以八进制数 xxx 规定的字符。             |
| [\xdd](https://www.runoob.com/jsref/jsref-regexp-hex.html)   | 查找以十六进制数 dd 规定的字符。            |
| [\uxxxx](https://www.runoob.com/jsref/jsref-regexp-unicode-hex.html) | 查找以十六进制数 xxxx 规定的 Unicode 字符。 |

> 量词

| 量词                                                         | 描述                                                         |
| :----------------------------------------------------------- | :----------------------------------------------------------- |
| [n+](https://www.runoob.com/jsref/jsref-regexp-onemore.html) | 匹配任何包含至少一个 n 的字符串。例如，/a+/ 匹配 "candy" 中的 "a"，"caaaaaaandy" 中所有的 "a"。 |
| [n*](https://www.runoob.com/jsref/jsref-regexp-zeromore.html) | 匹配任何包含零个或多个 n 的字符串。例如，/bo*/ 匹配 "A ghost booooed" 中的 "boooo"，"A bird warbled" 中的 "b"，但是不匹配 "A goat grunted"。 |
| [n?](https://www.runoob.com/jsref/jsref-regexp-zeroone.html) | 匹配任何包含零个或一个 n 的字符串。例如，/e?le?/ 匹配 "angel" 中的 "el"，"angle" 中的 "le"。 |
| [n{X}](https://www.runoob.com/jsref/jsref-regexp-nx.html)    | 匹配包含 X 个 n 的序列的字符串。例如，/a{2}/ 不匹配 "candy," 中的 "a"，但是匹配 "caandy," 中的两个 "a"，且匹配 "caaandy." 中的前两个 "a"。 |
| [n{X,}](https://www.runoob.com/jsref/jsref-regexp-nxcomma.html) | X 是一个正整数。前面的模式 n 连续出现至少 X 次时匹配。例如，/a{2,}/ 不匹配 "candy" 中的 "a"，但是匹配 "caandy" 和 "caaaaaaandy." 中所有的 "a"。 |
| [n{X,Y}](https://www.runoob.com/jsref/jsref-regexp-nxy.html) | X 和 Y 为正整数。前面的模式 n 连续出现至少 X 次，至多 Y 次时匹配。例如，/a{1,3}/ 不匹配 "cndy"，匹配 "candy," 中的 "a"，"caandy," 中的两个 "a"，匹配 "caaaaaaandy" 中的前面三个 "a"。注意，当匹配 "caaaaaaandy" 时，即使原始字符串拥有更多的 "a"，匹配项也是 "aaa"。 |
| [n$](https://www.runoob.com/jsref/jsref-regexp-ndollar.html) | 匹配任何结尾为 n 的字符串。                                  |
| [^n](https://www.runoob.com/jsref/jsref-regexp-ncaret.html)  | 匹配任何开头为 n 的字符串。                                  |
| [?=n](https://www.runoob.com/jsref/jsref-regexp-nfollow.html) | 匹配任何其后紧接指定字符串 n 的字符串。                      |
| [?!n](https://www.runoob.com/jsref/jsref-regexp-nfollow-not.html) | 匹配任何其后没有紧接指定字符串 n 的字符串。                  |

> RegExp对象方法

| 方法                                                         | 描述                                               |
| :----------------------------------------------------------- | :------------------------------------------------- |
| [compile](https://www.runoob.com/jsref/jsref-regexp-compile.html) | 在 1.5 版本中已废弃。 编译正则表达式。             |
| [exec](https://www.runoob.com/jsref/jsref-exec-regexp.html)  | 检索字符串中指定的值。返回找到的值，并确定其位置。 |
| [test](https://www.runoob.com/jsref/jsref-test-regexp.html)  | 检索字符串中指定的值。返回 true 或 false。         |
| [toString](https://www.runoob.com/jsref/jsref-regexp-tostring.html) | 返回正则表达式的字符串。                           |

> 支持正则的String的方法

| 方法                                                    | 描述                             |
| :------------------------------------------------------ | :------------------------------- |
| [search](https://www.runoob.com/js/jsref-search.html)   | 检索与正则表达式相匹配的值。     |
| [match](https://www.runoob.com/js/jsref-match.html)     | 找到一个或多个正则表达式的匹配。 |
| [replace](https://www.runoob.com/js/jsref-replace.html) | 替换与正则表达式匹配的子串。     |
| [split](https://www.runoob.com/js/jsref-split.html)     | 把字符串分割为字符串数组。       |

### 2.正则表达式体验

#### 2.1 验证

**注意**：这里是使用**正则表达式对象**来**调用**方法。

```javascript
// 创建一个最简单的正则表达式对象
var reg = /o/;
// 创建一个字符串对象作为目标字符串
var str = 'Hello World!';
// 调用正则表达式对象的test()方法验证目标字符串是否满足我们指定的这个模式，返回结果true
console.log("/o/.test('Hello World!')="+reg.test(str));
```

#### 2.2 匹配

```javascript
// 创建一个最简单的正则表达式对象
var reg = /o/;
// 创建一个字符串对象作为目标字符串
var str = 'Hello World!';
// 在目标字符串中查找匹配的字符，返回匹配结果组成的数组
var resultArr = str.match(reg);
// 数组长度为1
console.log("resultArr.length="+resultArr.length);

// 数组内容是o
console.log("resultArr[0]="+resultArr[0]);
```

#### 2.3 替换

**注意**：这里是使用**字符串对象**来**调用**方法。

```javascript
// 创建一个最简单的正则表达式对象
var reg = /o/;
// 创建一个字符串对象作为目标字符串
var str = 'Hello World!';
var newStr = str.replace(reg,'@');
// 只有第一个o被替换了，说明我们这个正则表达式只能匹配第一个满足的字符串
console.log("str.replace(reg)="+newStr);//Hell@ World!

// 原字符串并没有变化，只是返回了一个新字符串
console.log("str="+str);//str=Hello World!
```

#### 2.4  全文查找

如果不使用g对正则表达式对象进行修饰，则使用正则表达式进行查找时，仅返回第一个匹配；使用g后，返回所有匹配。

```javascript
// 目标字符串
var targetStr = 'Hello World!';

// 没有使用全局匹配的正则表达式
var reg = /[A-Z]/;
// 获取全部匹配
var resultArr = targetStr.match(reg);
// 数组长度为1
console.log("resultArr.length="+resultArr.length);
// 遍历数组，发现只能得到'H'
for(var i = 0; i < resultArr.length; i++){
  console.log("resultArr["+i+"]="+resultArr[i]);
}
```

对比

```javascript
// 目标字符串
var targetStr = 'Hello World!';
// 使用了全局匹配的正则表达式
var reg = /[A-Z]/g;
// 获取全部匹配
var resultArr = targetStr.match(reg);
// 数组长度为2
console.log("resultArr.length="+resultArr.length);
// 遍历数组，发现可以获取到“H”和“W”
for(var i = 0; i < resultArr.length; i++){
  console.log("resultArr["+i+"]="+resultArr[i]);
}
```

####  2.5 忽略大小写

```javascript
//目标字符串
var targetStr = 'Hello WORLD!';

//没有使用忽略大小写的正则表达式
var reg = /o/g;
//获取全部匹配
var resultArr = targetStr.match(reg);
//数组长度为1
console.log("resultArr.length="+resultArr.length);
//遍历数组，仅得到'o'
for(var i = 0; i < resultArr.length; i++){
  console.log("resultArr["+i+"]="+resultArr[i]);
}
```

对比

```javascript
//目标字符串
var targetStr = 'Hello WORLD!';
//使用了忽略大小写的正则表达式
var reg = /o/gi;
//获取全部匹配
var resultArr = targetStr.match(reg);
//数组长度为2
console.log("resultArr.length="+resultArr.length);
//遍历数组，得到'o'和'O'
for(var i = 0; i < resultArr.length; i++){
  console.log("resultArr["+i+"]="+resultArr[i]);
}
```

#### 2.6 元字符使用

```javascript
var str01 = 'I love Java';
var str02 = 'Java love me';
// 匹配以Java开头
var reg = /^Java/g;
console.log('reg.test(str01)='+reg.test(str01)); // false
console.log("<br />");
console.log('reg.test(str02)='+reg.test(str02)); // true
```

```javascript
var str01 = 'I love Java';
var str02 = 'Java love me';
// 匹配以Java结尾
var reg = /Java$/g;
console.log('reg.test(str01)='+reg.test(str01)); // true
console.log("<br />");
console.log('reg.test(str02)='+reg.test(str02)); // false
```

#### 2.7 字符集合的使用

```javascript
//n位数字的正则
var targetStr="123456789";
var reg=/^[0-9]{0,}$/;
//或者 ： var reg=/^\d*$/;
var b = reg.test(targetStr);//true
```

```javascript
//数字+字母+下划线，6-16位
var targetStr="HelloWorld";
var reg=/^[a-z0-9A-Z_]{6,16}$/;
var b = reg.test(targetStr);//true
```

#### 2.8  常用正则表达式

| 需求     | 正则表达式                                                 |
| -------- | ---------------------------------------------------------- |
| 用户名   | /^\[a-zA-Z ]\[a-zA-Z-0-9]{5,9}\$/                          |
| 密码     | /^\[a-zA-Z0-9 \_-@#& \*]{6,12}\$/                          |
| 前后空格 | /^\s+\|\s+\$/g                                             |
| 电子邮箱 | /^\[a-zA-Z0-9 \_.-]+@(\[a-zA-Z0-9-]+\[.]{1})+\[a-zA-Z]+\$/ |


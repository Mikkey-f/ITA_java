## HTML

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

## CSS

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


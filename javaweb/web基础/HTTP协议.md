# HTTP协议



## 一.概念

![image-20250607224636379](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250607224636379.png)





## 二.请求协议



### 1.请求数据格式

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250608163558410.png" alt="image-20250608163558410" style="zoom: 80%;" />

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250608161013361.png" alt="image-20250608161013361" style="zoom: 67%;" />

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250608214212157.png" alt="image-20250608214212157" style="zoom: 67%;" />



### 2.请求数据获取

![image-20250608214542847](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250608214542847.png)

![image-20250608214622944](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250608214622944.png)

```java
@RestController
public class RequestController {

    @RequestMapping("/request")//资源访问路径"/request"
    public String request(HttpServletRequest request){
        //1.获取请求方式
        String method = request.getMethod();//GET
        System.out.println("请求方式" + method);

        //2.获取请求url地址
        String url = request.getRequestURL().toString();//http://localhost:8080/request
        String uri = request.getRequestURI();// /request
        System.out.println("请求地址" + uri);

        //3.获取请求协议
        String protocol = request.getProtocol();//HTTP/1.1
        System.out.println("请求协议" + protocol);

        //4.获取请求参数 - name age
        String name = request.getParameter("name");//szj
        String age = request.getParameter("age");//18
        System.out.println("name:" + name + " age:" + age);

        //5.获取请求头 - Accept
        String accept = request.getHeader("Accept");
        System.out.println("Accept:" + accept);


        return "ok";

    }
}
```

![image-20250608220848989](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250608220848989.png)





## 二.响应协议

### 1.响应数据格式

![image-20250608221211425](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250608221211425.png)

![image-20250608222638668](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250608222638668.png)

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250608222317555.png" alt="image-20250608222317555" style="zoom:50%;" />

![image-20250609082434310](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250609082434310.png)



### 2. 响应数据设置

![image-20250609084417832](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250609084417832.png)

![image-20250609084508001](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250609084508001.png)

```java
@RestController
public class ResponseController {

    @RequestMapping("/response")
    public void response(HttpServletResponse response) throws Exception{
        //设置响应状态码
        response.setStatus(401);

        //设置响应头
        response.setHeader("name","szj");

        //设置响应体
        response.getWriter().write("<h1>hello response</h1>");

    }

    @RequestMapping("/response2")
    public ResponseEntity<String> response2(){
        return ResponseEntity.status(401)
                .header("name","java-web")
                .body("<h1>hello response</h1>");
    }
}
```




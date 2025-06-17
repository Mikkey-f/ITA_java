# SpringBoot Web案例

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250610143035743.png" style="zoom: 50%;" />

```java
@RestController//底层的@ResponseBody -> 作用：将controller返回值直接作为响应体的数据直接响应；返回值是对象/集合则转为json数据，并响应给前端
public class UserController {
    @RequestMapping("/list")
    public List<User>  list() throws Exception{
        // 1.加载并读取user.txt文件，获取用户数据
        //InputStream  in = new FileInputStream(new File("\"D:\\web-ai-code\\web-ai-project01\\springboot-web-01\\src\\main\\resources\\user.txt\""));//地址写死了，不推荐
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("user.txt");
        ArrayList<String> lines = IoUtil.readLines(in, StandardCharsets.UTF_8, new ArrayList<>());

        // 2.解析用户信息，封装为User对象 -> list集合
        List<User> userList = lines.stream().map(line -> {
            String[] parts = line.split(",");
            Integer id = Integer.parseInt(parts[0]);
            String username = parts[1];
            String password = parts[2];
            String name = parts[3];
            Integer age = Integer.parseInt(parts[4]);
            LocalDateTime updateTime = LocalDateTime.parse(parts[5], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            return new User(id, username, password, name, age, updateTime);
        }).toList();

        //3.返回数据（json）
        return userList;
    }
}
//复用性差 难以维护
```

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250610163455481.png" alt="image-20250610163455481" style="zoom:67%;" />


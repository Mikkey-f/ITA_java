# SQL语句

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250611103737342.png" alt="image-20250611103737342" style="zoom:67%;" />



## 一.DDl

### 1.

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250611103938088.png" alt="image-20250611103938088" style="zoom: 67%;" />

![image-20250611104733070](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250611104733070.png)

![image-20250611104822778](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250611104822778.png)



### 2.表结构

#### 2.1 创建：

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250611153243214.png" alt="image-20250611153243214" style="zoom:50%;" />

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250611153613028.png" alt="image-20250611153613028" style="zoom: 50%;" />

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250611154537231.png" alt="image-20250611154537231" style="zoom:50%;" />



#### 2.2 数据类型：

数值类型：

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250611155306148.png" alt="image-20250611155306148" style="zoom:50%;" />

字符串类型：

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250611155753444.png" alt="image-20250611155753444" style="zoom:50%;" />

日期类型：

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250611160040452.png" alt="image-20250611160040452" style="zoom:50%;" />

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250611160106150.png" alt="image-20250611160106150" style="zoom:50%;" />



#### 2.3 查询,修改，删除

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250611172117654.png" alt="image-20250611172117654" style="zoom: 67%;" />



```mysql
-- 查询当前数据库所有表
show tables;

-- 查看表结构
desc emp;

-- 查询建表语句
show create table emp;

-- 字段 添加字段 qq
alter table emp add qq varchar(13) comment 'qq号码';

-- 字段 修改字段类型
alter table emp modify qq varchar(15) comment 'QQ号码';

-- 字段 修改字段名
alter table emp change qq qq_num varchar(15) comment 'QQ号码';

-- 字段 删除字段
alter table emp drop column qq_num;

-- 修改表名
alter table emp rename to employee;

-- 删除表
drop table employee;
```



### 3.设计表案例

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250611171634600.png" alt="image-20250611171634600" style="zoom:50%;" />

```mysql
--  案例：设计员工表 emp
-- 基础字段：id 主键；create_time 创建时间；update_time 修改时间；
create table emp(
    id int unsigned primary key auto_increment comment 'ID,主键',
    username varchar(20) not null unique comment '用户名',
    password varchar(32) default '123456' comment '密码',
    name varchar(10) not null comment '姓名',
    gender tinyint unsigned not null comment '性别,1 男 2 女',
    phone char(11) not null unique comment '手机号',
    job tinyint unsigned comment '职位，1 班主任；2讲师；3 学工主管；4 教研主管；5 咨询师',
    salary int unsigned comment '薪资',
    entry_date date comment '入职日期',
    image varchar(255) comment '图像',
    create_time datetime comment '创建时间',
    update_time datetime comment '修改时间'
) comment '员工表';
```





## 二.DML

![image-20250611174403283](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250611174403283.png)



### 1.insert

![image-20250611200131004](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250611200131004.png)

![image-20250611202303990](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250611202303990.png)



### 2.update

![image-20250611202942602](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250611202942602.png)

![image-20250611202953172](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250611202953172.png)



### 3.delete

![image-20250611203037879](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250611203037879.png)

![image-20250611203110730](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250611203110730.png)



```mysql
-- DML : 数据操作语言
-- DML : 插入数据 - insert
-- 1. 为 emp 表的 username, password, name, gender, phone 字段插入值
    insert into emp(username, password, name, gender, phone) values ('songjiang','12345678','宋江',1,'13300001111');

-- 2. 为 emp 表的 所有字段插入值
-- 方式1：
    insert into emp(id, username, password, name, gender, phone, job, salary, entry_date, image, create_time, update_time)
    values (null,'linchong','12345678','林冲',1,'12200001122',1,6000,'2020-01-01','1.jpg',now(),now());
    -- 等价于 insert into emp values (null,'linchong','12345678','林冲',1,'12200001122',6000,'2020-01-01','1.jpg',now(),now());

-- 3. 批量为 emp 表的 username, password, name, gender, phone  字段插入数据
insert into emp(username, password, name, gender, phone) values
                    ('sizhijun','12345678','司',1,'13300001121'),('fangyao','1233344','方',2,'13881546666');

-- DML : 更新数据 - update
-- 1. 将 emp 表的ID为1员工 用户名更新为 'zhangsan', 姓名name字段更新为 '张三'
update emp set username = 'zhangsan', name = '张三' where id = 1;

-- 2. 将 emp 表的所有员工的入职日期更新为 '2010-01-01'
update emp set entry_date = '2010-01-01';



-- DML : 删除数据 - delete
-- 1. 删除 emp 表中 ID为1的员工
delete from emp where id = 1;

-- 2. 删除 emp 表中的所有员工
delete from emp;
```



## 三.DQL

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250611203512391.png" alt="image-20250611203512391" style="zoom: 50%;" />

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250611203656879.png" alt="image-20250611203656879" style="zoom: 67%;" />



### 1.基本查询

![image-20250611203914660](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250611203914660.png)

![image-20250611205014541](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250611205014541.png)

```mysql
--  =================== DQL: 基本查询 ======================
-- 1. 查询指定字段 name,entry_date 并返回
select name, entry_date from emp;

-- 2. 查询返回所有字段
select * from emp;
select id, username, password, name, gender, phone, job, salary, entry_date, image, create_time, update_time from emp;

-- 3. 查询所有员工的 name,entry_date, 并起别名(姓名、入职日期)
select name as '姓 名', entry_date as 入职日期 from emp;

-- 4. 查询已有的员工关联了哪几种职位(不要重复) - distinct去重
select distinct job from emp;
```



### 2.条件查询

![image-20250611205146714](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250611205146714.png)

![image-20250611205220076](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250611205220076.png)

![image-20250611211002073](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250611211002073.png)



```mysql
--  =================== DQL: 条件查询 ======================
-- 1. 查询 姓名 为 柴进 的员工
select * from emp where name = '柴进';

-- 2. 查询 薪资小于等于5000 的员工信息
select * from emp where salary <= 5000;

-- 3. 查询 没有分配职位 的员工信息
select * from emp where job is null;

-- 4. 查询 有职位 的员工信息
select * from emp where job is not null;

-- 5. 查询 密码不等于 '123456' 的员工信息
select * from emp where password != '123456';

-- 6. 查询 入职日期 在 '2000-01-01' (包含) 到 '2010-01-01'(包含) 之间的员工信息
select * from emp where entry_date between '2000-01-01' and '2010-01-01';

-- 7. 查询 入职时间 在 '2000-01-01' (包含) 到 '2010-01-01'(包含) 之间 且 性别为女 的员工信息
select * from emp where (entry_date between '2000-01-01' and '2010-01-01') and gender = 2;

-- 8. 查询 职位是 2 (讲师), 3 (学工主管), 4 (教研主管) 的员工信息
select * from emp where job = 2 or job = 3 or job = 4;
select * from emp where job in (2,3,4);

-- 9. 查询 姓名 为两个字的员工信息(_:单个字符；% 任意个字符)
select * from emp where name like '__';

-- 10. 查询 姓 '李' 的员工信息
select * from emp where name like '李%';

-- 11. 查询 姓名中包含 '二' 的员工信息
select * from emp where name like '%二%';
```



### 3.分组查询

 ![image-20250611211254465](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250611211254465.png)

![image-20250611211928908](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250611211928908.png)

![](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250611213321029.png)

![image-20250611213333475](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250611213333475.png)

```mysql
--  =================== DQL: 分组查询 ======================
-- 聚合函数
-- 注意 所有的聚合函数不参与null的统计
-- 1. 统计该企业员工数量
select count(username)from emp;

select count(*) from emp; -- 推荐

select count(0) from emp;

-- 2. 统计该企业员工的平均薪资
select avg(salary) from emp;

-- 3. 统计该企业员工的最低薪资
select min(salary) from emp;

-- 4. 统计该企业员工的最高薪资
select max(salary) from emp;

-- 5. 统计该企业每月要给员工发放的薪资总额(薪资之和)
select sum(salary) from emp;


-- 分组
-- 分组之后，select后的字段列表不能随意书写，能写的一般是分组字段+聚合数组
-- 1. 根据性别分组 , 统计男性和女性员工的数量
select gender , count(*) from emp group by gender;

-- 2. 先查询入职时间在 '2015-01-01' (包含) 以前的员工 , 并对结果根据职位分组 , 获取员工数量大于等于2的职位
select job ,count(*) from emp where entry_date <= '2015-01-01' group by job having count(*) >=2;

```



### 4. 排序查询

![image-20250611214605800](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250611214605800.png)

![image-20250611215106877](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250611215106877.png)

```mysql
--  =================== 排序查询 ======================
-- 1. 根据入职时间, 对员工进行升序排序 - asc
select * from emp order by entry_date asc;
select * from emp order by entry_date;

-- 2. 根据入职时间, 对员工进行降序排序 - desc
select * from emp order by entry_date desc;

-- 3. 根据 入职时间 对公司的员工进行 升序排序 ， 入职时间相同 , 再按照 更新时间 进行降序排序
select * from emp order by entry_date , update_time desc;
```



### 5.分页查询

![image-20250611215405479](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250611215405479.png)

![image-20250611215540559](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250611215540559.png)

![image-20250611220209231](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250611220209231.png)

```mysql
--  =================== 分页查询 ======================
-- 1. 从起始索引0开始查询员工数据, 每页展示5条记录
select * from emp limit 5;

select * from emp limit 0,5;

-- 2. 查询 第1页 员工数据, 每页展示5条记录
select * from emp limit 0,5;

-- 3. 查询 第2页 员工数据, 每页展示5条记录
select * from emp limit 5,5;

-- 4. 查询 第3页 员工数据, 每页展示5条记录
select * from emp limit 10,5;

-- 页码
-- 起始索引 = (页码 - 1) * 每页展示记录数
```


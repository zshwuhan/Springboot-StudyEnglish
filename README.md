# Springboot-StudyEnglish
基于SpringBoot+MyBatis的英语学习平台


## 邮箱注册功能
使用Spring封装的邮件发送类 `JavaMailSenderImpl`实现邮箱发送进行注册。

1. 添加maven依赖
```xml
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-mail</artifactId>
        </dependency>
```

2. 配置`application.yml`文件
```yml
spring:
  mail:
    host: smtp.qq.com
    username: xxxxxxxxx@qq.com  # 邮箱地址
    password: xxxxxxxxxx # 授权码
    properties:
      mail:
        smtp:
          ssl:
            enable: true

```
3. 在发送之前利用UUID类生成一个随机的验证码
```java
public static String getUUID(){
        return UUID.randomUUID().toString().replace("-","");
    }

```
4. 然后使用QQ邮箱的smtp邮件服务器，给注册的用户发送带着验证码的邮箱，邮箱内容包含了to,object,context
```java
 String email = user.getEmail();
        String subject = "来自StudyEnglish网站的激活邮件";
        String context = "<a href=\"http://localhost:8080/user/checkCode?activeCode="+activeCode+"\">激活请点击:"+activeCode+"</a>";
        sendEmail.SendEmail(email,subject,context);
```

5. 用户收到邮箱后，用户点击邮箱，然后进入RegisterController处理

如果数据库中的验证码与用户注册的验证码相同则注册成功
```java
    //验证激活码 登录
    @RequestMapping("/user/checkCode")
    public String active(String activeCode){
        System.out.println("进入checkCode");
        //查询这个激活码
        User user = userService.queryUserByActiveCode(activeCode);

        System.out.println("user---->"+user);

        if (user != null)
        {
            //给这个用户激活
            user.setActiveStatus(1);
            //把激活码清除
            user.setActiveCode(null);
            userService.updateUser(user);
        }
        return "index";
    }
 ```

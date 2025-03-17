# 软件开发整体介绍
## 软件开发流程
![img.png](img.png)<br>
## 角色分工
![img_1.png](img_1.png)
## 软件环境
![img_2.png](img_2.png)
<br>

# 苍穹外卖项目介绍
![img_3.png](img_3.png)
<br>
![img_4.png](img_4.png)

## 前端环境搭建
重点是后端，前端直接用<br>
后端搭建好框架，主要编写功能业务<br>
前端：管理端web 用户端小程序
后端：java服务框架
## 后端
后端使用maven
![img_5.png](img_5.png)<br>
![img_6.png](img_6.png)
例如：DTO封装json成一个java
## 数据库设计
直接建表就行了
![img_7.png](img_7.png)<br>

## 前后端联调
![img_8.png](img_8.png)
遇到一个编译失败问题：Class com.sun.tools.javac.tree.JCTree$JCImport does not have member field 'com.sun.tools.javac.tree.JCTree qualid'
<br>在依赖里升级了一下lom就好了
<br>
注解:相当于一个标签，告诉spring框架该类、接口、方法的信息，由框架统一管理
<br>
jwt:客户成功登陆后，服务端会生成一个令牌给客户端，客户端手持令牌才能访问服务端的资源，未成功返回或者令牌生命周期到期就无法访问
<br>
前端的请求怎么到后端？
前端的动态请求从nginx反向代理转发到后端服务器<br>
![img_9.png](img_9.png)
<br>
1. nginx可以做缓存，提高访问
2. 可以做负载均衡，将请求均匀合理分发发到后端服务器
3. 保证后端服务的安全，不暴露出来

**配置反向代理**：
在conf配置文件中配置<br>
![img_10.png](img_10.png)<br>
将匹配到的部分给替换了
<br>
**负载均衡**：声明一个upstream转发<br>
![img_11.png](img_11.png)<br>
**分配策略**：默认轮询（一人一个）<br>
![img_12.png](img_12.png)<br>

# 完善登录功能
1. 明文密码要加密（md5加密）加密是不可逆的，只能单向加密<br>
1.1 修改数据库明文密码<br>
1.2 修改Java代码，把前端提交的加密<br>

# 导入接口文档
接口设计是个很复杂的过程，项目选择直接给出接口，直接导入<br>
1. 了解前后端分离开发流程<br>
接口规定了前后端交互的流程，比如格式之类的
2. 导入接口 yapi
3. swagger测试接口<br>
Knife4j集成了swagger在Java中<br>
![img_13.png](img_13.png)<br>

## swagger的常用注解
![img_14.png](img_14.png)<br>
注意相应的注解放到相应的位置
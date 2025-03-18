# 公共字段自动填充
![img.png](img.png)<br>
这四个字段如果每次都复制，会很麻烦(代码冗余，不方便后期维护)<br>
![img_1.png](img_1.png)<br>
每当执行右边sql时都需要更新，使用切面拦截公共操作(为mapper中的添加注解)<br>
![img_2.png](img_2.png)
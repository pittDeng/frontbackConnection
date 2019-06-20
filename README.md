# frontbackConnection

## 前端(/mydemo)
前端使用vue的技术,且向后端请求使用的axios包
安装axios包的方法如下,但是必须cd到前端项目的根目录下安装
```
cd mydemo
cnpm install axios --save
```
```
cd mydemo
//cmd启动的方法
npm install
//在启动前可以去看一下根目录下config下配置文件
//里的port配置，确保不要与后端端口使用同一端口
npm run dev
```
**这里的node_modules里面的依赖已经删除，如果再次运行出现故障，可以从新创建一个项目，把源码粘贴进去。**
```
//创建vue项目
vue init webpack mydemo
```
**注意事项**

> + **请注意前端是在客户端运行，因此前端访问后端的地址应该写服务器的绝对地址，否则在客户端无法访问**
>+ **前端服务器的config里面的host要改为0.0.0.0，否则无法在其他电脑访问**
>+ **后端服务器自动寻址的话，前端里面的请求地址需要按需改动**

## 后端(/comexampledsh)
这里后端采用的springboot技术，请注意因为跨域限制，这里在返回值时必须要设置头部信息，具体看IndexController.java代码


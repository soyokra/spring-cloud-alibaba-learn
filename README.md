# spring-cloud-alibaba-learn
- [官网](https://spring.io/projects/spring-cloud-alibaba#learn)
- [版本说明](https://github.com/alibaba/spring-cloud-alibaba/wiki/%E7%89%88%E6%9C%AC%E8%AF%B4%E6%98%8E#%E6%AF%95%E4%B8%9A%E7%89%88%E6%9C%AC%E4%BE%9D%E8%B5%96%E5%85%B3%E7%B3%BB%E6%8E%A8%E8%8D%90%E4%BD%BF%E7%94%A8)

## 快速开始

#### 安装nacos服务
```shell
 docker run --name nacos-quick -e MODE=standalone -p 8848:8848 -p 9848:9848 -d nacos/nacos-server:2.0.3
```

> 关于9848端口问题
> 
> 环境：Nacos版本 2.0.3，docker镜像，M1 Mac 
> 
> 问题描述：页面访问正常，curl -X POST正常，但是使用Java SDK集成发布失败
>
> 原因定位：跟踪源码，异常描述： Client not connected,current status:STARTING，客户端gRPC无法和服务端创建链接，在Nacos2.X版本中，增加了gRPC通信端口，需要由docker一并映射出来，否则就会出现无法初始化连接。
>
> 解决方案：在docker容器中映射9848端口


#### spring-cloud-dubbo启动问题
> An attempt was made to call a method that does not exist. The attempt was made from the following location:
>
>https://github.com/alibaba/spring-cloud-alibaba/issues/2310

解决方法
```xml
<dependency>
    <groupId>com.alibaba.spring</groupId>
    <artifactId>spring-context-support</artifactId>
    <version>1.0.11</version>
</dependency>
```

## 组件版本
- Spring Cloud Alibaba 2.2.7.RELEASE
- Spring Cloud Hoxton.SR12
- Spring Boot 2.3.12.RELEASE
- Sentinel 1.8.1
- Nacos 2.0.3
- RocketMQ 4.6.1
- Dubbo 2.7.13
- Seata 1.3.0



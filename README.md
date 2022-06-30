# spring-cloud-alibaba-learn
- [官网](https://spring.io/projects/spring-cloud-alibaba#learn)
- [版本说明](https://github.com/alibaba/spring-cloud-alibaba/wiki/%E7%89%88%E6%9C%AC%E8%AF%B4%E6%98%8E#%E6%AF%95%E4%B8%9A%E7%89%88%E6%9C%AC%E4%BE%9D%E8%B5%96%E5%85%B3%E7%B3%BB%E6%8E%A8%E8%8D%90%E4%BD%BF%E7%94%A8)

## 快速开始

### 安装nacos服务
```shell
 docker run --name nacos-quick -e MODE=standalone -p 8848:8848 -p 9848:9848 -d nacos/nacos-server:2.0.3
```

### 启动
> 启动Domain领域服务

## Q&A
### 1. 9848端口问题
Question:
> Correct the classpath of your application so that it contains a single, compatible version of org.apache.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor

Answer:
> 在Nacos2.X版本中，增加了gRPC通信端口，需要由docker一并映射出来，例如：```-p 9848:9848```， 否则就会出现无法初始化连接。

### 2. dubbo启动错误
Question:
> org.apache.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor.<init>(ReferenceAnnotationBeanPostProcessor.java:106)
>
> https://github.com/alibaba/spring-cloud-alibaba/issues/2310

Answer:
```xml
<!-- 增加依赖 -->
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



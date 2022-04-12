# spring-boot-nacos-demo

## 官方文档

<https://nacos.io/zh-cn/docs/quick-start-spring.html>

## 如何运行 demo

1. 先使用 docker-compose 启动 nacos-server
2. 启动项目

## 项目

spring-boot 项目初始化

### 安装

```xml
<dependency>
  <groupId>com.alibaba.nacos</groupId>
  <artifactId>nacos-spring-context</artifactId>
  <version>1.1.1</version>
</dependency>
```

这里使用的是 spring 的包，原因是 spring-boot 包并不支持 2.0 以上的 spring-boot

### 配置

```java
import com.alibaba.nacos.api.annotation.NacosProperties;
import com.alibaba.nacos.spring.context.annotation.config.EnableNacosConfig;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;

import org.springframework.context.annotation.Configuration;

@Configuration
@EnableNacosConfig(globalProperties = @NacosProperties(serverAddr = "127.0.0.1:8848"))
@NacosPropertySource(dataId = "example", autoRefreshed = true)
public class NacosConfig {

}

```

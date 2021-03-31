## 1.零基础微服务架构理论入门

 **什么是微服务？** 

- 微服务是一种架构风格
- 一个应用拆分为一组小型服务
- 每个服务运行在自己的进程内，也就是可独立部署和升级
- 服务之间使用轻量级HTTP交互
- 服务围绕业务功能拆分
- 可以由全自动部署机制独立部署
- 去中心化，服务自治。服务可以使用不同的语言、不同的存储技术

 **主题词01：分布式微服务架构-落地维度** 

 满足哪些维度？支撑起这些维度的具体技术？ 

![img](https://raw.githubusercontent.com/acloudyh/springCloud/master/image/cloud%E7%BB%84%E4%BB%B6%E5%9B%BE.png) 

- 服务注册与发现
- 服务调用
- 服务降级
- 服务熔断
- 负载均衡
- 服务消息队列
- 服务网关
- 配置中心管理
- 自动化构建部署
- 服务监控
- 全链路追踪
- 服务定时任务
- 调度操作

**Spring Cloud简介** 

 是什么？符合微服务技术维度 

**SpringCloud=分布式微服务架构的站式解决方案，是多种微服务架构落地技术的集合体，俗称微服务全家桶** 

 猜猜SpringCloud这个大集合里有多少种技术? 

![img](https://shanpeng326-1301338170.cos.ap-beijing.myqcloud.com/%E7%AC%94%E8%AE%B0%E5%9B%BE%E7%89%87/springcloud/1-1-1.png) 

 SpringCloud俨然已成为微服务开发的主流技术栈，在国内开发者社区非常火爆。 

 **“微”力十足，互联网大厂微服务架构案例** 

 京东的： 

![京东的](https://shanpeng326-1301338170.cos.ap-beijing.myqcloud.com/%E7%AC%94%E8%AE%B0%E5%9B%BE%E7%89%87/springcloud/1-1-2.png) 

 阿里的： 

![阿里的](https://shanpeng326-1301338170.cos.ap-beijing.myqcloud.com/%E7%AC%94%E8%AE%B0%E5%9B%BE%E7%89%87/springcloud/1-1-3.png) 

 京东物流的： 

![京东物流](https://shanpeng326-1301338170.cos.ap-beijing.myqcloud.com/%E7%AC%94%E8%AE%B0%E5%9B%BE%E7%89%87/springcloud/1-1-4.png) 

 ![微服务的简单概括](https://shanpeng326-1301338170.cos.ap-beijing.myqcloud.com/%E7%AC%94%E8%AE%B0%E5%9B%BE%E7%89%87/springcloud/1-1-5.png) 

 **Spring Cloud技术栈** 

![netflix](https://shanpeng326-1301338170.cos.ap-beijing.myqcloud.com/%E7%AC%94%E8%AE%B0%E5%9B%BE%E7%89%87/springcloud/1-1-6.png) 

 ![img](https://shanpeng326-1301338170.cos.ap-beijing.myqcloud.com/%E7%AC%94%E8%AE%B0%E5%9B%BE%E7%89%87/springcloud/1-1-7.png) 

 ![img](https://img-blog.csdnimg.cn/img_convert/735076e24e1096e38b0ee8ef50f08a17.png) 

## 2.SpringBoot和SpringCloud版本选型

- Spring Boot 2.X 版
  - [源码地址](https://github.com/spring-projects/spring-boot/releases/)
  - [Spring Boot 2 的新特性](https://github.com/spring-projects/spring-boot/wiki/spring-Boot-2.0-Release-Notes)
  - 通过上面官网发现，Boot官方**强烈建议**你升级到2.X以上版本
- Spring Cloud H版
  - [源码地址](https://github.com/spring-projects/spring-cloud)
  - [官网](https://spring.io/projects/spring-cloud)

- Spring Boot 与 Spring Cloud 兼容性查看
  - [文档](https://spring.io/projects/spring-cloud#adding-spring-cloud-to-an-existing-spring-boot-application)
  - [JSON接口](https://start.spring.io/actuator/info)

- 接下来开发用到的组件版本
  - Cloud - Hoxton.SR1
  - Boot - 2.2.2.RELEASE
  - Cloud Alibaba - 2.1.0.RELEASE
  - Java - Java 8
  - Maven - 3.5及以上
  - MySQL - 5.7及以上

## 3.Cloud组件停更说明

- 停更引发的“升级惨案”

  - 停更不停用
  - 被动修复bugs
  - 不再接受合并请求
  - 不再发布新版本

- Cloud升级

   ![1615540778973](https://shanpeng326-1301338170.cos.ap-beijing.myqcloud.com/%E7%AC%94%E8%AE%B0%E5%9B%BE%E7%89%87/springcloud/1-1-8.png)

# Spring Cloud Demo

一个简单的 Spring Cloud 示例

---

## 简介

### Ver.2.0

- Spring cloud config server 模块添加 Spring Cloud Bus 和 Rabbitmq，并使用 Spring cloud netflix eureka client 模块作为 Client 进行测试，测试接口 `/test`
- Consumer demo 模块使用 RestTemplate 并开启负载均衡
- Consumer demo 模块添加 Spring Cloud Hystrix 并实现断路保护
- Consumer demo 模块添加 Spring Cloud Feign 支持
- 修改部分 Service id

### Ver.1.0

包含以下模块：

- Spring cloud netflix eureka server
- Spring cloud netflix eureka client
- Spring cloud netflix zuul
- Spring cloud config server
- Consumer demo
- Producer demo

测试 API ：`api/v1/demo/get`，通过 `zuul` 调用

请求：`url --> zuul --> consumer --> producer`

返回：`producer --> consumer --> zuul --> 网页`

---

## 端口

|模块|端口|Service id|
|:---:|:---:|:---:|
|netflix_eureka_client|8081|netflix_eureka_client|
|netflix_eureka_server|8080|netflix_eureka_server|
|netflix_zuul|8079|netflix_zuul|
|config_server|8078|config_server|
|producer_demo|8077|producer-demo|
|consumer_demo|8076|consumer-demo|

---

## 开源许可证

Apache-2.0
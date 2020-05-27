# Spring Cloud Demo

一个简单的 Spring Cloud 示例

---

## 简介

包含以下模块：

- Spring cloud netflix eureka server
- Spring cloud netflix eureka client
- Spring cloud netflix zuul
- Spring cloud config
- Consumer demo
- Producer demo

测试 API ：`api/v1/demo/get`，通过 `zuul` 调用

请求：`url --> zuul --> consumer --> producer`

返回：`producer --> consumer --> zuul --> 网页`

---

## 端口

|模块|端口|
|:---:|:---:|
|netflix_eureka_client|8081|
|netflix_eureka_server|8080|
|netflix_zuul|8079|
|config_server|8078|
|producer_demo|8077|
|consumer_demo|8076|

---

## 开源许可证

Apache-2.0
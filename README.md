# 主要技术栈：
- SpringBoot、Mybatis、ElasticSearch、Spring Cloud、Vue2、RabbitMQ 

# 项目描述：
- 项目是一个网上零食购物店，主要采用Spring Boot+Spring Cloud+Mybatis框架，项目拆分成了主要的五个服务。分别是服务注册中心、网关、用户、商品、公共类，两个数据库四张表

##  服务拆分：
- 一个父工程snackshop，四个子工程，一个服务注册中心，一个抽取的工具类包common

## 实体类抽取：
- 根据AOP编程思想，抽取子工程的四个实体类打包到maven仓库，供模块使用 

 ## Eureka集群部署：
 - 修改Windows本地文件，模拟实现分布式集群部署

 ## 跨数据库查询：
 Feign远端调用，通过反编译JSon数据，实现跨数据库查询，开启Hystrix熔断处理
- 负载均衡：使用Ribbon，模拟对大量购物请求做一个负载均衡策略，均分到集群部署的服务器上
 
## · 搜索补全：
- 使用pinyin分词器+ik分词器，自定义分词器，实现搜索补全功能

## 价格高亮显示：
- 通过highlight属性设置pre_tags、post_tags(标签名)，修改CSS样式，实现价格高亮显示

## 订单超时未支付：
- 使用TTL+topicExchange，设置setExpiration属性，超时未支付剔除消息，删除订单

## 商品信息数据同步：
- RabbitMQ监听商品数据库修改消息，及时跟新ES搜索文档里面的数据信息

## 用户权限：
- 使用session对用户未登入请求做一个拦截，例如查看购物车

## 网关配置：
- 使用gatway，对用户和商品的访问地址做一个区别

## 登录页面
![登录页面](https://github.com/YyangZhiHeng/snackshop/blob/main/picture/login.png)

## 购物车
![购物车](https://github.com/YyangZhiHeng/snackshop/blob/main/picture/car.png)

## 商品页面
![商品](https://github.com/YyangZhiHeng/snackshop/blob/main/picture/main.png)

## 注册页面
![注册页面](https://github.com/YyangZhiHeng/snackshop/blob/main/picture/register.png)

更新中....

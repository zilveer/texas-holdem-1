# texas-holdem
蜘蛛侠
## 简介
> 本项目名：texas，
## 环境
**JAVA**
* JDK1.8

**持久层**
* MySql 5.6
* Mongodb

**servlet 容器**
* Spring-boot 1.3.5.RELEASE

**爬虫框架**
* 待定

## 目录结构
```
.
├── bin                     #启动脚本
├── falcon-common           #通用工具层
├── falcon-dao              #持久层，mysql,monogdb
│   └── src
│       └── main
│           ├── java
│           └── resources
│               └── mapper  #mybatis mapper文件
├── falcon-model            #对象实体pojo抽象，如面向数据库的bean；数据传输的dto、vo、po等
│   └── src
│       └── main
│           ├── java
│           └── resources
├── falcon-rpc              #提供rpc所需interface，为了减少其他项目引用，实现还是可以定义到service层
│   └── src
│       └── main
│           ├── java
│           └── resources   
├── falcon-service          #业务逻辑层，处理持久层与控制层对接的业务逻辑及rpc实现的业务逻辑
│   └── src
│       └── main
│           ├── java
│           └── resources
├── falcon-web
│    └── src
│        └── main
│           ├── java
│           │   └── com
│           │       └── tomasky
│           │           └── falcon
│           │               ├── config  #spring 相关注解配置类
│           │               └── Application.java  #项目启动类
│           ├── resources
│           └── webapp
└── sql                     #存放每次迭代的ddl sql脚本
```
## Docker 打包
部署可以使用docker 打包image部署， Dockerfile文件在根目录`Dockerfile`
## 启动参数
需要在启动时注入jvm参数，以实现加载相应环境的配置变量

* 本地测试: 

```
-Dspring.profiles.active=test
```

* 线上测试: 

```
-Dspring.profiles.active=u_staging
```

* ucloud线上：

```
-Dspring.profiles.active=u_production
```

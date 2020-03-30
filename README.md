# RESTEasy Servlet30 Demo

[![CircleCI](https://circleci.com/gh/alchemy-studio/resteasy-servlet30-demo.svg?style=svg)](https://circleci.com/gh/alchemy-studio/resteasy-servlet30-demo)

启动`jetty`服务器：

```bash
$ mvn jetty:run
```

测试请求：

```bash
$ http localhost:8080/app/foo
HTTP/1.1 200 OK
Content-Length: 13
Content-Type: application/octet-stream
Date: Thu, 12 Sep 2019 03:07:40 GMT
Server: Jetty(9.4.17.v20190418)

Hello, world!

$
```

访问spring annotation标记的resource：

```bash
$ http localhost:8080/app/spring
HTTP/1.1 200 OK
Content-Length: 17
Content-Type: application/octet-stream
Date: Sun, 16 Feb 2020 04:54:13 GMT
Server: Jetty(9.4.24.v20191120)

Spring is coming!

$
```

---

关于`HashMapResource`的使用方法：

* [远程调试java代码（分析一个resteasy的例子）](https://weinan.io/2020/03/30/resteasy.html)


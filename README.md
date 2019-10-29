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

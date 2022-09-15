# Generate project from..
```
mvn archetype:generate -DarchetypeGroupId=com.airhacks -DarchetypeArtifactId=jakartaee-essentials-archetype -DarchetypeVersion=0.0.3  -Darchetype.interactive=false --batch-mode -Dversion=1.0-SNAPSHOT -DgroupId=jeestudy -DartifactId=jeefirst
```

# Build
```
mvn clean package && docker build -t jeestudy/jeefirst .
```

# RUN

```
docker rm -f jeefirst || true && docker run -d -p 8080:8080 -p 4848:4848 --name jeefirst jeestudy/jeefirst 
```

# Glassfishのログをみるには
``docker ps``　で コンテナIDを確認し、
``docker logs コンテナID``
で直近のログを見ることが可能

# First access URL
http://localhost:8080/jeefirst/api/ping

# Calc sample 
```
curl -X POST -H "Content-Type: application/json" -d '{"firstNumber":"111","secondNumber":"222"}' localhost:8080/jeefirst/api/calc
```
# Javaバージョンの切り替え
```
sdk use java 11.0.5-amzn    
```

# Docker無しでビルド＆起動(UberJarとしてPayaraMicroを利用)
```
mvn clean package payara-micro:start
```

JakartaEE9に対応しているのはPayara6からだが、まだアルファ版しかでてないため、アルファ版を利用

# JSF画面

http://localhost:8080/greeting.xhtml

# 段組テーブル検討
参考
https://ja.getdocs.org/jsf2-jsf-2-datatable-example

http://localhost:8080/paging.xhtml

# 参考

- JSF EL 2の紹介
  - https://ja.getdocs.org/intro-to-jsf-expression-language


http://localhost:8080/modal.xhtml

- ArchUnitの使い方
- https://qiita.com/opengl-8080/items/0d0006918c2936c9986e

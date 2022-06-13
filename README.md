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
# Docker無しでビルド＆起動(UberJarとしてPayaraMicroを利用)
```
mvn clean package payara-micro:start
```

JakartaEE9に対応しているのはPayara6からだが、まだアルファ版しかでてないため、アルファ版を利用

# JSF画面

http://localhost:8080/greeting.xhtml


http://localhost:8080/modal.xhtml
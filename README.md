# Build
mvn clean package && docker build -t jeestudy/jeefirst .

# RUN

docker rm -f jeefirst || true && docker run -d -p 8080:8080 -p 4848:4848 --name jeefirst jeestudy/jeefirst 
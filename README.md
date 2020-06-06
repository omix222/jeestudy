# Generate project from..
mvn archetype:generate -DarchetypeGroupId=com.airhacks -DarchetypeArtifactId=jakartaee-essentials-archetype -DarchetypeVersion=0.0.3  -Darchetype.interactive=false --batch-mode -Dversion=1.0-SNAPSHOT -DgroupId=jeestudy -DartifactId=jeefirst

# Build
mvn clean package && docker build -t jeestudy/jeefirst .

# RUN

docker rm -f jeefirst || true && docker run -d -p 8080:8080 -p 4848:4848 --name jeefirst jeestudy/jeefirst 

# First access URL
http://localhost:8080/jeefirst/resources/ping
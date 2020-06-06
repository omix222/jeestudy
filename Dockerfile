FROM airhacks/glassfish
COPY ./target/jeefirst.war ${DEPLOYMENT_DIR}

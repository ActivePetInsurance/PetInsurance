FROM tomcat:8.5.46-jdk8-openjdk
# These database credentials will need to be changed based on our sql instance
ENV DATABASE_NAME="postgres"
ENV JDBC_SCHEMA=""
ENV JDBC_URL="34.70.42.108"
ENV JDBC_USERNAME="postgres"
COPY target/petinsurance-0.0.1-SNAPSHOT.war CATALINA_HOME/webapps/petinsurance-0.0.1-SNAPSHOT.war
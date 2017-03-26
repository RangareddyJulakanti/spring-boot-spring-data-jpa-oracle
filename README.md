# spring-boot-spring-data-jpa-oracle


1.Set your data base details in application.properties 

spring.datasource.url=jdbc:oracle:thin:@localhost:1521:XE
spring.datasource.username=system
spring.datasource.password=system
spring.datasource.driver-class-name=oracle.jdbc.driver.OracleDriver
server.port=1234
spring.jpa.generate-ddl=true

2.mvn clean compile install
3.Run DemoApplication
4.Save data by hiting the http://localhost:1234/save
5.see the data which is saved in data base through http://localhost:1234/findall

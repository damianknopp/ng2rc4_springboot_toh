ng2rc4_springboot_toh
=========

Angular 2 tour of hereos tutorial, served with Spring Boot TLS Embedded Tomcat

---
http://projects.spring.io/spring-boot/

https://angular.io/docs/ts/latest/tutorial/

Initial setup
---
Install node_modules and typings

	cd src/main/resources/public
	npm install

Compile
---
	mvn clean install
	cd src/main/resources/public
	gulp

Run spring boot embedded Tomcat
---
	mvn spring-boot:run (hot deploys updates for js, nice!)

vist, https://localhost:8443/index.html, see ng2 toh tutorial

visit, https://localhost:8443/swagger-ui.html, see rest service docs

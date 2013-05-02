Spring Data JDBC Code Generator Maven plugin
=============================================

This is a maven plugin for using the [Spring Data Jdbc Code generator](https://github.com/kalyanmulampaka/spring-data-jdbc-codegen).


Getting Started
===============

**Note: This project is not yet deployed to central maven repository so you need to install it locally, as follows:**

```
$ git clone git://github.com/kalyanmulampaka/spring-data-jdbc-codegen-maven-plugin.git
$ cd spring-data-jdbc-codegen-maven-plugin
$ mvn javadoc:jar source:jar install
```

Usage
------
  To use the plugin add the following snippet in the build->plugins section of your pom.xml
  
      <plugin>
      			<!-- Spring Data Jdbc code generation. Code is generated before the compile phase -->
    				<groupId>com.mulampaka.spring.data.jdbc.codegen</groupId>
    				<version>1.0.0</version>
    				<artifactId>spring-data-jdbc-codegen-maven-plugin</artifactId>
    				<executions>
    					<execution>
    						<id>compile</id>						
    						<goals>
    							<goal>generatecode</goal>
    						</goals>
    						<configuration>
    							<propertiesFile>src/main/resources/codegenerator.properties</propertiesFile>
    						</configuration>
    					</execution>
    				</executions>
    	</plugin>




License
=======
This project is released under version 2.0 of the [Apache License](http://www.apache.org/licenses/LICENSE-2.0).

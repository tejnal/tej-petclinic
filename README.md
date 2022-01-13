## Common Topics: 
git , bitbucket
Maven, Gradle
Intellij , Eeclipse
Shell script
Jenkins
Typing
Html/css/java script 
Jhipster 
Grafana
splunk
junit5


### Bootify
It is like spring initializer tool that helps to create major application template 

###m  maven
how to prepare and release your projects?
How to package your project and share to others?


##Topics: Developer blocks 
Jpa, Thymeleaf, Hibernate, liquibase 


###Topic: Spring interview questions ?
-> How to achieve dependency injections in spring application?
-> what is inversion of control ?


### Topic: How to get upto date in your working field?
know what is happening in spring community 
Know what is happening in java community



##Topics:SDET developer 
selenium, java , api testing, Integration testing, 

## Topic: Spring modules 
Spring MVC 
Spring-core
spring-context 
Spring-web
Spring-mvc 
Spring-actuator 
spring data jpa


### Topic: development tricks 
# How to work with github workflow ?

first you need to fork a github repo that you wanted to work on with 
clone that Forked repo to your local 
Now all we need to clone the original repo and do git remote add <FolderNAME> <url>
After that use git fetch <repository>
Git compare branch

# How to handle data in local development 
We have two options, 
-> We can use CommandLineRunner 
-> we can use H2 database to test this 

# What do you know about SOLID principles?



### Topic: How develop a spring application 
## Database design 
-> design database model 
-> Implement ORM mapping 
-> Create entity classes 
-> Connect to datasource 
-> Spring Data repository

#### Topic: Spring boot 
-> spring boot will handle component scan automatically 
-> The best way to declare beans is using constructor we dont have 
to autowire constructors to create beans
-> @EnableAutoConfigurations -- we can exclude unwanted them if you dont want 
particular one 
  -> how to check the what are bean that come with auto configure in spring boot
  mvn spring-boot:help -Ddetail=true
  mvn spring-boot:run -Drun.arguments=--debug
->  

### Topics : Java related questions 
-> how to implement HASHCODE and equals() ?
-> what is open closed principle ?
    it is open for extension and closed for change 
-> Interface segregation principle ?
-> What is dependency inversion principle?






### Topic : Spring related topics and questions
-> What is spring dependency injection?
-> What is handle Spring profile?
-> Bean lifecycle events ?
-> How to handle external properties file?
-> How to handle spring environment properties?
-> How to read properties in spring boot applications?
-> how to read properties from YAML files?
-> how to use spring boot profile properties?





### Topic: Spring: Containers, Dependency Injection and IOC 

-> what is dependency injection ?
-> what is inversion control?
-> What is the use of the SpEL module?
-> What is spring application context?
->

### Topic : JPA 
-> 



#How to change spring banner while running application?
http://patorjk.com/

# implement map based service

# 


### Topic: cloud technologies

### Topic: Microservices 

### Topic: Reactive programing 

### Topic: Run time monitoring

### Topic: Maven 
-> What is the use of maven release plugin?

###  Topic: Spring Data 
--> What are the fetch types in spring data ?
--> What are the cascade types in Spring Data?
persist, merge and refresh
--> 

### Junit 5 

extension model in junit 5 testing library 



### Spring boot
-> ComponentScan  -- it is by default, we can handle this bt explicit declaration, 
if create beans that are different package.
It use reflection to scan -- that is  get things little slow 
-> Profile 
-> Dependency Injection 
-> Inversion controller
-> Java Configuration 
-> primary bran and profile 
-> What does mean Factory Beans?
-> What are spring bean scopes?

### Topic: Externalising properties
--> to handle usernames, passwords, API keys, paths, queue names etc
--> How to handle properties 
      * CommandLine 
      * SPRING_APPLICATION_JSON - JSON object via commandline or environment variable 
      * JNDI
      * OS environmental variables -- for more secure way doing things 
      * Property files 
      
     
 Environmental variable example --> DB_USERNAME=UserFromEnvVar!
 Program arguments --. --guru.password= PwdFromCmdLine
 
--> Spring t o do automation scanning for application properties  
 
--> Spring boot support yml and multi yml files based on env -- application.yml , application-dev.yml , application-si1.yml 

--> How enbale profile to make use of environmental specific properties spring.profile.active= dev, si, qa

--> we can handle multiple profile in single YAML file 

--> Property binding in spring -->create class and configure class with annotation @Configuration and @ConfigurationProperties 

--> Constructor Property bindings  --> @ConstructorBinding --> @EnableConfigurationProperties("properties.class )


###   Web development with Spring MVC 

 





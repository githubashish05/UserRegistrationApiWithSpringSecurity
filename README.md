# UserRegistrationApiWithSpringSecurity

#add spring security in rest api:

to add spring security in rest we need to do some steps

1. add spring boot security dependency in pox.xml 

    <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
		</dependency>
      
2. add jsonwebtoken dependency in pox.xml file to provide secure communication.

    <dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt</artifactId>
			<version>0.9.0</version>
		</dependency>

# encrypt password:
there are many way to encrypt password. here i am using BCryptPasswordEncoder class of spring security. it contains encode(String password) which is used to encrypt password. 
String password = "test";
//create object of bCryptPasswordEncoder.
bCryptPasswordEncoder.encode(password);

package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  

@RestController  
public class HelloWorldController   
{  
@RequestMapping("/api/hello")  
public String hello()   
{  
return "Hello Shankar, This is your first CI/CD project";  

}  
}  

package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  

@RestController  
public class AppController   
{  
@RequestMapping("/api/app/health")  
public String healthCall()   
{  
return "GCP Application up and running, health checks passed..!!!";  
}  
} 

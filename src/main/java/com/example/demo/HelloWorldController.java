package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  

@RestController  
public class HelloWorldController   
{  
@RequestMapping("/api/hello")  
public String hello()   
{  
return "Hello Shankar, This is your demo CI/CD project";  

}  
@GetMapping(value = "/ping")
public ResponseEntity<String> ping() {
  return ResponseEntity.ok("{\"status\":\"OK\"}");
}
}  

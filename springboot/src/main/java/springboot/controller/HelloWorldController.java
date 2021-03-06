package springboot.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import springboot.model.HelloWorld;

@Controller
@EnableAutoConfiguration
public class HelloWorldController {
	
    @RequestMapping(value="mrcsFelipe/helloWorldClass", method={RequestMethod.GET})
    @ResponseBody
    HelloWorld getClassHelloWorld() {
    	
    	HelloWorld hello = new HelloWorld(1, "Hello World");
        return hello;
    }
    
    @RequestMapping(value="mrcsFelipe/helloWorldString", method={RequestMethod.GET})
    @ResponseBody
    String getStringHelloWorld() {
    	
        return "Olá Mundo ! Hello World";
    }
    
}
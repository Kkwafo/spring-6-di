package kokwapf.spring6di.controllers;

import kokwapf.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;
    //if i use autowire on the method will be force for use it.
    @Qualifier("setterGreetingBean")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        System.out.println("Autowire force from usage on method");
        this.greetingService = greetingService;
    }


    public String sayHello(){
        return greetingService.sayGreeting();
    }
}

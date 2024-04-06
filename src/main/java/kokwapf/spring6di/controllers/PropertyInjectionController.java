package kokwapf.spring6di.controllers;

import kokwapf.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectionController {

    @Autowired
    GreetingService greetingService;
    public String sayHello (){
        return greetingService.sayGreeting();
    }
}

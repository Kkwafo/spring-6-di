package kokwapf.spring6di.controllers;

import kokwapf.spring6di.services.GreetingService;
import kokwapf.spring6di.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {


    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        System.out.println("Im the main Controller");
        return greetingService.sayGreeting();
    }
}

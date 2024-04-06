package kokwapf.spring6di.controllers;

import kokwapf.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    // Constructor:
    // Here, we can use qualifiers to control how Spring wires the beans.
    // We can specify which implementation of GreetingService to inject using @Qualifier annotation.
    // If we want to return the primary bean instance, we can use @Primary annotation.
    // However, if we want to return the original bean instance, we can add @Qualifier in the constructor.
    // By default, Spring will give a name to the qualifier, which will be the lowercase of the class name.
    //GreetingServiceImpl now will be pick up the original instance
    public ConstructorInjectedController(@Qualifier("greetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}

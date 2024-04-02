package kokwapf.spring6di.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
public String sayHello(){
    System.out.println("Im the main Controler");
    return "Hello Everyone";
}
}

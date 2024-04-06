package kokwapf.spring6di.controllers;

import kokwapf.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SetterInjectedControllerTest {

    @Autowired
    SetterInjectedController setterInjectedController;

    //if i forgot to run the 2nd setter and i test, i will get a error null pointer
    // soo is not a good choose to use a injected property and a injecter setter
//    @BeforeEach
//    void setUp(){
//        setterInjectedController = new SetterInjectedController();
//        setterInjectedController.setGreetingService(new GreetingServiceImpl());
//    }
    @Test
    void sayHello() {
        System.out.print(setterInjectedController.sayHello());
    }
}
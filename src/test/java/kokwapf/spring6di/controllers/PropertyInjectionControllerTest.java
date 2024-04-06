package kokwapf.spring6di.controllers;

import kokwapf.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PropertyInjectionControllerTest {

    // In this test class, we're testing the PropertyInjectionController class, which utilizes property injection for dependency injection.
    // We have a field propertyInjectionController annotated with @Autowired, which implies that Spring will inject an instance of PropertyInjectionController into this field before the tests run.
    // The @BeforeEach method is commented out, which means we're not manually setting up the dependencies for testing.
    // Initially, there was a manual setup of dependencies within the @BeforeEach method, which involved creating instances of PropertyInjectionController and GreetingServiceImpl and setting them to the respective fields.
    // However, since we're using Spring's testing framework, we can rely on Spring to handle dependency injection automatically, so manual setup is unnecessary.
    // The @Test method sayHello() is testing the behavior of the sayHello() method of PropertyInjectionController.
    // We're invoking sayHello() and printing the result to the console.
    @Autowired
    PropertyInjectionController propertyInjectionController;

    //@BeforeEach
    //void setUp(){
    //    propertyInjectionController = new PropertyInjectionController();
    //    propertyInjectionController.greetingService = new GreetingServiceImpl();
    //}

    @Test
    void sayHello() {
        System.out.println(propertyInjectionController.sayHello());
    }
}

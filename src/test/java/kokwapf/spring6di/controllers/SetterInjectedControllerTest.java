package kokwapf.spring6di.controllers;

import kokwapf.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SetterInjectedControllerTest {

    // In this test class, we're testing the SetterInjectedController class, which uses setter injection for dependency injection.
    // We have a field setterInjectedController annotated with @Autowired, indicating that Spring will inject an instance of SetterInjectedController before the tests run.
    // The @BeforeEach method is commented out because we have encountered issues where forgetting to invoke the setter method on the injected property leads to a NullPointerException during testing.
    // Initially, there was a manual setup of dependencies within the @BeforeEach method, where we created an instance of SetterInjectedController and invoked its setter method to set the dependency manually.
    // However, relying on setter injection can lead to issues if the setter method is not invoked properly, as demonstrated by the commented-out setup method.
    // Therefore, it's generally not recommended to use both injected properties and setter injection simultaneously, as it can lead to confusion and potential errors.
    // The @Test method sayHello() tests the behavior of the sayHello() method of SetterInjectedController.
    // We invoke sayHello() and print the result to the console.
    @Autowired
    SetterInjectedController setterInjectedController;

    // Not recommended due to potential issues with setter invocation. If you forget to invoke the setter method to instantiate the dependency when testing manually, a NullPointerException error will occur.
    //@BeforeEach
    //void setUp(){
    //    setterInjectedController = new SetterInjectedController();
    //    setterInjectedController.setGreetingService(new GreetingServiceImpl());
    //}

    @Test
    void sayHello() {
        System.out.print(setterInjectedController.sayHello());
    }
}

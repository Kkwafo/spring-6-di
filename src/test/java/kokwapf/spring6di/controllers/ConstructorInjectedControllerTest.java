package kokwapf.spring6di.controllers;

import kokwapf.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ConstructorInjectedControllerTest {

    // In this test class, we are evaluating the ConstructorInjectedController class, which uses constructor dependency injection.
    // We have a field 'controller' annotated with @Autowired, indicating that Spring will inject an instance of ConstructorInjectedController before tests run.
    // The @BeforeEach method is commented out because we rely on Spring to handle dependency injection automatically.
    // Initially, there was a manual setup of dependencies within the @BeforeEach method, where we created an instance of ConstructorInjectedController and passed an instance of GreetingServiceImpl to its constructor.
    // However, since we're using Spring's testing framework, manual setup is unnecessary as Spring automatically handles dependency injection for us.
    // The @Test method sayHello() tests the behavior of the sayHello() method of ConstructorInjectedController.
    // We invoke sayHello() and print the result to the console.

    // Additional Comment:
    // When it was tested with the @BeforeEach method and without Spring annotations, an attempt was made to simulate Spring's dependency injection behavior, as seen in the setUp() method.
    // However, this approach can be error-prone and is not recommended in practice, as Spring provides a more robust and automatic way to handle dependency injection.
    @Autowired
    ConstructorInjectedController controller;

    // Not necessary due to Spring's automatic injection
    //@BeforeEach
    //void setUp(){
    //    controller = new ConstructorInjectedController(new GreetingServiceImpl());
    //}

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}

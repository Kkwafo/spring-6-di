package kokwapf.spring6di.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyControllerTest {

    // In this test method, we are directly instantiating MyController, which implies that we're not utilizing dependency injection.
    // We're essentially bypassing the Spring container and creating an instance manually.
    // This approach doesn't leverage the benefits of dependency injection, such as loose coupling and easier testing.
    // We're invoking the sayHello() method of MyController and printing the result to the console.
    @Test
    void sayHello() {
        MyController myController = new MyController();
        System.out.println(myController.sayHello());
    }
}

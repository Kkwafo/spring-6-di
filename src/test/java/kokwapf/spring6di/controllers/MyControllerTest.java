package kokwapf.spring6di.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyControllerTest {

    // im taking a extern dependecy that is gonna give me a greeting but is not ussing the conextex of the dependency injection
    @Test
    void sayHello() {
        MyController myController = new MyController();
        System.out.println(myController.sayHello());


    }
}
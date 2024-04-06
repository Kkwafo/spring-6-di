package kokwapf.spring6di;

import kokwapf.spring6di.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DiApplicationTests {

    @Autowired
    ApplicationContext applicationContext;
    @Autowired
    MyController myController;

    // Verifies that an instance of the controller is injected.
    @Test
    void testAutowiredOfController(){
        System.out.println(myController.sayHello());
    }

    // This test verifies that dependency injection is functioning correctly within the Spring application context.
    @Test
    void testGetControllerFromCtx(){
        MyController myController = applicationContext.getBean(MyController.class);
        System.out.println("From test using --> Spring application context");
        System.out.println(myController.sayHello());
    }
    @Test
    void contextLoads() {
    }

}

package kokwapf.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("dev")
@SpringBootTest
class DevelopmentEnvironmentControllerTest {

    EnvironmentController environmentController;
    @Test
    void getEnvironment() {
        System.out.println(environmentController.getEnvironment());
    }
}
package kokwapf.spring6di.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;
@ActiveProfiles("EN")
@SpringBootTest
class myi18NControllerTestEN {

    @Autowired
    Myi18NController myi18NController;

    // Comment:
    // This error occurs because we have two services with the same name ('i18NService') and both attempt to be wired, leading to a conflict.
    // To resolve this conflict, we need to implement profiles. Profiles allow us to define separate configurations for different environments or scenarios.
    // By using profiles, we can specify which service implementation should be used based on the active profile.
    @Test
    void sayHello(){
        System.out.println(myi18NController.sayHello());
    }

}

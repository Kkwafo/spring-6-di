package kokwapf.spring6di.controllers;

import kokwapf.spring6di.services.EnvironmentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {
    private final EnvironmentService environmentService;

    public EnvironmentController(@Qualifier("environmentService") EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }
    public String getEnvironment(){
        return environmentService.dataService();
    }

}

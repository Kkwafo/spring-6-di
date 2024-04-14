package kokwapf.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("prd")
@Service
public class EnvironmentServicePRD implements  EnvironmentService{
    @Override
    public String getEnv() {
        return "prd";
    }
}

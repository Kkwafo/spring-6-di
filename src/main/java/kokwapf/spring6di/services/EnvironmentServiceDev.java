package kokwapf.spring6di.services;

import org.springframework.stereotype.Service;

@Service
public class EnvironmentServiceDev implements EnvironmentService{
    @Override
    public String getEnv() {
        return "dev";
    }
}

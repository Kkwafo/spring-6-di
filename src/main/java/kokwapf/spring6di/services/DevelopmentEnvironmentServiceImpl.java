package kokwapf.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service("environmentService")
public class DevelopmentEnvironmentServiceImpl implements EnvironmentService{
    @Override
    public String dataService() {
        return "dataSource from development environment";
    }
}

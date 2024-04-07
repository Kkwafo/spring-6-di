package kokwapf.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service("environmentService")
public class TestingEnvironmentServiceImpl implements EnvironmentService{
    @Override
    public String dataService() {
        return "dataSource from testing environment";
    }
}

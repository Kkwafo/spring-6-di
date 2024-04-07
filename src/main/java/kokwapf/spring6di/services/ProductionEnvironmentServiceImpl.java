package kokwapf.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("prod")
@Service("environmentService")
public class ProductionEnvironmentServiceImpl implements EnvironmentService{
    @Override
    public String dataService() {
        return "dataSource from production environment";
    }
}

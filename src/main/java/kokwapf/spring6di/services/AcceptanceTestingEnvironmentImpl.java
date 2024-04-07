package kokwapf.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("uat")
@Service("environmentService")
public class AcceptanceTestingEnvironmentImpl implements EnvironmentService{
    @Override
    public String dataService() {
        return "dataSource from user acceptance testing environment";
    }
}

package kokwapf.spring6di.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//i name the services us
@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingService{
    //i add services and then i will use qualifiear
    @Override
    public String sayGreeting() {
        return "Friends dont´n let friends to property injection";
    }
}

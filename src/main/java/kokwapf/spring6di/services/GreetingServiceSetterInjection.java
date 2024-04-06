package kokwapf.spring6di.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjection  implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Im setting a Greeting";
    }
}

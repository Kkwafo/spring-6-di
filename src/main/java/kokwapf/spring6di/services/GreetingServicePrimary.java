package kokwapf.spring6di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

// If I don't use the @Primary annotation, the framework won't know which method to use.
// So, by marking this bean as @Primary, we specify that this bean is the one to be used in such cases.
// Essentially, we inform Spring that we want to give preference to this service during injection over other services.
// This primary service will take precedence over other autowired services.
@Primary
@Service
public class GreetingServicePrimary implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello From Primary Bean";
    }
}

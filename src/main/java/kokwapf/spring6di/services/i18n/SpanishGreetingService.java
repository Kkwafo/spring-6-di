package kokwapf.spring6di.services.i18n;

import kokwapf.spring6di.services.GreetingService;
import org.springframework.stereotype.Service;

@Service("i18NService")
public class SpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Este sera un msg en español - ES";
    }
}

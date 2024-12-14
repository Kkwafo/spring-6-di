package kokwapf.spring6di.services;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import kokwapf.spring6di.model.Beer;
import kokwapf.spring6di.model.BeerStyle;

public class BeerServiceImpl  implements BeerService{


	@Override
	public Beer getBeerById(UUID id) {
	    return new Beer(
	        id,
	        1,
	        "Buffon Del Rey",
	        BeerStyle.PALE_ALE,
	        "123456",
	        new BigDecimal("12.99"),
	        122,
	        LocalDateTime.now(),
	        LocalDateTime.now()
	    );

	}
}

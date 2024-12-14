package kokwapf.spring6di.services;

import java.util.UUID;

import kokwapf.spring6di.model.Beer;


public interface BeerService {

    Beer getBeerById(UUID id);
}

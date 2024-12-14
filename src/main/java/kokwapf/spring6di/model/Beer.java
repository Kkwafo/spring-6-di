package kokwapf.spring6di.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Data
public class Beer {

	private UUID id;
    private Integer version;
    private String beerName;
    private BeerStyle beerStyle;
    private String upc;
    private Integer quantityOnHand;
    private BigDecimal price;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    
    public Beer(UUID id, int version, String beerName, BeerStyle beerStyle, String upc, BigDecimal price, 
            int quantityOnHand, LocalDateTime createdDate, LocalDateTime updatedDate) {
    this.id = id;
    this.version = version;
    this.beerName = beerName;
    this.beerStyle = beerStyle;
    this.upc = upc;
    this.price = price;
    this.quantityOnHand = quantityOnHand;
    this.createdDate = createdDate;
    this.updatedDate = updatedDate;
}
    
}

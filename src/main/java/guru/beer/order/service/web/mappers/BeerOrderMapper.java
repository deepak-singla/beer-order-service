package guru.beer.order.service.web.mappers;

import org.mapstruct.Mapper;

import guru.beer.order.service.domain.BeerOrder;
import guru.beer.order.service.web.model.BeerOrderDto;

@Mapper(uses = {DateMapper.class, BeerOrderLineMapper.class})
public interface BeerOrderMapper {

    BeerOrderDto beerOrderToDto(BeerOrder beerOrder);

    BeerOrder dtoToBeerOrder(BeerOrderDto dto);
}

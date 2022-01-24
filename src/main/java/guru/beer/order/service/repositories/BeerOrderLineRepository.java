package guru.beer.order.service.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import guru.beer.order.service.domain.BeerOrderLine;

import java.util.UUID;

public interface BeerOrderLineRepository extends PagingAndSortingRepository<BeerOrderLine, UUID> {
}

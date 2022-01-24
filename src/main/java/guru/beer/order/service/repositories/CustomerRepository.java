package guru.beer.order.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.beer.order.service.domain.Customer;

import java.util.List;
import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {
    List<Customer> findAllByCustomerNameLike(String customerName);
}

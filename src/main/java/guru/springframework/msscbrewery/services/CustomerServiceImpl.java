package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerByUUID(UUID id) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("Vlad Paun")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        //todo impl - would add a real impl to update customer
        log.debug("Updating a customer...");
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting a beer...");
    }
}

package io.github.komidawi.pccbackend.domain;

import io.github.komidawi.pccbackend.infra.BusinessRepository;
import org.springframework.stereotype.Service;

@Service
public class BusinessService {

    private final BusinessRepository businessRepository;

    BusinessService(BusinessRepository businessRepository) {
        this.businessRepository = businessRepository;
    }

    public void save(BusinessObject object) {
        businessRepository.save(object);
    }

    public BusinessObject get(int id) {
        return businessRepository.get(id);
    }
}

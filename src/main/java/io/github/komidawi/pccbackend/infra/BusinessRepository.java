package io.github.komidawi.pccbackend.infra;


import io.github.komidawi.pccbackend.domain.BusinessObject;

public interface BusinessRepository {

    void save(BusinessObject businessObject);

    BusinessObject get(int id);

}

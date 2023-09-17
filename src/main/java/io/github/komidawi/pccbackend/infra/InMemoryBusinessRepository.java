package io.github.komidawi.pccbackend.infra;

import io.github.komidawi.pccbackend.domain.BusinessObject;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
class InMemoryBusinessRepository implements BusinessRepository {

    private final Map<Integer, BusinessObject> data = new HashMap<>();

    @Override
    public void save(BusinessObject businessObject) {
        data.put(businessObject.id(), businessObject);
    }

    @Override
    public BusinessObject get(int id) {
        return data.get(id);
    }
}

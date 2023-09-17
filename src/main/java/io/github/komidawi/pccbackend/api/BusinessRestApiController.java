package io.github.komidawi.pccbackend.api;

import io.github.komidawi.pccbackend.domain.BusinessObject;
import io.github.komidawi.pccbackend.domain.BusinessService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/business")
class BusinessRestApiController {

    private final BusinessService businessService;

    BusinessRestApiController(BusinessService businessService) {
        this.businessService = businessService;
    }

    @GetMapping("/object/{id}")
    public BusinessObjectDto getObject(@PathVariable int id) {
        BusinessObject businessObject = businessService.get(id);
        return new BusinessObjectDto(businessObject.id());
    }

    @PostMapping("/object")
    public void createObject(@RequestBody BusinessObjectDto dto) {
        BusinessObject businessObject = new BusinessObject(dto.getId());
        businessService.save(businessObject);
    }
}

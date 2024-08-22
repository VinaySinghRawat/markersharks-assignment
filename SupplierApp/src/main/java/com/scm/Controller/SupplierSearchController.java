package com.scm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scm.Entity.Supplier;
import com.scm.Service.SupplierSearchService;

import lombok.Data;
import lombok.NoArgsConstructor;

@RestController
@RequestMapping("/api/supplier")
public class SupplierSearchController {
    @Autowired
    private SupplierSearchService supplierSearchService;

    @PostMapping("/query")
    public List<Supplier> searchSuppliers(@RequestBody SupplierSearchQuery query) {
        return supplierSearchService.searchSuppliers(query.getLocation(), query.getNatureOfBusiness(), query.getManufacturingProcess(), query.getLimit());
    }
}
@Data
@NoArgsConstructor
class SupplierSearchQuery {
    private String location;
    private String natureOfBusiness;
    private String manufacturingProcess;
    private int limit;

    // getters and setters
}

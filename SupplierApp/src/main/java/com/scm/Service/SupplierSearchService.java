package com.scm.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scm.Entity.Supplier;
import com.scm.Repository.SupplierRepository;

@Service
public class SupplierSearchService {
    @Autowired
    private SupplierRepository supplierRepository;

    public List<Supplier> searchSuppliers(String location, String natureOfBusiness, String manufacturingProcess, int limit) {
        List<Supplier> suppliers = supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcessesContaining(location, natureOfBusiness, manufacturingProcess);
        return suppliers.stream().limit(limit).collect(Collectors.toList());
    }
}